package com.ly.security.uitl;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * 加密解密工具类
 * 技术：jdk与commons.codec
 * 方式：Base64、DES、3DES与AES
 * 对称加密AES，非对称加密: ECC，消息摘要: MD5，数字签名:DSA
 *
 * @author mfl
 * @date 2019/1/10 17:21
 */
public class CryptionUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(CryptionUtils.class);
    private static final String BASE64_SECRET_KEY = "***ly***";
    // AES/ECB/PKCS5Padding 1、加密算法名称 2、分组加密模式 3、分组的填充方式
    private static final String AES_ECB = "AES/ECB/PKCS5Padding";

    public static void main(String[] args) {
        String a = "mengfanlong";
        System.out.println("mw = " + a);
        String mengfanlong = base64Jdk(a);
        System.out.println("mengfanlong = " + mengfanlong);

        String s = base64JdkDecode(mengfanlong);
        System.out.println("jiemi = " + s);


        System.out.println("===========================================");
        SecretKey secretKey = generateSecretKey();
        byte[] bytes = encryptionAesEcbJdk("mflyyf".getBytes(), secretKey);
        String s1 = new String(bytes);
        System.out.println("s1 = " + s1);
        byte[] bytes1 = decryptionAesEcbJdk(bytes, secretKey);
        String s2 = new String(bytes1);
        System.out.println("s2 = " + s2);


    }


    // Base64
    // 严格来说Base64并不是一种加密/解密算法，而是一种编码方式。
    // Base64不生成密钥，通过Base64编码后的密文就可以直接“翻译”为明文，
    // 但是可以通过向明文中添加混淆字符来达到加密的效果

    /**
     * Base64 jdk 加密
     *
     * @param plaintext 明文
     */
    public static String base64Jdk(final String plaintext) {

        if (plaintext == null || StringUtils.isEmpty(plaintext)) {
            return null;
        }
        BASE64Encoder encoder = new BASE64Encoder();
        String encode = encoder.encode((BASE64_SECRET_KEY + plaintext).getBytes());
        System.out.println("encode = " + encode);

        return encode;
    }

    public static String base64JdkDecode(final String miW) {
        String result = "";
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            result = new String(decoder.decodeBuffer(miW));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (result != null && !StringUtils.isEmpty(result)) {
            int length = CryptionUtils.BASE64_SECRET_KEY.length();
            if (length > result.length()) {
                throw new RuntimeException("密文错误！");
            } else {
                result = result.substring(length, result.length());
            }
        }
        return result;

    }

    // DES
    // DES是一种基于56位密钥的对称算法，1976年被美国联邦政府的国家标准局确定为联邦资料处理标准（FIPS），
    // 随后在国际上广泛流传开来。现在DES已经不是一种安全的加密算法，已被公开破解，
    // 现在DES已经被高级加密标准（AES）所代替

    // AES 128

    /**
     * AES ECB模式 加密算法
     *
     * @param plaintext 明文
     * @param secretKey 秘钥
     * @return 密文
     */
    public static byte[] encryptionAesEcbJdk(final byte[] plaintext, final SecretKey secretKey) {

        try {
            Cipher cipher = Cipher.getInstance(AES_ECB);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            return cipher.doFinal(plaintext);
        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            LOGGER.error("AES ECB 加密错误！");
            e.printStackTrace();
        }
        return null;
    }

    /**
     * AES ECB模式 解密算法
     *
     * @param ciphertext 密文
     * @param secretKey  秘钥
     * @return 明文
     */
    public static byte[] decryptionAesEcbJdk(final byte[] ciphertext, final SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance(AES_ECB);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            return cipher.doFinal(ciphertext);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
            System.out.println("===AES ECB 解密错误，确定秘钥是否正确！");
            LOGGER.error("===AES ECB 解密错误，确定秘钥是否正确！");
            e.printStackTrace();
        }
        return null;
    }

    public static SecretKey generateSecretKey() {
        try {
            KeyGenerator aes = KeyGenerator.getInstance("AES");
            aes.init(128);
            byte[] encoded = aes.generateKey().getEncoded();
            return new SecretKeySpec(encoded, "AES");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

}

package spring.cast;

/**
 * @author Administrator
 * @date 2018/9/26 14:12
 */
public class CastTest {
    public static void main(String[] args) {
        CastTest castTest = new CastTest();
        Class<? extends CastTest> aClass = castTest.getClass();
        System.out.println("aClass = " + aClass);

        Object obj = new Father();

        System.out.println("===============================");
        Son son = new Son();
        son.show();

        System.out.println("===============================");
        Father father = new Father();
        System.out.println(father.getClass());

        System.out.println("===============================");

        father = Father.class.cast(son);
        father.show();

        System.out.println("===============================");
        System.out.println(obj.getClass());
        System.out.println(father.getClass());
        System.out.println(son.getClass());
    }
}

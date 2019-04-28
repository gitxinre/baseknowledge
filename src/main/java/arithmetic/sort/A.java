package arithmetic.sort;

import common.Bean.UserDTO;
import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class A {
    public static void main(String[] args) {
        /*String a[] = new String[1000000];
        for (int i = 0; i < a.length; i++) {
            a[i] = UUID.randomUUID().toString().replace("-","");
        }
        long s1 = System.currentTimeMillis();
        Arrays.sort(a);
        long e1 = System.currentTimeMillis();
        System.out.println("(e1-s1) = " + (e1 - s1));
        System.out.println("===================================");
        int t = a.length / 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("a[i * t] = " + a[i * t]);
        }
        List<String> list = Arrays.asList(a);*/
        ///////////////////////////////////////////////////////
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for (int i = 0; i < 10; i++) {
            UserDTO u = new UserDTO();
            u.setId(UUID.randomUUID().toString().replace("-", "") + "===" + i);
            u.setName("mfl" + i);
            u.setAddress("yf" + i);
            u.setAge(new Random().nextInt(30));
            u.setScore(new Random().nextInt(3));
            userDTOList.add(u);
        }
        System.out.println("userDTOList = " + userDTOList);

        long s1 = System.currentTimeMillis();
        Collections.sort(userDTOList, new Comparator<UserDTO>() {
            public int compare(UserDTO o1, UserDTO o2) {
                int r = o2.getScore() - o1.getScore();
                if (r == 0) {
                    r = o2.getAge() - o1.getAge();
                }

                return r;
            }
        });
        long e1 = System.currentTimeMillis();
        System.out.println("(e1-s1) = " + (e1 - s1));

        StringUtils.isNotEmpty("");
        String a1 = "261B95980A0734E8C896D3D2F6B4CB47_110109_2017";
        //String a2 = "SubprocessTest";
        String a2 = "jtrwdsl";
        int i = a1.compareTo(a2);
        System.out.println("i = " + i);

        int maxValue = Integer.MAX_VALUE;



        System.out.println("maxValue = " + maxValue);

        System.out.println("userDTOList = " + userDTOList);


        Map<String, Object> map = new HashMap<String, Object>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");

        map.isEmpty();
        Object d = map.get("d");
        System.out.println("d = " + d);

        String a = ",";
        String[] split = a.split(",");

        for (String str :
                split) {
            if (StringUtils.isNotEmpty(str))
            System.out.println("str = " + str);
        }

        List<String> l1 = new ArrayList<String>();
        if (l1.isEmpty()) {
        }


/*

import org.apache.commons.collections.CollectionUtils;
List<String> userIdList = (List<String>) CollectionUtils.collect(userDTOList, new Transformer() {
    public Object transform(Object o) {
        return ((UserDTO) o).getId();
    }
});

*/

    }
}

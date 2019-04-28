import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Test001 {

    @Test
    public void testSqlInString() {
        String sqlInStr = "";
        List<String> list = new ArrayList<String>();
        list.add("mfl");
        list.add("yi");
        list.add("yu");
        list.add("fa");
        for (String str :
                list) {
            sqlInStr += "'" + str + "',";
        }
        System.out.println("sqlInStr = " + sqlInStr.substring(0,sqlInStr.length()-1));

        String a = "1";
        if(1 == Integer.parseInt(a))
            System.out.println("a = " + a);


    }
}

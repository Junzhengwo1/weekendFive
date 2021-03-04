package compareTO;

import java.util.Arrays;

/**
 * @author JIAJUN KOU
 */


//comparable接口的使用
public class ComparableTest {
    public static void main(String[] args) {
        show01();
    }


    public static void show01(){
        String[] a=new String[]{"aa","bb","kk","ll","nn","dd"};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


    }
}



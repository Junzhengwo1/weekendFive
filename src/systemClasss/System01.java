package systemClasss;

import java.util.Arrays;

/**
 * @author JIAJUN KOU
 */

//System类的学习；在long包中，里面的方法都是静态的。

public class System01 {
    public static void main(String[] args) {
    //show01();
    show02();

    }
    //验证一个for循环需要多少时间。
    private static void show01() {
    //首先先获取一次毫秒值
        long s=System.currentTimeMillis();
        //执行for循环
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long e=System.currentTimeMillis();
        System.out.println("耗时："+(e-s));
    }

    public static void show02(){
        //数组copy方法
//        参数：
//        src - 源数组。
//        srcPos - 源数组中的起始位置。
//        dest - 目标数组。
//        destPos - 目标数据中的起始位置。
//        length - 要复制的数组元素的数量。

        //先定义一个源数组
        int[] src={1,2,3,4,5};
        //定义一个目标数组
        int[] dest={6,7,8,9,10};
        System.out.println("复制前："+ Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后："+ Arrays.toString(dest));


    }
}

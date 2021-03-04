package date01;

import java.util.Date;

/**
 * @author JIAJUN KOU
 */
//date类练习
    //一天=24x60x60=86400秒
public class DateTest01 {
    public static void main(String[] args) {
        //获取当前系统时间到时间原点的经历了多少毫秒 long类型的值
        //System.out.println(System.currentTimeMillis());
        DateDemo();
        DateDemo2();
        DateDemo3();
    }
    public static void DateDemo(){
        Date date=new Date();
        System.out.println(date);//dete重写了toString方法： 这里打印的就是 具体的时间了。
    }
    public static void DateDemo2(){
        //传入的是0毫秒
        Date date2=new Date(0l);
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970
    }
    public static void DateDemo3(){
        //long getTime()把日期转换成毫秒。
        Date date3=new Date();
       long time= date3.getTime();
        System.out.println(time);
    }




}

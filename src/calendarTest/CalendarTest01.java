package calendarTest;



import java.util.Calendar;

/**
 * @author JIAJUN KOU
 */
//calendar类；它是一个抽象类，主要是操作日历的方法。
    //有一个静态方法可以来用。该方法返回了 类的子类对象。
public class CalendarTest01 {
    public static void main(String[] args) {

        //show01();
        //show02();
        show03();

    }

    private static void show03() {
        //add()方法
        Calendar c=Calendar.getInstance();//静态方法
        //把年增加两年
        c.add(Calendar.YEAR,2);
        int a=c.get(Calendar.YEAR);
        //把月减少两个月
        c.add(Calendar.MONTH,-2);
        int b=c.get(Calendar.MONTH);
        System.out.println(a);//2022
        System.out.println(b);//6
    }

    public static void show01(){
        //返回一个 Calendar对象
        Calendar calendar=Calendar.getInstance();
        //该方法返回给定日历字段的值。
        int year=calendar.get(Calendar.YEAR);//返回的就是年
        System.out.println(year);
        int month=calendar.get(Calendar.MONTH);//返回的就是月
        System.out.println(month+1);//这是一个西方的月份；所以这里需要加一
        int date=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(date);

    }
    public static void show02(){
        //传递指定的日历字段，给指定字段设置值。
        Calendar c=Calendar.getInstance();
        c.set(Calendar.YEAR,1552120);//这是年
        int a=c.get(Calendar.YEAR);
        System.out.println(a);
        c.set(Calendar.MONTH,10);
        int b=c.get(Calendar.MONTH);
        System.out.println(b);
        c.set(Calendar.DATE,20);
        int d=c.get(Calendar.DATE);
        System.out.println(d);

        //还可以重载
        c.set(2000,2,2);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int date=c.get(Calendar.DATE);

        System.out.println(date);
        System.out.println(month);
        System.out.println(year);
    }

}

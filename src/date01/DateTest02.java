package date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author JIAJUN KOU
 */
public class DateTest02 {
    public static void main(String[] args) throws ParseException {
        Scanner date=new Scanner(System.in);
        System.out.println("请输入出生日期：yyyy-mm-dd");
        //使用DateFormat类中方法parse，把字符串解析成Date格式
        String birth=date.next();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-mm-dd");
        Date  brithday=simpleDateFormat.parse(birth);
        //把Date再传化成毫秒值
        long b= brithday.getTime();
        //获取当前日期并转化成毫秒值
        long todayTime=new Date().getTime();
        //差值
        long time=todayTime-b;
        //再把差值转成天数
        System.out.println(time/1000/60/60/24);
    }
}

package date01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JIAJUN KOU
 */
//日期格式化 DateFormat类；//注意 这个类是抽象类
    //String format（Date date） 把日期转化成string
public class DateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年mm月dd日 hh时mm分ss秒");
        //该方法主要是将字符串解析成日期格式
        Date date=sdf.parse("2020年08月08日 15时51分54秒");
        System.out.println(date);

    }
}

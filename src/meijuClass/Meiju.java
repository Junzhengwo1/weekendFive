package meijuClass;

/**
 * @author JIAJUN KOU
 *
 */

//枚举类的学习 Enum
    //关键字 enum定义枚举类
    //如何自定义枚举类。

public class Meiju {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        spring.getSeasonName();
        System.out.println(spring.getSeasonName());
        System.out.println(spring);
    }

}

class Season1{
    //自定义枚举类
    //2.声明Season对象的属性
    private final String seasonName;
    //1.私有化类的构造器
    private Season1(String seasonName){
        this.seasonName=seasonName;
    }
    //3.提供当前枚举类的多个对象
    public static final Season1 SPRING=new Season1("春天");

    public String getSeasonName() {
        return seasonName;
    }

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                '}';
    }
}

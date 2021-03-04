package meijuClass;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/**
 * @author JIAJUN KOU
 */
//enum定义的枚举类默认继承 Enum类。
public class EnumTest {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        System.out.println(spring);//这里打印的就不是地址值了。
        System.out.println(spring.getSeasonName());

        //enum的方法：
        //toString();
        //values();
        //valueOf();
        //1.toString();
        System.out.println("===============");
        System.out.println(summer.toString());//SUMMER
        //2.values();
        Season[] values = Season.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].getSeasonName());
        }
        System.out.println("===============");
        Thread.State[] values2=Thread.State.values();
        for (int i = 0; i < values2.length; i++) {
            System.out.println(values2[i]);
        }
        System.out.println("=====================");
        //3.valueOf(String objName);返回枚举类中对象名是objName的对象
        Season summer1 = Season.valueOf("SUMMER");
        System.out.println(summer1);//SUMMER
        System.out.println("============");

        Season2 spring2 = Season2.SPRING;
        spring2.show();//这是春天；；
        System.out.println("================");
        Season2 summer2 = Season2.SUMMER;
        summer2.show();//这是秋天

    }

}

interface Info{
    public abstract void show();
}

//使用enum关键字定义枚举类实现接口
enum  Season2 implements Info{
    //让枚举类的对象分别实现接口的抽象方法；
    SPRING("春天"){
        @Override
        public void show() {
            System.out.println("这是春天；；");
        }
    },
    SUMMER("秋天"){
        @Override
        public void show() {
            System.out.println("这是秋天：：");
        }
    };
    private final String seasonName;

    Season2(String seasonName) {
        this.seasonName=seasonName;
    }

    @Override
    public void show() {
        System.out.println("这厮王爷");
    }
}


//使用enum关键字定义枚举类
enum  Season{
    //1.多个对象之间用逗号。
    SPRING("春天"),
    SUMMER("秋天");
    //2.声明Season对象的属性
    private final String seasonName;
    //1.私有化类的构造器
    private Season(String seasonName){
        this.seasonName=seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }

}
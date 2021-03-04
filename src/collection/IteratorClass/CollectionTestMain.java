package collection.IteratorClass;
import java.util.ArrayList;
import java.util.Collection;
/*
集合框架 里面有很多类和接口
玩玩collection集合的；它是所有的单列最顶层的接口，定义了所有的共性方法
共有七个方法
 */
public class CollectionTestMain {
    public static void main(String[] args) {

        Collection<String> coll=new ArrayList<>();//这是多态的体现

        //用一下add();方法
        boolean b1=coll.add("kou");
        System.out.println(coll);
        coll.add("jia");
        coll.add("wang");
        coll.add("shdhk");
        System.out.println(coll);

        //remove();//返回值是一个boolean值
        boolean b2=coll.remove("kou");
        System.out.println(b2);
        boolean b3=coll.remove("lkj");
        System.out.println(b3);
        System.out.println(coll);

        //contains();方法；包含的意思
        boolean b4=coll.contains("oo");
        System.out.println(b4);
        boolean b5=coll.contains("jia");
        System.out.println(b5);

        //isEmpty();方法判断集合是否为空

        //size（）；方法 返回数组的元素个数

        //toArray（）；把集合变成一个数组。

        //clear（）；清除所有元素,这是集合还是存在，只是里边没有数据而已

    }
}

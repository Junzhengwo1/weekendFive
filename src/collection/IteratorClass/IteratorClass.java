package collection.IteratorClass;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;

//迭代器 用于遍历不同的集合 通用的取出集合元素
//迭代器是一个接口 所以需要用到实现类来实现；在collection接口中有一个方法就是Iterator
//返回就是一个实现类的实现。

//迭代器的使用步骤：
//1、先使用集合中的方法 Iterator（）；获取迭代器的实现类对象
//2、使用Iterator接口中的方法hasNext判断有没有下一个元素
//3、使用接口的next去除集合的下一个元素。
public class IteratorClass {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll=new ArrayList<>();
        //往集合中添加元素
        coll.add("寇");
        coll.add("jiu");
        coll.add("q");
        coll.add("w");
        coll.add("e");
        coll.add("r");
        coll.add("t");

        //迭代器的泛型跟着集合走
        Iterator<String> it=coll.iterator();
        /*boolean b=it.hasNext();
        System.out.println(b);
        String s=it.next();
        System.out.println(s);

        boolean b2=it.hasNext();
        System.out.println(b2);
        String s2=it.next();
        System.out.println(s2);*/

        //使用while循环来遍历集合。因为不知道具体的次数
        while (it.hasNext()){
            String e=it.next();
            System.out.println(e);
        }

        //增强for循环遍历集合。











    }
}

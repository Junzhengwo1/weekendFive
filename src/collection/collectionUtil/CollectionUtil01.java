package collection.collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author JIAJUN KOU
 */
//collections集合工具类的使用。
public class CollectionUtil01 {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        //1、往集合中添加多个元素。
        //这里是静态方法可以直接使用
        Collections.addAll(list,"a","c","kou","jia","jun","1","2","3");
        System.out.println(list);
        //2、打乱顺序。
        Collections.shuffle(list);
        System.out.println(list);
        //3、sort()排序，只能传list集合不可以set集合;默认升序
            //3.1默认方法
        Collections.sort(list);
        System.out.println(list);

        //自定义的集合
        ArrayList<Person> listPerson=new ArrayList<>();
        listPerson.add(new Person("kou",20));
        listPerson.add(new Person("jia",21));
        listPerson.add(new Person("jun",22));
        listPerson.add(new Person("abc",22));
        System.out.println(listPerson);
        //4、要对自定义的Person类排序，需要按规则排序
        Collections.sort(listPerson);
        System.out.println(listPerson);
        //5、第二种 comparator
        Collections.sort(listPerson, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result= o1.getAge()-o2.getAge();
                //如果年龄相同就按姓名首字母比较。
                if(result==0){
                    result=o1.getName().charAt(0)-o2.getName().charAt(0);//升序
                }
                return result;
            }
        });
        System.out.println(listPerson);


    }
    //自定义排序就必须实现Comparable接口；重写CompareTo（）方法。
    static class Person implements Comparable<Person>{
        private  String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        //重写排序的规则；默认返回0，它就认为元素是相同的。
        @Override
        public int compareTo(Person o) {
            //我要比较三个人的年龄
            return o.getAge()-this.getAge();//这就是年龄降序排序。
        }
    }
}

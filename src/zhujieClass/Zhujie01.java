package zhujieClass;

/**
 * @author JIAJUN KOU
 */
//注解的概述
    //1、理解Annotation
    //2、如何自定义注解；参照SupperWarnings
        //出现的比较少
public class Zhujie01 {
    public static void main(String[] args) {

    }
}
@Myzhujie(value = "kou")
class Person{


}

//自定义注解
@interface Myzhujie{

    String value();


}
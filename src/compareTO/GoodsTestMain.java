package compareTO;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author JIAJUN KOU
 */
public class GoodsTestMain {
    public static void main(String[] args) {
        show01();
        show02();

    }
    public static void show01(){
        Goods[] goods=new Goods[5];
        goods[0]=new Goods("kou",50);
        goods[1]=new Goods("jia",500);
        goods[2]=new Goods("jun",200);
        goods[3]=new Goods("wang",300);
        goods[4]=new Goods("jhi",300);

        //默认的是不可以比较的，需要实现comparable接口
        Arrays.sort(goods);

        System.out.println(Arrays.toString(goods));
    }
    public static void show02(){
        Goods[] goods=new Goods[5];
        goods[0]=new Goods("kou",50);
        goods[1]=new Goods("jia",500);
        goods[2]=new Goods("jun",200);
        goods[3]=new Goods("wang",300);
        goods[4]=new Goods("jhi",300);
        Arrays.sort(goods, new Comparator<Goods>() {
            @Override
            public int compare(Goods o1, Goods o2) {
                if(o1.getName().equals(o2.getName())){
                    return Double.compare(o1.getPrice(),o2.getPrice());
                }else {
                    return o1.getName().compareTo(o2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(goods));
    }
}

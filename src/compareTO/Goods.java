package compareTO;

import java.util.Comparator;

/**
 * @author JIAJUN KOU
 */
//要实现comparable接口，才可以来比较。
    //comparator接口
public class Goods implements Comparable, Comparator {

    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指名需要比较大小的方式
    @Override
    public int compareTo(Object o) {
        if(o instanceof Goods){
            Goods goods=(Goods)o;
            //方式一
            if(this.price>goods.price){
                return 1;
            }else if(this.price<goods.price){
                return -1;
            }else {
                return this.name.compareTo(goods.name);
            }
            //方式二
           //return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("传入的数据类型不一致。");
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Goods && o2 instanceof Goods){
            Goods goods=(Goods)o1;
            Goods goods1=(Goods)o2;
        if(goods.getName().equals(goods1.getName())){
            return Double.compare(goods.getPrice(),goods1.getPrice());
        }else {
            return goods.getName().compareTo(goods1.getName());
        }
    }
        throw new RuntimeException("传入的数据类型不一致。");
    }
}

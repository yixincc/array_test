package com.xxx.stream;

import com.xxx.pojo.Mask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo004 {

    public static void main(String[] args) {
        List<Mask> maskList = new ArrayList<>();
        maskList.add(new Mask("3m","kn95"));
        maskList.add(new Mask("honewall","kn95"));
        maskList.add(new Mask("3m","ffp2"));
        maskList.add(new Mask("honewall","n95"));

        //匿名内部类 按照类型比较
        maskList.sort(new Comparator<Mask>() {
            @Override
            public int compare(Mask o1, Mask o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        System.out.println(maskList);

        maskList.sort(((o1, o2) -> o1.getType().compareTo(o2.getType())));
        System.out.println(maskList);
        System.out.println("------------");
        //求一个长方形的面积
        System.out.println(area(4, 6, (i1, i2) -> i1 * i2));
    }

    public static Integer area(Integer i1,Integer i2, Funtion01<Integer,Integer> funtion01){
        return funtion01.test(i1,i2);
    }

    /**
     * 自定义函数式接口
     * @param <T>
     * @param <R>
     */
    @FunctionalInterface
    interface Funtion01<T,R>{
        public R test(T t1,T t2);
    }

}

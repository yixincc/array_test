package com.xxx.stream;

public class LambdaDemo003 {
    public static void main(String[] args) {
        System.out.println(testLong(11111L, 22222L, (l1, l2) -> l1 + l2));
    }

    public static Long testLong(Long l1,Long l2,myFunction<Long,Long> function){
        return function.test(l1,l2);
    }

    @FunctionalInterface
    interface myFunction<T,R>{
        public R test(T t1,T t2);
    }
}

package com.xxx.commclass;

import jdk.swing.interop.SwingInterOpUtils;

/*
    String :  不可变的字符序列   private final byte[] value;
    StringBuilder : 可变的字符序列,线程不安全|不同步
        建议使用StringBuilder代替StringBuffer
    StringBuffer : 可变的字符序列,线程安全的|同步
        在多线程环境下保证数据的安全,建议使用StringBuffer

    执行效率: StringBuilder >  StringBuffer > String

    StringBuilder|StringBuffer :
        byte[] value; --> 默认初始容量16,每次扩容原容量的2倍+2,使用 Arrays.copyOf方法进行扩容
            int newCapacity = (oldCapacity << 1) + 2;
 */
public class Class003_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder() 构造一个字符串构建器，其中不包含任何字符，初始容量为16个字符。
        StringBuilder sb  = new StringBuilder();
        System.out.println(sb);
        //StringBuilder(String str) 容量为seq的长度+16
        StringBuilder sb2 = new StringBuilder("ABC");
        System.out.println(sb2);

        System.out.println(sb.capacity());
        System.out.println(sb2.capacity());

        //StringBuilder append(boolean b) 将 boolean参数的字符串表示形式追加到序列中。
        sb.append(123);
        System.out.println(sb.append(false));;
        System.out.println(sb.append("nihaoaac"));;
        System.out.println(sb.append("a"));;
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        //StringBuilder delete(int start, int end) 删除此序列的子字符串中的字符。
        System.out.println(sb.delete(0,3));
        System.out.println(sb);

        //StringBuilder insert(int offset, double d) 将 double参数的字符串表示形式插入此序列中。
        System.out.println(sb.insert(5,4.4));
        System.out.println(sb);

        //StringBuilder reverse() 导致此字符序列被序列的反向替换。
        System.out.println(sb.reverse());

        //StringBuilder|StringBuffer --> String
        //1) toString()
        //2) new String(StringBuilder|StringBuffer)
        System.out.println(sb.toString());
        System.out.println(new String(sb));

        //String-->StringBuilder|StringBuffer
        //new StringBuilder|StringBuffer(String str)
    }
}

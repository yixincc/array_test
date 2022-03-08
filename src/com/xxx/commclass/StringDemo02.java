package com.xxx.commclass;

import java.util.Arrays;

public class StringDemo02 {
    public static void main(String[] args) {
        String str1 = "jintianzhendejukun";
        String str2 = "jintianzhendejukunxixi";

        System.out.println(str1.charAt(5));
        System.out.println(str1.codePointAt(5));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.concat("wuhu"));
        System.out.println(str1);

        System.out.println(str1.contains("zhen"));
        String s = String.copyValueOf(new char[] {'a','b','v'});
        System.out.println(s);

        System.out.println(str2.endsWith("i"));
        System.out.println(str2.startsWith("i"));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        char[] arr = new char[10];
        str1.getChars(1,6,arr,5);
        System.out.println(Arrays.toString(arr));

        System.out.println(str1.indexOf('z'));
        System.out.println(str2.indexOf("z",9));

        System.out.println(str1.intern());
    }
}

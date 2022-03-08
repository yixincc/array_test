package com.xxx.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
    异常处理方案: *****
        1.抛出异常 throws 异常类型
        2.异常捕获
            try...catch
            try{
                有可能出现异常的代码;
            }catch(FileNotFoundException e){
                遇到异常后执行的代码;
            }catch(NullPointerException e){
                遇到异常执行的代码;
            }.....
            catch(Exception e){//-->接盘侠  //Exception e = new ClassCastException();
            } finally{
                无论try中是否遇到异常,结束之前都会执行finally中的代码
            }
    注意:
        无论是编译时异常还是运行时异常都可以通过2中解决方案处理
        但是编译时异常只能通过2种解决方案处理
        而运行时异常可以通过2种解决方案处理,也可以通过增强程序健壮性if
        一个try后面可以接1~n个catch
        如果try中的代码一旦遇到异常try中后面的代码不会执行,会直接判断catch,多个catch之间从上到下判断,如果找到对应的catch,执行{}中的代码
        如果存在多个catch,大范围类型的捕获放在最后
        一般在finally中会定义资源的关闭等代码
 */
public class Class002_Exception {
    public static void main(String[] args) {
        System.out.println("------------main----------");
        try {
            System.out.println("try开始了-------------------");
            test();
            //System.out.println(5/0);
            System.out.println("try结束了-------------------");
        } catch (FileNotFoundException e) {
            System.out.println("遇到文件未找到异常啦!!!");
        } catch (ArithmeticException e){
            System.out.println("分母为0....");
        } finally {
            System.out.println("最后的最后我们都会离开...");
        }

        System.out.println("------------结束----------");
    }

    public static void test() throws FileNotFoundException {
        //编译时异常
        InputStream is = new FileInputStream("D://test.txt");
    }
}

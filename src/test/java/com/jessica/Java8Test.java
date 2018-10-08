package com.jessica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by guanyiting on 2018/6/19 0019.
 * desc:
 */
public class Java8Test {
    public static void main(String[] args) {
        Java8Test java8Test=new Java8Test();

        /*
        //lambda表达式引用局部变量
         String str="hello";
        Convertion convertion=ss-> System.out.println(str+ss);
        convertion.printConvert("\n\rI catch you lambda expression!");
        */

        /*
        //参数使用类型声明
        MathOperation addition=(int a,int b)->a+b;

        //不用类型声明
        MathOperation subtraction=(a,b)->a-b;

        //函数主体大括号中的返回语句
        MathOperation multiplication=(a,b)->{return a*b;};

        System.out.println("2+2="+java8Test.operate(2,2,addition));
        System.out.println("2-2="+java8Test.operate(2,2,subtraction));
        System.out.println("2*2="+java8Test.operate(2,2,multiplication));

        //参数使用圆括号
        GreetingService useParentheses=(msg)-> System.out.println("Welcome to Beijing"+msg);

        //参数不使用圆括号；
        GreetingService notUseParentheses=msg->{
            System.out.println("do not use Parenthese Greeting"+msg);};

        useParentheses.sayMessage("(useParentheses)");
        notUseParentheses.sayMessage("(this is a greeting message)");
        */

        /*
        //jdk7与jdk8调用Collections.sort(List,Comparator)的区别
        List<String> list1=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        list1.add("john");
        list1.add("tom");
        list1.add("jack");
        list1.add("alice");
        list1.add("juli");
        list1.add("bitrees");
        list2.add("john");
        list2.add("tom");
        list2.add("jack");
        list2.add("alice");
        list2.add("juli");
        list2.add("bitrees");

        java8Test.sortByJava7(list1);
        System.out.println("jdk7:");
        System.out.println(list1);

        java8Test.sortByJava8(list2);
        System.out.println("jdk8:");
        System.out.println(list2);

        //jdk8方法引用
        list1.forEach(System.out::println);
        */
    }

    interface Convertion{
        void printConvert(String s);

//        void printConvert1(String s);
    }

    interface MathOperation{
        int operation(int a,int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

    //java7排序
    private void sortByJava7(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    //java8排序
    private  void sortByJava8(List<String> list){
        Collections.sort(list,(s1,s2)->s1.compareTo(s2));
    }
}

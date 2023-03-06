package javase.advanced.集合.cllection.set集合练习.copy;

import java.util.HashSet;
import java.util.Set;
 
/**
 * @author yx
 * @date 2022-03-09 14:16
 */
/*
1、HashSet去重
2、Set.retailAll(s2)方法判断两数中是否存在有重复的数
3、注意强制类型的转换
 */
public class 排它平方数
{
    public static void main(String[] args) {
        for (int i=100000;i<1000000;i++){
            if(B(i)){//调用B方法返回结果为true输出结果
                if(i!=203879 ) System.out.println(i);
            }
        }
    }
    public static Set A(long m){//去重
        String s=""+m;
        Set h=new HashSet<>();
        for (int i=0;i<s.length();i++){
            h.add(s.charAt(i));//charAt()方法返回指定索引位置的char值。索引范围为0~length()-1.
        }
        return h;
    }
    public static boolean B(int n){
        Set s1=A(n);//调用A方法，返回结果为Set类型
        Set s2=A((long)n*n);//强制转换成long，调用A方法，返回结果为Set类型
        if(s1.size()!=6)return false;//s1集合的长度不为6返回false
        s1.retainAll(s2);//判断s2集合的元素和s1集合的元素是否相重，相重则删除相重元素，不相重则删除s1
        return s1.isEmpty();//s1为空则返回true，否则返回false
    }
}
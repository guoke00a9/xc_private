package javase.advanced.注解;

/**
 * Annotation:
 * 		注解,或者叫注释
 * 		注解Anntation是一种引用数据类型，编译之后也会生成xxx.class文件
 * 		语法:
 * 			[修饰符列表] @interface 注解类型名{
 * 
 * 			}
 * 		用途:
 * 			注解可以出现在类上、方法上、变量上、注解还可以出现在注解类型上
 * @author Passerby
 *		
 *@Override：
 *		这个注解只能注解方法
 *		这个注解给编译器参考的，和运行阶段没有关系
 *		凡是java中的方法带有这个注解，编译器都会进行
 *		编译检查，如果这个方法不是重写父类的方法，编译器报错
 *@Deprecated
 *		表示方法或类已过时
 *
 *用来标注注解的注解被称为元注解
 *常见的元注解有；
 *		Target
 *			这是一个元注解，用来标注“注解类型”的“注解”
 *			这个Target注解用来标注“被标注的注解”可以出现在哪些位置上
 *		Retention
 *			这是一个元注解，用来标注“注解类型”的“注解”
 *			这个Retention注解用来标注“被标注的注解”最终保存在哪里
 */
public class 注解 {

	public static void main(String[] args) {

	}

	@Override
	public String toString() {
		return "注解 []";
	}

}


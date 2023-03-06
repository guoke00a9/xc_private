package javase.basis.package包;

/**关于java语言当中的包机制：
 * 
 * 		1、包又称为package，java中引用package这种语法机制主要是为了方便程序的管理。
 * 		   不同功能的类被分门别类放到不同的软件包当中，查找比较方便，管理比较方便，
 * 		   易维护。
 * 		2、包名的命名规范：
 * 				公司域名倒叙+项目名+模块名+功能名；
 * 				采用这种方式重名的几率较低，因为公司域名具有全球唯一性。
 * 		3、包名要求全部小写，包名也是标志符，必须遵守标识符命名规则。
 * 		4、一个包对应着一个目录。
 * 				package com.bj.lx.bao;
 *					public class text1{
 *						public static void main(String[] args) {
 *							System.out.println("Holle World!");
 *					}
 *				}
 *		5、使用了packzge机制之后，应该怎么编译？怎么运行？
 *			使用了packzge机制之后，类名不再是text1了，类名是：com.bj.lx.bao.text1
 *			编译：javac java源文件路径（在硬盘上生成一个class文件：text1.class）
 *			手动创建目录：将text1.class字节码文件放到指定目录下。
 *			运行：java com.bj.lx.bao.text1
 *			另一种方式：
 *				javac -d 编译之后存放路径 java源文件的路径
 *				javac -d.*.java
 */

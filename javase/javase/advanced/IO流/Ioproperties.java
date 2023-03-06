package javase.advanced.IO流;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import javax.annotation.processing.FilerException;

/**
 * Io和Propertoes的联合使用:
 * 		Properties:
 * 			Properties是一个Map集合。
 * 			Properties中的key,value存储的都String类型。
 * @author Passerby
 *
 */
public class Ioproperties {

	public static void main(String[] args) throws FilerException {

		/**
		 * 以后经常改变的数据，可以写到文件中，实用程序动态获取。
		 * 将来只需修改这个文件的内容，java代码不需要改动，不需要
		 * 重新编译，服务器也不需要重启。就可以拿到动态的信息。
		 * 
		 * 类使用这个程序文件中的内容格式是:
		 * 		key1=value
		 * 		key1=value
		 * 的时候，我们把这种配置文件叫做属性配置文件。
		 * 
		 * java规范中有要求:属性配置文件建议以.properties结尾，但这不是必须的。
		 * 这种以.properties结尾的文件在java中被称为:属性配置文件。
		 * 其中Properties对象是专门存放属性配置文件的一个类。
		 */
		FileReader fr = null;
		try {
			fr = new FileReader("userinfo.properties");
			Properties pro = new Properties();
			//调用load方法将流放到Properties数组当中，其中=左边做key，=右边做value。
			pro.load(fr);
			//通过key获取value
			String UserName = pro.getProperty("user");
			System.out.println("userName:"+UserName);
			System.out.println("password:"+pro.getProperty("password"));
			} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}

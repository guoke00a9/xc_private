package javase.advanced.集合.cllection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Vecyor：
 * 		底层调用数组
 * 		默认容量10 扩容之后是原容量的2倍
 * 		线程安全的 效率较低 使用较少【有新的保证线程安全的方式】
 * @author 王爸爸
 *
 */
public class Vecyor集合 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList();
		//变成线程安全的
		Collections.synchronizedList(list);
		
		list.add(1);
		list.add(2);
	}

}

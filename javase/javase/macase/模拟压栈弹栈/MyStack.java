package javase.macase.模拟压栈弹栈;

public class MyStack {
	
	private Object [] arr;
	public MyStack() {
		//创建对象初始化数组长度
		this.arr = new Object[10];
	}
	public Object[] getArr() {
		return arr;
	}
	public void setArr(Object[] arr) {
		this.arr = arr;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	private int index = -1;
	
	public void push(Object obj) throws MyException {
		if(index >= arr.length-1) {
			throw new MyException("栈溢出，压栈失败！");
		}
		index++;
		arr[index] = obj;
		System.out.println(obj+"压棧成功"+"棧帧指向"+index);
	}
	
}

package javase.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class 模态和非模态 {

	public static void main(String[] args) {

		//建立两个按钮
		JButton btn1 = new JButton("模态对话框");
		JButton btn2 = new JButton("非模态对话框");
		//创建窗体并命名为MyDialogDemo
		JFrame f = new JFrame("MyDialogDemo");
		//设置窗体大小
		f.setSize(300,250);
		//设置窗口显示位置
		f.setLocation(650,300);
		/**
		 * 为内容面板设置布局管理器
		 * new FlowLayout
		 * 创建一个布局管理器
		 */
		f.setLayout(new FlowLayout());
		//添加组件btn1
		f.add(btn1);
		//添加组件btn2
		f.add(btn2);
		//设置窗体关闭时的默认操作
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//让组件显示
		f.setVisible(true);
		//禁止改变窗体大小
		f.setResizable(false);
		
		final JLabel label = new JLabel();
		//定义一个JDialog
		final JDialog dialog = new JDialog(f,"Dialog");
		dialog.setSize(300,260);
		dialog.setLocation(300,300);
		dialog.setLayout(new FlowLayout());
		//创建按钮对象
		final JButton btn3 = new JButton("确定");
		dialog.add(btn3);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setModal(true);
			}
			
		});
		
	}

}

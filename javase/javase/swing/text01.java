package javase.swing;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class text01 extends JFrame{

	public static void main(String[] args) {

		SwingUtilities.invokeLater(text01::createAndShowGUI);
	}

	public static void createAndShowGUI(){
		JFrame frame = new JFrame("JFrameTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("JFrameText");
		frame.setSize(350,300);
		frame.setLocation(300,200);
		//让组件显示
		frame.setVisible(true);
		//禁止改变窗体的大小
		frame.setResizable(false);
	}
}

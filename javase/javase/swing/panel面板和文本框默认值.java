package javase.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel面板和文本框默认值 {
	public static void main(String[] args) {
		
		JFrame f = new JFrame("测试");
    	JPanel p =new JPanel();
    	f.setLayout(new FlowLayout(FlowLayout.LEFT));
    	JTextField t = new JTextField("王烨");
    	p.add(t);
    	JButton but = new JButton("按钮1");
    	p.add(but);
    	JPanel p1 =new JPanel();
    	p1.add(new JTextField("xxx"));
    	p1.add(new JButton("按钮2"));
    	f.add(p);
    	f.add(p1);
    	f.setSize(400,500);
    	f.setLocation(500,500);
    	f.setResizable(false);
    	f.setVisible(true);
    	
    	but.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				System.out.println(t.getText());
			}
    		
    	});
	}
}

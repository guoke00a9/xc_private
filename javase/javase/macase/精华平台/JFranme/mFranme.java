package javase.macase.精华平台.JFranme;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class mFranme {
	JFrame mf;
	JCheckBox c1;
    JCheckBox c2;
    JCheckBox c3;
    JButton btn;
	public mFranme() {
		mf = new JFrame("精华");
		mf.setSize(400,400);
		mf.setLocation(600,300);
		mf.setResizable(false);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(new FlowLayout());
		btn = new JButton("确认");
		c1 = new JCheckBox("分辨率1680*1050",true);
        c2 = new JCheckBox("分辨率1920*1080");
        c3 = new JCheckBox("分辨率1000*1000");
        mf.add(c1);
        mf.add(c2);
        mf.add(c3);
        mf.add(btn);
        mf.setVisible(true);
    }
}

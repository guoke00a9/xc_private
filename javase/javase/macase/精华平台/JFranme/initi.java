package javase.macase.精华平台.JFranme;

import javase.macase.精华平台.JHutil;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class initi {
	JFrame jhm;
	JButton btn1;
	JButton btn2;
	ResourceBundle b;
//	标签						文本框						面板组件
	JLabel firstLabel1;		JTextField textFiled1;		JPanel p1;    
	JLabel firstLabel2;		JTextField textFiled2;		JPanel p2;  
	JLabel firstLabel3;		JTextField textFiled3;      JPanel p3;    
	JLabel firstLabel4;		JTextField textFiled4;      JPanel p4;    
	JLabel firstLabel5;		JTextField textFiled5;      JPanel p5;    
	JLabel firstLabel6;		JTextField textFiled6;      JPanel p6;    
	JLabel firstLabel7;		JTextField textFiled7;      JPanel p7;    
	JLabel firstLabel8;		JTextField textFiled8;      JPanel p8;    
	JLabel firstLabel9;		JTextField textFiled9;      JPanel p9;  
    
	public initi() {
		final int FIELDWITCH = 10; 
		b = ResourceBundle.getBundle("窗口");
		jhm = new JFrame(b.getString("mName"));
        jhm.setSize(Integer.valueOf(b.getString("windowSizeX")),Integer.valueOf(b.getString("windowSizeY")));//设置窗口大小
        jhm.setLocation(Integer.valueOf(b.getString("positionX")),Integer.valueOf(b.getString("positionY")));//设置显示位置
        jhm.setResizable(false);//禁止改变窗口大小
        jhm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置窗口默认关闭操作
        jhm.setLayout(new FlowLayout());//定义布局管理器

        btn1 = new JButton("开始");//创建按钮
        textFiled1 = new JTextField(FIELDWITCH);//创建文本域
        textFiled2 = new JTextField(FIELDWITCH);//创建文本域
        textFiled3 = new JTextField(FIELDWITCH);//创建文本域
        textFiled4 = new JTextField(FIELDWITCH);//创建文本域
        textFiled5 = new JTextField(FIELDWITCH);//创建文本域
        textFiled6 = new JTextField(FIELDWITCH);//创建文本域
        textFiled7 = new JTextField(FIELDWITCH);//创建文本域
        textFiled8 = new JTextField(FIELDWITCH);//创建文本域
        textFiled9 = new JTextField(FIELDWITCH);//创建文本域
        JTextField[] t = {textFiled1,textFiled2,textFiled3,textFiled4,textFiled5,textFiled6,textFiled7,textFiled8,textFiled9};
        
        firstLabel1 = new JLabel(b.getString("Label1"));
        firstLabel2 = new JLabel(b.getString("Label2"));
        firstLabel3 = new JLabel(b.getString("Label3"));
        firstLabel4 = new JLabel(b.getString("Label4"));
        firstLabel5 = new JLabel(b.getString("Label5"));
        firstLabel6 = new JLabel(b.getString("Label6"));
        firstLabel7 = new JLabel(b.getString("Label7"));
        firstLabel8 = new JLabel(b.getString("Label8"));
        firstLabel9 = new JLabel(b.getString("Label9"));
        JLabel[] l = {firstLabel1,firstLabel2,firstLabel3,firstLabel4,firstLabel5,firstLabel6,firstLabel7,firstLabel8,firstLabel9};
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        p7 = new JPanel();
        p8 = new JPanel();
        p9 = new JPanel();
        JPanel[] jp = {p1,p2,p3,p4,p5,p6,p7,p8,p9};
        //将文本框组件和标签组件添加到panel面板
        for (int i = 0; i < jp.length; i++) {
			jp[i].add(l[i]);
			jp[i].add(t[i]);
			System.out.println("ok");
		}
        //添加组件
        for (int i = 0; i < jp.length; i++) {
			jhm.add(jp[i]);
		}
        jhm.add(btn1);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] arr = new String[13];
                String[] arr1 = textFiled1.getText().split(",|，");
                String[] arr4 = textFiled4.getText().split(",|，");
                String[] arr5 = textFiled5.getText().split(",|，");
                String[] arr6 = textFiled6.getText().split(",|，");
                //获取数据
                arr[0] = arr1[0];arr[1] = arr1[1];
                arr[2] = textFiled2.getText();
                arr[3] = textFiled3.getText();
                arr[4] = arr4[0];arr[5] = arr4[1];
                arr[6] = arr5[0];arr[7] = arr5[1];
                arr[8] = arr6[0];arr[9] = arr6[1];
                arr[10] = textFiled7.getText();
                arr[11] = textFiled8.getText();
                arr[12] = textFiled9.getText();
                
                int[] jhArr = JHutil.replace(arr);
//                for (int j = 0; j < jhArr.length; j++) {
//					System.out.println(jhArr[j]);
//				}
            }
        });
        jhm.setVisible(true);//显示窗口/组件
	}
	public void start() {
		
	}
}

package javase.macase.模拟消息自动发送;

import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SendQQandWEIXIN {
    public static void main(String[] args)throws AWTException {
    	
    	
    	FileReader fr = null;
		StringBuffer s = new StringBuffer();
		try {
			fr = new FileReader("D:\\自动轰炸.txt");
			char [] chararr = new char[10];
			int readCount = 0;
			while ((readCount = fr.read(chararr)) != -1) {
				String timeString = new String(chararr,0,readCount);
				s.append(chararr);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
    	String s1 = new String(s);
    	String[] stext = s1.split("\n");
    	
        Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();//获取系统剪切板
        Transferable tText = null;
        Toolkit tolkit = Toolkit.getDefaultToolkit();
        Robot robot = new Robot();
        robot.delay(10000);//延迟十秒，主要是为了预留出打
        for (int i = 0; i < stext.length; i++) {
        	tText = new StringSelection(stext[i]);
            clip.setContents(tText, null);
            robot.keyPress( KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.delay(300);
            robot.keyPress( KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.delay(100);
        }
    }
}

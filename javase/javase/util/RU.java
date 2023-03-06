package javase.util;

import java.awt.*;
import java.awt.event.InputEvent;

public class RU {

    static Robot robot = null;

    static {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void delay(int ms){
        robot.delay(ms);
    }

    public static void mouseDClick(){
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        delay(200);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void mouseClick(){
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void mouseMove(int x, int y){
        int move = 5;
        while (move --> 0){
            robot.mouseMove(x,y);
        }
    }

    public static void mouseWheel(int wheel){
        robot.mouseWheel(wheel);
    }
}

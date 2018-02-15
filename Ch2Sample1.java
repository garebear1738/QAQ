/**
 * @(#)Ch2Sample1.java
 *
 *
 * @author 
 * @version 1.00 2017/11/21
 */
import javax.swing.*;

class Ch2Sample1 {
	public static void main(String[] args) {
		JFrame    myWindow;
		myWindow = new JFrame();
		
		int x=300, y=300;
		
		myWindow.setLocation(x,y);
		myWindow.setSize(300, 200);
		myWindow.setTitle("My First Java Program");
		myWindow.setVisible(true);
	}
}

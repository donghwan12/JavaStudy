package Ch18;

import javax.swing.JFrame;

public class C01SwingMain {

	public static void main(String[] args) {
		JFrame frame=new JFrame("첫번쨰 프레임입니다");
		frame.setBounds(100,100,500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

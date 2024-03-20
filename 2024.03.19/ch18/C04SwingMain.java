package Ch18;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
class C04GUI extends JFrame{
	C04GUI(){
		super("두번째 프레임입니다.");
		setBounds(100,100,250,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		Panel생성
		JPanel panel=new JPanel();
		panel.setLayout(null);
//		배경색지정
		Color col=new Color(237,247,183);
		panel.setBackground(col);
		
//		btn_component 추가
		JButton btn1 =new JButton("button01");
		btn1.setBounds(10,10,100,30);
		JButton btn2 =new JButton("button02");
		btn2.setBounds(120,10,100,30);
		
//		TextField_component 추가
		JTextField text1=new JTextField();
		text1.setBounds(10,50,210,30);
		
		JTextField text2=new JTextField();
		text2.setBounds(10,90,210,30);
//		TExtArea_component 추가
		JTextArea area1=new JTextArea();
//		area1.setBounds(10,140,210,100);
		
//		ScrollPanel_component 추가
		JScrollPane scroll=new JScrollPane(area1);
		scroll.setBounds(10,130,210,200);
		

//		Component를 Panel에 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(text1);
		panel.add(text2);
//		panel.add(area1);
		panel.add(scroll);

		
//		Frame에 Panel을 추가
		add(panel);
		setVisible(true);
	}
}

public class C04SwingMain {

	public static void main(String[] args) {
		
		new C04GUI();

	}

}

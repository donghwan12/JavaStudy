package Ch18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
class C05GUI extends JFrame implements ActionListener,KeyListener,MouseListener{
	JButton btn1;
	JButton btn2;
	JTextField text1;
	JTextField text2;
	JTextArea area1;
	JScrollPane scroll;
	C05GUI(){
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
		btn1 =new JButton("button01");
		btn1.setBounds(10,10,100,30);
		
		btn2 =new JButton("button02");
		btn2.setBounds(120,10,100,30);
		
//		TextField_component 추가
		text1=new JTextField();
		text1.setBounds(10,50,210,30);
		
		text2=new JTextField();
		text2.setBounds(10,90,210,30);
//		TExtArea_component 추가
		area1=new JTextArea();
//		area1.setBounds(10,140,210,100);
		
//		ScrollPanel_component 추가
		scroll=new JScrollPane(area1);
		scroll.setBounds(10,130,210,200);
		

//		Event에 Component 등록
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		text1.addKeyListener(this);
//		text2.addKeyListener(this);
		area1.addMouseListener(this);
		
		
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

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==btn1) {
			System.out.println("BTN1 Clicked...");//콘솔창에 뜬다
		}else if(e.getSource()==btn2) {
			System.out.println("Btn2 Cliked..");
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
//		키를 눌렀을때/떗을때
//		System.out.println("keyTpyed.."+e.getKeyChar());
		if(e.getSource()==text1) {
			if(e.getKeyCode()==13) {
				//text1에 있는 문자열을 text.area에 전달	
				//text1의 값은 초기화를 시켜줘야한다.
				String meassage=text1.getText();
				area1.append(meassage+"\n");
				text1.setText("");
			}
		}
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
//			키를 눌럿을때
//		System.out.println("KeyPressed.."+e.getKeyChar());
//		System.out.println("keyPressed..."+e.getKeyCode());
	}
	@Override
	public void keyReleased(KeyEvent e) {
//				키를 땟을떄
//		System.out.println("Keyreleaseed.."+e.getKeyChar());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		try {
				System.out.println("MouseClicked.."+e.getPoint());
				int offset =area1.viewToModel(e.getPoint());
				System.out.println("offset:"+ offset);
				int row=area1.getLineOfOffset(offset);
				int StartOffset=area1.getLineStartOffset(row);
				int endOffset=area1.getLineEndOffset(row);
				
				String getStr=area1.getText(StartOffset,endOffset-StartOffset);
				System.out.println("message:"+getStr);
				System.out.println("row:"+row);
		} catch (BadLocationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class C05SwingMain2 {

	public static void main(String[] args) {
		
		new C05GUI();

	}

}

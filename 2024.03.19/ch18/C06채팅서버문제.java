package Ch18;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class G06GUI extends JFrame implements ActionListener,KeyListener{
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JTextField text1;
	JTextArea area1;
	 JScrollPane scroll;
    G06GUI() {
        super("Chatting Server");
        setBounds(500,500,500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(null); // 절대 위치에 배치할 것이므로 null 레이아웃 설정하지만, 추천되는 방식은 아님
        Color col = new Color(237, 247, 183);
        panel.setBackground(col);
        
        btn1 = new JButton("파일로 저장");
        btn1.setBounds(300,20, 150, 30);
        
        btn2=new JButton("1:1 대화");
        btn2.setBounds(300,70,150,30);
        
        btn3=new JButton("대화기록 보기");
        btn3.setBounds(300,120,150,30);
        
        btn4=new JButton("입력");
        btn4.setBounds(300,300,150,30);
        
        
        text1=new JTextField();
        text1.setBounds(10,300,250,30);
        
        area1=new JTextArea();

        scroll=new JScrollPane(area1);
        scroll.setBounds(10,10,250,250);
        
//        panel에 기능추가
        panel.add(text1);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(scroll);
        
//        event에 component 등록
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        text1.addKeyListener(this);
        scroll.addKeyListener(this);
        
        
        
        add(panel); // 프레임에 패널 추가
        setVisible(true); // setVisible 위치 변경 (컴포넌트 추가 후에 호출해야 함)
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			System.out.println("파일로 저장 되었습니다..");	
		}else if(e.getSource()==btn2) {
			System.out.println("1:1요청입니다");
		}else if(e.getSource()==btn3) {
			System.out.println("대화기록을 봅니다");
		}
		if(e.getSource()==btn4) {
			System.out.println("입력...");
		}
		

		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("key입력되었습니다..."+e.getKeyChar());
		if(e.getSource()==text1) {
			if(e.getKeyCode() !=10 &&e.getKeyCode()!=13) {
				String massge=text1.getText();
				area1.append(massge+"\n");
				text1.setText("");
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

public class C06채팅서버문제 {
    
    public static void main(String[] args) {
        new G06GUI();
    }
}

package Finally;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Frame_index extends JFrame {
	public static void main(String args[]) {
		Frame_index demo = new Frame_index();//ʵ����demo
    }
	 public Frame_index() {
	        init();
	        this.setTitle("ѧ��ѡ��ϵͳ");
			this.setSize(400, 420);
			this.setVisible(true);
	    }
	public void init() { 
		JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton btn1=new JButton("ѧ��ѡ��");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("����", Font.PLAIN, 16));
		btn1.setBounds(36, 56, 138, 102);
		btn1.addActionListener(new ActionListener(){//�����¼�
			public void actionPerformed(ActionEvent arg0) {
			ChoiseCourse choice=new ChoiseCourse();//�����ťʱ����choice����ʵ����������ҳ�����ת
			}
		});
		JButton btn2=new JButton("ѧ���˿�");
		btn2.setFont(new Font("����", Font.PLAIN, 16));
		btn2.setBounds(202, 56, 138, 102);
		btn2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				CancelCourse quit=new CancelCourse();
			}
		});
		JButton btn3=new JButton("��ѯ��ѡ�γ�");
		btn3.setFont(new Font("����", Font.PLAIN, 16));
		btn3.setBounds(121, 200, 138, 102);
		btn3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			PrintCourse print=new PrintCourse();
			}
		});
	    panel.setLayout(null);
	    panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		getContentPane().add(panel);
	}
}
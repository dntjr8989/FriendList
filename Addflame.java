import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addflame extends JFrame {

	public Addflame()
	{
		super("추가될 친구 정보");
		
		this.setLayout(new GridLayout(1, 6));
		
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(2, 1));
		JLabel t = new JLabel("이름");
		JTextField p = new JTextField(13);
		panel1.add(t);
		panel1.add(p);
		this.add(panel1);
		
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(2, 1));
		t = new JLabel("그룹");
		p = new JTextField(13);
		panel2.add(t);
		panel2.add(p);
		this.add(panel2);
		
		Panel panel3 = new Panel();
		panel3.setLayout(new GridLayout(2, 1));
		t = new JLabel("전화");
		p = new JTextField(13);
		panel3.add(t);
		panel3.add(p);
		this.add(panel3);
		
		Panel panel4 = new Panel();
		panel4.setLayout(new GridLayout(2, 1));
		t = new JLabel("Email");
		p = new JTextField(13);
		panel4.add(t);
		panel4.add(p);
		this.add(panel4);
		
		Panel panel5 = new Panel();
		panel5.setLayout(new GridLayout(2, 1));
		t = new JLabel("사진");
		p = new JTextField(13);
		panel5.add(t);
		panel5.add(p);
		this.add(panel5);
		
		Panel panel6 = new Panel();
		panel6.setLayout(new GridLayout(1, 1));
		JButton doneB = new JButton("Done");
		panel6.add(doneB);
		this.add(panel6);
		
		setSize(800, 200);
		setLocation(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		ActionListener donelistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("done 눌림");
			}
		};
		doneB.addActionListener(donelistener);
	}
}

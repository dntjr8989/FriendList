import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendListGUI extends JFrame{
	
	FriendList fl = new FriendList();
	FriendListFile tt = new FriendListFile();
	public FriendListGUI() {
		super("ģ�����");
	
		this.setLayout(new GridLayout(1, 7));
		
		fl = tt.readFileToList("friendlist-norm.data");
		
		//üũ�ڽ�
		Panel panel1 = new Panel();
		panel1.setLayout(new GridLayout(20, 1));
		JLabel t = new JLabel("");
		panel1.add(t);
		
		JCheckBox[] c = new JCheckBox[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			c[i] = new JCheckBox();
			panel1.add(c[i]);
		}
		this.add(panel1);
		
		//�̸�
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(20, 1));
		t = new JLabel("�̸�");
		panel2.add(t);
		
		JLabel[] n = new JLabel[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			n[i] = new JLabel(fl.Flist[i].getName());
			panel2.add(n[i]);
		}
		this.add(panel2);
		
		//�׷�
		Panel panel3 = new Panel();
		panel3.setLayout(new GridLayout(20, 1));
		t = new JLabel("�׷�");
		panel3.add(t);
		JTextField[] g = new JTextField[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			g[i] = new JTextField(fl.Flist[i].getGroup());
			panel3.add(g[i]);
		}
		this.add(panel3);
		
		//��ȭ��ȣ
		Panel panel4 = new Panel();
		panel4.setLayout(new GridLayout(20, 1));
		t = new JLabel("��ȭ��ȣ");
		panel4.add(t);
		JTextField[] ph = new JTextField[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			ph[i] = new JTextField(fl.Flist[i].getPhonenumber(), 13);
			panel4.add(ph[i]);
		}
		this.add(panel4);
		
		//Email
		Panel panel5 = new Panel();
		panel5.setLayout(new GridLayout(20, 1));
		t = new JLabel("Email");
		panel5.add(t);
		
		JTextField[] e = new JTextField[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			e[i] = new JTextField(fl.Flist[i].getEmail());
			panel5.add(e[i]);
		}
		this.add(panel5);
		
		//����
		Panel panel6 = new Panel();
		panel3.setLayout(new GridLayout(20, 1));
		t = new JLabel("����");
		panel6.add(t);
		this.add(panel6);
		
		//��ư
		Panel panel7 = new Panel();
		panel7.setLayout(new GridLayout(4, 1));
		JButton addB = new JButton("Add");
		JButton deleteB = new JButton("Delete");
		JButton modifyB = new JButton("Modify");
		JButton savefileB = new JButton("Save File");
		panel7.add(addB);
		panel7.add(deleteB);
		panel7.add(modifyB);
		panel7.add(savefileB);
		this.add(panel7);
		
		
		setSize(1000, 500);
		setLocation(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
		ActionListener addlistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				Addflame temp = new Addflame();
				System.out.println("Add ����");
			}
		};
		addB.addActionListener(addlistener);
		
		ActionListener deletelistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("delete ����");
			}
		};
		deleteB.addActionListener(deletelistener);
		
		ActionListener modifylistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("modify ����");
			}
		};
		modifyB.addActionListener(modifylistener);
		
		ActionListener savefilelistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("savefile ����");
			}
		};
		savefileB.addActionListener(savefilelistener);
	}
}

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FriendListGUI extends JFrame{
	
	FriendList fl = new FriendList();
	FriendListFile tt = new FriendListFile();
	public FriendListGUI() {
		super("친구목록");
	
		this.setLayout(new GridLayout(1, 7));
		
		fl = tt.readFileToList("friendlist-norm.data");
		
		//체크박스
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
		
		//이름
		Panel panel2 = new Panel();
		panel2.setLayout(new GridLayout(20, 1));
		t = new JLabel("이름");
		panel2.add(t);
		
		JLabel[] n = new JLabel[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			n[i] = new JLabel(fl.Flist[i].getName());
			panel2.add(n[i]);
		}
		this.add(panel2);
		
		//그룹
		Panel panel3 = new Panel();
		panel3.setLayout(new GridLayout(20, 1));
		t = new JLabel("그룹");
		panel3.add(t);
		JTextField[] g = new JTextField[20];
		for(int i=0; i<fl.numFriends(); i++)
		{
			g[i] = new JTextField(fl.Flist[i].getGroup());
			panel3.add(g[i]);
		}
		this.add(panel3);
		
		//전화번호
		Panel panel4 = new Panel();
		panel4.setLayout(new GridLayout(20, 1));
		t = new JLabel("전화번호");
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
		
		//사진
		Panel panel6 = new Panel();
		panel3.setLayout(new GridLayout(20, 1));
		t = new JLabel("사진");
		panel6.add(t);
		this.add(panel6);
		
		//버튼
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
				System.out.println("Add 눌림");
			}
		};
		addB.addActionListener(addlistener);
		
		ActionListener deletelistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("delete 눌림");
			}
		};
		deleteB.addActionListener(deletelistener);
		
		ActionListener modifylistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("modify 눌림");
			}
		};
		modifyB.addActionListener(modifylistener);
		
		ActionListener savefilelistener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("savefile 눌림");
			}
		};
		savefileB.addActionListener(savefilelistener);
	}
}

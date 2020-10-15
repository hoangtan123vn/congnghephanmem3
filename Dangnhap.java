import java.awt.*;
import java.awt.event.*;
class Dangnhap extends Frame implements ActionListener {
	private Button b1;
	private Label l1,l2;
	private TextField tf1,tf2;
	Dangnhap(){
		setLayout (new FlowLayout ());
		setLocation ( 500,100);
		setSize (200,100);
		l1= new Label ("Ten");
		tf1 = new TextField("",10);
		l2= new Label ("Mat khau");
		tf2 = new TextField("",10);
		b1=new Button ("Dang nhap");
		tf1.addActionListener(this);
		tf2.addActionListener(this);
		b1.addActionListener (this);
		add (l1);
		add (tf1);
		add (l2);
		add (tf2);
		add(b1);
		setVisible (true);
	}
	public void actionPerformed (ActionEvent e){
		if (e.getSource()== b1)
			new TextMessage(); 
	}
	public static void main(String[] args) {
		new Dangnhap();
	}
}
ngu
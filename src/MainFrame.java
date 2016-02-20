import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;


public class MainFrame extends JFrame{
	
	private DisplayPanel displaypanel;
	private MyGridLayout mygridlayout;
	
	
	
	public MainFrame(){
		//super("Calculator");
		setTitle("Calculator");
		setLayout(new BorderLayout());
		
		
		displaypanel=new DisplayPanel();
		mygridlayout=new MyGridLayout();
		
		mygridlayout.setDisplayPanel(displaypanel);
		
		
		
		add(displaypanel,BorderLayout.NORTH);
		add(mygridlayout,BorderLayout.CENTER);
		setLocation(500,100);
		pack();
		setResizable(false);
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);
	}
}
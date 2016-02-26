import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class MainFrame extends JFrame implements KeyListener{
	
	private DisplayPanel displaypanel;
	private MyGridLayout mygridlayout;
	
	public MainFrame(){
		//super("Calculator");
		setTitle("Calculator");
		setLayout(new BorderLayout());
		
		
		displaypanel=new DisplayPanel();
		mygridlayout=new MyGridLayout(this,displaypanel);
		
		mygridlayout.setDisplayPanel(displaypanel);
		
		
		addKeyListener(this); 
		add(displaypanel,BorderLayout.NORTH);
		add(mygridlayout,BorderLayout.CENTER);
		setLocation(500,100);
		pack();
		setResizable(false);
		setFocusable(true);
        setFocusTraversalKeysEnabled(false);
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setVisible(true);	    
	    
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println("key");
        int bno;
		
		char code=e.getKeyChar();
		//System.out.println(code);
	
		int keyCode = e.getKeyCode();
		//System.out.println(keyCode);

		
		if(keyCode==110 || keyCode==46 || keyCode==190)  	displaypanel.appendText(".");
		
		if(keyCode==107 || keyCode==43 || code=='+' ){
			bno=1;
	        mygridlayout.forkeyvariable(bno);
			displaypanel.appendText1("+");
			}
		if(keyCode==109 || keyCode==45){
			bno=2;
			mygridlayout.forkeyvariable(bno);
			displaypanel.appendText1("-");
		}
		if(keyCode==106 || keyCode== 42 || code=='*'){
			bno=3;
			mygridlayout.forkeyvariable(bno);
			displaypanel.appendText1("*");
		}
		
		if(keyCode==111 || keyCode==47 || keyCode==191){
			bno=4;
			mygridlayout.forkeyvariable(bno);
			displaypanel.appendText1("/");
		}
		if(code=='^'){
			bno=7;
			mygridlayout.forkeyvariable(bno);
			displaypanel.appendText1("^");
		}	
		
		
		if((keyCode>= 48 && keyCode <= 57) || (keyCode >= 96 && keyCode <= 105)){
			if(keyCode>95)
				displaypanel.appendText(Integer.toString(keyCode-96));
			else if(code!='!' && code!='@' && code!='#' && code!='$' && code!='%' && code!='^' &&  code!='&' && code!='*' &&  code!='(' && code!=')' && code!='-' && code!='+' )
				displaypanel.appendText(Integer.toString(keyCode-48));
		}
		
		if(keyCode==10 || (keyCode==61 && code!='+')){
			mygridlayout.somethinghappen();
			try { 
			    if(keyCode==61)	 
				System.out.println(""); 
				}
			 catch (ArithmeticException e1) {  // catch = sign of upper key
				System.out.println(""); 
				} 
			}
		
		if(keyCode==127)    displaypanel.setText("0");
		
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
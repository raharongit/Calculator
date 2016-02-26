import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class DisplayPanel extends JPanel{
	
	private JTextField displayarea;
	public static String s="",s1="";
	public DisplayPanel(){
		
	     displayarea = new JTextField("0",10);
	    displayarea.setAlignmentX(LEFT_ALIGNMENT);
		displayarea.setEditable(false);
	     
	     displayarea.setHorizontalAlignment(JTextField.RIGHT);
	     
	     Font font = new Font("Times New Roman", Font.BOLD,25);
         //set font for JTextField
         displayarea.setFont(font);
         displayarea.setBackground(Color.BLACK);
         displayarea.setForeground(Color.WHITE);
      
		setLayout(new BorderLayout());
		add(displayarea,BorderLayout.CENTER);
		
	}
	
	public void appendText(String text){
		s=s+text;
		displayarea.setText(s1+s);
		}
	
	public void appendText1(String text){
		displayarea.setText(s+text);
		s1=s+text;
		s="";
		}
	
	public void setText(String text){
		displayarea.setText(text);
		s=""; s1="";}
	 
	 
	 public String getText(){
		 return s;
		 }

	}
	
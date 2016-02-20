import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DisplayPanel extends JPanel{
	
	private JTextArea displayarea;
	public static String s="";
	public DisplayPanel(){
		
		displayarea=new JTextArea(2,0);
		displayarea.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		displayarea.setFont(new Font("Times New Roman", 1, 20));
		displayarea.setEditable(false);
		setLayout(new BorderLayout());
		add(displayarea,BorderLayout.CENTER);
	}
	
	public void appendText(String text){
		s=s+text;
		displayarea.append(text);
		}
	
	public void appendText1(String text){

		displayarea.append(text);
		s="";
		}
	
	public void setText(String text){
		displayarea.setText(text);
		s="";}
	 
	 
	 public String getText(){
		 return s;}
	}
	
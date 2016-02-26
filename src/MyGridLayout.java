import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JButton;
import javax.swing.JPanel;


public class MyGridLayout extends JPanel implements ActionListener{

	private JButton jbt[];
	private JPanel jpl;
	MainFrame frame;
	private GridBagLayout layout;
	private GridBagConstraints gbc;
	private DisplayPanel displaypanel;
	public static double a, b, result=0;
	public static int btnno=0,count=0;
	private String s;

	public MyGridLayout(MainFrame mainFrame, DisplayPanel display) {
	    frame=mainFrame;
		layout = new GridBagLayout();
		setLayout(layout);
		gbc = new GridBagConstraints();
        
		displaypanel=display;
		
		jbt = new JButton[21];
		for (int i = 0; i < 10; i++) {
			jbt[i] = new JButton(String.valueOf(i));
		}
		jbt[10] = new JButton("+");
		jbt[11] = new JButton("-");
		jbt[12] = new JButton("*");
		jbt[13] = new JButton("/");
		jbt[14] = new JButton("=");
		jbt[15] = new JButton("±");
		jbt[16] = new JButton("√");
		jbt[17] = new JButton("x²");
		jbt[18] = new JButton(".");
		jbt[19] = new JButton("^");
		jbt[20] = new JButton("All Clear");

		// first row
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 5;
		add(jbt[20], gbc);

		// second row
		for (int i = 1, j = 0; i < 4; i++) {
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = j;
			gbc.gridy = 1;
			gbc.gridwidth = 1;
			add(jbt[i], gbc);
			j++;
		}

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 1;
		add(jbt[10], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 1;
		add(jbt[15], gbc);

		// third row
		for (int i = 4, j = 0; i < 7; i++) {
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = j;
			gbc.gridy = 2;
			add(jbt[i], gbc);
			j++;
		}

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 2;
		add(jbt[11], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 2;
		add(jbt[16], gbc);

		// fourth row
		for (int i = 7, j = 0; i < 10; i++) {
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = j;
			gbc.gridy = 3;
			add(jbt[i], gbc);
			j++;
		}
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 3;
		add(jbt[12], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 3;
		add(jbt[17], gbc);

		// fifth row
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 4;
		add(jbt[18], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 4;
		add(jbt[0], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 4;
		add(jbt[14], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 3;
		gbc.gridy = 4;
		add(jbt[13], gbc);

		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 4;
		gbc.gridy = 4;
		add(jbt[19], gbc);

		for (int i = 0; i < jbt.length; i++) {

			jbt[i].addActionListener(this);
			
		}

	}

	public void setDisplayPanel(DisplayPanel displaypanel) {

		this.displaypanel = displaypanel;
	}

	public void actionPerformed(ActionEvent e) {
	
		frame.requestFocusInWindow();
		if (e.getSource() == jbt[0])
		{
			displaypanel.appendText("0");
			System.out.println(e.getSource());
		}
		if (e.getSource() == jbt[1])
			displaypanel.appendText("1");
		if (e.getSource() == jbt[2])
			displaypanel.appendText("2");
		if (e.getSource() == jbt[3])
			displaypanel.appendText("3");
		if (e.getSource() == jbt[4])
			displaypanel.appendText("4");
		if (e.getSource() == jbt[5])
			displaypanel.appendText("5");
		if (e.getSource() == jbt[6])
			displaypanel.appendText("6");
		if (e.getSource() == jbt[7])
			displaypanel.appendText("7");
		if (e.getSource() == jbt[8])
			displaypanel.appendText("8");
		if (e.getSource() == jbt[9])
			displaypanel.appendText("9");
		if (e.getSource() == jbt[18])
			displaypanel.appendText(".");
		if (e.getSource() == jbt[15])
			displaypanel.appendText("-");

		if (e.getSource() == jbt[20])
			displaypanel.setText("0");

		if (e.getSource() == jbt[10]) {
			if(count==0)a = Double.parseDouble(displaypanel.getText());
			if(count>0){
				somethinghappen();
				a=result;
			}
			btnno = 1;
			displaypanel.appendText1("+");
			count++;
		}
		if (e.getSource() == jbt[11]) {
			if(count==0)a = Double.parseDouble(displaypanel.getText());
			if(count>0){
				somethinghappen();
				a=result;
			}
			btnno = 2;
			displaypanel.appendText1("-");
			count++;
		}
		if (e.getSource() == jbt[12]) {
			if(count==0)a = Double.parseDouble(displaypanel.getText());
			if(count>0){
				somethinghappen();
				a=result;
			}
			btnno = 3;
			displaypanel.appendText1("*");
			count++;
		}
		if (e.getSource() == jbt[13]) {
			if(count==0)a = Double.parseDouble(displaypanel.getText());
			if(count>0){
				somethinghappen();
				a=result;
			}
			btnno = 4;
			displaypanel.appendText1("/");
			count++;
		}
		
		 if(e.getSource()==jbt[16]){
		  a = Double.parseDouble(displaypanel.getText());
		  btnno=5;
		  displaypanel.setText(null);
		 displaypanel.appendText1("sqrt("+a+")"); 
		 }
		 
		 if(e.getSource()==jbt[17]){
		 a=Double.parseDouble(displaypanel.getText());
		 btnno=6;
		 displaypanel.setText(null);
		 displaypanel.appendText1(a+"^2"); 
		 }
		
		  if(e.getSource()==jbt[19]){
		  a=Double.parseDouble(displaypanel.getText()); 
		  btnno=7;
		  displaypanel.appendText1("^");
		  }
		
		if (e.getSource() == jbt[14]) {
			
			count=0;
			somethinghappen();
		}
		
	}
	
	
	public void forkeyvariable(int b1){
		
		if(count==0)a = Double.parseDouble(displaypanel.getText());
		if(count>0){
			somethinghappen();
			a=result;
		}
		btnno = b1;
		count++;
	}
	
	public void somethinghappen(){
		
		if(btnno!=5 && btnno!=6)
		b = Double.parseDouble(displaypanel.getText());
		
		 System.out.println(a);
		 System.out.println(b);
		switch (btnno) {

		
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;
		case 5: 
			result=Math.sqrt(a); 
			break;
		case 6:
			result=Math.pow(a,2);
			break;
		case 7:
			result = Math.pow(a, b);
			break;
		default:
			result = 0;
		}
		displaypanel.setText(null);
		
	
		NumberFormat nf= NumberFormat.getInstance();
		nf.setMaximumFractionDigits(4);
		nf.setMinimumFractionDigits(0);
		
		//System.out.println("%.2f", result);		 
		displaypanel.appendText((nf.format(result)));
	}

}
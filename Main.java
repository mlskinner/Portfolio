package mp3;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
//import java.io.ObjectInputFilter.Status;
//import javax.swing.BoxLayout;
//import java.axt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main implements ActionListener{
	private JFrame frame;
	private JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, min, mult, div, percent, eq, pm;
	private JButton oneN, sqr, dec, clear, mod, xsq, xcub;
	private JButton sin, cos, tan, log, ln, asin, acos, atan, raise, abs, sinh, cosh, tanh, exit;
	private JTextField outputText, inputText;
	private double n1=0, n2=0, result = 0;
	private String display, input;
	private String f;
	private double a = 0;
	private int op;
	private String temp, temporary, keep;
	private Character character;
	private Boolean isDec;
	public static void main(String [] args) {
		Main calc = new Main();
	}
	
	public Main() {
		
		//main frame
		frame = new JFrame("Calculator");
		frame.setSize(350, 500);
		frame.getContentPane().setBackground(Color.GRAY);
		GridBagLayout gbLayout = new GridBagLayout();
		GridBagConstraints gbConstraints = new GridBagConstraints();
		frame.setLayout(gbLayout);
		gbConstraints.fill = GridBagConstraints.HORIZONTAL;
		
		//j panel for spacing 
		JPanel jp = new JPanel();
		jp.setBackground(Color.GRAY);
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 8;
		gbConstraints.gridwidth = 4;
		frame.add(jp, gbConstraints);
		
		
		//text field 1
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 0;
		gbConstraints.gridwidth = 4;
		inputText = new JTextField(30);
		frame.add(inputText, gbConstraints);
		inputText.setBackground(Color.green);
		
		//text field 2
		gbConstraints.gridx = 0;
		gbConstraints.gridy = 1;
		gbConstraints.gridwidth = 4;
		outputText = new JTextField(30);
		frame.add(outputText, gbConstraints);
		outputText.setBackground(Color.green);
		outputText.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//main buttons
		
				//button 1
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=5;
		one = new JButton("1");
		frame.add(one, gbConstraints);
		one.addActionListener(this);
				//button 2
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=5;
		two = new JButton("2");
		frame.add(two, gbConstraints);
		two.addActionListener(this);
				//button 3
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=5;
		three = new JButton("3");
		frame.add(three, gbConstraints);
		three.addActionListener(this);
				//button 4
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=4;
		four = new JButton("4");
		frame.add(four, gbConstraints);
		four.addActionListener(this);
				//button 5
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=4;
		five = new JButton("5");
		frame.add(five, gbConstraints);
		five.addActionListener(this);
				//button 6
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=4;
		six = new JButton("6");
		frame.add(six, gbConstraints);
		six.addActionListener(this);
				//button 7
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=3;
		seven = new JButton("7");
		frame.add(seven, gbConstraints);
		seven.addActionListener(this);
				//button 8
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=3;
		eight = new JButton("8");
		frame.add(eight, gbConstraints);
		eight.addActionListener(this);
				//button 9 
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=3;
		nine = new JButton("9");
		frame.add(nine, gbConstraints);
		nine.addActionListener(this);
				//button 0
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=6;
		zero = new JButton("0");
		frame.add(zero, gbConstraints);
		zero.addActionListener(this);
		
		
		//symbol buttons
		
				//button +
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=5;
		plus = new JButton("+");
		frame.add(plus, gbConstraints);
		plus.addActionListener(this);
		
				//button -
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=9;
		min = new JButton("-");
		frame.add(min, gbConstraints);
		min.addActionListener(this);
		
				//button /
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=4;
		div = new JButton("÷");
		frame.add(div, gbConstraints);
		div.addActionListener(this);
		
				//button *
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=3;
		mult = new JButton("*");
		frame.add(mult, gbConstraints);
		mult.addActionListener(this);
		
				//button % 
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=9;
		percent = new JButton("%");
		frame.add(percent, gbConstraints);
		percent.addActionListener(this);
		//change dimensions
		
				//button +/-
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=7;
		pm = new JButton("±");
		frame.add(pm, gbConstraints);
		pm.addActionListener(this);
		
				//button =
		gbConstraints.gridwidth=2;
		gbConstraints.gridx=2;
		gbConstraints.gridy=6;
		eq = new JButton("=");
		frame.add(eq, gbConstraints);
		eq.addActionListener(this);
		
				//button 1/n
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=7;
		oneN = new JButton("1/n");
		frame.add(oneN, gbConstraints);
		oneN.addActionListener(this);
		
				//button square root
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=7;
		sqr = new JButton("√");
		frame.add(sqr, gbConstraints);
		sqr.addActionListener(this);
		
				//button decimal
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=6;
		dec = new JButton(".");
		frame.add(dec, gbConstraints);
		dec.addActionListener(this);
		
				//button c/clear
		
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=2;
		clear = new JButton("C");
		frame.add(clear, gbConstraints);
		clear.addActionListener(this);
		
				//button "mod"
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=7;
		mod = new JButton("Mod");
		frame.add(mod, gbConstraints);
		mod.addActionListener(this);
		
				//button x^2
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=9;
		xsq = new JButton("x²");
		frame.add(xsq, gbConstraints);
		xsq.addActionListener(this);
		
				//button x^3
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=9;
		xcub = new JButton("x³");
		frame.add(xcub, gbConstraints);
		xcub.addActionListener(this);
		
		
		//scientific buttons 
		
				//button sin
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=10;
		sin = new JButton("sin");
		frame.add(sin, gbConstraints);
		sin.addActionListener(this);
		
				//button cos
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=12;
		cos = new JButton("cos");
		frame.add(cos, gbConstraints);
		cos.addActionListener(this);
		
				//button tan
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=10;
		tan = new JButton("tan");
		frame.add(tan, gbConstraints);
		tan.addActionListener(this);
		
		
				//button log
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=10;
		log = new JButton("log");
		frame.add(log, gbConstraints);
		log.addActionListener(this);
		
		
				//button natural log
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=13;
		ln = new JButton("ln");
		frame.add(ln, gbConstraints);
		ln.addActionListener(this);
		
				//button asin
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=10;
		asin = new JButton("asin");
		frame.add(asin, gbConstraints);
		asin.addActionListener(this);
		
				//button acos
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=11;
		acos = new JButton("acos");
		frame.add(acos, gbConstraints);
		acos.addActionListener(this);
		
				//button atan
		
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=11;
		atan = new JButton("atan");
		frame.add(atan, gbConstraints);
		atan.addActionListener(this);
		
				//button 10^n
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=11;
		raise = new JButton("10^n");
		frame.add(raise, gbConstraints);
		raise.addActionListener(this);
		
				//button abs
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=3;
		gbConstraints.gridy=11;
		abs = new JButton("abs");
		frame.add(abs, gbConstraints);
		abs.addActionListener(this);
		
				//button sinh
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=0;
		gbConstraints.gridy=12;
		sinh = new JButton("sinh");
		frame.add(sinh, gbConstraints);
		sinh.addActionListener(this);
		
				//button tanh
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=1;
		gbConstraints.gridy=12;
		tanh = new JButton("tanh");
		frame.add(tanh, gbConstraints);
		tanh.addActionListener(this);
		
				//button cosh
		gbConstraints.gridwidth=1;
		gbConstraints.gridx=2;
		gbConstraints.gridy=12;
		cosh = new JButton("cosh");
		frame.add(cosh, gbConstraints);
		cosh.addActionListener(this);
		
		
		//exit button 
		gbConstraints.gridwidth=2;
		gbConstraints.gridx=2;
		gbConstraints.gridy=13;
		exit = new JButton("EXIT");
		frame.add(exit, gbConstraints);
		exit.addActionListener(this);
		
		// need to change dimensions for all the buttons
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//base num functions
		
			//one
		String st = e.getActionCommand();
		if (e.getSource() == one) {
			inputText.setText(inputText.getText().concat("1"));	
			
		}
			//two
		if (e.getSource() == two) {
		
			inputText.setText(inputText.getText().concat("2"));	
		}
			//3
		if (e.getSource() == three) {
			
				inputText.setText(inputText.getText().concat("3"));	
		}
				//4
		if (e.getSource() == four) {
		
				inputText.setText(inputText.getText().concat("4"));
		}
			//5
		if (e.getSource() == five) {
			
				inputText.setText(inputText.getText().concat("5"));	
			
		}
			//6
		if (e.getSource() == six) {
			
				inputText.setText(inputText.getText().concat("6"));
			
		}
			//7
		if (e.getSource() == seven) {
		
				inputText.setText(inputText.getText().concat("7"));
			
		}
			//8
		if (e.getSource() == eight) {
			
				inputText.setText(inputText.getText().concat("8"));
		}
			//9
		if (e.getSource() == nine) {
			
				inputText.setText(inputText.getText().concat("9"));

		}
			//0
		if (e.getSource() == zero) {
			
				inputText.setText(inputText.getText().concat("0"));
	
		}
		
		// decimal 
		if (e.getSource() == dec) {
			
			inputText.setText(inputText.getText().concat("."));
			isDec = true;
		}
	
		
		//sin
		if (e.getSource() == sin) {
				
				//inputText.setText(inputText.getText().concat("sin"));
				n1 = Double.parseDouble(inputText.getText());
				result = Math.sin(Math.toRadians(n1));	
				input = "sin("+n1+")";
				inputText.setText(input);
				n1 = result;		
				
		}
		//cos
		if (e.getSource() == cos) {
				
				//inputText.setText(inputText.getText().concat("cos"));
				n1 = Double.parseDouble(inputText.getText());
				result = Math.cos(Math.toRadians(n1));	
				input = "cos("+n1+")";
				inputText.setText(input);
				n1 = result;		
				
		}
		//tan
		if (e.getSource() == tan) {
				
				//inputText.setText(inputText.getText().concat("tan"));
				n1 = Double.parseDouble(inputText.getText());
				result = Math.tan(Math.toRadians(n1));	
				input = "tan("+n1+")";
				inputText.setText(input);
				n1 = result;
				
		}
		
		//sinh
				if (e.getSource() == sinh) {
					
						
					n1 = Double.parseDouble(inputText.getText());
					result = Math.sinh(Math.toRadians(n1));	
					input = "sinh("+n1+")";
					inputText.setText(input);
					n1 = result;
				}
		//cosh
			if (e.getSource() == cosh) {
				
				//inputText.setText(inputText.getText().concat("cosh"));
				n1 = Double.parseDouble(inputText.getText());
				result = Math.cosh(Math.toRadians(n1));	
				input = "cosh("+n1+")";
				inputText.setText(input);
				n1 = result;				
						
				}
		//tanh
			if (e.getSource() == tanh) {
				
				
				n1 = Double.parseDouble(inputText.getText());
				result = Math.tanh(Math.toRadians(n1));	
				input = "tanh("+n1+")";
				inputText.setText(input);
				n1 = result;
						
			}
				
	//asin
			if (e.getSource() == asin) {
				
					
				n1 = Double.parseDouble(inputText.getText());
				result = Math.asin(Math.toRadians(n1));	
				input = "asin("+n1+")";
				inputText.setText(input);
				n1 = result;
			}
	//acos
		if (e.getSource() == acos) {
			
			
			n1 = Double.parseDouble(inputText.getText());
			result = Math.acos(Math.toRadians(n1));	
			input = "atan("+n1+")";
			inputText.setText(input);
			n1 = result;				
					
			}
	//atan
		if (e.getSource() == atan) {
			
			
			n1 = Double.parseDouble(inputText.getText());
			result = Math.atan(Math.toRadians(n1));	
			input = "atan("+n1+")";
			inputText.setText(input);
			n1 = result;
					
		}		
		
		
		
		
		
		
		//addition
		if (e.getSource() == plus) {
			op = 1;
			n1 = Double.parseDouble(inputText.getText());
			temp = inputText.getText().concat("+");
			
			inputText.setText(inputText.getText().concat("+"));
		
			
			isDec = false;
			if(isDec) {
				inputText.setText(n1 + "+");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}	
			
			//subtraction
		if (e.getSource() == min) {
			op = 2;
			n1 = Double.parseDouble(inputText.getText());
			temp = inputText.getText().concat("-");
			inputText.setText(inputText.getText().concat("-"));
			
			isDec = false;
			if(isDec) {
				inputText.setText(n1 + "-");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}
			//multiplication
		if (e.getSource() == mult) {
			op = 4;
			n1 = Double.parseDouble(inputText.getText());
			temp = inputText.getText().concat("*");
			inputText.setText(inputText.getText().concat("*"));
			
			isDec = false;
			if(isDec) {
				inputText.setText(n1 + "*");
			}
			else if(! isDec) {
				outputText.setText("");
				//doesn't work
			}
		}	
			//division
		if (e.getSource() == div) {
			op = 3;
			n1 = Double.parseDouble(inputText.getText());
			temp = inputText.getText().concat("÷");
			inputText.setText(inputText.getText().concat("÷"));
			
			isDec = false;
			if(isDec) {
				inputText.setText(n1 + "÷");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}	
			// percent
		if (e.getSource() == percent) {
			op = 5;
			n1 = Double.parseDouble(inputText.getText());
			temp = inputText.getText().concat("%");
			inputText.setText(inputText.getText().concat("%"));
			
			isDec = false;
			if(isDec) {
				inputText.setText(n1+ "%");
			}
			else if(! isDec) {
				outputText.setText(" ");
			}
		}	
		
		
		
		
		
			// squared
		if (e.getSource() == xsq) {
			op = 6;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText(inputText.getText().concat("²"));
			//result = Math.pow(2, n1);
			
			isDec = false;
			
			if(isDec) {
				inputText.setText(n1 + "²");
			}
			else if(! isDec) {
				outputText.setText("");
				
				//need to add symbol
			}
		}	
		
		
		
		
		//modulus
		if (e.getSource() == mod) {
			op = 7;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText(inputText.getText().concat("Mod"));
			
			
			isDec = false;
			
			if(isDec) {
				inputText.setText(n1 + "Mod");
			}
			else if(! isDec) {
				outputText.setText(" ");
			}
			}	
		
		
		
		
		
		// n^10
		if (e.getSource() == raise) {
			op = 8;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText(inputText.getText().concat("^10"));
			result = Math.pow(10, n1);
			
			isDec = false;
			
			if(isDec) {
				inputText.setText(n1 + "^10");
			}
			else if(! isDec) {
				outputText.setText("");
			}
			}	
		//x cubed
		if (e.getSource() == xcub) {
			op = 9;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText(inputText.getText().concat("³"));
			
			
			isDec = false;
			
			if(isDec) {
				inputText.setText(n1 + "³");
			}
			else if(! isDec) {
				outputText.setText("");
					
			}
		}
			
		// 1/n
		if(e.getSource() == oneN) {
			op = 10;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("1/" + inputText.getText());
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("1/ " + n1);
			}
			else if(! isDec) {
				outputText.setText("");
					
			} 
		
		}
		//natural log 
		if(e.getSource() == ln) {
			op = 11;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("ln(" + inputText.getText() + ")");
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("ln(" + n1 + ")");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}
			
		//regular log
		if(e.getSource() == log) {
			op = 12;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("log(" + inputText.getText() + ")");
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("log(" + n1 + ")");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}
			//absolute value 	
		if(e.getSource() == abs) {
			op = 13;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("|" + inputText.getText() + "|");
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("|" + n1 + "|");
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}
		
		//square root
		if(e.getSource() == sqr) {
			op = 14;
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("√" + inputText.getText());
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("√" + n1 );
			}
			else if(! isDec) {
				outputText.setText("");
			}
		}
		
		// plus/minus
		if(e.getSource() == pm) {
			op = 15;
			
			n1 = Double.parseDouble(inputText.getText());
			
			inputText.setText("-" + inputText.getText());
			
			isDec = false;
			
			if(isDec) {
				inputText.setText("-" + n1 );
			}
			else if(! isDec) {
				outputText.setText("");
			}
			
		}
		
		
		
			//functionality 
		
		//exit button 
		if (e.getSource() == exit) {
			System.exit(0);
		}
		
		//clear button 
		if(e.getSource() == clear) {
			inputText.setText(" ");
			outputText.setText(" ");
		}
		


//symbol buttons, operators

//equals
		if (e.getSource() == eq) {
			int k = 0;
			String f = inputText.getText();
			temp = f;
			System.out.print(op);
			switch (op) {
			//add
			case 1:
				
				k = temp.indexOf("+");
				f = f.substring(k);
				System.out.print(f);
				n2 = Double.parseDouble(f);
				result = n1 + n2;

				break;
			//subtract
			case 2:
				
				k = temp.indexOf("-");
				f = f.substring(k+1);
				System.out.print(f);
				n2 = Double.parseDouble(f);
				result = n1 - n2;
				
				break;
			//divide
			case 3:
				k = f.indexOf("÷");
				f = f.substring(k+1);
				System.out.print(f);
				n2 = Double.parseDouble(f);
				result = n1 / n2;
				
				break;
			//multiply
			case 4:
				k = f.indexOf("*");
				f = f.substring(k+1);
				System.out.print(f);
				n2 = Double.parseDouble(f);
				result = n1 * n2;
				
			break;
			//percent
			case 5:
				//k = f.indexOf("%");
				//f = f.substring(k+1);
				//System.out.print(f);
				//n2 = Double.parseDouble(f);
				result = n1 / 100;
				//outputText.setText(f);
			break;
			// x squared 
			case 6:
				result = n1 * n1;
			
			break;
			//modulus
			case 7:
				k = f.indexOf("Mod");
				f = f.substring(k+3);
				System.out.print(f);
				n2 = Double.parseDouble(f);
				result = n1 % n2;
				//outputText.setText(f);
			break;
			// 10^n
			case 8:
				result = Math.pow(10, n1);
			break;
			//x cubed
			case 9:
				result = n1 * n1 * n1;
			break;
			// 1/n
			case 10:
				result =  1 / n1;
			break;
			// natural log 
			case 11:
				result = Math.log(n1);
			break;
			//regular log
			case 12:
				result = Math.log10(n1);
			break;
			//absolute value
			case 13:
				result = Math.abs(n1);
			break;
			//square root
			case 14:
				result = Math.sqrt(n1);
			break;
			//plus minus 
			case 15:
				result = -1 * n1;
			break;
			}
		
		outputText.setText(Double.toString(result));
		
		
		
}
	}


}

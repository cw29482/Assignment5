import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScoreGUI implements ActionListener{
	private JFrame frame;
	private JPanel panel;
	private JTextField textField1;
	private JTextField textField2; 
	private JTextField textField3;
	private JTextField textField4;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JButton button;
	
	public ScoreGUI() {
		frame = new JFrame("Score Calculator");
		frame.setVisible(true);
		frame.setSize(400, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		
		label1 = new JLabel();
		label1.setText("Enter scores: ");
		label1.setForeground(Color.WHITE);
		label3 = new JLabel();
		label3.setText("Average of Scores: " );
		label3.setForeground(Color.WHITE);
		label2 = new JLabel();
		label2.setText("_______");
		label2.setForeground(Color.WHITE);
		
		
		textField1 = new JTextField(5); 
		textField2 = new JTextField(5);
		textField3 = new JTextField(5);
		textField4 = new JTextField(5);
		
		button = new JButton("Find Score");
		button.addActionListener(this);
		
		panel.add(label1);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(textField3);
		panel.add(textField4);
		panel.add(label3);
		panel.add(label2);
		panel.add(button);
		
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double num3 = Double.parseDouble(textField3.getText());
		double num4 = Double.parseDouble(textField4.getText());
		double sum = num1 + num2 + num3 + num4;
		double average = sum / 4;
		
		label2.setText(String.valueOf(average));
	}
}

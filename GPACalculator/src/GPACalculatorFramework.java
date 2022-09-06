import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;

public class GPACalculatorFramework {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	double value;
	double gpa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GPACalculatorFramework window = new GPACalculatorFramework();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GPACalculatorFramework() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CWRU GPA Calculator");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(116, 6, 250, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Class");
		lblNewLabel_1.setBounds(56, 46, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Credits");
		lblNewLabel_2.setBounds(201, 46, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Grade");
		lblNewLabel_3.setBounds(335, 46, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(21, 74, 130, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(190, 74, 61, 26);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(318, 74, 61, 26);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(190, 101, 61, 26);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(318, 101, 61, 26);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(190, 132, 61, 26);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(318, 132, 61, 26);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(190, 161, 61, 26);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(318, 161, 61, 26);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(190, 190, 61, 26);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(318, 190, 61, 26);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(21, 101, 130, 26);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(21, 132, 130, 26);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(21, 161, 130, 26);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(21, 190, 130, 26);
		frame.getContentPane().add(textField_14);
		
		JLabel lblNewLabel_4 = new JLabel("GPA For Semester: ");
		lblNewLabel_4.setBounds(116, 250, 136, 16);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(247, 250, 61, 16);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Calculate GPA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Get number of credit hours that user has entered
				int credithours1 = Integer.parseInt(textField_1.getText());
				int credithours2 = Integer.parseInt(textField_3.getText());
				int credithours3 = Integer.parseInt(textField_5.getText());
				int credithours4 = Integer.parseInt(textField_7.getText());
				int credithours5 = Integer.parseInt(textField_9.getText());
				
				int [] allcredithours = {credithours1, credithours2, credithours3, credithours4, credithours5};
				
				// Store the grades corresponding to each course
				String grade1 = textField_2.getText();
				String grade2 = textField_4.getText();
				String grade3 = textField_6.getText();
				String grade4 = textField_8.getText();
				String grade5 = textField_10.getText();
				
				String [] allgrades = {grade1, grade2, grade3, grade4, grade5};
				
				// Mapping letter grades to numeric values
				HashMap<String, Double> qualityvalues = new HashMap<>();
				qualityvalues.put("A", 4.0);
				qualityvalues.put("B", 3.0);
				qualityvalues.put("C", 2.0);
				qualityvalues.put("D", 1.0);
				qualityvalues.put("F", 1.0);
				
				for (int i = 0; i < allcredithours.length; i++)
				{
					if(qualityvalues.containsKey(allgrades[i]))
					{
						value+= qualityvalues.get(allgrades[i]) * allcredithours[i];
					}
				}
				gpa = (value/(credithours1 + credithours2 + credithours3 + credithours4 + credithours5));
				lblNewLabel_5.setText(gpa + "");
			}
		});
		btnNewButton.setBounds(155, 217, 117, 29);
		frame.getContentPane().add(btnNewButton);
	}
}

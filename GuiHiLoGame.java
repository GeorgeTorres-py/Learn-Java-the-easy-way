import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess;
	private JLabel lblOutput;
	private int theNumber;
	public void checkGuess() {
		String guessText = txtGuess.getText();
		String message = "";
		int guess = Integer.parseInt(guessText);
				if (guess < theNumber)
					message = guess + " iss too low, try again.";
				else if (guess > theNumber)
					message = guess + " is too high, try agin.";
				else 
					message = guess +
							" is correct!!!! winna ";
					newGame();
					
				
		lblOutput.setText(message);
		txtGuess.requestFocus();
		txtGuess.selectAll();

	}
	public void newGame() {
		theNumber = (int)(Math.random() * 100 + 1);
	}
	
	
	public GuessingGame() {
		getContentPane().setBackground(new Color(255, 222, 173));
		setForeground(Color.LIGHT_GRAY);
		setTitle("Coin GT HiLo Guessing Game");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Coin GT Hi-Lo Game");
		lblNewLabel.setBounds(116, 11, 211, 45);
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Guess a number between 1 - 100:\r\n");
		lblNewLabel_1.setBounds(57, 94, 211, 32);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		getContentPane().add(lblNewLabel_1);
		
		txtGuess = new JTextField();
		txtGuess.setBounds(289, 97, 49, 26);
		txtGuess.setHorizontalAlignment(SwingConstants.RIGHT);
		getContentPane().add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnNewButton = new JButton("Guess");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnNewButton.setBackground(new Color(255, 235, 205));
		btnNewButton.setBounds(156, 154, 112, 32);
		getContentPane().add(btnNewButton);
		
		lblOutput = new JLabel("Click above to guess");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(139, 213, 152, 14);
		getContentPane().add(lblOutput);
	}
	


	public static void main(String[] args) {
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(450,300));
		theGame.setVisible(true);
	}
}

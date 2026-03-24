import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// I DONT KNOW WHAT STUPID THING IS IT BUT I FULLOW A BOOK

class DogYears2 extends JFrame {
	private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;

	private JTextField_humanYearsTF = new JTextField(3);
	private JTextField_dogYearsTF = new JTextField(3);

	public DogYears2(){
		JButton convertBtn = new JButton("Convert");
		convertBtn.addActionListener(new ConvertBtnListener());
		_dogYearsTF.addActionListener(new ConvertBtnListener());
		_humanYearsTF.setEditable(false);

		JPanel content = new JPanel();

		content.setLayout(new FlowLayout());

		contend.add(new JLabel("Dog Years"));
		content.add(_dogYearsTF);
		content.add(convertBtn);
		content.add(new JLabel("Human Years"));
		content.add(_humanYearsTF);
	}
}
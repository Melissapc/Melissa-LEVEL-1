import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
		ChuckleClicker clicker = new ChuckleClicker();
		clicker.makeButtons();
	}

	JButton button1;
	JButton button2;

	void makeButtons() {
		JFrame frame = new JFrame();
		frame.setSize(500, 400);
		frame.setVisible(true);
		JPanel panel = new JPanel();

		button1 = new JButton();
		button1.addActionListener(this);
		button1.setVisible(true);
		button2 = new JButton();
		button2.addActionListener(this);
		button2.setVisible(true);

		panel.add(button1);

		button1.setText("joke");
		panel.add(button2);
		button2.setText("punchline");
		frame.add(panel);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			JOptionPane.showMessageDialog(null, "hi");
		}

		if (e.getSource() == button2) {
			JOptionPane.showMessageDialog(null, "hi");
		}
	}
}

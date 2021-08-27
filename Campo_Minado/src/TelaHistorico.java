import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaHistorico implements ActionListener {
	
	JLabel label;
	JTextField textField;
	JComboBox<String> comboBox;
	String[] dificuldades = {"F�cil", "M�dio", "Dif�cil"};
	
	public TelaHistorico() {
		JFrame frame = new JFrame("Hist�rico");
		frame.setVisible(true);
		frame.setSize(300, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("N�vel");
		frame.add(label);
		
		comboBox = new JComboBox<String>(dificuldades);
		frame.add(comboBox);
		
		JButton button = new JButton("Ok");
		button.addActionListener(this);
		frame.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String comboBoxValue = (String) comboBox.getSelectedItem();
	}
}

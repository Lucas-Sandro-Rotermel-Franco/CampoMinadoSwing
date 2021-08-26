import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaSobre extends JFrame implements ActionListener{
	JPanel panel;
	
	public TelaSobre() {
		setTitle("Sobre");
		setSize(530, 570);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel(new GridLayout(1,1));
		
		JLabel label = new JLabel ("Campo Minado");
		label.setFont(label.getFont().deriveFont(32.0f));
		panel.add(label);
		
		add(panel, BorderLayout.CENTER);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
	}
}

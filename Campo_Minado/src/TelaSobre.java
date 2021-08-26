import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class TelaSobre extends JFrame implements ActionListener {

	JLabel imagem;
	ImageIcon icon;
	JButton buttonFechar;
	JPanel panel;
	
	public TelaSobre() {
		setTitle("Sobre");
		setSize(650, 550);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panel = new JPanel(new GridLayout(1,1));
		
		icon = new ImageIcon("img/sobre.png");
		panel.add(imagem = new JLabel(icon));
		
		buttonFechar = new JButton("Fechar");
		buttonFechar.addActionListener(this);
		add(panel, BorderLayout.CENTER);
		add(buttonFechar, BorderLayout.SOUTH);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.dispose();
	}
}

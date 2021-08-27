import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaInicio implements ActionListener {
	JFrame frame;
	JMenuBar barraDeMenu;
	JMenu menu;
	JMenuItem novoJogo, difFacil, difMedio, difDificil, historico, sobre, sair;
	TelaSobre telaSobre;
	TelaHistorico telaHistorico;
	
	public TelaInicio() {
		
		frame = new JFrame("Campo Minado");
		frame.setVisible(true);
		frame.setSize(620, 410);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		barraDeMenu = new JMenuBar();
		menu = new JMenu("Início");
		
		novoJogo = new JMenu("Novo Jogo");
		menu.add(novoJogo);
		
		difFacil = new JMenuItem("Fácil");
		difFacil.addActionListener(this);
		novoJogo.add(difFacil);
		
		difMedio = new JMenuItem("Médio");
		difMedio.addActionListener(this);
		novoJogo.add(difMedio);
		
		difDificil = new JMenuItem("Difícil");
		difDificil.addActionListener(this);
		novoJogo.add(difDificil);
		
		historico = new JMenuItem("Historico");
		menu.add(historico);
		
		sobre = new JMenuItem("Sobre");
		menu.add(sobre);
		
		sair = new JMenuItem("Sair");
		menu.add(sair);
		
		historico.addActionListener(this);
		sobre.addActionListener(this);
		sair.addActionListener(this);
		
		barraDeMenu.add(menu);
		frame.setJMenuBar(barraDeMenu);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == difFacil) {
			//implementar Novo Jogo Fácil
		} else if (e.getSource() == difMedio) {
			//implementar Novo Jogo Médio
		} else if (e.getSource() == difDificil) {
			//implementar Novo Jogo Difícil
		} else if (e.getSource() == historico) {
			new TelaHistorico();
		} else if (e.getSource() == sobre) {
			telaSobre = new TelaSobre();
			telaSobre.setVisible(true);
		} else if (e.getSource() == sair) {
			System.exit(0);
		}
		
	}
}

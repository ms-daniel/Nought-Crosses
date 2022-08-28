package InterfaceSwing;

import javax.swing.JPanel;
import javax.swing.border.CompoundBorder;
import java.awt.Rectangle;
import java.util.Locale;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class menu extends JPanel {
	
	private JLabel playLabel;
	private JLabel exitLabel;
	private JLabel IAvsIALabel;
	private JLabel PlayervsIALabel;

	/**
	 * Create the panel.
	 */
	public menu() {
		Cursor handCursor= new Cursor(Cursor.HAND_CURSOR);
		Cursor defaultCursor= new Cursor(Cursor.DEFAULT_CURSOR);
		
		setMinimumSize(new Dimension(600, 600));
		setMaximumSize(new Dimension(600, 600));
		setLocale(new Locale("pt", "BR"));
		setBounds(new Rectangle(0, 0, 600, 600));
		setLayout(null);
		
		PlayervsIALabel = new JLabel("");
		PlayervsIALabel.setIcon(new ImageIcon("resources\\playervsia.png"));
		PlayervsIALabel.setVisible(false);
		PlayervsIALabel.setBounds(new Rectangle(1, 0, 200, 100));
		PlayervsIALabel.setBounds(105, 226, 390, 65);
		add(PlayervsIALabel);
		
		IAvsIALabel = new JLabel("");
		IAvsIALabel.setIcon(new ImageIcon("resources\\iavsia.png"));
		IAvsIALabel.setBounds(new Rectangle(1, 0, 200, 100));
		IAvsIALabel.setBounds(170, 312, 260, 65);
		IAvsIALabel.setVisible(false);
		add(IAvsIALabel);
		
		//cria label para por imagem da opção jogar
		playLabel = new JLabel("");
		playLabel.setIcon(new ImageIcon("resources\\jogar.png"));
		playLabel.setBounds(new Rectangle(1, 0, 200, 100));
		playLabel.setBounds(198, 226, 205, 65);
		playLabel.setVisible(true);
		add(playLabel);
		
		////cria label para por imagem da opção sair
		exitLabel = new JLabel("");
		exitLabel.setIcon(new ImageIcon("resources\\sair.png"));
		exitLabel.setBounds(new Rectangle(1, 0, 200, 100));
		exitLabel.setBounds(230, 312, 205, 65);
		exitLabel.setVisible(true);
		add(exitLabel);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setIcon(new ImageIcon("resources\\menu.jpg"));
		backgroundLabel.setBounds(0, 0, 600, 600);
		add(backgroundLabel);
		
		
		//ações
		playLabel.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			@Override
			public void mouseEntered(MouseEvent e) {
				playLabel.setIcon(new ImageIcon("resources\\jogarGlow.png"));
				playLabel.setCursor(handCursor);
			}
			//quando o mouse sai da label
			@Override
			public void mouseExited(MouseEvent e) {
				playLabel.setIcon(new ImageIcon("resources\\jogar.png"));
				playLabel.setCursor(defaultCursor);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				playLabel.setIcon(new ImageIcon("resources\\jogar.png"));
			}
		});
		
		PlayervsIALabel.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			@Override
			public void mouseEntered(MouseEvent e) {
				PlayervsIALabel.setIcon(new ImageIcon("resources\\playervsiaGlow.png"));
				PlayervsIALabel.setCursor(handCursor);
			}
			//quando o mouse sai da label
			@Override
			public void mouseExited(MouseEvent e) {
				PlayervsIALabel.setIcon(new ImageIcon("resources\\playervsia.png"));
				PlayervsIALabel.setCursor(defaultCursor);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				PlayervsIALabel.setIcon(new ImageIcon("resources\\playervsia.png"));
			}
		});
		
		IAvsIALabel.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			@Override
			public void mouseEntered(MouseEvent e) {
				IAvsIALabel.setIcon(new ImageIcon("resources\\iavsiaGlow.png"));
				IAvsIALabel.setCursor(handCursor);
			}
			//quando o mouse sai da label
			@Override
			public void mouseExited(MouseEvent e) {
				IAvsIALabel.setIcon(new ImageIcon("resources\\iavsia.png"));
				IAvsIALabel.setCursor(defaultCursor);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				IAvsIALabel.setIcon(new ImageIcon("resources\\iavsia.png"));
			}
		});
		
		exitLabel.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			@Override
			public void mouseEntered(MouseEvent e) {
				exitLabel.setIcon(new ImageIcon("resources\\sairGlow.png"));
				exitLabel.setCursor(handCursor);
			}
			//quando o mouse sai da label
			@Override
			public void mouseExited(MouseEvent e) {
				exitLabel.setIcon(new ImageIcon("resources\\sair.png"));
				exitLabel.setCursor(defaultCursor);
			}
			//ao clicar no label
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0); //fecha o programa
			}
		});

	}
	/**
	 * 
	 * @return retorna uma referencia do botao play
	 */
	public JLabel getPlayLabel() {
		return playLabel;
	}
	/**
	 * 
	 * @return retorna referencia da label de player vs ia
	 */
	public JLabel getPvsIA() {
		return PlayervsIALabel;
	}
	/**
	 * 
	 * @return retorna referencia da label de ia vs ia
	 */
	public JLabel getIAvsIA() {
		return IAvsIALabel;
	}
	/**
	 * esconde opções de jogar e sair
	 * e mostra opções de jogar com ia
	 * ou ver ia vs ia
	 */
	public void NextLabel() {
		playLabel.setVisible(false);
		exitLabel.setVisible(false);
		
		PlayervsIALabel.setVisible(true);
		//IAvsIALabel.setVisible(true);
	}
	/**
	 * esconde opções de jogar com ia
	 * ou ia vs ia, voltando para o menu
	 * anterior
	 */
	public void previousLabel() {
		playLabel.setVisible(true);
		exitLabel.setVisible(true);
		
		PlayervsIALabel.setVisible(false);
		//IAvsIALabel.setVisible(false);
	}
}

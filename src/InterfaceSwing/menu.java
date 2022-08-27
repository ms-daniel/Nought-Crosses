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
		
		
		//cria label para por imagem da opção jogar
		playLabel = new JLabel("");
		playLabel.setIcon(new ImageIcon("resources\\jogar.png"));
		playLabel.setBounds(new Rectangle(1, 0, 200, 100));
		playLabel.setBounds(198, 226, 205, 65);
		add(playLabel);
		
		////cria label para por imagem da opção sair
		JLabel exitLabel = new JLabel("");
		exitLabel.setIcon(new ImageIcon("resources\\sair.png"));
		exitLabel.setBounds(new Rectangle(1, 0, 200, 100));
		exitLabel.setBounds(230, 312, 205, 65);
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
	
	public JLabel getPlayLabel() {
		return playLabel;
	}
}

package InterfaceSwing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Window extends JFrame {

	private JPanel contentPane;
	private JLabel playButton;
	private JButton exitTButton;
	private tabuleiro tabuleiro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window frame = new Window();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Window() {
		setResizable(false);
		setTitle("Nought & Crosses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 637);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menu panelMenu = new menu();
		contentPane.add(panelMenu);
		
		tabuleiro = new tabuleiro();
		exitTButton = tabuleiro.getExitButton();
		
		playButton = panelMenu.getPlayLabel();
		
		playButton.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			//ao clicar no label
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.remove(panelMenu); //remove panel antigo
				contentPane.add(tabuleiro); //cria novo panel (do tabuleiro)
				repaint(); //"repinta" toda a Janela para poder mostrar o panel do tabuleiro
			}
		});
		
		exitTButton.addMouseListener(new MouseAdapter() {
			//quando o mouse está emcima da label
			//ao clicar no label
			@Override
			public void mouseClicked(MouseEvent e) {
				contentPane.remove(tabuleiro); //remove panel antigo
				contentPane.add(panelMenu); //cria novo panel (do tabuleiro)
				repaint(); //"repinta" toda a Janela para poder mostrar o panel do tabuleiro
			}
		});
		
		

		
		
		//tabuleiro tabuleiro = new tabuleiro();
		//contentPane.add(tabuleiro);
	}

}

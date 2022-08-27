package InterfaceSwing;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

import IA.VeIA;

import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class tabuleiro extends JPanel {

	private VeIA inteligencia;
	private Cursor handCursor = new Cursor(Cursor.HAND_CURSOR);
	private Cursor defaultCursor = new Cursor(Cursor.DEFAULT_CURSOR);
	private ImageIcon cross = new ImageIcon("resources\\cross1.png");
	private ImageIcon nought = new ImageIcon("resources\\nought1.png");
	private JButton Menu;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JButton Button6;
	private JButton Button7;
	private JButton Button8;
	private JButton Button9;
	private char[][] no = 	{{'.','.','.'},
			                 {'.','.','.'},
			                 {'.','.','.'}};

	/**
	 * Create the panel.
	 */
	public tabuleiro() {
		try {
			inteligencia = new VeIA();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		setMinimumSize(new Dimension(600, 600));
		setMaximumSize(new Dimension(600, 600));
		setLocale(new Locale("pt", "BR"));
		setBounds(new Rectangle(0, 0, 600, 600));
		setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				unblockButton();
			}
		});
		btnNewButton.setBounds(262, 545, 85, 21);
		add(btnNewButton);

		Button1 = new JButton("");
		Button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button1.setContentAreaFilled(false);
		Button1.setFocusTraversalKeysEnabled(false);
		Button1.setFocusPainted(false);
		Button1.setBorderPainted(false);
		Button1.setFocusable(false);
		Button1.setBounds(111, 113, 120, 120);
		add(Button1);

		Button2 = new JButton("");
		Button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button2.setContentAreaFilled(false);
		Button2.setFocusTraversalKeysEnabled(false);
		Button2.setFocusPainted(false);
		Button2.setBorderPainted(false);
		Button2.setFocusable(false);
		Button2.setBounds(240, 113, 120, 120);
		add(Button2);

		Button3 = new JButton("");
		Button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button3.setContentAreaFilled(false);
		Button3.setFocusTraversalKeysEnabled(false);
		Button3.setFocusPainted(false);
		Button3.setBorderPainted(false);
		Button3.setFocusable(false);
		Button3.setBounds(368, 113, 120, 120);
		add(Button3);

		Button4 = new JButton("");
		Button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button4.setContentAreaFilled(false);
		Button4.setFocusTraversalKeysEnabled(false);
		Button4.setFocusPainted(false);
		Button4.setBorderPainted(false);
		Button4.setFocusable(false);
		Button4.setBounds(111, 242, 120, 120);
		add(Button4);

		Button5 = new JButton("");
		Button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button5.setContentAreaFilled(false);
		Button5.setFocusTraversalKeysEnabled(false);
		Button5.setFocusPainted(false);
		Button5.setBorderPainted(false);
		Button5.setFocusable(false);
		Button5.setBounds(240, 242, 120, 120);
		add(Button5);

		Button6 = new JButton("");
		Button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button6.setContentAreaFilled(false);
		Button6.setFocusTraversalKeysEnabled(false);
		Button6.setFocusPainted(false);
		Button6.setBorderPainted(false);
		Button6.setFocusable(false);
		Button6.setBounds(368, 242, 120, 120);
		add(Button6);

		Button7 = new JButton("");
		Button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button7.setContentAreaFilled(false);
		Button7.setFocusTraversalKeysEnabled(false);
		Button7.setFocusPainted(false);
		Button7.setBorderPainted(false);
		Button7.setFocusable(false);
		Button7.setBounds(111, 368, 120, 120);
		add(Button7);

		Button8 = new JButton("");
		Button8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button8.setContentAreaFilled(false);
		Button8.setFocusTraversalKeysEnabled(false);
		Button8.setFocusPainted(false);
		Button8.setBorderPainted(false);
		Button8.setFocusable(false);
		Button8.setBounds(240, 368, 120, 120);
		add(Button8);

		Button9 = new JButton("");
		Button9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button9.setContentAreaFilled(false);
		Button9.setFocusTraversalKeysEnabled(false);
		Button9.setFocusPainted(false);
		Button9.setBorderPainted(false);
		Button9.setFocusable(false);
		Button9.setBounds(368, 368, 120, 120);
		add(Button9);

		Menu = new JButton("Sair/Menu");
		Menu.setBorder(UIManager.getBorder("Button.border"));
		Menu.setBackground(SystemColor.controlShadow);
		Menu.setFocusable(false);
		Menu.setMargin(new Insets(0, 0, 0, 0));
		Menu.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		Menu.setBounds(501, 11, 89, 23);
		Menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(Menu);

		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setIcon(new ImageIcon("resources\\tabuleiro.jpg"));
		backgroundLabel.setBounds(0, 0, 600, 600);
		add(backgroundLabel);

		// ações
		Button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[0][0] == '.' && !isBlock()) {
					Button1.setIcon(nought);
					no[0][0] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[0][0] == '.' )
					Button1.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[0][0] == '.' )
					Button1.setIcon(null);
			}
		});

		Button2.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[0][1] == '.' && !isBlock()) {
					Button2.setIcon(nought);
					no[0][1] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[0][1] == '.' )
					Button2.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[0][1] == '.' )
					Button2.setIcon(null);
			}
		});
		Button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if(no[0][2] == '.' && !isBlock()) {
					Button3.setIcon(nought);
					no[0][2] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[0][2] == '.' )
					Button3.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[0][2] == '.' )
					Button3.setIcon(null);
			}
		});
		Button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[1][0] == '.' && !isBlock() ) {
					Button4.setIcon(nought);
					no[1][0] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[1][0] == '.' )
					Button4.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[1][0] == '.' )
					Button4.setIcon(null);
			}
		});
		
		Button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[1][1] == '.' && !isBlock()) {
					Button5.setIcon(nought);
					no[1][1] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[1][1] == '.' )
					Button5.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[1][1] == '.' )
					Button5.setIcon(null);
			}
		});
		Button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[1][2] == '.' && !isBlock()) {
					Button6.setIcon(nought);
					no[1][2] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[1][2] == '.' )
					Button6.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[1][2] == '.' )
					Button6.setIcon(null);
			}
		});
		Button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[2][0] == '.' && !isBlock()) {
					Button7.setIcon(nought);
					no[2][0] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[2][0] == '.' )
					Button7.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[2][0] == '.' )
					Button7.setIcon(null);
			}
			
		});

		Button8.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			if(no[2][1] == '.' && !isBlock()) {
				Button8.setIcon(nought);
				no[2][1] = 'O';
				blockButton();
				playIA();
			}
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			if(no[2][1] == '.' )
				Button8.setIcon(nought);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			if(no[2][1] == '.' )
				Button8.setIcon(null);
		}
		});

		Button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no[2][2] == '.' && !isBlock()) {
					Button9.setIcon(nought);
					no[2][2] = 'O';
					blockButton();
					playIA();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(no[2][2] == '.' )
					Button9.setIcon(nought);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(no[2][2] == '.' )
					Button9.setIcon(null);
			}
		});
	}

	public JButton getExitButton() {
		return Menu;
	}
	/**
	 * Bloqueia todos os botões assim que o usuario joga
	 */
	private void blockButton() {
		Button1.setEnabled(false);
		Button2.setEnabled(false);
		Button3.setEnabled(false);
		Button4.setEnabled(false);
		Button5.setEnabled(false);
		Button6.setEnabled(false);
		Button7.setEnabled(false);
		Button8.setEnabled(false);
		Button9.setEnabled(false);
	}
	/**
	 * desBloqueia todos os botões assim que a IA joga
	 */
	private void unblockButton() {
			Button1.setEnabled(true);
			Button2.setEnabled(true);
			Button3.setEnabled(true);
			Button4.setEnabled(true);
			Button5.setEnabled(true);
			Button6.setEnabled(true);
			Button7.setEnabled(true);
			Button8.setEnabled(true);
			Button9.setEnabled(true);
	}
	
	/**
	 * retorna se os botões estrão bloqueados ou não
	 */
	private boolean isBlock() {
		boolean op = false;
		
		if(Button1.isEnabled())
			op = false;
		else
			op = true;
		
		return op;
	}
	
	/**
	 * IA joga
	 */
	private void playIA() {
		moveIA(inteligencia.jogue(getState(), moveCount()));
		//moveIA(posicao que a ia escolheu);
		System.out.println(getState() + moveCount());
		unblockButton(); //desbloqueia botões
	}
	
	/**
	 * passa o estado (que está em char) para uma string,
	 * isso será mandado para a IA analisar
	 * @return
	 */
	private String getState() {
		String noSTR = "";
		for(int i = 0; i < 3; i++) { //percorrer a matriz de caracteres
			for(int j = 0; j < 3; j++) {
				noSTR += this.no[i][j];
			}
		}
		
		return noSTR;
	}
	
	/**
	 * metodo para associar a jogada da IA
	 * com algum dos botões
	 */
	private void moveIA(int pos) {
		System.out.println(pos);
		switch(pos) {
			case 0:
				Button1.setIcon(cross);
				no[0][0] = 'X';
				break;
			case 1:
				Button2.setIcon(cross);
				no[0][1] = 'X';
				break;
			case 2:
				Button3.setIcon(cross);
				no[0][2] = 'X';
				break;
			case 3:
				Button4.setIcon(cross);
				no[1][0] = 'X';
				break;
			case 4:
				Button5.setIcon(cross);
				no[1][1] = 'X';
				break;
			case 5:
				Button6.setIcon(cross);
				no[1][2] = 'X';
				break;
			case 6:
				Button7.setIcon(cross);
				no[2][0] = 'X';
				break;
			case 7:
				Button8.setIcon(cross);
				no[2][1] = 'X';
				break;
			case 8:
				Button9.setIcon(cross);
				no[2][2] = 'X';
				break;
			default:
				JOptionPane.showMessageDialog(null, "Erro na IA");
				System.exit(1); //erro na IA retorna 1
				break;
		}
	}
	
	/**
	 * conta quantas jogadas há
	 */
	private int moveCount() {
		String state = getState().replace(".", "");
		return state.length();

	}	
}

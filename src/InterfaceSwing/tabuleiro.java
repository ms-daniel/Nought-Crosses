package InterfaceSwing;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.util.Locale;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class tabuleiro extends JPanel {
	
	private Cursor handCursor= new Cursor(Cursor.HAND_CURSOR);
	private Cursor defaultCursor= new Cursor(Cursor.DEFAULT_CURSOR);
	private ImageIcon cross = new ImageIcon("resources\\cross1.png");
	private ImageIcon nought = new ImageIcon("resources\\nought1.png");
	private JButton Menu;

	/**
	 * Create the panel.
	 */
	public tabuleiro() {
		
		
		setMinimumSize(new Dimension(600, 600));
		setMaximumSize(new Dimension(600, 600));
		setLocale(new Locale("pt", "BR"));
		setBounds(new Rectangle(0, 0, 600, 600));
		setLayout(null);
		
		JButton Button1 = new JButton("");
		Button1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button1.setContentAreaFilled(false);
		Button1.setFocusTraversalKeysEnabled(false);
		Button1.setFocusPainted(false);
		Button1.setBorderPainted(false);
		Button1.setFocusable(false);
		Button1.setBounds(111, 113, 120, 120);
		add(Button1);
		
		JButton Button2 = new JButton("");
		Button2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button2.setContentAreaFilled(false);
		Button2.setFocusTraversalKeysEnabled(false);
		Button2.setFocusPainted(false);
		Button2.setBorderPainted(false);
		Button2.setFocusable(false);
		Button2.setBounds(240, 113, 120, 120);
		add(Button2);
		
		JButton Button3 = new JButton("");
		Button3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button3.setContentAreaFilled(false);
		Button3.setFocusTraversalKeysEnabled(false);
		Button3.setFocusPainted(false);
		Button3.setBorderPainted(false);
		Button3.setFocusable(false);
		Button3.setBounds(368, 113, 120, 120);
		add(Button3);
		
		JButton Button4 = new JButton("");
		Button4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button4.setContentAreaFilled(false);
		Button4.setFocusTraversalKeysEnabled(false);
		Button4.setFocusPainted(false);
		Button4.setBorderPainted(false);
		Button4.setFocusable(false);
		Button4.setBounds(111, 242, 120, 120);
		add(Button4);
		
		JButton Button5 = new JButton("");
		Button5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button5.setContentAreaFilled(false);
		Button5.setFocusTraversalKeysEnabled(false);
		Button5.setFocusPainted(false);
		Button5.setBorderPainted(false);
		Button5.setFocusable(false);
		Button5.setBounds(240, 242, 120, 120);
		add(Button5);
		
		JButton Button6 = new JButton("");
		Button6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button6.setContentAreaFilled(false);
		Button6.setFocusTraversalKeysEnabled(false);
		Button6.setFocusPainted(false);
		Button6.setBorderPainted(false);
		Button6.setFocusable(false);
		Button6.setBounds(368, 242, 120, 120);
		add(Button6);
		
		JButton Button7 = new JButton("");
		Button7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button7.setContentAreaFilled(false);
		Button7.setFocusTraversalKeysEnabled(false);
		Button7.setFocusPainted(false);
		Button7.setBorderPainted(false);
		Button7.setFocusable(false);
		Button7.setBounds(111, 368, 120, 120);
		add(Button7);
		
		JButton Button8 = new JButton("");
		Button8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Button8.setContentAreaFilled(false);
		Button8.setFocusTraversalKeysEnabled(false);
		Button8.setFocusPainted(false);
		Button8.setBorderPainted(false);
		Button8.setFocusable(false);
		Button8.setBounds(240, 368, 120, 120);
		add(Button8);
		
		JButton Button9 = new JButton("");
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
		backgroundLabel.setIcon(new ImageIcon("E:\\Downloads(HD)\\projetos\\java\\noughts and crosses\\resources\\tabuleiro.jpg"));
		backgroundLabel.setBounds(0, 0, 600, 600);
		add(backgroundLabel);
		
		//ações
		Button1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button1.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button1.setIcon(null);
			}
		});
		
		Button2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button2.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button2.setIcon(null);
			}
		});
		Button3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button3.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button3.setIcon(null);
			}
		});
		Button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button4.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button4.setIcon(null);
			}
		});
		Button4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button4.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button4.setIcon(null);
			}
		});
		Button5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button5.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button5.setIcon(null);
			}
		});
		Button6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button6.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button6.setIcon(null);
			}
		});
		Button7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button7.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button7.setIcon(null);
			}
		});
		Button8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button8.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button8.setIcon(null);
			}
		});
		Button9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Button9.setIcon(cross);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Button9.setIcon(null);
			}
		});
	}
	
	public JButton getExitButton() {
		return Menu;
	}
}

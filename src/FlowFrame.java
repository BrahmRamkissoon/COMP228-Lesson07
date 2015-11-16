import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class FlowFrame extends JFrame {
	// PRIVATE INSTANCE VARIABLES
	private Font _defaultFont;
	private JLabel _FirstNameLabel;
	
	
	// 	CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++
	public FlowFrame() {
		_initialize();
		
		this._FirstNameLabel = new JLabel("First Name");
		this._FirstNameLabel.setFont(this._defaultFont);
		getContentPane().add(this._FirstNameLabel);
	}
	
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++++++++++
	private void _initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		getContentPane().setLayout(new FlowLayout());
		this._defaultFont = new Font("Goudy Old Style", Font.PLAIN, 16);		
	}

}

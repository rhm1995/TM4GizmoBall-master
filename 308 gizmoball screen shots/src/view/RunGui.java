package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class RunGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RunGui frame = new RunGui();
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
	public RunGui() {
		setTitle("Gizmoball");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 420);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mntmNewGame = new JMenuItem("New Game");
		menuBar.add(mntmNewGame);
		
		JMenuItem mntmLoad = new JMenuItem("Load");
		menuBar.add(mntmLoad);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		menuBar.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		menuBar.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(12, 21, 100, 72);
		btnStart.setMaximumSize(new Dimension(100, 100));
		
		JButton btnStop = new JButton("Stop");
		btnStop.setBounds(12, 103, 100, 72);
		btnStop.setMaximumSize(new Dimension(100, 100));
		
		JButton btnTick = new JButton("Tick");
		btnTick.setBounds(12, 186, 100, 72);
		btnTick.setMaximumSize(new Dimension(100, 100));
		
		JButton btnBuildMode = new JButton("Build Mode");
		btnBuildMode.setBounds(12, 268, 100, 72);
		btnBuildMode.setMaximumSize(new Dimension(100, 100));
		
		contentPane.setLayout(null);
		contentPane.add(btnStart);
		contentPane.add(btnStop);
		contentPane.add(btnTick);
		contentPane.add(btnBuildMode);
		
		Canvas canvas = new Canvas();
		canvas.setBounds(118, 21, 393, 320);
		canvas.setBackground(Color.black);
		contentPane.add(canvas);
	}
}

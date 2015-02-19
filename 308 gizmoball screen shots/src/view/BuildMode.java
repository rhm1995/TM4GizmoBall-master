package view;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuildMode extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuildMode frame = new BuildMode();
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
	public BuildMode() {
		setTitle("Gizmoball");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 480);
		
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
		
		JButton btnCircle = new JButton("Circle");
		btnCircle.setBounds(18, 82, 89, 23);
		btnCircle.setMaximumSize(new Dimension(100, 100));
		
		JButton btnSquare = new JButton("Square");
		btnSquare.setBounds(109, 82, 89, 23);
		btnSquare.setMaximumSize(new Dimension(100, 100));
		
		JButton btnTriangle = new JButton("Triangle");
		btnTriangle.setBounds(18, 116, 89, 23);
		btnTriangle.setMaximumSize(new Dimension(100, 100));
		
		JButton btnRotate = new JButton("Rotate");
		btnRotate.setBounds(18, 207, 89, 23);
		btnRotate.setMaximumSize(new Dimension(100, 100));
		
		JButton btnLeftFlipper = new JButton("Left Flipper");
		btnLeftFlipper.setBounds(18, 150, 89, 23);
		
		
		JButton btnRightflipper = new JButton("RightFlipper");
		btnRightflipper.setBounds(109, 150, 89, 23);
		
		JButton btnAbsorber = new JButton("Absorber");
		btnAbsorber.setBounds(109, 116, 89, 23);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.setBounds(18, 276, 89, 23);
		
		JButton btnDisconnect = new JButton("Disconnect");
		btnDisconnect.setBounds(109, 276, 89, 23);
		
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(109, 207, 89, 23);
		
		
		contentPane.setLayout(null);
		contentPane.add(btnCircle);
		contentPane.add(btnSquare);
		contentPane.add(btnTriangle);
		contentPane.add(btnAbsorber);
		contentPane.add(btnRotate);
		contentPane.add(btnDelete);
		contentPane.add(btnLeftFlipper);
		contentPane.add(btnRightflipper);
		contentPane.add(btnConnect);
		contentPane.add(btnDisconnect);
		
		
		Canvas canvas = new Canvas();
		canvas.setBounds(213, 28, 444, 365);
		canvas.setBackground(Color.black);
		contentPane.add(canvas);
		
		JButton btnAddGizmo = new JButton("Add Gizmo");
		btnAddGizmo.setBounds(18, 48, 180, 23);
		contentPane.add(btnAddGizmo);
		
		JButton btnRunMode = new JButton("Run Mode");
		btnRunMode.setBounds(18, 331, 180, 50);
		contentPane.add(btnRunMode);
		
		JButton btnClearBoard = new JButton("Clear Board");
		btnClearBoard.setBounds(109, 241, 89, 23);
		contentPane.add(btnClearBoard);
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(18, 241, 89, 23);
		contentPane.add(btnMove);
	}
}

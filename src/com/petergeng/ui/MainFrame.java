package com.petergeng.ui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame = new JFrame();
	JMenuBar menuBar = new JMenuBar();
	//JPanel panel = new JPanel(new FlowLayout());
	JPanel panel = new JPanel(new FlowLayout(0, 5, 5));
	private Toolkit theKit;
	private Dimension wndSize;
	private JMenu fileMenu;
	private Container container ;
	public MainFrame(){
		//JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setTitle("cgi�ӿ����ݹ�������v0.1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    
	    frame.setSize(900, 800);
	    this.theKit = frame.getToolkit(); 
	    this.wndSize = theKit.getScreenSize(); 
	    frame.setBounds(wndSize.width / 4, wndSize.height / 4, // Position
	        wndSize.width / 2, wndSize.height / 2);
	    this.container = frame.getContentPane();
	    //this.frame.setLayout(new FlowLayout());
	    this.initMenu();
	    this.initLabel();
	    
	    frame.setVisible(true);
	}
	
	public void initMenu(){
		fileMenu = new JMenu("�ļ�");
		JMenuItem newMenuItem = new JMenuItem("����");
		fileMenu.add(newMenuItem);
		JMenuItem openMenuItem = new JMenuItem("��");
		fileMenu.add(openMenuItem);

		JMenuItem closeMenuItem = new JMenuItem("�ر�");
		fileMenu.add(closeMenuItem);

		JMenuItem saveMenuItem = new JMenuItem("����");
		fileMenu.add(saveMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("�˳�");
		fileMenu.add(exitMenuItem);
		
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
	}
	
	public void initLabel(){
		//final JPanel panel = new JPanel(new FlowLayout());
		//final JPanel panel = new JPanel(new FlowLayout());
		JScrollPane scrollPane = new JScrollPane();
	    JLabel label = new JLabel("������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JTextField textField = new JTextField(5);
	    label.setLabelFor(textField);
	    scrollPane.add(label);
	    scrollPane.add(textField);
	    
	    JLabel type = new JLabel("������������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JComboBox typeCombo = new JComboBox();
	    typeCombo.addItem("����");
	    typeCombo.addItem("�ַ���");
	    type.setLabelFor(typeCombo);
	    scrollPane.add(type);
	    scrollPane.add(typeCombo);
	    
	    JLabel structLabel = new JLabel("������������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JComboBox structCombo = new JComboBox();
	    structCombo.addItem("��ֵ");
	    structCombo.addItem("json����");
	    structCombo.addItem("����");
	    structLabel.setLabelFor(structCombo);
	    scrollPane.add(structLabel);
	    scrollPane.add(structCombo);
	    
	    JButton button = new JButton("����");
	    panel.add(button);
	    
	    button.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent actionEvent) {  
	            System.out.println("I was selected.");
	            initLabels();
	          }  
	    });
	    scrollPane.setVisible(true);
	    panel.add(scrollPane);
	    container.add(panel);
	    //container.add(panel);
	}
	
	public void repaintPanel(JScrollPane crollPane){
		crollPane.repaint();
		panel.repaint();
        Container c = this.frame.getContentPane();
        c.validate();
	}
	
	public void initLabels(){
		JScrollPane scrollPane = new JScrollPane();
	    JLabel label = new JLabel("������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JTextField textField = new JTextField(5);
	    label.setLabelFor(textField);
	    scrollPane.add(label);
	    scrollPane.add(textField);
	    
	    JLabel type = new JLabel("������������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JComboBox typeCombo = new JComboBox();
	    typeCombo.addItem("����");
	    typeCombo.addItem("�ַ���");
	    type.setLabelFor(typeCombo);
	    scrollPane.add(type);
	    scrollPane.add(typeCombo);
	    
	    JLabel structLabel = new JLabel("������������: ");
	    label.setDisplayedMnemonic(KeyEvent.VK_N);
	    JComboBox structCombo = new JComboBox();
	    structCombo.addItem("��ֵ");
	    structCombo.addItem("json����");
	    structCombo.addItem("����");
	    structLabel.setLabelFor(structCombo);
	    scrollPane.add(structLabel);
	    scrollPane.add(structCombo);
	    
	    JButton button = new JButton("����");
	    scrollPane.add(button);
	    
	    button.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent actionEvent) {  
	            System.out.println("I was selected.");
	            initLabels();
	          }  
	    });
	    
	    System.out.println(1111);
	    scrollPane.setVisible(true);
	    panel.add(scrollPane);
	    repaintPanel(scrollPane);
	}
	
	public static void main(String[] args) {
	    
	    new MainFrame();
	    
	    
	  }
	
}

package com.petergeng.ui;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;

public class SimpleTreeTest extends JFrame {

  public static void main(String[] args) {
    SimpleTreeTest stt = new SimpleTreeTest();
    stt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    stt.setSize(250, 250);
    stt.setVisible(true);
  }

  public SimpleTreeTest() {
    Object[] genealogy = { "A{", "B{", "C", "D", "E", "F" };
    java.util.Vector v = new java.util.Vector() {
      public String toString() {
        return "DD:[]";
      }
    };
    v.addElement("test : {}");
    v.addElement("2");
    v.addElement("3");
    v.addElement("4");
    //genealogy[0] = v;
    JTree tree = new JTree(genealogy);
    
    tree.setRootVisible(true);
    JScrollPane jsp = new JScrollPane(tree);
    getContentPane().add(jsp);
  }

}
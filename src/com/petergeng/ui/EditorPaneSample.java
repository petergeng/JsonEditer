package com.petergeng.ui;
import java.io.IOException;
import java.net.URL;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.text.Document;

class ActivatedHyperlinkListener implements HyperlinkListener {
  JEditorPane editorPane;

  public ActivatedHyperlinkListener(JEditorPane editorPane) {
    this.editorPane = editorPane;
  }

  public void hyperlinkUpdate(HyperlinkEvent hyperlinkEvent) {
    HyperlinkEvent.EventType type = hyperlinkEvent.getEventType();
    final URL url = hyperlinkEvent.getURL();
    if (type == HyperlinkEvent.EventType.ENTERED) {
      System.out.println("URL: " + url);
    } else if (type == HyperlinkEvent.EventType.ACTIVATED) {
      System.out.println("Activated");

      Document doc = editorPane.getDocument();
      try {
        editorPane.setPage(url);
      } catch (IOException ioException) {
        System.out.println("Error following link, Invalid link");
        editorPane.setDocument(doc);
      }
    }
  }
}

public class EditorPaneSample {
  public static void main(String args[]) {
    JFrame frame = new JFrame("EditorPane Example");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    try {
      JEditorPane editorPane = new JEditorPane("http://www.google.com");
      editorPane.setEditable(false);

      HyperlinkListener hyperlinkListener = new ActivatedHyperlinkListener(editorPane);
      editorPane.addHyperlinkListener(hyperlinkListener);
      JScrollPane scrollPane = new JScrollPane(editorPane);
      frame.add(scrollPane);
    } catch (IOException e) {
      System.err.println("Unable to load: " + e);
    }

    frame.setSize(640, 480);
    frame.setVisible(true);
  }
}
package org.example;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class WordCount extends JFrame implements ActionListener
{
  JLabel wordCount;
  JLabel letterCount;
  JTextArea jTextArea;
  JButton jButton;
  JButton text;
  JButton background ;

  public WordCount()
  {
    super("Word Count Application");

    //Jlabel
    wordCount = new JLabel("Word Counting : ");
    wordCount.setBounds(40,30,200,20);

    letterCount = new JLabel("Letter Counting : ");
    letterCount.setBounds(40,50,200,20);

    add(letterCount);
    add(wordCount);

    //JTest
    jTextArea = new JTextArea();
    jTextArea.setBounds(40,80,345,100);

    //JButton
    jButton = new JButton("Calculate");
    jButton.setBounds(40,220,100,20);
    jButton.addActionListener(this);

    background = new JButton("Background");
    background.setBounds(160,220,100,20);
    background.addActionListener(this);

    text = new JButton("Text Colour");
    text.setBounds(280,220,105,20);
    text.addActionListener(this);

    add(jTextArea);
    add(jButton);
    add(background);
    add(text);

    setSize(430,300);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }


  public static void main(String[] args)
  {
    new WordCount();
  }

  @Override
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==jButton)
    {
      String note = jTextArea.getText();
      letterCount.setText("Number of characters : " + note.length());

      String words[] = note.split("\\s");
      wordCount.setText("Number of words : " + words.length);
    }
    else if (e.getSource()==background)
    {
      Color c = JColorChooser.showDialog(this,"Choose colour",Color.black);
      jTextArea.setBackground(c);
    }
    else if (e.getSource()==text)
    {
      Color c = JColorChooser.showDialog(this,"Choose colour",Color.black);
      jTextArea.setForeground(c);
    }

  }
}
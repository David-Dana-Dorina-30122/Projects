package org.example;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class TaskManager extends JFrame implements ActionListener {
   JLabel label,label2;
   JTextField textField;
   JButton button,button2,button3;
   String selectedPathFile;
   JList<String> itemList;
   DefaultListModel<String> items;

   TaskManager() {
      this.setTitle("Your Tasks");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      label = new JLabel();
      label.setText("New Task:");
      //label.setForeground(new Color(0, 0, 255));
      label.setBounds(25, 50, 100, 200);
      label.setVerticalAlignment(JLabel.TOP);
      this.add(label);

      textField = new JTextField();
      textField.setBounds(25, 80, 300, 20);
      this.add(textField);

      label2 = new JLabel();
      label2.setText("Select The Tasks File:");
      label2.setBounds(25,10,200,30);
      this.add(label2);

      button = new JButton("Select File");
      button.addActionListener(this);
      button.setBounds(155, 15, 100, 20);
      this.add(button);

      button2 = new JButton("Insert Task");
      button2.addActionListener(this);
      button2.setBounds(25, 125, 150, 30);
      this.add(button2);

      button3 = new JButton("Delete Task");
      button3.addActionListener(this);
      button3.setBounds(190, 125, 150, 30);
      this.add(button3);


      itemList = new JList<>();
      JScrollPane scrollPane = new JScrollPane(itemList);
      scrollPane.setBounds(35, 165, 300, 200);
      this.add(scrollPane);

      this.setSize(420, 420);
      this.setLayout(null);
      this.setVisible(true);
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == button) {
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File("."));

         int response = fileChooser.showOpenDialog(null);

         if (response == JFileChooser.APPROVE_OPTION) {
            selectedPathFile = fileChooser.getSelectedFile().getAbsolutePath();
            System.out.println("Selected file path: " + selectedPathFile);

            items = new DefaultListModel<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(selectedPathFile))) {
               String line;
               while ((line = bufferedReader.readLine()) != null) {
                  items.addElement(line);
               }
            } catch (IOException ex) {
               System.err.println("Error reading the file: " + ex.getMessage());
            }
            itemList.setModel(items);
         }
      }

      if(e.getSource() == button2){
         String getText = textField.getText();
         items.addElement(getText);

         try (BufferedWriter writer = new BufferedWriter(new FileWriter(selectedPathFile, true))) {
            writer.write(getText + "\n");
            //writer.newLine();
         } catch (IOException ex) {
            System.err.println("Error writing to the file: " + ex.getMessage());
         }
         textField.setText("");
      }

      if(e.getSource() == button3){
         int index = itemList.getSelectedIndex();
         if(index != -1){
            items.remove(index);
            } else {
                  JOptionPane.showMessageDialog(this, "Please select an item to delete.", "Error", JOptionPane.ERROR_MESSAGE);
                  }
      }

   }
}



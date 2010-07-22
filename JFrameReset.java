
import javax.swing.*;
import java.util.Vector;

//For the Font
import java.awt.Font;

//For the ItemListener
import java.awt.event.*;

public class JFrameReset extends JFrame { // implements MouseListener {
   JPanel      topPanel;
   JScrollPane scrollPanel;


   public JFrameReset(){
      topPanel = new JPanel();
      topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));

      JLabel title = new JLabel("Title 1");
      topPanel.add(title);

      topPanel.removeAll();
      topPanel.add(new JLabel("Secondary Label"));
      
      scrollPanel = new javax.swing.JScrollPane(topPanel);
      getContentPane().add( 
         scrollPanel,
         java.awt.BorderLayout.CENTER
      );
     this.setBounds( 100, 100, 500, 200 );
     this.setDefaultCloseOperation( this.EXIT_ON_CLOSE );
     this.setVisible(true); 
 
   }

   public void redraw() {
      topPanel.removeAll();

      JLabel title = new JLabel("Title 3");
      topPanel.add(title);
      
      //scrollPanel = new javax.swing.JScrollPane(topPanel);
      //getContentPane().add( 
      //   scrollPanel,
      //   java.awt.BorderLayout.CENTER
      //);
      topPanel.revalidate();
      //topPanel.repaint();
      //revalidate();

      repaint();

   }


   public static void main( String[] args ) {
      JFrameReset x = new JFrameReset();
      x.redraw();
   }

}


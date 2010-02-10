//
//  PopupMenu.java
//  Amaras Example
/*
 * Amaras Example, Java PopupMenu and example implementation
 * Copyright (C) 2010  Morgan Prior
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contact morgan.prior@gmail.com
 *
 */
import javax.swing.*;
import javax.swing.event.*;

//For mouse listener interface
import java.awt.event.*;

public class PopupMenu{
   //...where instance variables are declared:
   JPopupMenu popup;
   
   //Constructor
   public PopupMenu(){
      JFrame     frame     = new JFrame();
                 popup     = new JPopupMenu();

      JMenuItem  menuUp    = new JMenuItem("Up");
      JMenuItem  menuDown  = new JMenuItem("Down");

      //menuUp.addActionListener     (actionUp);
      //menuDown.addActionListener   (actionDown);

      popup.add( menuUp );
      popup.addSeparator();
      popup.add( menuDown );

      //Add listener to components that can bring up popup menus.
      MouseListener popupListener = new PopupListener();
      frame.addMouseListener(popupListener);

      frame.setSize    (400,400);
      frame.setVisible (true);
      frame.setDefaultCloseOperation( frame.EXIT_ON_CLOSE );
   }
   
   
  
  //inner class
   class PopupListener extends MouseAdapter {
       public void mousePressed(MouseEvent e) {
           maybeShowPopup(e);
       }

       public void mouseReleased(MouseEvent e) {
           maybeShowPopup(e);
       }

       private void maybeShowPopup(MouseEvent e) {
           if (e.isPopupTrigger()) {
               popup.show(e.getComponent(),
                          e.getX(), e.getY());
           }
       }
   }
  
   public static void main( String[] args ) {
		System.out.println("Java Example Copyright (C) 2010  Morgan Prior");
   	System.out.println("This program comes with ABSOLUTELY NO WARRANTY; ");
   	System.out.println("   This is free software, and you are welcome to redistribute it");
   	System.out.println("   under certain conditions;");
   	
   	PopupMenu newWindow = new PopupMenu();
	}


}
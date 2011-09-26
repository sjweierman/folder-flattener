/* 
 * Folder Flattener.
 * (c)2011 Stephen J. Sarma-Weierman
 * www.iteran.com
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
package com.iteran.flattener;

import javax.swing.UIManager;

/**
 *
 * @author Stephen J. Sarma-Weierman
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    } catch (Exception e) {
      //Do nothing
    }
        FlattenerGUI gui = new FlattenerGUI();
        gui.setVisible(true);
    }
}

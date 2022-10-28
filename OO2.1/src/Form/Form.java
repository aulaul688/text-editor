package Form;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.List;
import javax.swing.*;
import javax.swing.text.View;

import AbstractFactory.*;
import AbstractFactory.Menu;
import AbstractFactory.MenuBar;
//--------------------------------ORGINAL
import Bridge.FontConcreteImp;
import Bridge.GuiAbstraction;
import Factory.*;	//new
import Bridge.ColorConcreteImp;
import Bridge.Abstraction;

import IteratorCounter.ConcreteList;
import IteratorCounter.CounterList;
import IteratorCounter.Iterator;
import Visitor.*;

import java.util.ArrayList;
//------------------------------------VER8
import StatePattern.*;
import Strategy.*;
import Memento.*;
// import IteratorPattern.*;



public class Form  {


	
	//Constructer
    public Form() {
 
    }
               
    
    //======== Main ========
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
              GUIfacade fa ;
              fa = new GUIfacade();
              fa.initComponents();
              fa.setVisible(true);
              
            }
        });
    }


}

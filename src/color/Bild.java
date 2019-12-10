/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author mikper222
 */
public class Bild extends JFrame {

    Panel panel;
    private long nanos;

    public Bild() throws IOException {
        this.panel = new Panel();
        setContentPane(panel);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        while (true) {
            panel.drawImage();
        }
//        run();
    }

    public static void main(String[] args) {

        try {
            new Bild();
        } catch (IOException ex) {
            Logger.getLogger(Bild.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

//        private void run() {
//        while (true) {
////            panel.d
//            panel.repaint();
//            long delay = 0;
//
//            while (System.nanoTime() < nanos + delay) {
//                Thread.yield();
//            }
//            nanos += delay;
//        }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import java.awt.image.BufferedImage;

/**
 *
 * @author mikper222
 */
public class SortChars {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(40, 40, BufferedImage.TYPE_INT_ARGB);
        for (int c = 32; c < 127; c++) {
            image.getGraphics().clearRect(0, 0, 40, 40);
            image.getGraphics().drawString("" +c, 10, 30);
            int sum = 0;
            for (int y = 0; y < 40; y++) {
                for (int x = 0; x < 40; x++) {
                    int argb = image.getRGB(x, y);
                    if (argb != 0xff000000) {
                        sum++;
                    }
                }
            }
            System.out.println("list.add(new Point("+(int)c+","+sum+"))");
        }
    }
}

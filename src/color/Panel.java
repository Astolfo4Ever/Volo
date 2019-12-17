/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author mikper222
 */
class Panel extends JPanel{
    
    BufferedImage img;
    BufferedImage img2;
    BufferedImage img3;
    
    public Panel() throws IOException {
        
        setPreferredSize(new Dimension(400, 400));
        setFocusable(true);
        img = newImage();
        img2 = BluredImage();
        betterAsciiArt();
        System.out.println("");
        asciiArt();
    }
    
    
    
    public BufferedImage newImage() throws IOException{
        File imageFile = new File("images/volvo.png");
           BufferedImage tempImg = ImageIO.read(getClass().getResource("Volo.jpg"));
            
        int imgWidth = tempImg.getWidth(), imgHeight = tempImg.getHeight();
        for (int x = 0; x < imgWidth; x++) {
            for (int y = 0; y < imgHeight; y++) {
                int argb = tempImg.getRGB(x, y);
                
                int a = (argb>>24)& 255;
                int r = (argb>>16)& 255;
                int g = (argb>>8)& 255;
                int b = (argb>>0)& 255;
                
                argb = (a<<24)|(g<<16)|(r<<8)|b;
                tempImg.setRGB(x, y, argb);
            }
        }
        return tempImg;
    }
    
    private BufferedImage BluredImage( ) throws IOException{
        BufferedImage img = ImageIO.read(getClass().getResource("Volo.jpg"));
//        int imgWidth = img.getWidth(), imgHeight= img.getHeight();
//        int avgARGB = 0;
//        for (int x = 0; x < imgWidth -1; x++) {
//            for (int y = 0; y < imgHeight -1; y++) {
//                int avgA = 0, avgR = 0, avgG = 0, avgB = 0;
//                for (int xNeigbouhr = -1; xNeigbouhr <= 1; xNeigbouhr++) {
//                    for (int yNeigbouhr = -1; yNeigbouhr <= 1; yNeigbouhr++) {
//                        int ARGB = img.getRGB(xNeigbouhr,yNeigbouhr);
//                        
//                        avgA = (ARGB>>16)& 255;
//                        avgR = (ARGB>>6)& 255;
//                        avgG = (ARGB>>6)& 255;
//                        avgB = (ARGB>>2)& 255;
//                                
//                       ARGB = (avgA<<16)|(avgR<<3)|(avgG<<6)|(avgB<<2);
//                       avgARGB += ARGB;
//                    }
//                }       
//                        avgARGB = avgARGB / 2;
//                        int argb = img.getRGB(x, y);
//                        int a = (argb>>24)& 255;
//                        int r = (argb>>16)& 255;
//                        int g = (argb>>8)& 255;
//                        int b = (argb>>0)& 255;
//                
//                        argb = (a<<24)|(r<<16)|(g<<8)|(b<<0);
//                        img.setRGB(x, y, (argb+avgARGB)/2);
//            }
//        }
        return img;
        
    }

    void nextFrame() throws IOException {
        
    }

    void drawImage() {
        getGraphics().drawImage(img, 0, 0, null);
        getGraphics().drawImage(img2, img.getWidth(), 0, null);
        getGraphics().drawImage(img3, 0, 0, null);
        
    }

    public void asciiArt() throws IOException {
        BufferedImage img = ImageIO.read(getClass().getResource("Volo.jpg"));
        int imgWidth = img.getWidth(), imgHeight= img.getHeight();
        String str = "@MW%#BR$NmDEHQg&Sw689GOPZbdpq5KU4aehCXk23FVnouTszLy7Y[]x=?ftv()1c{|}j*+/<>I\\^lr!_\"~;',-:´.";
        for (int y = 0; y < imgHeight; y++) {
            for (int x = 0; x < imgWidth; x++) {
                int argb = img.getRGB(x, y);
                
                int r = (argb>>16)& 255;
                int g = (argb>>8)& 255;
                int b = (argb>>0)& 255;
                int avg = (str.length()-1) * (r+g+b)/(3*255);
                System.out.print(str.charAt(avg));
            }
            System.out.println("");
        }
    }
    
    public void betterAsciiArt() throws IOException{
        BufferedImage img = ImageIO.read(getClass().getResource("Volo.jpg"));
        int imgWidth = img.getWidth(), imgHeight= img.getHeight();
        String str = "@MW%#BR$NmDEHQg&Sw689GOPZbdpq5KU4aehCXk23FVnouTszLy7Y[]x=?ftv()1c{|}j*+/<>I\\^lr!_\"~;',-:´.";
        for (int y = 0; y < imgHeight; y++) {
            for (int x = 0; x < imgWidth; x++) {
                int argb = img.getRGB(x, y);
                
                int r = (argb>>16)& 255;
                int g = (argb>>8)& 255;
                int b = (argb>>0)& 255;
                int avg = (str.length()-1) * (r+g+b)/(3*255);
                if ( avg<45){ System.out.print(str.charAt(avg));
                } else { System.out.print("_");}
            }
            System.out.println("");
        }
    }
    
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import java.awt.Point;
import java.util.Comparator;

/**
 *
 * @author mikper222
 */
public class MyComparator implements Comparator<Point>{
    public int compare(Point o1, Point o2){
        return o2.y - o1.y; 
    }
} 

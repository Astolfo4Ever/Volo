/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package color;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author mikper222
 */
public class SortAList {
    public static void main(String[] args) {
        ArrayList<Point> list = new ArrayList();
        fill(list); 
        list.sort(new MyComparator());
        for (Point p : list) {
            System.out.println((char) p.x);
        }
    }

    private static void fill(ArrayList<Point> list) {
list.add(new Point(32,32));
list.add(new Point(33,32));
list.add(new Point(34,34));
list.add(new Point(35,35));
list.add(new Point(36,37));
list.add(new Point(37,29));
list.add(new Point(38,37));
list.add(new Point(39,37));
list.add(new Point(40,38));
list.add(new Point(41,29));
list.add(new Point(42,34));
list.add(new Point(43,34));
list.add(new Point(44,36));
list.add(new Point(45,37));
list.add(new Point(46,39));
list.add(new Point(47,31));
list.add(new Point(48,39));
list.add(new Point(49,39));
list.add(new Point(50,39));
list.add(new Point(51,30));
list.add(new Point(52,35));
list.add(new Point(53,35));
list.add(new Point(54,37));
list.add(new Point(55,38));
list.add(new Point(56,40));
list.add(new Point(57,32));
list.add(new Point(58,40));
list.add(new Point(59,40));
list.add(new Point(60,41));
list.add(new Point(61,32));
list.add(new Point(62,37));
list.add(new Point(63,37));
list.add(new Point(64,39));
list.add(new Point(65,40));
list.add(new Point(66,42));
list.add(new Point(67,34));
list.add(new Point(68,42));
list.add(new Point(69,42));
list.add(new Point(70,33));
list.add(new Point(71,24));
list.add(new Point(72,29));
list.add(new Point(73,29));
list.add(new Point(74,31));
list.add(new Point(75,32));
list.add(new Point(76,34));
list.add(new Point(77,26));
list.add(new Point(78,34));
list.add(new Point(79,34));
list.add(new Point(80,41));
list.add(new Point(81,32));
list.add(new Point(82,37));
list.add(new Point(83,37));
list.add(new Point(84,39));
list.add(new Point(85,40));
list.add(new Point(86,42));
list.add(new Point(87,34));
list.add(new Point(88,42));
list.add(new Point(89,42));
list.add(new Point(90,41));
list.add(new Point(91,32));
list.add(new Point(92,37));
list.add(new Point(93,37));
list.add(new Point(94,39));
list.add(new Point(95,40));
list.add(new Point(96,42));
list.add(new Point(97,34));
list.add(new Point(98,42));
list.add(new Point(99,42));
list.add(new Point(100,51));
list.add(new Point(101,42));
list.add(new Point(102,47));
list.add(new Point(103,47));
list.add(new Point(104,49));
list.add(new Point(105,50));
list.add(new Point(106,52));
list.add(new Point(107,44));
list.add(new Point(108,52));
list.add(new Point(109,52));
list.add(new Point(110,42));
list.add(new Point(111,33));
list.add(new Point(112,38));
list.add(new Point(113,38));
list.add(new Point(114,40));
list.add(new Point(115,41));
list.add(new Point(116,43));
list.add(new Point(117,35));
list.add(new Point(118,43));
list.add(new Point(119,43));
list.add(new Point(120,47));
list.add(new Point(121,38));
list.add(new Point(122,43));
list.add(new Point(123,43));
list.add(new Point(124,45));
list.add(new Point(125,46));
list.add(new Point(126,48));
    }
}

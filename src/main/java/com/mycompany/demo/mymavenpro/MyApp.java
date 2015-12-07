/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.mymavenpro;

import java.util.Random;

/**
 *
 * @author omara
 */
public class MyApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
       // int a = r.nextInt(100);
        Node myList = new Node();
        for (int i = 0; i < 5; i++) {
            myList = addNode(i, myList);
        }
        int len = nodeListLen(myList);
        System.out.println("===: " + len);
        
        if( TogglzDemo.FEATURE_ONE.isActive() ) {
        // new stuff here
}
    }

    static Node addNode(int n, Node prevNode) {
        Node myList = new Node(n, prevNode);
        return myList;
    }

    static int nodeListLen(Node aList) {
        int cnt = 0;
        while (aList.isEmpty != true) {
            cnt += 1;
            aList = aList.tail;
        }
        return cnt;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.mymavenpro;

/**
 *
 * @author omara
 */

public class Node {
    
    boolean isEmpty;
    int value = 0;
    Node tail;

    public Node() {
        this.isEmpty = true;
    }
    
     
    Node(int val, Node tail){
        this.isEmpty = false;
        this.value = val;
        this.tail = tail;
    }
    
}
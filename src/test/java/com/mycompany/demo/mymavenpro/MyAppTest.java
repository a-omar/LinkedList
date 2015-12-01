/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.demo.mymavenpro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author omara
 */
public class MyAppTest {
    
    public MyAppTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class MyApp.
     */

    /**
     * Test of addNode method, of class MyApp.
     */
    @Test
    public void testAddNode() {
        System.out.println("addNode");
        int n = 1;
        Node prevNode = new Node();
        Node expResult = new Node(n,prevNode);
        Node result = MyApp.addNode(n, prevNode);
        assertNotEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of nodeListLen method, of class MyApp.
     */
    @Test
    public void testNodeListLen() {
        System.out.println("nodeListLen");
        Node aList = null;
        int expResult = 2;
        int result = MyApp.nodeListLen(new Node(1,new Node(2,new Node())));
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}

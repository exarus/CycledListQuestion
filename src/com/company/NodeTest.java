package com.company;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests Node.
 *
 * Created by Ruslan on 9/17/2014.
 */

public class NodeTest {
    Node n0;
    Node n1;
    Node n2;
    Node n3;
    Node n4;
    Node n5;
    Node n6;
    Node n7;
    Node n8;
    Node n9;

    @Before
    public void beforeTest() {
        n0 = new Node();
        n1 = new Node();
        n2 = new Node();
        n3 = new Node();
        n4 = new Node();
        n5 = new Node();
        n6 = new Node();
        n7 = new Node();
        n8 = new Node();
        n9 = new Node();
    }

    @Test
    public void testLinearCase() {
        n0.setNext(n1).setNext(n2).setNext(n3).setNext(n4)
                .setNext(n5).setNext(n6).setNext(n7)
                .setNext(n8).setNext(n9);
        assertFalse(n0.isCycled());
        assertFalse(n5.isCycled());
    }

    @Test
    public void testCircleCase() {
        n0.setNext(n1).setNext(n2).setNext(n3).setNext(n4)
                .setNext(n5).setNext(n6).setNext(n7)
                .setNext(n8).setNext(n9).setNext(n0);
        assertTrue(n0.isCycled());
    }

    @Test
    public void testPCase() {
        n0.setNext(n1).setNext(n2).setNext(n3).setNext(n4)
                .setNext(n5).setNext(n6).setNext(n7)
                .setNext(n8).setNext(n9).setNext(n5);
        assertTrue(n0.isCycled());
    }

    @Test
    public void testgCase() {
        n0.setNext(n1).setNext(n2).setNext(n3).setNext(n4)
                .setNext(n5).setNext(n6).setNext(n7)
                .setNext(n8).setNext(n9).setNext(n0);
        assertTrue(n7.isCycled());
    }



}

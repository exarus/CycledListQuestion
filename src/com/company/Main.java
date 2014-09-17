package com.company;

import java.util.TreeSet;

class Main {

    public static void main(String[] args) {
        Node n0 = new Node();
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();
        Node n4 = new Node();
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();

        n0.setNext(n1).setNext(n2).setNext(n3).setNext(n4)
                .setNext(n5).setNext(n6).setNext(n7)
                .setNext(n8).setNext(n9);//.setNext(n1);
        System.out.println(n0.isCycled());
    }

}
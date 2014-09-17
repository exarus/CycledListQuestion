package com.company;

/**
 * Represents a node.
 * Created by Ruslan on 8/30/2014.
 */
public class Node {
    private static long nextId;
    private long id;
    private Node next;


    public boolean isCycled() {
        Node cur = this;
        while (cur != null) {
            Node prev = cur;
            cur = cur.getNext();
            if (prev.equals(cur)) {
                return true;
            }
            Node cur2 = this;
            while (!cur2.equals(prev)) {
                if (cur2.equals(cur)) {
                    return true;
                }
                cur2 = cur2.getNext();
            }
        }
        return false;
    }

    Node() {
        id = nextId;
        nextId++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (id != node.id) return false;
        return !(next != null ? !next.equals(node.next) : node.next != null);

    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    public Node setNext(Node next) {
        this.next = next;
        return next;
    }

    public Node getNext() {
        return next;
    }

    public long getId() {
        return id;
    }
}

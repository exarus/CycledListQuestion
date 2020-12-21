package com.company;

/**
 * Represents a node.
 * Created by Ruslan on 8/30/2014.
 */
public class Node {
    private static long nextId;
    private long id;
    private Node next;


    /**
     * Checks, if the node is a part of cycled linked structure.
     * In other words, checks if the node can be returned after
     * iterating throw the list via some amount of getNext() methods.
     *
     * @return true if the node is a part of cycled linked structure,
     * false in the other case.
     */
    public boolean isCycled() {
        Node cur = this;
        // iterating every element
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

    /**
     * Standart Constructor.
     */
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

    /**
     * Sets the next node.
     *
     * @param next node, to be next in the list.
     * @return param next.
     */
    public Node setNext(Node next) {
        this.next = next;
        return next;
    }

    /**
     * Returns the next node of the list.
     *
     * @return the next node of the list.
     */
    public Node getNext() {
        return next;
    }

    /**
     * Returns the node's id.
     *
     * @return the node's id.
     */
    public long getId() {
        return id;
    }
}

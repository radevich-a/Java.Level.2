package structure.list.impl;

import structure.list.GBIterator;
import structure.list.GBList;

public class SingleLinkedList implements GBList {
    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public String get(int index) {
        Node current = first;
        Node next = first.next;
        int i = 0;
        while (iterator().hasNext()) {
            if (i == index) {
                break;
            }
            next = current;
            current = current.next;
            i++;
            if (current == null){
                return null;
            }
        }
        return next.val;
    }

    @Override
    public void add(String val) {

        if (first == null) {
            first = new Node(val);
            first.prev = null;
        } else {
            add(first, val);
        }
        size++;
    }


    private void add(Node current, String val) {
        if (current.next == null) {
            current.next = new Node(val);

            return;
        }
        add(current.next, val);
        //current.prev = ;
    }


    @Override
    public boolean remove(String val) {
        if (first.val.equals(val)) {
            first = first.next;
            size--;
            return true;
        }

        Node prev = first;
        Node current = first.next;
        while(current != null) {
            if (current.val.equals(val)) {
                prev.setNext(current.next);
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false;
    }

    @Override
    public int size() {
//        int i = 0;
//        GBIterator iterator = iterator();
//        while (iterator.hasNext()) {
//            i++;
//        }
//        return i;
        return size;
    }

    @Override
    public GBIterator iterator() {
        return new StraightForwardIterator(first);
    }

    @Override
    public String toString() {
        return "SingleLinkedList 8 " +
                "first=" + first +

                " 8";
    }

    private static class Node {
        private String val;
        private Node next;
        private Node prev;

        public Node(String val) {

            this(val, null, null);
        }

        public Node(String val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }




        public void setNext(Node next) {
            this.next = next;
        }
        public void setPrev(Node prev){
            this.prev = prev;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val='" + val + '\'' +
                    ", next=" + next +
                    ", prev=" + prev +
                    '}';
        }
    }

    public static class StraightForwardIterator implements GBIterator {
        private Node current;

        public StraightForwardIterator(Node current) {

            this.current = current;
        }

        @Override
        public boolean hasNext() {

            return current != null;
        }

        @Override
        public String next() {
            String val = current.val;
            current = current.next;


            return val;
        }
    }
}

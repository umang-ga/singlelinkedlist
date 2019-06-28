package com.ga;

/**
 * @author Umang Soni
 *
 */
public class SingleLinkedList {

    private Node head;

    public SingleLinkedList() {
    }

    /* Single Linked list Node */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    /*
     * Method to append element in linked list If the Linked List is empty,it makes new node as head else it will
     * traverse till the last node and insert the new_node there
     */
    
    /**
     * @param linkList
     * @param data
     * @return
     */
    public SingleLinkedList append(SingleLinkedList linkList, int data) {

        Node new_node = new Node(data);
        new_node.next = null;

        if (linkList.head == null) {
            linkList.head = new_node;
        } else {
            Node last = linkList.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return linkList;
    }

    /*
     * Remove an element by data
     */
    
    /**
     * @param linkList
     * @param dataToDelete
     * @return
     */
    public static SingleLinkedList remove(SingleLinkedList linkList, int dataToDelete) {
        Node currNode = linkList.head, prev = null;

        // If head node holds the key to be deleted
        if (currNode != null && currNode.data == dataToDelete) {
            linkList.head = currNode.next;
            System.out.println(dataToDelete + " found and deleted");
            return linkList;
        }
        // If the key is somewhere other than at head
        while (currNode != null && currNode.data != dataToDelete) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println("Element : " + dataToDelete + " found and deleted");
        }

        if (currNode == null) {
            System.err.println("Element : " + dataToDelete + " not found");
        }
        return linkList;
    }

    /*
     * Remove an element by data
     */
    
    /**
     * @param linkList
     * @return
     */
    public SingleLinkedList removeTail(SingleLinkedList linkList) {

        Node currNode = linkList.head;

        // If the key is somewhere other than at head
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        if (currNode.next == null) {
            System.out.println("Tail Element deleted :" + currNode.data);
            remove(linkList, currNode.data);
        }
        return linkList;
    }

    /*
     * Remove an elements greater than specific data
     */
    
    /**
     * @param list
     * @param dataToDelete
     * @return
     */
    public SingleLinkedList removeElementsGreaterThan(SingleLinkedList list, int dataToDelete) {
        Node currNode = list.head;

        if (currNode == null) {
            System.err.println("List id empty");
            return list;
        }

        while (currNode != null) {
            if (currNode.data > dataToDelete) {
                remove(list, currNode.data);
                System.out.println("Element deleted " + dataToDelete);
            }
            currNode = currNode.next;
        }
        return list;
    }

    @Override
    public String toString() {
        Node currNode = this.head;
        String output = "";

        while (currNode != null) {
            // Print the data at current node
            output += currNode.data + " ";
            currNode = currNode.next;
        }
        return output;
    }
}

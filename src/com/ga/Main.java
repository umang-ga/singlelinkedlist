package com.ga;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Util util = new Util();

        SingleLinkedList list = new SingleLinkedList();

        // 1. Append an element into the linkedlist
        System.out.println("Appending int elements in singly linked list");
        util.appendElements(list);

        System.out.println(String.format("List data : %s", list.toString()));

        // 2. Remove tail element from linkedlist
        System.out.println("Removing tail element from singly linked list");
        list.removeTail(list);

        // 3. Remove all element in the linkedlist that is great than a target value

        Scanner myInput = new Scanner(System.in);
        System.err.print("Enter element greater than which u want to delete data: ");
        int data = myInput.nextInt();

        list.removeElementsGreaterThan(list, data);
        myInput.close();
        System.out.println(String.format("List data after deletion : %s", list.toString()));

        // If you want to set target element as fix value uncomment this code
        /*
         * System.out.println("Removing element greater than specified element from singly linked list");
         * list.removeElementsGreaterThan(list, 40);
         */

    }

}

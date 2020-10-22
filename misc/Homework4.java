/*
 * Author: Roderick Bishop
 * 
 * 
 * Created on: 2/12/2017
 * 
 * This program creates a linked list 
 */

import java.util.LinkedList;
public class Homework4{

public static void main (String []args) {
	LinkedList<String> list = new LinkedList<>();
	list.addFirst("America"); // Add it to the list
	System.out.println("(1) " + list);
	list.addLast("Canada"); // Add it to the beginning of the list
	System.out.println("(2) " + list);
	list.addFirst("Russia"); // Add it to the end of the list
	System.out.println("(3) " + list);
	list.addLast("France"); // Add it to the end of the list
	System.out.println("(4) " + list);
	list.addFirst("Germany"); // Add it to the list at index 2
	System.out.println("(5) " + list);
	list.addLast("Norway"); // Add it to the list at index 5
	System.out.println("(6) " + list);
	list.addFirst("Poland"); // Same as list.addFirst("Poland")
	System.out.println("(7) " + list);
	list.removeLast();
	System.out.println("(8) " + list);
}


public class LinkList {
	ListNode<String> head;
	 ListNode<String> tail;
	 
	 public void addFirst(String s) {
			ListNode<String> firstLink = new ListNode<String>(s);
		firstLink.next= head;
			firstLink = head;
		 }
		 
		 public void addLast(String s) {
			 ListNode<String> lastLink = new ListNode<String>(s);
			 ListNode tempNode = head;
			while(tempNode.next!=null) {
				tempNode = tempNode.next;
			}
			tempNode = lastLink;
			 
		 }
		 
		
		 public void removeLast() {
			 ListNode tempNode = head;
			 while(tempNode.next!=null) {
				 tempNode= tempNode.next;
			 }
			 tempNode.next=null;
		 }
}

public class ListNode<E> {
     E element;        // An item in the list.
    ListNode next;  // Pointer to the next node in the list.
public ListNode(E e) {
	element = e;	// A constructor for ListNode
}



}
}
package com.company;

public class Main {

    public static void main(String[] args) {
    //You don't need to touch anything here

	IndexCard card1 = new IndexCard("Card A",10);
    IndexCard card2 = new IndexCard("Card B",5);
    IndexCard card3 = new IndexCard("Card C",111);
    IndexCard card4 = new IndexCard("Card D",34);

    MyPriorityQueue myPriorityQueue = new MyPriorityQueue();
    myPriorityQueue.addToPriorityQueue(card1);
    myPriorityQueue.addToPriorityQueue(card2);
    myPriorityQueue.addToPriorityQueue(card3);
    myPriorityQueue.addToPriorityQueue(card4);

    myPriorityQueue.showPriorityQueue();
    myPriorityQueue.showPriorityQueue(); //Yes, this is here twice on purpose. It's to help you see a possible issue.
    }
}

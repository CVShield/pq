package com.company;


import java.util.PriorityQueue;

public class MyPriorityQueue {
    PriorityQueue<IndexCard> entries;
    PriorityQueue<IndexCard> pq = new PriorityQueue<IndexCard>();

    public MyPriorityQueue() {
        entries = new PriorityQueue<IndexCard>();
    }

    public void addToPriorityQueue(IndexCard card) { //You don't need to touch this method
        entries.add(card);
    }


    public void showPriorityQueue() { //dump data into another way of storing data :/ google how to make a new priorityqueue while still utilizing entries
        if (pq.size() == 4) {
            for (int x = 0; x < pq.size() + 3; x++) {
                System.out.print(pq.peek().getCardNameName()+" ");
                System.out.println(pq.peek().getDistanceValue());
                pq.remove(pq.peek());
            }
        } else {
            for (int y = 0; y< entries.size() + 3; y++) {
                pq.add(entries.peek());
                System.out.print(entries.peek().getCardNameName()+" ");
                System.out.println(entries.peek().getDistanceValue());
                entries.remove(entries.peek());
            }
        }
    }

        public void updateHeadValue(int valueToAdd){ //Should add provided value to first object in PriorityQueue
           // IndexCard.addToDistance(valueToAdd);

    }
}

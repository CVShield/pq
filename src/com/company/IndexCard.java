package com.company;

public class IndexCard implements Comparable {
    String cardName;
    Integer distanceValue;
    String previousPath;
    public IndexCard(String cardName) {
        this.cardName = cardName;
        distanceValue = 0;
        previousPath = null;
    }

    public IndexCard(String cardName, Integer defaultValue) {
        this.cardName = cardName;
        distanceValue = defaultValue;
        previousPath = null;
    }

    public String getCardNameName() {
        return cardName;
    }

    public void setCardName(String name) {
        this.cardName = name;
    }

    public void setDistanceValue(Integer distanceValue) {
        this.distanceValue = distanceValue;
    }

    public Integer getDistanceValue() {
        return distanceValue;
    }

    public String getPreviousPath() {
        return previousPath;
    }

    public void setPreviousPath(String path) {
        this.previousPath = path;
    }

    public void addToDistance(Integer value) {
        distanceValue += value;
    }

    @Override
    public int compareTo(Object indexCard2) {
        Integer valOfIndexCard1 = this.distanceValue;
        Integer valOfIndexCard2 = ((IndexCard) indexCard2).distanceValue;
        Integer valOfComparison = valOfIndexCard1.compareTo(valOfIndexCard2);
        if(valOfComparison < 0) {
            return -1;
        }
        else if(valOfComparison > 0)
            return 1;
        else {
            return 0;
        }
    }
}
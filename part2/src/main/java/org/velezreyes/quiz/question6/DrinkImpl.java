package org.velezreyes.quiz.question6;

class DrinkImpl implements Drink{

    private String name = "";
    private boolean fizzy = false;
    private int cost = 0;

    DrinkImpl(String name, boolean fizzy, int cost){
        this.name = name;
        this.fizzy = fizzy;
        this.cost = cost;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isFizzy() {
        return fizzy;
    }

    public int getCost() {
        return cost;
    }
}

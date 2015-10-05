package fr.unice.polytech.soa1.domain;

public enum Form {
    ROUND (3),
    TRIANGLE (5),
    OVAL (4);

    private int price = 0;

    Form(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}

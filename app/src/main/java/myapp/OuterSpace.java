package main.java.myapp;

public class OuterSpace {

    public enum Category {
        BASE,
        PROTEIN,
        TOPPING,
        SAUCE
    }

    public static void main(String[] args) {
        for (Category cat : Category.values()) {
            System.out.println(cat);
        }
    }
}

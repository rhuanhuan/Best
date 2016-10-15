package bester;

public class Cookie implements Bestable{

    private int numberOfChocolateChips;

    public Cookie(int numberOfChocolateChips) {
        this.numberOfChocolateChips = numberOfChocolateChips;
    }

    @Override
    public boolean betterThan(Object o){
        Cookie cookie = (Cookie)o;
        return numberOfChocolateChips>cookie.numberOfChocolateChips;
    }

}

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cookie cookie = (Cookie) o;

        return numberOfChocolateChips == cookie.numberOfChocolateChips;

    }

    @Override
    public int hashCode() {
        return numberOfChocolateChips;
    }
}

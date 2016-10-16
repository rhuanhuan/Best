package bester;

public class Best {

    private Bestable[] bestables;

    public Best(Bestable[] bestables) {
        if (bestables==null || bestables.length==0)
            throw new NullPointerException();
        this.bestables = bestables;
    }

    Bestable getBest() {
        Bestable result = bestables[0];
        for (int i = 1; i < bestables.length; i++) {
            if (bestables[i].betterThan(result)){
                result = bestables[i];
            }
        }
        return result;
    }

}

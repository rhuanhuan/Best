package bester;

/**
 * Created by rhuan on 10/14/16.
 */
public class Best {

    private Bestable[] bestables;

    public Best(Bestable[] bestables) {
        if (bestables==null || bestables.length==0)
            throw new NullPointerException();
        this.bestables = bestables;
    }

    Bestable getBest() {
        Bestable result = bestables[0];
        for (int i = 0; i < bestables.length - 1; i++) {
            if (bestables[i+1].betterThan(bestables[i])){
                result = bestables[i+1];
            }
        }
        return result;
    }

}

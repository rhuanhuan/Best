package bester;

/**
 * Created by rhuan on 10/14/16.
 */
public class Best {
    private Rectangle[] rectangleList;

    Best(Rectangle[] rectangleList) {

        if(rectangleList == null || rectangleList.length ==0){
            throw new NullPointerException();
        }
        this.rectangleList = rectangleList;
    }

    Rectangle getBestRetangle() {
        int listLength = rectangleList.length;
        Rectangle result = rectangleList[0];
        for (int i=0;i<listLength-1;i++){
            if (rectangleList[i + 1].betterThan(rectangleList[i])){
                result = rectangleList[i+1];
            }
        }
        return result;
    }
}

package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BestRectangleTest {

    @Test(expected = NullPointerException.class)
    public void rectangleShouldNotBeNullThenThrowNullException() throws Exception {
        new Best(null);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowNullExceptionWhenRectangleListIsEmpty() throws Exception {
        Rectangle[] rectanglesList = {};
        new Best(rectanglesList);

    }

    @Test
    public void shouldReturnTheRectangleIfOnlyOne() throws Exception {
        Rectangle[] rectanglesList = {new Rectangle(6,3)};
        Best bestRectangle = new Best(rectanglesList);
        assertEquals(new Rectangle(6,3),bestRectangle.getBest());
    }

    @Test
    public void shouldReturnTheBestRectangleIfWeInputTwoRectangles() throws Exception {
        Rectangle[] rectanglesList = {new Rectangle(5,8),new Rectangle(8,9)};
        Best bestRectangle = new Best(rectanglesList);
        assertEquals(new Rectangle(8,9),bestRectangle.getBest());
    }

    @Test
    public void shouldReturnTheBestRectangleIfWeInputFourRectangles() throws Exception {
        Rectangle[] rectanglesList = {new Rectangle(5,8),new Rectangle(8,9),new Rectangle(10,9),new Rectangle(7,9)};
        Best bestRectangle = new Best(rectanglesList);
        assertEquals(new Rectangle(10,9),bestRectangle.getBest());
    }

}

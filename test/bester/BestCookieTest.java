package bester;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BestCookieTest {
    @Test(expected = NullPointerException.class)
    public void shouldThrowAnExceptionIfItsNull() throws Exception {
        Cookie[] cookiesArry = null;
        new Best(cookiesArry);
    }

    @Test(expected = NullPointerException.class)
    public void shouldThrowAnExceptionIfItsEmpty() throws Exception {
        Cookie[] cookiesArry = {};
        new Best(cookiesArry);
    }

    @Test
    public void shouldReturnTheCookieIfOnlyOneCookie() throws Exception {
        Cookie[] cookiesArry = {new Cookie(1)};
        Best bestCookie=new Best(cookiesArry);
        assertEquals(bestCookie.getBest(),new Cookie(1));
    }

    @Test
    public void shouldReturnBestCookie() throws Exception {
        Cookie[] cookiesArry = {new Cookie(1),new Cookie(5),new Cookie(3),new Cookie(4)};
        Best bestCookie = new Best(cookiesArry);
        assertEquals(bestCookie.getBest(),new Cookie(5));
    }
}

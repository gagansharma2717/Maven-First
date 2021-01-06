package App1;

import App.App1;
import org.junit.Assert;
import org.junit.Test;

public class App1Test {
    @Test
    public void checkCount()
    {
        App1 a = new App1();
        Assert.assertEquals(100,a.count(10));
    }

}

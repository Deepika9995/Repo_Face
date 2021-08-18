import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestDemo {
    SumNum s = new SumNum();

    @Test
    public void test() {
        Assert.assertEquals(25,s.sum(10, 15));
    }

    @Test
    public void testString(){
        SumNum s = new SumNum();
        Assert.assertEquals("Super Nova!",s.getMessage("Super Nova!"));
    }
}

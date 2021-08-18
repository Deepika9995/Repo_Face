
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Assert;
import org.junit.Test;

public class StubTest {

    @Test
    public void testStubbing(){
        //Assert.fail("Start Stubbing");
        mock(Stub.class);
        StubCalling sc = new StubCalling();
        assertEquals("Deepika",sc.callDisplay("Dee"));
    }


}

import org.junit.Assert;
import org.junit.Test;


public class TestArea {

    @Test
   public void testInitial(){
       Assert.fail("Start..");
   }

   @Test
   public void testSquareArea(){
        FindAreaAndPerimeter findAreaAndPerimeter = new FindAreaAndPerimeter();
        Assert.assertEquals(16.0,findAreaAndPerimeter.calculateSquareArea(4.0),0);
   }

    @Test
    public void testSquarePerimeter(){
        FindAreaAndPerimeter findAreaAndPerimeter = new FindAreaAndPerimeter();
        Assert.assertEquals(24.0,findAreaAndPerimeter.calculateSquarePerimeter(6.0),0);
    }

    @Test
    public void testRectangleArea(){
        FindAreaAndPerimeter findAreaAndPerimeter = new FindAreaAndPerimeter();
        Assert.assertEquals(15.0,findAreaAndPerimeter.calculateRectangleArea(3.0, 5.0),0);
    }

    @Test
    public void testRectanglePerimeter(){
        FindAreaAndPerimeter findAreaAndPerimeter = new FindAreaAndPerimeter();
        Assert.assertEquals(16.0,findAreaAndPerimeter.calculateRectanglePerimeter(3.0, 5.0),0);
    }

}

import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TestUser{

  @Test
  public void testObjectInstances(){
    ArrayList<String> testArray = new ArrayList<String>();
    User user1 = new User("Alex","Doomcat",123,"doomcat9167@gmail.com", testArray);
    assertEquals(true, user1 instanceof User);
  }
}

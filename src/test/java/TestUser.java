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

  @Test
  public void testUserInstanceArray(){
    ArrayList<String> testArray = new ArrayList<String>();
    User user1 = new User("Alex","Doomcat",123,"doomcat9167@gmail.com", testArray);
    User user2 = new User("James","Do",12413,"doomcat@gmail.com", testArray);
    User user3 = new User("Kim","Dog",122343,"doomcat916@gmail.com", testArray);
    int expected = 3;
    assertEquals(expected, User.all().size());
  }
}

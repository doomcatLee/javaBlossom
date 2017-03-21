import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class User{
  private String mName;
  private String mUserName;
  private int mPassword;
  private String mEmail;
  private ArrayList<String> mContent;
  private LocalDateTime mCompletedAt;
  private static ArrayList<User> instances = new ArrayList<User>();
  private int mId;

  public User(String a, String b, int c, String d, ArrayList<String> e){
    mName = a;
    mUserName = b;
    mPassword = c;
    mEmail = d;
    mContent = e;
    instances.add(this);
    mId = instances.size();
  }

  //Getters
  public String getName(){
    return mName;
  }

  public String getUserName(){
    return mUserName;
  }

  public int getPassword(){
    return mPassword;
  }

  public String getEmail(){
    return mEmail;
  }

  public ArrayList<String> getContent(){
    return mContent;
  }

  public int getId() {
   return mId;
  }

  public static List<User> all() {
    return instances;
  }


  //Setters
  public void setName(String input){
    mName = input;
  }

  public void setUserName(String input){
    mUserName = input;
  }

  public void setPassword(int input){
    mPassword = input;
  }

  public void setEmail(String input){
    mEmail = input;
  }

  public void setContent(ArrayList<String> input){
    mContent = input;
  }

  public String toString(){
    return mName + mUserName + mEmail + mPassword + mContent;
  }


  //Cool methods here:
  public static void clear() {
    instances.clear();
  }

  public static User find(int id) {
    return instances.get(id - 1);
  }

}

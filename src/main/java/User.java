import java.util.ArrayList;

public class User{
  private String mName;
  private String mUserName;
  private int mPassword;
  private String mEmail;
  private ArrayList<String> mContent;

  public User(String a, String b, int c, String d, ArrayList<String> e){
    mName = a;
    mUserName = b;
    mPassword = c;
    mEmail = d;
    mContent = e;
  }

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

}

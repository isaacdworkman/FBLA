import java.util.ArrayList;
public class Comparing
{
  private ArrayList<String> Cities = new ArrayList<String>();
  public String selectedLocation;
  public boolean Cities(String location)
  {
    System.out.println(location);
    selectedLocation = location;
    System.out.println(selectedLocation + "----");
    if(location.equals("Omaha")||location.equals("Lincoln")||location.equals("Fremont")||location.equals("Other"))
    {
    return true;
    }
    return false;
  }
  public boolean RemoveByCity(String location)
  {
    //Why won't it work ill try later, won't save the selected location
    System.out.println(selectedLocation +"----");
    if(location.equals(selectedLocation))
    {
      System.out.println("True");
      return true;
    }
   

    System.out.println("False");
     return false;
  }

}
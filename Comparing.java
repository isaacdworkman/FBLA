import java.util.ArrayList;
public class Comparing
{
  
  
  public boolean Cities(String location)
  {
    System.out.println(location + " was selected);
    if(location.equals("Omaha")||location.equals("Lincoln")||location.equals("Fremont")||location.equals("Other"))
    {
    return true;
    }
    return false;
  }
  public boolean RemoveByCity(String location, String entry))
  {
    if(selectedLocation.equals("Other"))
    {
      if(!location.equals("Omaha")&& !location.equals("Lincoln")&&!location.equals("Fremont"))
      {
        return true;
      }
    }
    if(location.equals(selectedLocation))
    {
      return true;
    }
     return false;
  }

}

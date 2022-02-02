public class Comparing
{
  
  
  public boolean Cities(String location)
  {
    
    if(location.equals("Omaha")||location.equals("Lincoln")||location.equals("Fremont")||location.equals("Other")||location.equals("Any"))
    {
      System.out.println(location + " was selected");
    return true;
    }
    return false;
  }

  public boolean RemoveByCity(String location, String entry)
  {
    if(entry.equals("Any"))
    {
      return true;
    }
    if(entry.equals("Other"))
    {
      if(!location.equals("Omaha")&& !location.equals("Lincoln")&&!location.equals("Fremont"))
      {
        return true;
      }
    }
    if(location.equals(entry))
    {
      return true;
    }
     return false;
  }

  public boolean price (String enteredPriceRange)
  {
    
    if(enteredPriceRange.equals("Free")||enteredPriceRange.equals("Under 25")||enteredPriceRange.equals("Above 50")||enteredPriceRange.equals("Any"))
    {
      System.out.println(enteredPriceRange + " was selected");
    return true;
    }
    return false;
  }
  public boolean RemoveByPrice(String priceRange, String entry)
  {
    if(entry.equals("Any"))
    {
        return true;
    
    }
    if(priceRange.equals(entry))
    {
      return true;
    }
     return false;
  }

  public boolean Season (String enteredSeason)
  {
    
    if(enteredSeason.equals("Spring")||enteredSeason.equals("Summer")||enteredSeason.equals("Fall")||enteredSeason.equals("Winter")||enteredSeason.equals("Any"))
    {
      System.out.println(enteredSeason + " was selected");
    return true;
    }
    return false;
  }
  public boolean RemoveBySeason(String Season, String entry)
  {
    if(entry.equals("Any"))
    {
        return true;
    
    }
    if(Season.equals(entry))
    {
      return true;
    }
     return false;
  }

}

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
    // 0-5,6-10,10-20,20+
    if(enteredPriceRange.equals("0-5")||enteredPriceRange.equals("6-10")||enteredPriceRange.equals("10-20")||
    enteredPriceRange.equals("20+")||
    enteredPriceRange.equals("Any"))
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

  public boolean InsideOut (String enteredSeason)
  {
    
    if(enteredSeason.equals("Inside")||enteredSeason.equals("Outside")||enteredSeason.equals("Any"))
    {
      System.out.println(enteredSeason + " was selected");
    return true;
    }
    return false;
  }
  public boolean RemoveByInsideOrOutside(String Season, String entry)
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

  public boolean Handi (String choice)
  {
    if(choice.equals("No")||choice.equals("Yes")||choice.equals("Any"))
    {
      System.out.println(choice+" was selected");
      return true;
    }
    return false;
  }
  
  public boolean RemoveByHandicap(String hAccessible, String choice)
  {
    if(choice.equals("Any"))
    {
      return true;
    }
    if(choice.equals("No"))
    {
        return true;
    
    }
    if(hAccessible.equals(choice))
    {
      return true;
    }
     return false;
  }
  
  public boolean transportation (String enteredTransportation)
  {
    // 0-5,6-10,10-20,20+
    if(enteredTransportation.equals("Yes")||enteredTransportation.equals("No")||enteredTransportation.equals("Any"))
    {
      System.out.println(enteredTransportation + " was selected");
    return true;
    }
    return false;
  }
  public boolean RemoveByTransportation(String publicTransport, String entry)
  {
    if(entry.equals("No"))
    {
      return true;
    }
    if(publicTransport.equals(entry))
    {
      return true;
    }
     return false;
  }

}

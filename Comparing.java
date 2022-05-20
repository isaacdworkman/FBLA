public class Comparing
{
  //each general method validifies a proper user selectoin and then returns true or false based on that fact
  //each removeBy method compares the users entry to an attraction's attribute in the 2d array of the Attractions class

  //test 1
  public boolean testViable(String entered, String option1, String option2, String option3, String option4)
  {
    { 
    if(entered.equals(option1)||entered.equals(option2)|entered.equals(option3)||entered.equals(option4)||entered.equals("Any"))
    {
      System.out.println(entered + " was selected");
    return true;
    }
    return false;
  }
  }
  public boolean testViableShort(String entered, String option1, String option2)
  {
    if(entered.equals(option1)||entered.equals(option2)|entered.equals("Any"))
    {
      System.out.println(entered + " was selected");
    return true;
    }
    return false;
  }

  public boolean Removal(String trait, String desired)
  {
    if(desired.equals("Any"))
    {
      return true;
    }
    if(desired.equals(trait))
    {
      return true;
    }
     return false;
    }
  public boolean RemoveLoseEnds(String trait, String desired)
  {
    if(desired.equals("Other"))
    {
      if(!trait.equals("Omaha")&& !trait.equals("Lincoln")&&!trait.equals("Fremont"))
      {
        return true;
      }
    }
    if(desired.equals("Any"))
    {
        return true;
    }
    if(desired.equals("1"))
    {
      if(trait.equals("4.4")||trait.equals("4.3")||trait.equals("4"))
      return true;
    }
    if(desired.equals("2"))
    {
      if(trait.equals("4.5")||trait.equals("4.6")||trait.equals("4.7"))
      return true;
    }
    if(desired.equals("3"))
    {
      if(trait.equals("4.8")||trait.equals("4.9")||trait.equals("5"))
      return true;
    }
    if(desired.equals("4"))
    {
      return true;
    }
     return false;
  }
}
 

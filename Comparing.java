public class Comparing
{
  public boolean testViable(String entered, String option1, String option2, String option3, String option4)//Tests whether the user entered word is one of the options
  {  if(entered.equals(option1)||entered.equals(option2)|entered.equals(option3)||entered.equals(option4)||entered.equals("Any"))//Checks to see if the attribute entered equals the possible option. For example the city, if the user enters "Omaha" it checks if Omaha equals Omaha, Lincoln, Fremont, Other or any.
    {
      System.out.println(entered + " was selected");//If it returns true it tells the user the desired attribute was selected and doesn't run the do-while loop in the main class.
    return true;
    }
    return false;//Informs the program that the entered attribute doesn't equal one of the predeteremined options and runs the do-while loop. 
  }
  public boolean testViableShort(String entered, String option1, String option2)
  {//Very similar to the testViable method but checks less conditions whether its for just checking true/false, or inside/outside.
    if(entered.equals(option1)||entered.equals(option2))
    {
      System.out.println(entered + " was selected");//If it returns true it tells the user the desired attribute was selected and doesn't run the do-while loop in the main class.
    return true;
    }
    return false;//Informs the program that the entered attribute doesn't equal one of the predeteremined options and runs the do-while loop. 
  }

  public boolean Removal(String trait, String desired)// Used by the print statment to sort out the best locations for the desired attributes.
  {
    if(desired.equals("Any"))//If the user doesn't have a preference for an attribute all are returned true.
    {
      return true;
    }
    if(desired.equals(trait))//If the desired attribute equals the trait of a specific location it returns true.
    {
      return true;
    }
     return false;//Returns false if the desired attribute doesn't equal the attribute of the location.
    }
  public boolean RemovalYesOrNo(String trait, String desired)//Removes for yes or no statements, for example if the user doesn't need handicap accessibility they can still go to handicap accessible places.
  {
    if(desired.equals("No"))//Returns true for all locations if the user doesn't need the special help as in handicap accessibility and public transportation.
    {
      return true;
    }
    if(desired.equals(trait))//Returns true if the desired option equals the trait of the location.
    {
      return true;
    }
    return false;//Returns false if the desired equals "yes" and the location doesn't have "yes" as the trait.
  }
  public boolean RemoveLoseEnds(String trait, String desired)//Covers any other sceniors for the removal.
  {
    if(desired.equals("Other"))//No city has "other" as a city location, so "other" equals the various cities outside the main three - Omaha, Lincoln, Fremont- so it returns true for smaller cities.
    {
      if(!trait.equals("Omaha")&& !trait.equals("Lincoln")&&!trait.equals("Fremont"))//Returns true for each location if it does not equal "Omaha", "Lincoln", or "Fremont".
      {
        return true;
      }
    }
    if(desired.equals("Any"))//If the user has no prefrence for any attribute it always returns true.
    {
        return true;
    }
    //Rating removal
    //Rating are by ranges so the desired range is different that just a yes or no statement.
    if(desired.equals("1"))//If the user wants a trait thats either 4, 4.3, 4.4 because there are no locations with a 4.1 or 4.2 rating in the matrix. 
    {
      if(trait.equals("4.4")||trait.equals("4.3")||trait.equals("4"))//Returns true if the lcoations trait equals 4.4, 4.3, 4.
      return true;
    }
    if(desired.equals("2"))
    {
      if(trait.equals("4.5")||trait.equals("4.6")||trait.equals("4.7"))//Returns true if the locations rating trait equals 4.5, 4.6, or 4.7.
      return true;
    }
    if(desired.equals("3"))
    {
      if(trait.equals("4.8")||trait.equals("4.9")||trait.equals("5"))//Returns true of the location has rating of 4.7, 4.9, or 5.
      return true;
    }
    if(desired.equals("4"))//Similar to the any statement in the other removal. If the user has no preference none of the locations are removed.
    {
      return true;
    }
     return false;
  }
}
 

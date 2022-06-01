public class Attractions
{
  //Giant 2D array with strings, first column is the name of the attraction and the following rows are the attributes; each row is a different location
  //column 1: name, column 2: city, column 3: indoor/outdoor, column 4: price range(0-5,6-10,10-20,20+) 5:Wheel Chair Accesible 6: Public Transportaion/ walking distance 7: Requires phyiscal activity 8: Ranking out of 10, 9: Pogrammers recommendation
  private String[] attributes = new String[9];//Stores the desired attributes.
  private boolean returned = false;//used to remember if a location has already been returned
  Comparing Compare = new Comparing();//creates an obejct of the comparing class to call comapring methods
  private String[][] AttractionOptions = {//Every line is a different location to sort through to find the best location for the desired attributes.
    {"Henry Doorly Zoo and Aqaurium","Omaha","Outside","20+","Yes", "Yes","Yes","4.5","Yes"},
    {"Old Market", "Omaha","Outside","0-5", "Yes", "Yes","No","4.5","No"},
    { "Strategic Air and Space Museum", "Ashland","Inside","10-20","Yes", "No","No", "4.7","Yes"},
    {"Chimney Rock Historical Site","Morrill County","Outside","6-10","No", "No","No","4.4","Yes"},
    { "Haymarket District", "Lincoln","Outside","0-5","Yes", "Yes","No", "4.7","No"},
    {"Scotts Bluff National Monument", "Gering","Outside","0-5","Yes", "No","Yes", "4.8","No"},
    { "Golden Spike Tower", "North Platte","Outside","6-10","Yes", "No","No", "4.7","Yes"},
    {"Indian Cave State Park", "Shubert","Outside","6-10","No", "No","Yes", "4.5","Yes"},
    {"Carhenge","Alliance","Outside","0-5","No", "No","No", "4.6","Yes"},
    {"Scenic Driving Tour of the Sandhills","Grand Island","Outside","0-5","Yes", "No","No", "4.5","No"},
    {"Ride the Cowboy Trail", "Omaha","Outside","0-5","Yes", "Yes","Yes", "4.5","No"},
    {"Archway", "Grand Platte","Outside", "10-20","Yes", "No","No","4.6","No"},
    {"Sandhill Crane Migration","Gibbon","Outside","20+","Yes", "No","No","5","Yes","No"},              
    {"Durham Museum","Omaha","Inside","10-20","Yes", "Yes","No","4.7","Yes"},
    {"First National's Spirit of Nebraksa's Wildreness and Pioneer Courage Park","Omaha","Outside","0-5","Yes", "Yes","No","4.4","Yes"},
    {"Joslyn Art Museum","Omaha","Inside","0-5","Yes", "Yes","No","4.7","No"},
    {"Performing Arts Center","Omaha","Inside","20+","Yes", "Yes","No", "4.8","No"},
    {"Lauritzen Gardens" ,"Omaha","Inside","0-5","Yes","No","No", "4.8","No"},
    {"Omaha Children's Museum","Omaha","Inside","10-20","Yes","Yes","Yes", "4.7","No"},
    {"Bob Kerrey Pedrestrian Bridge","Omaha","Outside","0-5","Yes","No","Yes", "4.7","Yes"},
    {"Saint Cecilia Cathedral","Omaha","Inside","0-5","Yes", "Yes","No", "4.7","Yes"},
    {"Lewis & Clark Landing","Omaha","Outside","6-10","No","No","Yes", "4.6","Yes"},
    {"Trains at Kenefick Park","Omaha","Outside","0-5","Yes", "No","No", "4.8","Yes"},
    {"Freedom Park Navy Musuem", "Omaha","Inside","0-5","Yes", "Yes","No", "4.4","Yes"},
    {"Lee G. Simmons Conservation Park & Wildlife Safari","Omaha","Outside","6-10","No", "No","No", "4.7","Yes"},
    {"Mormon Trail Center","Omaha","Inside","0-5","Yes", "Yes","No","4.8","No"},
    { "Malcolm X House Site","Omaha","Inside","0-5","Yes", "No","No","4.5","Yes"},
    {"Tour the Capitol","Lincoln","Outside","0-5","Yes","Yes","Yes","5","No"},
    {"UNL State Museum", "Lincoln","Inside","6-10","Yes", "Yes","No","4.7","Yes"},
    {"Memorial Stadium Game","Lincoln","Outside","20+","Yes", "Yes","No", "4.8","Yes"},
    {"Sunken Gardens","Lincoln","Inside","0-5","Yes", "Yes","Yes", "4.8","No"},
    {"Museum of American Speed","Lincoln","Inside","10-20","Yes","Yes","No", "4.8","Yes"},
    { "Pioneers Park Nature Center","Lincoln","Outside","0-5","Yes", "Yes","No", "4.7","Yes"},
    {"Sheldon Musuem of Art", "Lincoln","Inside","0-5","Yes", "Yes","No", "4.5","No"},
    { "Lincolns Children's Zoo","Lincoln","Outside","10-20","Yes", "Yes","Yes","4.7","No"},
    {"Lincolns Children Museum","Lincoln","Inside","10-20","Yes", "Yes","Yes", "4.7","No"},
    {"International Quilt Study Center & Musuem","Lincoln","Inside","6-10","Yes", "Yes","No","4.6","No"},
    {"Governor's Residence","Lincoln","Inside","0-5","Yes","No","No","5","Yes"},
    {"National Roller Skating Museum","Lincoln","Inside","0-5","Yes", "Yes","No", "4.3","No"},
    {"Lester F. Larsen Tractor Test and Power Museum","Lincoln","Inside","0-5","Yes", "Yes","No", "4.6","Yes"},
    {"CourtHouse and Jail Rocks","West Camp Clarke","Outside","0-5","No", "No","Yes", "4.7","Yes"},
    { "Toadstool Geological Park","Harrison","Outside","0-5","Yes", "No","Yes", "4.7","Yes"},
    {"Chadron State Park","Chadron","Outside","6-10","Yes","No","Yes","4.7","Yes"},
    {"Agate Fossil Beds National Monument", "Whistle Creek","Outside","0-5","No", "No","Yes", "4.5","Yes"},
    {"Snake River Falls", "Valentine","Outside","0-5","No","No","Yes","4","No"},
    {"Fremont Lakes State Recreation Area","Fremont","Outside","6-10","Yes", "No","Yes", "4.4","Yes"},
    {"Bryson's Airboat Tours","Fremont","Outside","20+","Yes", "No","No","5","Yes"},
    {"Fremont Splash Station","Fremont","Outside","6-10","Yes", "No", "Yes", "4.4","Yes"},
    {"Tin Lizzy Tavern","Fremont","Inside","0-5","Yes", "Yes","No","4.3","No"},
    { "Louis E. May Museum","Fremont","Inside","0-5","Yes","No","No","4.8","No"},
    { "Ruff House","Fremont","Inside","20+","Yes","No","Yes","4.3","No"},
    {"Thirty Bowl","Fremont","Inside","10-20","Yes","No","Yes","4.4","No"}
  };
  public void enteredData(int location, String userEntered)//Records the entered traits from the main class into the attributes string array.
  {
    attributes[location] = userEntered;
  }
  
  //toString method to modify the normal System.out.print method
  public String toString(String k)
  {
    return " "+k;
  }
  public void printAttractionAttributes(int row)//Very similar to the printAttributes method. Used to print the attractions attributes in case none of the locations has all of the desired attributes that the user asks for.
  {
    System.out.println("Your city selected is : " + AttractionOptions[row][1] +"\nThe location is: " +  AttractionOptions[row][2] + "\nThe price range is between " +  AttractionOptions[row][3] + " dollars");//Prints out the city, inside/outside and price range because they aren't a yes or no statements.
    if(AttractionOptions[row][4].equals("Yes"))//If the location is handicap accessible then it returns a statement saying it is.
    {System.out.println("This location is handicap accessible");}
    else
    {System.out.println("This location is not handicap accessible");}//If not handicap accessible then it says so
   if(AttractionOptions[row][5].equals("Yes"))//If public transportation is an option for the location
    {System.out.println("Public transportation is an option");}//Statement returned if the location offers public transportation.
    else
    {System.out.println("Public transportation is not an option");} //Statement returns if the location can not be reached by public transportation.
    if(AttractionOptions[row][6].equals("Yes"))//If physical activity occurs then it returns a statement saying so
    {System.out.println("Physical activity occurs here");}
    else
    {System.out.println("Physical activity is not required");}//If physical activity isn't neccesary 
    System.out.println("The rating is : " + AttractionOptions[row][7]);//Returns the rating of the location.
    if(AttractionOptions[row][8].equals("Yes"))//If the programmer also enjoys the location
    {System.out.println("The programmers enjoys this attraction");}
    else
    {System.out.println("The programmers does not enjoy this attraction");}
    System.out.println();//Prints out a space so the next information is doesn't get mixed with the old information.
  }
  public void printAttributes()
  {
  System.out.println("Your city selected is : " + attributes[1] +"\nThe location is: " +  attributes[2] + "\nThe price range is between " +  attributes[3] + " dollars");//Returns the city, location, and price range of the desired attributes.
    if(attributes[4].equals("Yes"))//Returns whether or not the user needs handicap accessiblity.
    {System.out.println("Handicap accessibility is required");}
    else
    {System.out.println("Handicap accessibility is not required");}//If the user doesn't need handicap accessiblity it returns saying so.
   if(attributes[5].equals("Yes"))//Returns whether or not the user needs public transportation.
    {System.out.println("Public transportation is required");}
    else
    {System.out.println("Public transportation is not required");}//If the user doesn't need public transportation it returns saying so.
    if(attributes[6].equals("Yes"))//If the user desires physical activity.
    {System.out.println("Physical activity is prefered");}
    else
    {System.out.println("Physical activity is not prefered");}//The user does not want physical activity.
    if(attributes[7].equals("1"))//Returns the rating depending on which rating range the user has selected.
    {System.out.println("Your prefered rating is between 4 to 4.4");}
    else if(attributes[7].equals("2"))
    {System.out.println("Your prefered rating is between 4.5 to 4.7");}
    else if(attributes[7].equals("3"))
    {System.out.println("Your prefered rating is between 4.8 to 5.0");}
    else if(attributes[7].equals("4"))
    {System.out.println("You have no preference on rating");}
    if(attributes[8].equals("Yes"))//Returns whether the user desires the programmers opinion.
    {System.out.println("The programmers opinion is requested");}
    else
    {System.out.println("The programmers opinion is not wanted");}
      System.out.println();//Places a space to seperate chunks of information.
  }
  
  public void UltimatePrint(int comparison)//returns the final list of location options that match the users preferences
  { int count = 0;//Records how many desired attributes equals the locations attributes
  
    for(int row =0; row<AttractionOptions.length; row++)//Runs through every row (location) of the attraction options matrix.
    {
      for(int column = 1; column<AttractionOptions[0].length; column++)//Runs through every column of the row to test every attribute.
        {
          if(attributes[column].equals("Yes")||attributes[column].equals("No")&& column !=6 && column!=8)//If the column is one of the yes and no statments and isn't the physical activity or programmers opinions
          {
            if(Compare.RemovalYesOrNo(AttractionOptions[row][column],attributes[column])==true)//Calls the RemovalYesOrNo method in the comparison class and compares the attribute with the desired attribute. If it returns true it adds one to the count.
            {
              count++;
            }
          }
            
          else if(column == 7|| attributes[1].equals("Other"))//If the column is the 7th column or the desired attribute is "Other" runs this if statement.
          {
           if(Compare.RemoveLoseEnds(AttractionOptions[row][column], attributes[column]) == true)//Calls the RemoveLoseEnds method in the comparison class and determines if the method returns true it adds one to the count.  
              count++;
          }
          else if(Compare.Removal(AttractionOptions[row][column], attributes[column])==true)//The final remove if statment to catch the rest of the attributes. Calls the removal method in the comparison class. If the location has the desired attribute it adds one to count.
          {
            count++;
          }
        }
      if(count ==comparison)//If the count equals the goal number of attributes then it runs the code inside the if statement. 
      {
        
        if(comparison==8 && returned == false)//If no location has already been returned and its trying to be a perfect match to the users desired attributes.
        {
        System.out.println("These are the locations that fit your desired attributes");//Prints out alerting the user these are the best possible location for their desired traits.
          returned = true;//tells the private instance variable something has been returned.
        }
        System.out.println(AttractionOptions[row][0]);//Prints out the attractions that match the attributes.
        returned = true;//alerts the instance variable that something has been returned to the user.
        if(comparison<8)//If the program has to run the ultimate print statement more than once its prints out the attributes so the user can decided whether the different in attributes is still worth going too.
        {
          printAttractionAttributes(row);//Calls the printAttractionAttribute and prints off the information for that particular row.
        }
      }
      count = 0;//Resets the count for the next location.
    }
     if(returned == false)//If nothing has been returned meaning none of the attractions fit the desired attributes,
    {
      returned = true;//alerts the instance variable that something has been returned to the user.
      System.out.println("Sorry there were none that had the same attributes, but the next closest is location for your desired attributes is: ");//Alerts the user their desired attributes aren't matching with any of the locations.
      UltimatePrint(comparison-1);//Calls the Ultimate print statement again but with one less point so only 7 then 6 then 5 of the attributes have to be the same.
    }
  }
}

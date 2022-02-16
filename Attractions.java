import java.util.Arrays;//allows for the usage of 2d arrays and array methods
public class Attractions
{
  //Giant 2D array with strings, first column is the name of the attraction and the following rows are the attributes; each row is a different location
  //column 1: name, column 2: city, column 3: indoor/outdoor, column 4: price range(0-5,6-10,10-20,20+) 5:Wheel Chair Accesible 6: Public Transportaion/ walking distance 7: Requires phyiscal activity 8: Ranking out of 10, 9: Pogrammers recommendation
  private String locationEntered ="";
  private String PriceRange = "";
  private String SeasonEntry="";
  private String hAccessible="";
  private String pubTrains = "";
  private String physical ="";
  private String rating = "";
  private String opinion ="";
  private String[][] AttractionOptions = {
    {"Henry Doorly Zoo and Aqaurium","Omaha","Outside","20+","Yes", "Yes","Yes","4.5","Yes"},
    {"Old Market", "Omaha","Outside","0-5", "Yes", "Yes","No","4.5","No"},//Farmer's Market
    { "Strategic Air and Space Museum", "Ashland","Inside","10-20","Yes", "No","No", "4.7","Yes"},//all indoors
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
  //each method below stores the users input/preference to the associated attribute variable
  public void enteredLocation(String location)
  {
    locationEntered =location;
  }
  public void enteredPriceRange(String price)
  {
    PriceRange = price;
  }
  public void enteredSeason(String season)
  {
    SeasonEntry = season;
  }
  public void enteredHandicap(String h)
  {
    hAccessible = h;
  }
  public void enteredPTransportation(String Trains)
  {
    pubTrains = Trains;
  }
  public void enteredPhysical(String p)
  {
    physical=p;
  }
  public void enteredRating(String rate)
  {
    rating = rate;
  }
  public void enteredOpinion(String opin)
  {
    opinion  =opin;
  }
  //toString method to modify the normal System.out.print method
  public String toString(String k)
  {
    return " "+k;
  }

  Comparing Compare = new Comparing();//creates an obejct of the comparing class to call comapring methods
 
  public void UltimatePrint()//returns the final list of location options that match the users preferences
  {
    int insureReturn = 0;
    //each compare method below runs through each attraction's specified attribute for that column to see if it matches the users preference, and if it doesn't, that location is removed from the final output of recommended places to visit
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByCity(AttractionOptions[row][1],locationEntered)==true)
      {
        if(Compare.RemoveByInsideOrOutside(AttractionOptions[row][2],SeasonEntry)==true)
        {
          if(Compare.RemoveByPrice(AttractionOptions[row][3],PriceRange)==true)
          {
            if(Compare.RemoveByHandicap(AttractionOptions[row][4],hAccessible)==true)
            {
               if(Compare.RemoveByTransportation(AttractionOptions[row][5],pubTrains)==true)
              {
                if(Compare.RemoveByPysicalActivity(AttractionOptions[row][6],physical)==true)
                {
                  if(Compare.RemoveByRating(AttractionOptions[row][7],rating)==true)
                  {
                    if(Compare.RemoveByOpinion(AttractionOptions[row][8],opinion)==true)
                    {
                    System.out.println(AttractionOptions[row][0]);
                    insureReturn =1;
                    }
                  }
                }
                
              }
              
            }
          }
        }
      }
    }
    if (insureReturn == 0)
      System.out.print("Sorry, no attractions matched your travel preferences, please try again.");//prints this in case none of the locations match the selected preferences
      else
      {
        System.out.println("Those are our recommendations for your visit, have fun!!");//printed after the list of recommended attractions
      }
  }
}

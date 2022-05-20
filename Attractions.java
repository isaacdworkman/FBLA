import java.util.Arrays;//allows for the usage of 2d arrays and array methods
public class Attractions
{
  //Giant 2D array with strings, first column is the name of the attraction and the following rows are the attributes; each row is a different location
  //column 1: name, column 2: city, column 3: indoor/outdoor, column 4: price range(0-5,6-10,10-20,20+) 5:Wheel Chair Accesible 6: Public Transportaion/ walking distance 7: Requires phyiscal activity 8: Ranking out of 10, 9: Pogrammers recommendation
  private String[] attributes = new String[9];
  Comparing Compare = new Comparing();//creates an obejct of the comparing class to call comapring methods
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
    attributes[1] = location;
  }
  public void enteredPriceRange(String price)
  {
    attributes[3] = price;
  }
  public void enteredInsideOrOutside(String InsideOrOutside)
  {
    attributes[2] = InsideOrOutside;
  }
  public void enteredHandicap(String handicap)
  {
    attributes[4] = handicap;
  }
  public void enteredPTransportation(String publicTransport)
  {
    attributes[5] = publicTransport;
  }
  public void enteredPhysical(String activity)
  {
    attributes[6] = activity;
  }
  public void enteredRating(String rating)
  {
    attributes[7] = rating;
  }
  public void enteredOpinion(String opinion)
  {
    attributes[8] = opinion;
  }
  //toString method to modify the normal System.out.print method
  public String toString(String k)
  {
    return " "+k;
  }

 
  public void UltimatePrint(int comparison)//returns the final list of location options that match the users preferences
  { int count = 0;
    boolean returned = false;
    System.out.println("These are the locations that fit your desired attributes");
    for(int row =0; row<AttractionOptions.length; row++)
    {
      for(int column = 1; column<AttractionOptions[0].length; column++)
        {
          if(column == 7|| attributes[1].equals("Other"))
          {
           if(Compare.RemoveLoseEnds(AttractionOptions[row][column], attributes[column]) == true)
              count++;
          }
          if(Compare.Removal(AttractionOptions[row][column], attributes[column])==true)
          {
            count++;
          }
        }
      if(count ==comparison)
      {
        System.out.println(AttractionOptions[row][0] + " ");
        returned = true;
      }
      count = 0;
    }
     if(returned == false)
    {
      System.out.println("Sorry there were none that had the same attributes, but the next closest is location for your desired attributes is: ");
      UltimatePrint(comparison-1);
    }
  }
}

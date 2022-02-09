import java.util.Arrays;
public class Attractions
{
  //Giant 2D array with strings, first row is the name of the attraction and the following rows are the attributes
  //column 1: name, column 2: city, column 3: indoor/outdoor, column 4: price range(0-5,6-10,10-20,20+)
  private String locationEntered ="";
  private String PriceRange = "";
  private String SeasonEntry="";
  private String[][] AttractionOptions = {
    {"Henry Doorly Zoo and Aqaurium","Omaha","Outside","20+"},
    {"Old Market", "Omaha","Outside","0-5"},//Farmer's Market
    { "Strategic Air and Space Museum", "Ashland","Inside","10-20"},//all indoors
    {"Chimney Rock Historical Site","Morrill County","Outside","6-10"},
    { "Haymarket District", "Lincoln","Outside","0-5"},
    {"Scotts Bluff National Monument", "Gering","Outside","0-5"},
    { "Golden Spike Tower", "North Platte","Outside","6-10"},
    {"Indian Cave State Park", "Shubert","Outside","6-10"},
    {"Carhenge","Alliance","Outside","0-5"},
    {"Scenic Driving Tour of the Sandhills","Grand Island","Outside","0-5"},
    {"Ride the Cowboy Trail", "Omaha","Outside","0-5"},
    {"Archway", "GrandPlatte","10-20"},
    {"Sandhill Crane Migration","Gibbon","Outside","20+"},              
    {"Durham Museum","Omaha","Inside","10-20"},
    {"First National's Spirit of Nebraksa's Wildreness and Pioneer Courage Park","Omaha","Outside","0-5"},
    {"Joslyn Art Museum","Omaha","Inside","0-5"},
    {"Performing Arts Center","Omaha","Inside","20+"},
    {"Lauritzen Gardens" ,"Omaha","Inside","0-5"},
    {"Omaha Children's Museum","Omaha","Inside","10-20"},
    {"Bob Kerrey Pedrestrian Bridge","Omaha","Outside","0-5"},
    {"Saint Cecilia Cathedral","Omaha","Inside","0-5"},
    {"Lewis & Clark Landing","Omaha","Outside","6-10"},
    {"Trains at Kenefick Park","Omaha","Outside","0-5"},
    {"Freedom Park Navy Musuem", "Omaha","Inside","0-5"},
    {"Lee G. Simmons Conservation Park & Wildlife Safari","Omaha","Outside","6-10"},
    {"Mormon Trail Center","Omaha","Inside","0-5"},
    { "Malcolm X House Site","Omaha","Inside","0-5"},
    {"Tour the Capitol","Lincoln","Outside","0-5"},
    {"UNL State Museum", "Lincoln","Inside","6-10"},
    {"Memorial Stadium Game","Lincoln","Outside","20+"},
    { "Sunken Gardens","Lincoln","Inside","0-5"},
    {"Museum of American Speed","Lincoln","Inside","10-20"},
    { "Pioneers Park Nature Center","Lincoln","Outside","0-5"},
    {"Sheldon Musuem of Art", "Lincoln","Inside","0-5"},
    { "Lincolns Children's Zoo","Lincoln","Outside","10-20"},
    {"Lincolns Children Museum","Lincoln","Inside","10-20"},
    {"International Quilt Study Center & Musuem","Lincoln","Inside","6-10"},
    {"Governor's Residence","Lincoln","Inside","0-5"},
    {"National Roller Skating Museum","Lincoln","Inside"},
    {"Lester F. Larsen Tractor Test and Power Museum","Lincoln","Inside","0-5"},
    {"CourtHouse and Jail Rocks","West Camp Clarke","Outside","0-5"},
    { "Toadstool Geological Park","Harrison","Outside","0-5"},
    {"Chadron State Park","Chadron","Outside","6-10"},
    {"Agate Fossil Beds National Monument", "Whistle Creek","Outside","0-5"},
    {"Snake River Falls", "Valentine","Outside","0-5"},
    {"Coyote Hills Regional Park","Fremont","Outside","0-5"},
    {"Mission Peak Regional Preserve","Fremont","Outside","0-5"},
    {"Fremont Splash Station","Fremont","Outside","6-10"},
    {"Ardenwood Historical Farm","Fremont","Outside",""},
    { "Quarry Lakes Regional Recreation Area","Fremont","Outside",},
    { "Niles Canyon Railway","Fremont","Outside",},
    {"Old Mission San Jose","Fremont","Outside",}
  };
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

  public String toString(String k)
  {
    return " "+k;
  }
  Comparing Compare = new Comparing();
 
  public void testCities()
  {
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByCity(AttractionOptions[row][1],locationEntered)==true)
        {
          System.out.println(AttractionOptions[row][0]);
        }
    }
  }

   public void testSeason()
  {
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByInsideOrOutside(AttractionOptions[row][2],SeasonEntry)==true)
        {
          System.out.println(AttractionOptions[row][0]);
          
        }
      
    }
  }
   public void testPrice()
  {
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByPrice(AttractionOptions[row][3],PriceRange)==true)
        {
          System.out.println(AttractionOptions[row][0]);
        }
    }
  }
  public void UltimatePrint()
  {
    int insureReturn = 0;
    for(int row =0; row<AttractionOptions.length; row++)
    {
      if(Compare.RemoveByCity(AttractionOptions[row][1],locationEntered)==true)
        {
          if(Compare.RemoveByInsideOrOutside(AttractionOptions[row][2],SeasonEntry)==true)
        {
          System.out.println(AttractionOptions[row][0]);
          insureReturn =1;
        }
        }
    }
    if (insureReturn == 0)
      System.out.print("Stop being picky we live in Nebraska");
  }
}

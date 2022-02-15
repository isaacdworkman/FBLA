import java.util.Arrays;
public class Attractions
{
  //Giant 2D array with strings, first row is the name of the attraction and the following rows are the attributes
  //column 1: name, column 2: city, column 3: indoor/outdoor, column 4: price range(0-5,6-10,10-20,20+) 5:Wheel Chair Accesible 6: Public Transportaion/ walking distance 7:
  private String locationEntered ="";
  private String PriceRange = "";
  private String SeasonEntry="";
  private String hAccessible="";
  private String pubTrains = "";
  private String[][] AttractionOptions = {
    {"Henry Doorly Zoo and Aqaurium","Omaha","Outside","20+","Yes", "Yes"},
    {"Old Market", "Omaha","Outside","0-5", "Yes", "Yes"},//Farmer's Market
    { "Strategic Air and Space Museum", "Ashland","Inside","10-20","Yes", "No"},//all indoors
    {"Chimney Rock Historical Site","Morrill County","Outside","6-10","No", "No"},
    { "Haymarket District", "Lincoln","Outside","0-5","Yes", "Yes"},
    {"Scotts Bluff National Monument", "Gering","Outside","0-5","Yes", "No"},
    { "Golden Spike Tower", "North Platte","Outside","6-10","Yes", "No"},
    {"Indian Cave State Park", "Shubert","Outside","6-10","No", "No"},
    {"Carhenge","Alliance","Outside","0-5","No", "No"},
    {"Scenic Driving Tour of the Sandhills","Grand Island","Outside","0-5","Yes", "No"},
    {"Ride the Cowboy Trail", "Omaha","Outside","0-5","Yes", "Yes"},
    {"Archway", "Grand Platte","Outside", "10-20","Yes", "No"},
    {"Sandhill Crane Migration","Gibbon","Outside","20+","Yes", "No"},              
    {"Durham Museum","Omaha","Inside","10-20","Yes", "Yes"},
    {"First National's Spirit of Nebraksa's Wildreness and Pioneer Courage Park","Omaha","Outside","0-5","Yes", "Yes"},
    {"Joslyn Art Museum","Omaha","Inside","0-5","Yes", "Yes"},
    {"Performing Arts Center","Omaha","Inside","20+","Yes", "Yes"},
    {"Lauritzen Gardens" ,"Omaha","Inside","0-5","Yes","No"},
    {"Omaha Children's Museum","Omaha","Inside","10-20","Yes","Yes"},
    {"Bob Kerrey Pedrestrian Bridge","Omaha","Outside","0-5","Yes","No"},
    {"Saint Cecilia Cathedral","Omaha","Inside","0-5","Yes", "Yes"},
    {"Lewis & Clark Landing","Omaha","Outside","6-10","No","No"},
    {"Trains at Kenefick Park","Omaha","Outside","0-5","Yes", "No"},
    {"Freedom Park Navy Musuem", "Omaha","Inside","0-5","Yes", "Yes"},
    {"Lee G. Simmons Conservation Park & Wildlife Safari","Omaha","Outside","6-10","No", "No"},
    {"Mormon Trail Center","Omaha","Inside","0-5","Yes", "Yes"},
    { "Malcolm X House Site","Omaha","Inside","0-5","Yes", "No"},
    {"Tour the Capitol","Lincoln","Outside","0-5","Yes","Yes"},
    {"UNL State Museum", "Lincoln","Inside","6-10","Yes", "Yes"},
    {"Memorial Stadium Game","Lincoln","Outside","20+","Yes", "Yes"},
    { "Sunken Gardens","Lincoln","Inside","0-5","Yes", "Yes"},
    {"Museum of American Speed","Lincoln","Inside","10-20","Yes","Yes"},
    { "Pioneers Park Nature Center","Lincoln","Outside","0-5","Yes", "Yes"},
    {"Sheldon Musuem of Art", "Lincoln","Inside","0-5","Yes", "Yes"},
    { "Lincolns Children's Zoo","Lincoln","Outside","10-20","Yes", "Yes"},
    {"Lincolns Children Museum","Lincoln","Inside","10-20","Yes", "Yes"},
    {"International Quilt Study Center & Musuem","Lincoln","Inside","6-10","Yes", "Yes"},
    {"Governor's Residence","Lincoln","Inside","0-5","Yes","No"},
    {"National Roller Skating Museum","Lincoln","Inside","0-5","Yes", "Yes"},
    {"Lester F. Larsen Tractor Test and Power Museum","Lincoln","Inside","0-5","Yes", "Yes"},
    {"CourtHouse and Jail Rocks","West Camp Clarke","Outside","0-5","No", "No"},
    { "Toadstool Geological Park","Harrison","Outside","0-5","Yes", "No"},
    {"Chadron State Park","Chadron","Outside","6-10","Yes","No"},
    {"Agate Fossil Beds National Monument", "Whistle Creek","Outside","0-5","No", "No"},
    {"Snake River Falls", "Valentine","Outside","0-5","No","No"},
    {"Fremont Lakes State Recreation Area","Fremont","Outside","6-10","Yes", "No"},
    {"Bryson's Airboat Tours","Fremont","Outside","20+","Yes", "No"},
    {"Fremont Splash Station","Fremont","Outside","6-10","Yes", "No"},
    {"Tin Lizzy Tavern","Fremont","Inside","0-5","Yes", "Yes"},
    { "Louis E. May Museum","Fremont","Inside","0-5","Yes","No"},
    { "Ruff House","Fremont","Inside","20+","Yes","No"},
    {"Thirty Bowl","Fremont","Inside","10-20","Yes","No"}
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
  public void enteredHandicap(String h)
  {
    hAccessible = h;
  }
  public void enteredPTransportation(String Trains)
  {
    pubTrains = Trains;
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
  
  public void testHandicap()
  {
    for(int row=0;row<AttractionOptions.length;row++)
    {
      if(Compare.RemoveByHandicap(AttractionOptions[row][4],hAccessible)==true)
      {
        System.out.println(AttractionOptions[row][0]);
      }
    }
  }
public void testPubTransport()
  {
    int count=0;
    for(int row=0;row<AttractionOptions.length;row++)
    {
      if(Compare.RemoveByTransportation(AttractionOptions[row][5],pubTrains)==true)
      {
        System.out.println(AttractionOptions[row][0]);
        System.out.println(count++);
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
          if(Compare.RemoveByPrice(AttractionOptions[row][3],PriceRange)==true)
          {
            if(Compare.RemoveByHandicap(AttractionOptions[row][4],hAccessible)==true)
            {
               if(Compare.RemoveByTransportation(AttractionOptions[row][5],pubTrains)==true)
              {
                System.out.println(AttractionOptions[row][0]);
              insureReturn =1;
              }
              
            }
          }
        }
      }
    }
    if (insureReturn == 0)
      System.out.print("Stop being picky we live in Nebraska");
      else
      {
        System.out.println("Those are our recommendations for your visit, have fun!!");
      }
  }
}

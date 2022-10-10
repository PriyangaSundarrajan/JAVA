class PhoenixMall
  
{
       String movieName;
       int movieTime;
       boolean movieHit;
        
public static void main(String[] args)
        {
            PhoenixMall Screen1= new PhoenixMall(); 
            Screen1.movieName = "Ponniyin selvan";
            Screen1.movieTime = 10;
            Screen1.movieHit = true;
            PhoenixMall Screen2 = new PhoenixMall();
            Screen2.movieName="Captain";
            Screen2.movieTime= 11;
            Screen2.movieHit= true;
            PhoenixMall Screen3= new PhoenixMall();
            Screen3.movieName="Nanae varuven";
            Screen3.movieTime=12;
            Screen3.movieHit= false;
            PhoenixMall Screen4 = new PhoenixMall();
            System.out.println(Screen1.movieName+"->"+Screen1.movieTime+"->"+Screen1.movieHit);
            System.out.println(Screen2.movieName+"->"+Screen2.movieTime+"->"+Screen2.movieHit);
            System.out.println(Screen3.movieName+"->"+Screen3.movieTime+"->"+Screen3.movieHit);
            System.out.println(Screen4.movieName+"->"+Screen4.movieTime+"->"+Screen4.movieHit);
         }


}

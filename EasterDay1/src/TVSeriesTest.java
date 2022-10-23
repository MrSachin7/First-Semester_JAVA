public class TVSeriesTest
{
  public static void main(String[] args)
  {
    Actor actor1 =new Actor("Sachin Baral");
    Actor actor2 =new Actor("Shah Rukh Khan");
    Actor actor3 = new Actor("Nikhil Upreti");
    actor1.awardEmmy();
   for (int i=0;i<10;i++)
   {
     actor1.participateInEpisode();
     actor1.awardEmmy();
   }

    TVSeries tvSeries1 = new TVSeries("The Fighters Crew");
    TVSeries tvSeries2=new TVSeries("The Fighters Crew are back");
    tvSeries1.hireActor(actor1);
    tvSeries1.hireActor(actor2);
    tvSeries2.hireActor(actor1);
    tvSeries2.hireActor(actor3);

    for (int i=0; i<26;i++)
    {
      tvSeries1.makeNextEpisode();
    }
    for (int i =0; i<21 ; i++)
    {
      tvSeries2.makeNextEpisode();
    }
    System.out.println("The number of actors of first Tv series :"+tvSeries1.getNumberOfActors());
    System.out.println("The 1st and 2nd actor of 2nd Tv series are :\n \n"+tvSeries2.getActor(0)+"\n        \n        and \n  \n "+tvSeries2.getActor(1));

  }
}

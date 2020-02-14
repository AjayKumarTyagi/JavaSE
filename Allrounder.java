class Player{
  String name="";
  int age;
  double wt;
  public Player(){
    name="Bosco de Gama";
    age=5;
    wt=12.0;
  }
}
 class Cricket extends Player{
  int runs,matches;
  double strike;
  Cricket(){
    super();
    runs=999;
    matches=10;
    strike=999.89;
  }
  public void display(){
    System.out.println("runs: "+runs);
    System.out.println("matches: "+matches);
    System.out.println("strike: "+strike);
  }
}
 class Football extends Player{
  int goals,matches,assists;
  Football(){
    super();
    goals=999;
    matches=9;
    assists=0;
  }
 public void display(){
   System.out.println("goals: "+goals);
   System.out.println("matches: "+matches);
   System.out.println("assists: "+assists);
 }
}
 class Allrounder{
public static void main(String args[]){
  Cricket play1=new Cricket();
  Football play2=new Football();
  play1.display();
  play2.display();
}
}

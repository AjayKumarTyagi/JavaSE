
  class SuperAccess{
    private int sap,roll;
    private String name;
    public SuperAccess()
    {
      sap=0;
      roll=0;
      name="";
    }
    private void display()
    {
      System.out.println("name: "+name);
      System.out.println("sap: "+sap);
      System.out.println("roll no: "+roll);
    }
  }
  class Detail extends SuperAccess{
    int contact;
    String address;
    public Detail(){
      super();
      contact=0;
      address="";
    }
    public void display(){
      System.out.println("conatct: "+contact);
      System.out.println("address: "+address);
      System.out.println("name: "+name);
      System.out.println("sap: "+sap);
      System.out.println("roll no: "+roll);
    }
  public static void main(String args[]){
    Detail obj = new Detail();
    obj.display();
  }
}

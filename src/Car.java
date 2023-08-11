public class Car extends Vehicle
{

   private String color;
   private byte fuelType;
   private int noOfGears;

   public void setColor(String color){
       this.color= color;
}
    public String getColor(){
       return color;
    }
    public void setFuelType(byte fuelType){
       this.fuelType = fuelType;
    }

    public byte getFuelType() {
        return fuelType;
    }
    public void setNoOfGears(int noOfGears){
       this.noOfGears = noOfGears;
    }
    public int getNoOfGears(){
       return noOfGears;
    }
    @Override
    public void display(){
       super.display();
        System.out.println("color ;" + color);
        System.out.println("fuel type"+ fuelType);
        System.out.println("no. of Gears "+ noOfGears);


    }
    @Override
    void start(){
        System.out.println("car started");
    }
    @Override
    void stop(){
        System.out.println("car stopped");
    }
    void move(){
       System.out.println("car moving.");
    }
}

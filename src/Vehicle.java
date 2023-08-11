public abstract class Vehicle {
    private String passingNO;
    private String manufacturer;

    public void setPassingNO(String passingNO){
        if(passingNO.length() <= 10){
            this.passingNO = passingNO;
        } else {
            System.out.println("passing number maximum 10 characters");
        }
    }
    public String getPassingNO(){
        return passingNO;
    }
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public String getManufacturer(){
        return manufacturer;
    }
    public void display(){
        System.out.println(" passinng number" + passingNO);
        System.out.println("manufacture "+ manufacturer);

    }

    abstract void start();
    abstract void stop();

    abstract void move();


}

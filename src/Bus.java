public class Bus extends  Vehicle{
    private int capacity;

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }

    @Override
    void start(){
        System.out.println("bus started");
    }
    @Override
    void stop(){
        System.out.println("Bus stopped");

    }
    void move(){
        System.out.println("Bus moving ");
    }
}

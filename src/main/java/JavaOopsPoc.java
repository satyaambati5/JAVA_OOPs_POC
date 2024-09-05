//public class JavaOopsPoc {
//}
//I have used interface to cover all the oops concepts  without interface we can impliment
//rent method or function in the abstract class check comment code
interface  Rentable{
    void rent(int days);
}
abstract class Vehicle implements Rentable{
    private String brand;
    private String model;
    private Float rentalPrice;
    // Constructor

    public Vehicle(String brand,String model, Float rentalPrice)
    {
        this.brand=brand;
        this.model= model;
        this.rentalPrice= rentalPrice;
    }

//Encapsulation, Abstraction is being Achieved Here
//    Getters To access data
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;

    }
    public float getRentalPrice(){
        return this.rentalPrice;
    }
//    Setters To set the data
    public void setBrand(String brand){
        this.brand= brand;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setRentalPrice(Float rentalPrice )
    {
        this.rentalPrice=rentalPrice;
    }
// abstract methods
    abstract Float calculateRentalCost(int days);
//    abstract void abRent(int days);
}

class Car extends Vehicle  {
//    constructor
    public  Car(String brand,String model,Float rentalPrice){
//        super() method  to pass values to the Vehicle constructor, which assigns the values to the private attributes  which
        super(brand, model, rentalPrice);
    }
//    compile time polymorphism because this method is executed at compile time
    @Override
    public Float calculateRentalCost(int days) {
        return getRentalPrice() * days;
    }
    //    this is interface method which achieve 100% abstraction is implemented here
    @Override
    public void rent(int days){
        System.out.println("You have rented the car Brand: " + getBrand() +".\nModel "+ getModel()+" for "+ days+" days.\n");
        System.out.println("Price Per Day is: "+getRentalPrice());
        System.out.println("Total Rental Cost For the Car is: "+calculateRentalCost(days)+".\n");
    }


//    This is Abstract method implemented here
//    public void abRent(int days){
//        System.out.println("You have rented the Bike" + getBrand()+"\nModel" + getModel()+" for"+ days+" days");
//        System.out.println("Total Rental Cost For the Bike is: "+calculateRentalCost(days));
//
//    }


}

class Bike extends Vehicle{
//Constructor
    public  Bike(String brand,String model,Float rentalPrice){
        super(brand, model, rentalPrice);
    }
    //    compile time polymorphism because this method is executed at compile time
    @Override
    public  Float calculateRentalCost(int days){
        return getRentalPrice() *days;
    }
//    this is interface method which achieve 100% abstraction is implemented here
    @Override
    public void rent(int days ){
        System.out.println("You have rented the Bike Brand: " + getBrand()+".\nModel " + getModel()+" for "+days+" days.\n");
        System.out.println("Price Per Day is: "+getRentalPrice());
        System.out.println("Total Rental Cost For the Bike is: "+calculateRentalCost(days)+".\n");
    }

//    This is Abstract method implemented here
//    public void abRent(int days){
//        System.out.println("You have rented the Bike" + getBrand()+"\nModel" + getModel()+" for"+ days+" days");
//        System.out.println("Total Rental Cost For the Bike is: "+calculateRentalCost(days));
//
//    }


}
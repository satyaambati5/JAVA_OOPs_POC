public class Main {
    public static void main(String[] args) {

// AL the User Interaction's are Happens Here by interacting the provided functionalities
        System.out.println("<<<<<Welcome To Janatha Garrage>>>>\n");
//        Since Vehicle or  parent class is Abstract class we can not create object
//        but we can create Reference object to invoke to parent or vehicle

//        Car Reference obj
        Vehicle carobj =new  Car("Kia", "Seltos-2022",1740f);
//       This is also called Runtime polymorphism  or Dynamic method Dispatch Because
//       The abstract rent method is called runtime and Decide Which method to execute
        System.out.println("Welcome To Janatha Garrage Rental Cars.\n");
        carobj.rent(5);
//        carobj.setBrand("BMW Sport");
//        carobj.setModel("320d");
//        carobj.setRentalPrice(1800f);

//        System.out.println("Testing The Encapsulation Methods getter and Setters: "+ carobj.getBrand());


//        Bike Reference obj
        Vehicle bikeobj =new Bike("Royal Enfield", "Metror-350CC-2024", 1050f);
        System.out.println("Welcome To Janatha Garrage Rental Bikes.\n");
        bikeobj.rent(4);


    }
}

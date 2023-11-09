package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employee brad = new Employee("Worker", 1234, 16, "Male", "Brad", 58, 170);
        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(2, 420,false);
        Room deluxeRoom = new Room(2, 6900,false);
        Room theseRoom = new Room(2, 12345,false);
        ArrayList <Room> theBestList = new ArrayList <Room>();
        Employee rudy = new Employee("Worker", 1234, 16, "Female", "Rudy", 58, 140);
        Guest gaile = new Guest(15, "Female", "Gaile", 40, 140, true, 7890);
        Guest ray = new Guest(17, "female", "Ray", 40, 140, true, 234);

        pitbull.hireEmployee(rudy);
        for (Employee employee:pitbull.getEmployees()){
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
        }
        
        ArrayList <Guest> GuestsList = new ArrayList <Guest>();
        
        theBestList.add(economyRoom);
        theBestList.add(deluxeRoom);
        theBestList.add(theseRoom);
        pitbull.setRoomList(theBestList);
        
        
        System.out.println(pitbull.getName());
        for (Room room: pitbull.getRoomList()){
            System.out.println(room.getOccupancy());
            System.out.println(room.getPrice());
            System.out.println(room.isOccupied());
        }

        // System.out.println(pitbull.bookRooms(4,370));
    }
    
}

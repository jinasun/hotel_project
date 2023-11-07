package main.java.com.example;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employee brad = new Employee("Worker", 1234, 16, "Male", "Brad", 58, 170);
        Hotel pitbull = new Hotel("APCSA");
        Room economyRoom = new Room(2, 420,false);
        Room deluxeRoom = new Room(2, 6900,false);
        Room theseRoom = new Room(2, 12345,false);
        Employee rudy = new Employee("Worker", 1234, 16, "Female", "Rudy", 58, 140);
        Employee fuze = new Employee("Worker", 6789, 16, "Male", "Fuze", 58, 170);
        // Guest gaile = new Guest(15, true);
        // Guest ray = new Guest(17, true);
        pitbull.hireEmployee(rudy);
        for (Employee employee:pitbull.getEmployees()){
            System.out.println(employee.getName());
            System.out.println(employee.getSex());
        }
        
        ArrayList <Room> theBestList = new ArrayList <Room>();
        ArrayList <Employee> theSecondList = new ArrayList <Employee>();
        
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

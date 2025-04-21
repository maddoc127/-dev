public class Main {
        public static void main(String[] args) {
            Passenger p1 = new Passenger("John Doe", "123 Ocean Ave", 30, 1);
            System.out.println("After creation: " + p1);
    
            p1.setAge(31);
            System.out.println("After age update: " + p1);
    
            Room r1 = new Room(1, "W", 150);
            System.out.println("Room after creation: " + r1);
    
            r1.setPassenger(p1);
            System.out.println("Room after assigning passenger: " + r1);
        }
    }

public class Main {
        public static void main(String[] args) {
            Cruise cruise = new Cruise("SS. Neptune", 2, 1, 100, 200);

            Passenger p1 = new Passenger("Deniz Mirza", "Ankara", 20);
            Passenger p2 = new Passenger("Bruce Wayne", "Bat Cave", 40);
            Passenger p3 = new Passenger("Peter Parker", "New York", 21);
            Passenger p4 = new Passenger("Some Old Guy", "Somewhere near", 100);
    
            cruise.addPassenger(p1);
            cruise.addPassenger(p2);
            cruise.addPassenger(p3);
            cruise.addPassenger(p4);
    
            System.out.println(cruise);
    
            Passenger found = cruise.findPassenger("Deniz Mirza");
            if (found != null) {
                System.out.println("Passenger found: " + found);
            } else {
                System.out.println("Passenger not found.");
            }
        }
    }

public class Cruise {
    private String shipName;
    private int numberOfInteriorRooms;
    private int numberOfWindowRooms;
    private int numberOfOccupiedRooms;
    private int totalRooms;
    private int interiorRoomCost;
    private int windowRoomCost;
    private Passenger[] passengers;
    private Room[] rooms;

    public Cruise(String shipName, int numberOfInteriorRooms, int numberOfWindowRooms, int interiorRoomCost, int windowRoomCost) {
        this.shipName = shipName;
        this.numberOfInteriorRooms = numberOfInteriorRooms;
        this.numberOfWindowRooms = numberOfWindowRooms;
        this.interiorRoomCost = interiorRoomCost;
        this.windowRoomCost = windowRoomCost;
        totalRooms = numberOfInteriorRooms + numberOfWindowRooms;
        rooms = new Room[totalRooms];
        passengers = new Passenger[totalRooms];
        numberOfOccupiedRooms = 0;

        int roomNumber = 1;
        for (int i = 0; i < numberOfWindowRooms; i++) {
            rooms[i] = new Room(roomNumber++, "W", windowRoomCost);
        }
        for (int i = numberOfWindowRooms; i < totalRooms; i++) {
            rooms[i] = new Room(roomNumber++, "I", interiorRoomCost);
        }
    }

    public void addPassenger(Passenger p) {
        for (int i = 0; i < rooms.length; i++) {
            if (!rooms[i].getOccupied()) {
                Passenger copyp = new Passenger(p);
                copyp.setRoomNumber(rooms[i].getRoomNumber());
                rooms[i].setPassenger(copyp);
                passengers[i] = copyp;
                numberOfOccupiedRooms++;
                System.out.println( p.getName() + " is sucsessfuly added.");
                return;
            }
        }
        System.out.println("No available room for passenger: " + p.getName());
    }

    public Passenger findPassenger(String name) {
        for (Passenger p : passengers) {
            if (p != null && p.getName().equalsIgnoreCase(name)) {
                return new Passenger(p);
            }
        }
        System.out.println("passenger not found.");
        return null;

    }
    public String toString(){
        System.out.println("Ship name: " + shipName);
        System.out.println("Total rooms: " + totalRooms + " Window rooms: " + numberOfWindowRooms + " Interior rooms: " + numberOfInteriorRooms);
        for (int i = 0 ; i < totalRooms ; i++){
            System.out.println("Room number: " + rooms[i].getRoomNumber() + " Room type: " + rooms[i].getRoomType() + " Occupation: " + rooms[i].getOccupied() + " Room Cost: " + rooms[i].getCost() + " Passenger: " + rooms[i].getPassenger().getName());
        }
        System.out.println("Total passengers: " + passengers.length);
        for (int i = 0 ; i < passengers.length ; i++){
            Room temp = rooms[i];
            System.out.println("Name: " + passengers[i].getName() + " Address: " + passengers[i].getAddress() + " Age: " + passengers[i].getAge() + " Room number: " + temp.getRoomNumber() + " Room type: " + temp.getRoomType() + " Occupation: " + temp.getOccupied() + " Room cost: " + temp.getCost());
        }
        return "";
    }
}

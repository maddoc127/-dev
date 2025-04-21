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

        // Create Room objects
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
                Passenger copyp = new Passenger(p); // avoid privacy leaks
                copyp.setRoomNumber(rooms[i].getRoomNumber());
                rooms[i].setPassenger(copyp);
                passengers[i] = copyp;
                numberOfOccupiedRooms++;
            }
        }
        System.out.println("No available room for passenger: " + p.getName());
    }

    public Passenger findPassenger(String name) {
        for (Passenger p : passengers) {
            if (p != null && p.getName().equalsIgnoreCase(name)) {
                return new Passenger(p); // return a copy to avoid privacy leaks
            }
        }
        return null;
    }
}

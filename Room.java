public class Room {
    private int roomNumber;
    private String roomType;
    private int cost;
    private boolean occupied;
    private Passenger passenger;

    public Room(int roomNumber, String roomType, int cost) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.cost = cost;
        this.occupied = false;
        this.passenger = null;
    }

    public int getRoomNumber() { 
        return roomNumber; }
    public void setRoomNumber(int roomNumber) { 
        this.roomNumber = roomNumber; }
    public String getRoomType() { 
        return roomType; }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }
    public int getCost() { 
        return cost; }
    public void setCost(int cost){
        this.cost= cost;
    }
    public boolean getOccupied() { 
        return occupied; }
    public void setOccupied(boolean occupied) { 
         this.occupied = occupied; }
    public Passenger getPassenger() { 
        return passenger; }
    public void setPassenger(Passenger passenger) { 
        this.passenger = passenger; 
        setOccupied(true); }
    
    public String toString() {
        String x = "no";
        String name = "no passenger";
        if(occupied){
            x = "yes";
            name = passenger.getName();
        }
        return "Room number: " +roomNumber + " Room Type: " + roomType+ " Cost: " + cost+ " Occupied: " + x + " Passanger Name: " + name;
    }

    public boolean equals(Room other) {
        if(this.roomNumber == other.roomNumber && this.roomType == other.roomType && this.cost == other.cost && this.occupied == other.occupied && this.passenger == other.passenger){
            return true;
        }
        return false;
    }
}

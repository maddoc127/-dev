public class Passenger {
    private String name;
    private String address;
    private int age;
    private int roomNumber;

    public Passenger(String name, String address, int age, int roomNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.roomNumber = roomNumber;
    }

    public Passenger(Passenger other) {
        this.name = other.name;
        this.address = other.address;
        this.age = other.age;
        this.roomNumber = other.roomNumber;
    }

    public String getName() { 
        return name; }
    public void setName(String name) { 
        this.name = name; }
    public String getAddress() { 
        return address; }
    public void setAddress(String address) { 
        this.address = address; }
    public int getAge() { 
        return age; }
    public void setAge(int age) { 
        this.age = age; }
    public int getRoomNumber() { 
        return roomNumber; }
    public void setRoomNumber(int roomNumber) { 
        this.roomNumber = roomNumber; }

    public String toString() {
        return "Name: " + name + ", Address: " + address + ", Age: " + age + ", Room #: " + roomNumber;
    }

    public boolean equals(Passenger other) {
       if(this.name == other.name && this.address == other.address &&this.age == other.age &&this.roomNumber == other.roomNumber){
        return true;
       }
       return false;
    }
}
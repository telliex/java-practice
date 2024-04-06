package lesson10_classes;

public class Customer {
    private int id;
    private String name, address;

    public Customer( String userName, int userId, String userAddress){
        this.id= userId;
        this.name = userName;
        this.address = userAddress;
    }
    public void setName(String userName){
        name = userName;
    }
    public String getName(){
        return name;
    }

    public void setId(int userId){
        id = userId;
    }

    public  int getId(){
        return id;
    }

    public void setAddress(String userAddress){
        address = userAddress;
    }

    public String getAddress(){
        return address;
    }

    public String toString(){
        return String.format("name: %s / id: %d / address: %s", name,id,address );
    }
}

/*
 * Lab Exception Handling
 * Martino Laurent, Lawrence williams
 * */
public class Customer {
    public String name;
    public String address;
    public String city;
    public String state;
    public String zipCode;

    public Customer(String name,String address, String city, String state, String zip ){
        this.name = name;
        this.address = address;
        this.city =city;
        this.state = state;
        this.zipCode =zip;
    }
    public Customer(){

    }
    public String getNameAndAddress(Customer customer){
        String nameAndAddress;
        nameAndAddress = customer.name + "\n" + customer.address +"\n"+customer.city+ ", "+customer.state+" "+customer.zipCode;
        return nameAndAddress;
    }

}

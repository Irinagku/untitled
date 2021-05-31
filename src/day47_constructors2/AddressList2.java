package day47_constructors2;

public class AddressList2 {
    public static void main(String[] args) {
        Address2 cybertekAddress = new Address2(); //calling the constructor automatically
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("McLean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("address after update = " + cybertekAddress);
        System.out.println("street info = " + cybertekAddress.getStreet());

        Address2 newAddress = new Address2();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("McLean");
        newAddress.setState("VA");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());

        Address2 papaJohnPizza = new Address2("8802 1st Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("papa John Pizza = " + papaJohnPizza.toString());


    }
}

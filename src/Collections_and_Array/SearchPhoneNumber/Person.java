package Collections_and_Array.SearchPhoneNumber;

public class Person {
    private String name ;
    private String surName;
    private String numperPhone;
    private String address;

    public Person(String name, String surName, String numperPhone, String address) {
        this.name = name;
        this.surName = surName;
        this.numperPhone = numperPhone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getNumperPhone() {
        return numperPhone;
    }

    public String getAddress() {
        return address;
    }
}

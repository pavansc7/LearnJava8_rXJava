package java8_package.Person;

public class Person {
    private String name;
    private int id;
    private String address;
    private char gender;

    private static int counter = 100;

    public Person(String name, String address, char gender) {
        //    System.out.println("I am in constructor");
        this.name = name;
        this.id = ++counter;
        this.address = address;
        this.gender = gender;
    }

    public Person(int id,String name, String address, char gender) {
        //    System.out.println("I am in constructor");
        this.name = name;
        this.id = id;
        this.address = address;
        this.gender = gender;
    }

    public Person getVal(int val)  {
        if(val==5)
           // throw  new RuntimeException("Localized message from Pavan");
            throw new RuntimeException("Localized message from Pavan");
        else
            return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}

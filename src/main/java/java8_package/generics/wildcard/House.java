package java8_package.generics.wildcard;

public class House extends Building {
   String houseName;


    @Override
    public String toString() {
        return "House{" +
                "houseName='" + houseName + '\'' +
                ", plotno=" + plotno +
                ", id='" + id + '\'' +
                '}';
    }

    House(int plotno, String houseName){
        //super();
         super(plotno);
        this.houseName=houseName;
        id="ghanta";
    }
}

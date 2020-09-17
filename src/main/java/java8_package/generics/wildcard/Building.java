package java8_package.generics.wildcard;

public class Building {
    int plotno;
    String id="I am id";

    public Building(int plotno) {
        this.plotno = plotno;
        //this.id = id;
    }

    @Override
    public String toString() {
        return "Building{" +
                "plotno=" + plotno +
                ", id='" + id + '\'' +
                '}';
    }
}

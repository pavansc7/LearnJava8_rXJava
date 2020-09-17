/*
package java8_package.prediate_examples;

import io.vertx.core.json.JsonObject;
import java8_package.Person.Person;

class NasServerContext{
    public static final String NAS_SERVER_AR_KEY = "personAr";
    String ID_KEY = "id";
    String NAME_KEY = "name";

    private Person personAr;
    public NasServerContext(String jsonString) {
        JsonObject jsonObject = new JsonObject(jsonString);
        JsonObject nasServerjson = jsonObject.getJsonObject(NAS_SERVER_AR_KEY);
        if (nasServerjson != null) {
           // this.personAr = new Person(nasServerjson.getString(ID_KEY),nasServerjson.getString(NAME_KEY));
        } else {
            personAr = new Person(jsonObject.getString(ID_KEY));
        }
    }

    Person getPersonAr(){
        return this.personAr;
    }

    void setPersonAr(Person pr){
        this.personAr = pr;
    }
}
public class ContextEx {
    public static void main(String[] args) {
        String s = "{ \"personAr\":{ \"id\":\"Value\", \"name\":\"Pavan\" } }" ;
        //NasServerContext nasServerContext = new NasServerContext("{\"personAR\":{\"id\":\"101\",\"name\":\"pavan\"}}");
        NasServerContext nasServerContext = new NasServerContext(s);
        System.out.println(nasServerContext.getPersonAr());
    }

}
*/

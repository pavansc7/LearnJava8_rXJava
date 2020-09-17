package java8_package.enums.examples;

import java.util.Arrays;
import java.util.stream.Collectors;

enum  Enum {
    EN_1("Pavan"),
    EN_2("kumar"),
    EN_3("pk");

    public String getVal() {
        return val;
    }
    private String val;

    Enum(String val){
        this.val=val;
    }

   static Enum setEnum(String param){

        //Declarative pg
       return Arrays.stream(Enum.values()).filter(val->val.getVal() == param).findFirst().orElse(null);

        //Imperative pg
//       Enum[] e = Enum.values();
//       for(int i=0;i<e.length;i++){
//           if(e[i].val == param){
//               return e[i];
//           }
//       }
//       return null;
    }
}

public class Ex1{
   static Enum e2 = Enum.setEnum("kumar");
    public static void main(String[] args) {
       // Enum en = Enum.EN_1;
       // System.out.println(en);
      //  Enum en2 = Enum.valueOf("EN1_1");
       // new Enum()

//       Enum e = Enum.valueOf("EN_1");
//        System.out.println(e);

        Enum e = Enum.setEnum("kumar");
        e.equals(Enum.EN_1);
       System.out.println( e2.equals(Enum.EN_1));
    }
}
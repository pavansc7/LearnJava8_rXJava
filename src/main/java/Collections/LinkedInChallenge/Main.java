package Collections.LinkedInChallenge;

import io.vertx.core.eventbus.Message;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list1 = new ArrayList<>();
//        list1.addAll(Arrays.asList("daal","tea","detergent"));
//
//        ArrayList<String> list2 = new ArrayList<>();
//        list2.addAll(Arrays.asList("can","milk","candy"));
//
//        list1.addAll(list2);
//
//        System.out.println(" Original Groc List ------");
//        list1.forEach(System.out::println);
//
//        //Search for Item and remove
//        System.out.println(" Please enter the item that has to be removed");
//        Scanner scanner = new Scanner(System.in);
//        String removeGroc = scanner.next();
//
//                int initialSize = list1.size();
//
//        if(list1.contains(removeGroc));
//        list1.remove(removeGroc);

//With Iteration
        /*
        for(String groc:list1) {
            if(groc.equalsIgnoreCase(removeGroc)){
                System.out.println(MessageFormat.format(" Item found will {0} - It will be removed ",groc));
                list1.remove(groc);
                break;
            }
        } */

//        if(list1.size() ==  initialSize)
//            System.out.println(" Sorry entered value not present in grocery list, hence failed to remove.");
        Boolean s=Boolean.FALSE;
        A a = new A();
        int x=10;
         a.setB( x==10 ? a.getA(): Boolean.FALSE);

         Boolean r = Boolean.valueOf(s.booleanValue());
         System.out.println(r);
    }

    }
class A{
    Boolean s;
    Boolean b;
    Boolean getA(){
        return s;

    }

    void setB(Boolean s1){
        b = s1;
    }
}

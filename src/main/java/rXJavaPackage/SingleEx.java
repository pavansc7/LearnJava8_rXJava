package rXJavaPackage;

import io.reactivex.Single;


import java.util.*;

public class SingleEx {

    public static void main(String[] args) {
        Command command = new Command();
        Single.just(command.getInstanceId().orElse(null))


//                .map(s -> {
//                    System.out.println(s.getClass());
//                    if(s != "Pavan"){
//                        return true;
//                    }
//                    System.out.println(s.getClass());
//                    return s;
//                })
             //  .cast(String.class)
                //.map(val->modify(String.valueOf(val)))
                .doOnError((val)->{})
               // .onErrorReturn((val)->{return "Failed";})
                .subscribe((val)->System.out.println(val+" "+val.getClass()),val->System.out.println(val));

        HashSet hashSet = new HashSet<>(null);

    }

   static String modify(String name){
        return name+" hello";
    }
}


class Command{
Optional<String> getInstanceId(){
    //return Optional.of(new String("Pavan"));
    return Optional.ofNullable(null);
}
}
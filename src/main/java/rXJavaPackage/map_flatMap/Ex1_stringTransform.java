package rXJavaPackage.map_flatMap;

import io.reactivex.Observable;

import java.util.Arrays;

public class Ex1_stringTransform {
    public static void main(String[] args) {
        String s;
       Observable ob = Observable.just(new String("pavanKUMAR"))
                .map((string)->{
                    String[] strings=new String[2];
                        strings[0] = string.toUpperCase();
                        strings[1] = string.toLowerCase();
                       // Observable.error(new Exception());
                       // return Observable.just(strings);
                    return strings;
                });
               //.flatMap(str -> str);


                ob.subscribe(val->{
                   // System.out.println(val.toString());
                   Arrays.stream((String[])val).forEach(item->System.out.println(item));
                });
        //System.out.println(s);


    }
}

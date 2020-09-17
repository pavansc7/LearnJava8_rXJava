package rXJavaPackage.Observable.Observale;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class DisposableEx {
    public static void main(String[] args) throws InterruptedException {

        Observable ob = Observable.interval(1, TimeUnit.SECONDS);
        Disposable d = ob.subscribe(System.out::println);

        Thread.sleep(3000);

        d.dispose();

        System.out.println(d.isDisposed());

        Thread.sleep(2000);
    }
}

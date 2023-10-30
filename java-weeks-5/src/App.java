import java.util.ArrayList;
import java.util.Collections;



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");



        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(96);
        list.add(225);
        list.add(324);
        list.add(400);
        
        System.out.println("with collections");
        Collections.sort(list);
        for ( int res : list){
            if ( Math.sqrt(res)% 2 == 0){
              System.out.println(Math.sqrt(res));

            }
        }

        System.out.println("with tream");
        list.stream()
            .sorted()
            .forEach(res -> {
                if ( Math.sqrt(res)% 2 == 0){
              System.out.println(Math.sqrt(res));

            }
        });

    }
}

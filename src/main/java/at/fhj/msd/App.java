package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

       
        var pt = new MovablePoint(3, 7, 2, 5);
        var vh = new Vehicle("car", 0, 0, 8, 4);
        var rt = new Robot(10, 10, 3);

        List<Movable> movables = new ArrayList<>();
        movables.add(pt);
        movables.add(vh);
        movables.add(rt);

        for (Movable movable : movables) {
            movable.moveUp();
            movable.moveRight();
            System.out.println(movable);
        }
 

    }

   
}

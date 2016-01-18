import javax.xml.bind.SchemaOutputResolver;
import java.awt.*;

/**
 * Created by Marina on 13.12.2015.
 */
public class Main {

    public static void main(String[] args) {
        Pen pen1 = new Pen(10, Color.BLACK);
        Pen pen2 = new Pen(5, Color.YELLOW);
        Pen pen3 = new Pen(5, Color.yellow);
        Pen pen4 = new Pen(10, Color.BLACK);

        System.out.println(pen2.equals(pen3));
        System.out.println(pen1.equals(pen2));
        System.out.println(pen1.equals(pen4));

        System.out.println(pen1.hashCode());
        System.out.println(pen4.hashCode());

        System.out.println(pen2.hashCode());
        System.out.println(pen3.hashCode());

        System.out.println(pen1.toString());
        System.out.println(pen2.toString());


    }
}

package other;

/**
 * Created by Owner on 31.08.2016.
 */
public class Run {

    public static void main(String[] args) {
        Man ivan = new Man("ivan", true, true, false);
        System.out.println(ivan);

        try {
            Contrarian.reverseAllBoolean(ivan);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        System.out.println("Inverting Boolean values...");


        System.out.println(ivan);

    }
}

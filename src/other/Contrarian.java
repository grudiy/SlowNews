package other;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by Owner on 31.08.2016.
 */
public class Contrarian {
    public static void reverseAllBoolean(Object obj) throws IllegalAccessException {
        for (Field f : obj.getClass().getDeclaredFields()) {
            //f.setAccessible(true); // WHY THIS IS NEEDED?
            if (f.getType().equals(Boolean.class) && f.get(obj) != null) {
                f.set(obj, !((Boolean)f.get(obj)).booleanValue());
            }
            else if (f.getType().equals(boolean.class)) {
                f.setBoolean(obj, !f.getBoolean(obj));
            }
        }

    }
}

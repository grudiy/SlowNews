package other;

/**
 * Created by Owner on 31.08.2016.
 */
public class Man {
    String name;
    Boolean alive;
    Boolean smart;
    Boolean deleted;

    public Man(String name, Boolean alive, Boolean smart, Boolean deleted) {
        this.name = name;
        this.alive = alive;
        this.smart = smart;
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", alive=" + alive +
                ", smart=" + smart +
                ", deleted=" + deleted +
                '}';
    }
}

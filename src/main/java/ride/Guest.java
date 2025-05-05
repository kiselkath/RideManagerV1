package ride;

import java.util.Objects;

public class Guest {
    private final int id;
    private final String name;

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id == guest.id && Objects.equals(name, guest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

package Task1;

import java.util.Objects;

public class Human {
    private String name;
    private static int count = 0;

    public Human(String name) {
        this.name = name;
        count++;
    }

    public Human() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return count + ". name: " + name;
    }
}
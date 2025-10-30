import java.util.ArrayList;
import java.util.Objects;

public class Opera extends MusicalShow {
    int choirSize;

    Opera(String title, int duration, Director director,
                 ArrayList<Actor> listOfActors, String musicAuthor,
                 String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    void showActors() {
        System.out.println("Список актёров оперы '" + title + "': ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + " ("
                    + actor.height + ")");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Opera opera = (Opera) o;
        return choirSize == opera.choirSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choirSize);
    }

    @Override
    public String toString() {
        return "Opera{" +
                "choirSize=" + choirSize +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", librettoText='" + librettoText + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}

import java.util.ArrayList;
import java.util.Objects;

public class Ballet extends  MusicalShow {
    String choreographer;

    Ballet(String title, int duration, Director director,
                  ArrayList<Actor> listOfActors, String musicAuthor,
                  String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    void showActors() {
        System.out.println("Список актёров балета '" + title + "': ");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ballet ballet = (Ballet) o;
        return Objects.equals(choreographer, ballet.choreographer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), choreographer);
    }

    @Override
    public String toString() {
        return "Ballet{" +
                "choreographer='" + choreographer + '\'' +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", librettoText='" + librettoText + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}

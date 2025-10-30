import java.util.ArrayList;
import java.util.Objects;

public class MusicalShow extends Show {
    String musicAuthor;
    String librettoText;

    MusicalShow(String title, int duration, Director director,
                       ArrayList<Actor> listOfActors, String musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    void printLibretto () {
        System.out.println("Либретто музыкального шоу '" + title + "':");
        String libretto = librettoText;
        System.out.println("'" + libretto + "'");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MusicalShow that = (MusicalShow) o;
        return Objects.equals(musicAuthor, that.musicAuthor) && Objects.equals(librettoText, that.librettoText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), musicAuthor, librettoText);
    }

    @Override
    public String toString() {
        return "MusicalShow{" +
                "musicAuthor='" + musicAuthor + '\'' +
                ", librettoText='" + librettoText + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}

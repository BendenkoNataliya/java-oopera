import java.util.ArrayList;
import java.util.Objects;

public class Show {
    final String title;
    final int duration;
    final Director director;
    ArrayList<Actor> listOfActors;

    Show(String title, int duration, Director director,
                ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    void showActors () {
        System.out.println("Список актёров пьесы '" + title + "': ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.name + " " + actor.surname + " ("
                    + actor.height + ")");
        }
    }

    void addActor (Actor newActor) {
        boolean actorNotFind = true;
        if (listOfActors.isEmpty()) {
        } else {
            for (Actor actor : listOfActors) {
                if (actor.equals(newActor)) {
                    actorNotFind = false;
                }
            }
        }
        if (actorNotFind) {
            listOfActors.add(newActor);
        } else {
            System.out.println("Этот актер уже задействован в данном представлении.");
        }
    }


    void changeActor (Actor changingActor, String surname) {
        int index = 0;
        int indexCoincidence = 0;
        boolean actorNotFind = true;
        for (Actor actor : listOfActors) {
            if (actor.surname.equals(surname)) {
                actorNotFind = false;
                indexCoincidence = index;
            }
            index++;
        }
        if (actorNotFind) {
            System.out.println("Актер с фамилией " + surname
                    + " не задействован в постановке '" + title + "'." );
        } else {
            listOfActors.remove(indexCoincidence);
            listOfActors.add(changingActor);
            System.out.println("В постановке '" + title + "' произошла замена актёра "
                    + surname + " на актёра " + changingActor.surname);
        }
    }

    void directorInfo() {
        System.out.println("Режиссер постановки - " + director.name + " "
                + director.surname);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Show show = (Show) o;
        return duration == show.duration && Objects.equals(title, show.title)
                && Objects.equals(director, show.director)
                && Objects.equals(listOfActors, show.listOfActors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, duration,
                director, listOfActors);
    }

    @Override
    public String toString() {
        return "Show{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", director=" + director +
                ", listOfActors=" + listOfActors +
                '}';
    }
}

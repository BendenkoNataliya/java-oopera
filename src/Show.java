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
            System.out.println(actor);
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

/* В методе changeActor НЕ ВНЕСЛА исправления, т.к. не могу найти в классе ArrayList готовый метод, который
ищет в списке объект по значению поля объекта. Метод contains ищет объект вцелом. А в ТЗ указано,
что параметрами метода по замене актера являются новый актер и фамилия того, кого он заменяет.
Можно под этот метод переопределить equals в класса Actor, но тогда некорректно будет работать метод
addActor, т.к. там нужно равенство актров по полям - имя, фамилия и рост, а не только по фамилии.
 */
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
            listOfActors.set(indexCoincidence, changingActor);
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

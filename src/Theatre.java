import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Валерий", "Лукьянов",
                Gender.MALE, 177 );
        Actor actor2 = new Actor("Сергей", "Костров",
                Gender.MALE, 184 );
        Actor actor3 = new Actor("Светлана", "Ларина",
                Gender.FEMALE, 168 );
        Director director1 = new Director("Иван", "Быстров",
                Gender.MALE, 4);
        Director director2 = new Director("Артем", "Котляров",
                Gender.MALE, 3);
        String musicComposer = new String("Александр Сидоренко");
        String choreographer = new String("Марина Никулина");
        Show show = new Show("В гостях", 120, director1,
                new ArrayList<>());
        Ballet ballet = new Ballet("Белоснежка", 110, director2,
                new ArrayList<>(), musicComposer, "Эта история — классическая сказка "
                + "о Белоснежке, в которой добро побеждает зло. Белоснежка, доверчивая "
                + "и добрая, становится жертвой коварства мачехи, но благодаря любви "
                + "и верности друзей, она возвращается к жизни.", choreographer);
        Opera opera = new Opera("Пиковая дама", 200, director2, new ArrayList<>(),
                musicComposer, "Погрузитесь в мир страстей и интриг"
               + " с оперой «Пиковая дама» П.И. Чайковского, вдохновленной одноименной"
               + " драмой А.С. Пушкина. В этой уникальной постановке, действие которой"
               + " перенесено в эпоху Екатерины II, раскрывается трагедия личности, "
               + "ставшей жертвой общества, подчинённого власти денег.", 25);

        show.addActor(actor1);
        show.addActor(actor3);
        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);
        opera.addActor(actor2);
        opera.addActor(actor3);
        show.showActors();
        ballet.showActors();
        opera.showActors();
        show.changeActor(actor2, "Лукьянов");
        show.showActors();
        ballet.changeActor(actor2, "Светлов");
        ballet.printLibretto();
        opera.printLibretto();
    }
}

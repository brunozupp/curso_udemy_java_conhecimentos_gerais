package section10.exerciciovetorfixacao;

public class VetorExercicioFixacao {

    public static void executar() {

        Room[] rooms = new Room[10];

        rooms[9] = new Room(9,"Roberto", "r@hotmail.com");
        rooms[0] = new Room(0,"Bruno", "b@hotmail.com");
        rooms[2] = new Room(2,"Rose", "rs@hotmail.com");
        rooms[4] = new Room(4,"Ronaldo", "ro@hotmail.com");


        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] == null) continue;

            rooms[i].show();
        }

        // Ou

        for(Room room : rooms) {
            if(room == null) continue;
            room.show();
        }
    }
}

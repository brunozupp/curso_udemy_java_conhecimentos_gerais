package section10.exerciciovetorfixacao;

public class Room {

    private int numberRoom;
    private String nameStudant;
    private String emailStudant;

    public Room(int numberRoom, String nameStudant, String emailStudant) {
        this.numberRoom = numberRoom;
        this.nameStudant = nameStudant;
        this.emailStudant = emailStudant;
    }

    public void show() {
        System.out.printf("%d - %s - %s%n",numberRoom,nameStudant,emailStudant);
    }
}

package section13.application;

import section13.entities.Comment;
import section13.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class PostExecutar {

    public static void executar() throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome");
        Post post1 = new Post(
                simpleDateFormat.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this worderful country!",
                12
        );
        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);
    }
}

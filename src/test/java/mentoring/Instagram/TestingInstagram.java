package mentoring.Instagram;

import java.util.ArrayList;

public class TestingInstagram {
    public static void main(String[] args) {
        Post post1 = new Post();
        post1.caption = "captions 1";
        post1.comments = new ArrayList<>();
        String comment1 = "comment 1";
        String comment2 = "comment 2";
        post1.comments.add(comment1);
        post1.comments.add(comment2);
        post1.likes = 89;

        Post post2 = new Post();
        post2.caption = "captions 1";
        post2.comments = new ArrayList<>();
        String comment3 = "comment 1";
        String comment4 = "comment 2";
        post2.comments.add(comment3);
        post2.comments.add(comment4);
        post2.likes = 90;

        InstagramUser instagramUser = new InstagramUser();
        instagramUser.age = 33;
        instagramUser.name = "Vasyl";
        instagramUser.numOfPosts = 2;
        instagramUser.posts  = new ArrayList<>();
        instagramUser.posts.add(post1);
        instagramUser.posts.add(post2);




    }
}

package mentoring.Instagram;

public class TestingInstagram {
    public static void main(String[] args) {

        Instagram instagram = new Instagram();


        // Sign up page
        // On sign up page users  MUST provide name, age, username etc.
        InstagramUser user1 = new InstagramUser("John Wick", 45, "jw2020");
        instagram.addUser(user1);
        String userToken = instagram.login("cbt1", "cbt2020");
        System.out.println(userToken);
        instagram.seeAllUsers(userToken);
//        InstagramUser user2 = new InstagramUser("James Bond", 41, "jbcool");
//        instagram.addUser(user2);
//        System.out.println();
//        instagram.seeAllUsers("Cyb32134");











    }
}

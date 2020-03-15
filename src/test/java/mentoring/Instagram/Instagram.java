package mentoring.Instagram;

import utilities.Config;

import java.util.ArrayList;
import java.util.List;

public class Instagram {
    public List<InstagramUser> users;

    public Instagram(){
        users = new ArrayList<>();
    }
    /*
    Methods:
- addUser ==> done
- addPost ==> done in instagramUser
- removeUser   ==> done
- removePost==>  done
- updateUserInfo ==> done
- updatePostInfo ==>
     */

    public void addUser(InstagramUser instagramUser) {
        boolean found = false;
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(instagramUser.username)) {
                System.out.println("Username is already exists.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User added to the system");
            users.add(instagramUser);
        }

    }

    public void addPost(String username, Post post) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                u.posts.add(post);
                return;
            }
        }
        System.out.println("Username: " + username + " not found");
    }


    public void removeUser(String username) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                users.remove(u);
                return;
            }
        }
        System.out.println("Username " + username + " is not found");
    }


    public void updateUserInfo(String username, String newName, int newAge) {
        for (InstagramUser u : users) {
            if (u.username.equalsIgnoreCase(username)) {
                u.name = newName;
                u.age = newAge;
                System.out.println("Info updated");
                return;
            }
        }
        System.out.println("Username " + username + " is not found");
    }

    public void seeAllUsers(String secretKey){
        if(Config.getProperty("apiKey").equals(secretKey)) {
            for (int i = 0; i < users.size(); i++) {
                System.out.println("User " + (i + 1));
                System.out.println("Name: " + users.get(i).name);
                System.out.println("Username: " + users.get(i).username);
                System.out.println("Age: " + users.get(i).age);
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid API key! Try again");
        }
    }
}





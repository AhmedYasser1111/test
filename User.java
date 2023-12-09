

import java.util.ArrayList;
import java.util.Date;

public class User {
    private String Fisrtname;
    private String Lastname;
    private String email;
    private String username;
    private String password;
    private String Confirmpassword;
    private String profilePictureUrl; //4aklaha m4 ht4t8all nnn
    private Date birthdate;
    private ArrayList<String> ListOfFriends = new ArrayList<String>();


    public User(String Fisrtname, String Lastname, String email, String username, String password, String Confirmpassword, String profilePictureUrl, Date birthdate) {
        this.Fisrtname = Firstname;
        this.Lastname = Lastname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.Confirmpassword = Confirmpassword;
        this.profilePictureUrl = profilePictureUrl;
        this.birthdate = birthdate;
        ArrayList<String> listOfPosts = new ArrayList<>();
        this.ListOfFriends = new ArrayList<>();
        ArrayList<String> listOfConversations = new ArrayList<>();

    }

    public String getFisrtname() {
        return Fisrtname;
    }

    public void setFisrtname(String Fisrtname) {
        Fisrtname = Fisrtname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        Lastname = Lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmpassword() {
        return Confirmpassword;
    }

    public void setConfirmpassword(String Confirmpassword) {
        Confirmpassword = Confirmpassword;
    }

    public String getProfilePictureUrl() {
        return profilePictureUrl;
    }

    public void setProfilePictureUrl(String profilePictureUrl) {
        this.profilePictureUrl = profilePictureUrl;
    }

    public ArrayList<String> getListOfFriends() {
        return ListOfFriends;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setListOfFriends(ArrayList<String> listOfFriends) {
        ListOfFriends = listOfFriends;
    }
    /*public void addFriend(User friend) {
        friends.add(friend);
    }

    public void removeFriend(User friend) {
        friends.remove(friend);
    }*/
    public void deletePost(Post post) {
        posts.remove(post);
    }

    public static User createAccount(String Fisrtname, String username, String password, String email, Date birthdate){
        if (username == null || password == null || Firstname == null || email == null || profilePictureUrl == null) {
            throw new IllegalArgumentException("All parameters are required");
        }
        return new User(username, password, Firstname, Lastname, email, profilePictureUrl);


    }
    public boolean login(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be null or empty");
        }
        if (password == null || password.isEmpty()) {
            throw new IllegalArgumentException("Password cannot be null or empty");
        }
        return this.username.equals(username) && this.password.equals(password);
    }
    public Post writePost(String title, String content) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (content == null || content.isEmpty()) {
            throw new IllegalArgumentException("Content cannot be null or empty");
        }

        Post newPost = new Post(title, content, this); //this represents the user who is creating the post
        this.posts.add(newPost);
        return newPost;
    }
    public void writeComments(Post post, String commentText) {
        Comment comment = new Comment(this, commentText);  //this represents the user who is commenting on the post
        post.addComment(comment);
    }
    public void likeComment(Comment comment) {
        comment.addLike(this); //add user to the list of likes (this represents the user)
    }
    public void likePost(Post post) {
        post.addLike(this);
    }
    public void seeFriendsPosts() {
        for (User friend : ListOfFriends) {
            System.out.println("Posts from " + friend.getUsername() + ":");
            for (Post friendPost : friend.getPosts()) {
                System.out.println(" - " + friendPost.getMessage());
            }
            System.out.println(); // Separate friend posts
        }
    }
    public void createPage(String pageTitle, String pageDescription) {
        Page page = new Page(pageTitle, pageDescription, this);
        pages.add(page);
        System.out.println("Page created: " + pageTitle);
    }

}






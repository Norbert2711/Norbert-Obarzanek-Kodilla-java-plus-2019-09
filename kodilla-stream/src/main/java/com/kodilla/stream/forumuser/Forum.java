package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;
public class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {

        theForumUser.add(new ForumUser(10, "Adam Kownacki", 'M', 2005,10,23, 67));
        theForumUser.add(new ForumUser(11, "Katarzyna Maj", 'F', 1995,6,30, 12));
        theForumUser.add(new ForumUser(12, "Tomasz Nowotniak", 'M', 1980,6,18, 24));
        theForumUser.add(new ForumUser(13, "Robert Murawski", 'M', 1999,10 ,17, 5));
        theForumUser.add(new ForumUser(14, "Anna Stolc", 'F', 1999 , 9 , 7, 0));
        theForumUser.add(new ForumUser(15, "Jolanta Dulek", 'F', 1978 , 12 , 21, 54));
        theForumUser.add(new ForumUser(16, "Krzyszfof Czyż", 'F', 2004 , 4 , 3, 0));
        theForumUser.add(new ForumUser(17, "Paweł Woźniak", 'M', 2002,9,5, 14));

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUser);
    }

}

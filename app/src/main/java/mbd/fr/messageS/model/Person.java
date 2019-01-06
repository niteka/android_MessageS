package mbd.fr.messageS.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {



    private String name;
    private String lastName;
    private String userName;
    private String password;

    private List<String> contact;
    public static final List<Person> USERSLIST = new ArrayList<Person>();


    public static final Map<String, Person> USER_MAP = new HashMap<String, Person>();

    //private static final int COUNT = 25;



    private static void addPerson(Person user) {
        USERSLIST.add(user);
        USER_MAP.put("user.getId()", user);
    }



    private static String userDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about User: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }








    public Person(String etName, String lastName, String userName, String password) {
        this.name = etName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                '}';
    }
}

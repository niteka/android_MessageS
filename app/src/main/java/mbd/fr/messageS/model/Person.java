package mbd.fr.messageS.model;

class Person {
    private String name;
    private String lastName;
    private String userName;
    private String password;

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

}

package enums;

public enum Role {

    ROLE_ADMIN("Admin"),
    ROLE_TEACHER("Teacher"),
    ROLE_STUDENT("Student");

    private final String name;

    Role(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }


}

package homework10;

public class UserEntity {

    private String firstname;  //use camel case
    private String surname;
    private int age;

    public UserEntity(String name, String surname, int age) {
        this.firstname = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() { return firstname; }

    void setName( String firstname) {this.firstname = firstname; }

    public String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    //this method should be in UserValidationService
    //and you should pass to it the User object
    public int checkName(String firstname)
    {
        if (firstname.length() < 3 || firstname.length() > 15){
            throw new ValidationException("The minimum length of the user's name is 3 characters. The maximum length of the user's name is 15 characters. Your length: " + firstname.length());
        }
        return getName().length();
    }

    //this method should be in UserValidationService
    //and you should pass to it the User object
    public int checkSurname(String surname)
    {
        if (surname.length() < 3 || surname.length() > 15){
            throw new ValidationException("The minimum length of the user's surname is 3 characters. The maximum length of the user's surname is 15 characters. Your length: " + surname.length());
        }
        return getName().length();
    }

    //this method should be in UserValidationService
    //and you should pass to it the User object
    public int checkAge(int age)
    {
        if (age < 0 || age > 120){
            throw new ValidationException("The age must not be less than 0 and shall not exceed 120 years. Your age: " + getAge());
        }
        return getAge();
    }
}


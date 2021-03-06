package homework10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Tests are failing, please fix them
class UserEntityTest {

    @Test
    void doubleCheckAgeIn() {
        UserEntity tola = new UserEntity("Aleksandra", "Kwiatkowska", 20);
        assertEquals(20, tola.checkAge(20));
    }

    @Test
    void doubleCheckAgeAbove() {
        UserEntity ola = new UserEntity("Aleksandra", "Gasiorowska", 129);
        assertEquals(129, ola.checkAge(129));
    }

    @Test
    void doubleCheckNameAbove() {
        UserEntity tola = new UserEntity("Aleksandra Maria Lidia", "Gasiorowska", 29);
        assertEquals(22, tola.checkName("Aleksandra Maria Lidia"));
    }

    @Test
    void doubleCheckNameIn() {
        UserEntity ola = new UserEntity("Aleksandra", "Gasiorowska", 29);
        assertEquals(10, ola.checkName("Aleksandra"));

    }

    @Test
    void doubleCheckSurnameAbove() {
        UserEntity ola = new UserEntity("Aleksandra", "Gasiorowska Minor", 29);
        assertEquals("The minimum length of the user's surname is 3 characters. The maximum length of the user's surname is 15 characters. Your length: 17", ola.checkSurname("Gasiorowska Minor"));
    }

    @Test
    void doubleCheckSurnameIn() {
        UserEntity tola = new UserEntity("Aleksandra", "Kwiatkowska", 30);
        assertEquals(10, tola.checkSurname("Kwiatkowska"));
    }
}

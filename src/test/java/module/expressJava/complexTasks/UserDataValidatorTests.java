package module.expressJava.complexTasks;

import org.example.module.expressJava.complexTasks.userDataValidator.InvalidUserException;
import org.example.module.expressJava.complexTasks.userDataValidator.User;
import org.example.module.expressJava.complexTasks.userDataValidator.UserValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserDataValidatorTests {

    @Test
    void validatorEmptyNameTest() {
        User user = new User("test@mail.ru", 20);
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkUser(user);
        });
    }

    @Test
    void validatorAgeMinTest() {
        User user = new User("Bob", 17, "tests@mailTest.ru");
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkUser(user);
        });
    }

    @Test
    void validatorAgeMaxTest() {
        User user = new User("Bob", 101, "tests@mailTest.ru");
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkUser(user);
        });
    }

    @Test
    void validatorAgeTest() {
        User user = new User("Bob", 50, "tests@mailTest.ru");
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertTrue(userValidator.checkUser(user));
    }

    @Test
    @DisplayName("Проверка валидации email - негативный сценарий")
    void validatorEmailTest() {
        User user = new User("Bob", 101, "testsmailTest.ru");
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkUser(user);
        });
    }

    @Test
    void validatorEmailPositiveTest() {
        User user = new User("Bob", 50, "tests@mailTest.ru");
        UserValidator userValidator = new UserValidator();
        userValidator.setValidationEnabled(true);

        assertTrue(userValidator.checkUser(user));
    }
}

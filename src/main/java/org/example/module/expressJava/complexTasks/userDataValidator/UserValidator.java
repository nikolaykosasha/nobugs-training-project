package org.example.module.expressJava.complexTasks.userDataValidator;

public class UserValidator {
    private boolean validationEnabled;

    public boolean checkUser(User user) {

        if (validationEnabled) {
            checkName(user);
            checkAge(user);
            checkEmail(user);
            return true;
        }

        return false;
    }

    private void checkName(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {

            throw new InvalidUserException("Имя не может быть пустым");
        }

        if (!(Character.isUpperCase(user.getName().charAt(0)))) {
            throw new InvalidUserException("Имя должно начинаться с заглавной буквы");
        }

    }

    private void checkAge(User user) {
        if((user.getAge() < 18 || user.getAge() > 100)){
            throw new InvalidUserException("Возраст должен быть в пределах от 18 до 100 лет.");
        }
    }

    private void checkEmail(User user) {
        if (!(user.getEmail().matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$"))) {
            throw new InvalidUserException("Email должен соответствовать стандартному формату электронной почты.");
        }
    }

    public void setValidationEnabled(boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }
}

package com.roman.onlinemagazine.DTO;

public class UserDTO {

    private String email;
    private String password;
    private String username;
    private String repeatPassword;
    private int age;

    private String usernameError;
    private String emailError;
    private String passwordError;
    private String repeatPasswordError;
    private String alreadyExistsError;

    public String getRepeatPasswordError() {
        return repeatPasswordError;
    }

    public void setRepeatPasswordError(String repeatPasswordError) {
        this.repeatPasswordError = repeatPasswordError;
    }

    public String getUsernameError() {
        return usernameError;
    }

    public void setUsernameError(String usernameError) {
        this.usernameError = usernameError;
    }

    public String getEmailError() {
        return emailError;
    }

    public void setEmailError(String emailError) {
        this.emailError = emailError;
    }

    public String getPasswordError() {
        return passwordError;
    }

    public void setPasswordError(String passwordError) {
        this.passwordError = passwordError;
    }

    public String getAlreadyExistsError() {
        return alreadyExistsError;
    }

    public void setAlreadyExistsError(String alreadyExistsError) {
        this.alreadyExistsError = alreadyExistsError;
    }

    public UserDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", repeatPassword='" + repeatPassword + '\'' +
                ", age=" + age +
                '}';
    }
}

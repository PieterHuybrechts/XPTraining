package com.cegeka.spacebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String username;
    private List<Person> friends = new ArrayList<>();
    private List<Message> messages = new ArrayList<>();

    public Person(String userName) {
        this.setUsername(userName);
    }

    public String getUsername() {
        return this.username;
    }

    private void setUsername(String username){
        this.validateUserName(username);
        this.username = username;
    }

    public void addFriend(Person person) {
        if(person.equals(this)){
            throw new IllegalArgumentException("A person can not add itself");
        }

        if(!this.hasFriend(person)){
            this.friends.add(person);
        }

        if(!person.hasFriend(this)){
            person.addFriend(this);
        }
    }

    private boolean hasFriend(Person person){
        return this.getFriends().contains(person);
    }

    public List<Person> getFriends() {
        return new ArrayList<>(this.friends);
    }

    public void addMessage(Message message) {
        if(!this.getFriends().contains(message.getSender())){
            throw new IllegalArgumentException("Persons have to be friends to send a message");
        }

        this.messages.add(message);
    }

    public List<Message> getMessages() {
        return this.messages;
    }

    private void validateUserName(String username){
        Validator<String> userNameValidator = new Validator<>();

        userNameValidator.validate(Objects::isNull,username,"Username can not be null");
        userNameValidator.validate(String::isEmpty,username,"Username can not be empty");
        userNameValidator.validate(uName -> uName.trim().isEmpty(),username,"Username can not only contain spaces");
    }

    private interface IUserNameValidator<T> {
        boolean test(T username);
    }

    private static class Validator<T>{
        void validate(IUserNameValidator<T> test, T username, String message) {
            if(test.test(username)){
                throw new IllegalArgumentException(message);
            }
        }
    }
}

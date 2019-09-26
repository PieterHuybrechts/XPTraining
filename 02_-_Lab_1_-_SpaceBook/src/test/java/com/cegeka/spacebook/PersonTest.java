package com.cegeka.spacebook;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PersonTest {

    private Person person1;
    private Person person2;
    private Message message;

    @Before
    public void setUp() throws Exception {
        this.person1 = new Person("person");
        this.person2 = new Person("person2");
        this.message = new Message(person1, "Message");
    }

    @Test
    public void Person_givenUsername_thenPersonHasGivenUsername() {
        Person person = new Person("randomUsername");

        assertThat(person.getUsername()).isEqualTo("randomUsername");
    }

    @Test
    public void Person_givenUsernameNull_ExpectingException() {
        assertThatThrownBy(() -> new Person(null))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Username can not be null");
    }

    @Test
    public void Person_givenUsernameEmpty_ExpectingException() {
        assertThatThrownBy(() -> new Person(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Username can not be empty");
    }

    @Test
    public void Person_givenUsernameOnlyContainingSpaces_ExpectingException() {
        assertThatThrownBy(() -> new Person("       "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Username can not only contain spaces");
    }

    @Test
    public void addFriend_givenAPerson_ThenThePersonHasAFriend() {
        this.person1.addFriend(this.person2);

        assertThat(this.person1.getFriends()).containsExactly(this.person2);
    }

    @Test
    public void addFriend_givenAPerson_ThenTheOtherPersonHasAFriend() {
        this.person1.addFriend(this.person2);

        assertThat(this.person2.getFriends()).containsExactly(this.person1);
    }

    @Test
    public void addFriend_givenAPersonAddingHimself_ThenThrowException() {
        assertThatThrownBy(() -> this.person1.addFriend(this.person1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("A person can not add itself");
    }

    @Test
    public void addMessage_givenAPersonWithAFriend_ReceivesAMessage() {
        this.person2.addFriend(this.person1);

        this.person2.addMessage(this.message);

        assertThat(this.person2.getMessages()).containsExactly(this.message);
    }

    @Test
    public void addMessage_givenAPersonWithoutAFriend_ThenThrowException() {
        assertThatThrownBy(() -> this.person2.addMessage(message))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Persons have to be friends to send a message");
    }
}

package my_work;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Hamza Ouni
 */
public class Person {

    private String name;
    private String lastname;
    private String firstname;

    HelloMessageGenerator helloMessageGenerator;

    public HelloMessageGenerator getHelloMessageGenerator() {
        return helloMessageGenerator;
    }

    public void setHelloMessageGenerator(HelloMessageGenerator helloMessageGenerator) {
        this.helloMessageGenerator = helloMessageGenerator;
    }

    public Person() {
    }

    public Person(String name, String lastname, String firstname) {
        this.name = name;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}

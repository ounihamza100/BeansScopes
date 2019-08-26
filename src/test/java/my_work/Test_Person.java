package my_work;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Hamza Ouni
 */
public class Test_Person {

    private static final String NAME = "John Smith";
    private static final String NAME_OTHER = "Anna Jones";

    @Test
    public void givenSingletonScope_whenSetName_thenEqualNames() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes.xml");
        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");
        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        personSingletonA.setName(NAME);
        Assert.assertEquals(NAME, personSingletonB.getName());
        ((AbstractApplicationContext) applicationContext).close();


    }

    @Test
    public void givenPrototypeScope_whenSetName_thenDifferentNames() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes.xml");
        Person personPrototypeA = (Person) applicationContext.getBean("personPrototype");
        Person personPrototypeB = (Person) applicationContext.getBean("personPrototype");

        personPrototypeA.setName(NAME);
        personPrototypeB.setName(NAME_OTHER);

        Assert.assertEquals(NAME, personPrototypeA.getName());
        Assert.assertEquals(NAME_OTHER, personPrototypeB.getName());
        ((AbstractApplicationContext) applicationContext).close();
    }

    @Test
    public void injectProtoypeBean_inSegletonBean_getDifferentObj() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes.xml");

        Person personSingletonA = (Person) applicationContext.getBean("personSingleton");

        Person personSingletonB = (Person) applicationContext.getBean("personSingleton");

        String[] allBeanNames = applicationContext.getBeanDefinitionNames();
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }

        ((AbstractApplicationContext) applicationContext).close();
    }

}

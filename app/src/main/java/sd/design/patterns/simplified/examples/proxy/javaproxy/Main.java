package sd.design.patterns.simplified.examples.proxy.javaproxy;

import sd.design.patterns.all.examples.proxy.javaproxy.Person;
import sd.design.patterns.all.examples.proxy.javaproxy.PersonImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {
    public static void main(String... args) {
        Person joe = new PersonImpl();
        joe.setName("Joe Javabean");
        joe.setInterests("cars, computers, music");
        joe.setGeekRating(7);

        Person newJoe = (Person) Proxy.newProxyInstance(
                joe.getClass().getClassLoader(),
                joe.getClass().getInterfaces(),
                new PersonInvocationHandler(joe)
        );

        System.out.println(newJoe.getName());

        newJoe.setName("Test");
    }

    static class PersonInvocationHandler implements InvocationHandler {
        Person person;

        public PersonInvocationHandler(Person person) {
            this.person = person;
        }


        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            try {
                if (method.getName().startsWith("get")) {
                    return method.invoke(person, args);
                } else if (method.getName().equals("setGeekRating")) {
                    return method.invoke(person, args);
                } else if (method.getName().startsWith("set")) {
                    throw new IllegalAccessException();
                }
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}

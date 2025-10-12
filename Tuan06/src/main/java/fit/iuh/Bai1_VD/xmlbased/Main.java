package fit.iuh.Bai1_VD.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Student student1 = context.getBean("student1", Student.class);
        Student student2 = context.getBean("student2", Student.class);
        Student student3 = context.getBean("student3", Student.class);
        Person person = context.getBean("person", Person.class);
        Class_ class2 = context.getBean("class2", Class_.class);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(person);
        System.out.println(class2);
    }
}

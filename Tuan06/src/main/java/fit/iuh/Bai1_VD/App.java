package fit.iuh.Bai1_VD;

import fit.iuh.Bai1_VD.business.CustomerBusiness;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml"); // đúng

        CustomerBusiness business = (CustomerBusiness) context.getBean("customerBusiness");
        business.process();
    }
}

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String args[]){
        BeanFactory beanFactory=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserManager userManager=(UserManager)beanFactory.getBean("userManager");
        userManager.addUser("zhang san","123");
    }
}

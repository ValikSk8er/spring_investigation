package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //витягує бін по класу або по інтерфесу, по класу ніфіга не гуд
        context.getBean(TerminatorQuoter.class).sayQuote();

    }
}

package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @author: TianXiang
 * @description:
 * @date: 2019/8/18
 */
public class ProtoType {
    
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("beans.xml");
        Object bean = application.getBean("sheep");
        System.out.println(bean); // 多莉
        Object bean2 = application.getBean("sheep");
        System.out.println(bean2); // 多莉
        System.out.println(bean == bean2); // false
    }
    
}

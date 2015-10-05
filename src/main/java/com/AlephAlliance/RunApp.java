package com.AlephAlliance;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.model.IPhone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vitalii on 08.09.2015.
 */
public class RunApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context.xml");
        PhoneDAO dao = applicationContext.getBean(PhoneDAO.class);
        IPhone phone = new IPhone();
        phone.setColor("white");
//        phone.setModel("4s");
//        phone.setCondition("new");
//        phone.setMemory("8");

        List<IPhone> list = dao.getPhoneByParameters(phone);

        if(list.size() > 0) {
            int i = 1;
            for (IPhone p : list) {
                System.out.println(i + " " + p);
                i++;
            }
        }else System.out.println("Sorry, we dont have such phones");
    }
}

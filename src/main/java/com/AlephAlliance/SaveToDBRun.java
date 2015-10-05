package com.AlephAlliance;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.service.PhoneService;
import com.AlephAlliance.service.PhoneServiceImpl;
import com.AlephAlliance.utils.PhoneTXTParser;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Vitalii on 09.09.2015.
 */
public class SaveToDBRun {

    public static final String PHONES = "E:\\Programming\\internetShop\\src\\main\\resources\\phones";

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:app-context.xml");

        PhoneTXTParser parser = applicationContext.getBean(PhoneTXTParser.class);
        try {
            parser.parse(PHONES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

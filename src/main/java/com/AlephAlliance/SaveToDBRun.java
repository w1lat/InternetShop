package com.AlephAlliance;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.service.PhoneService;
import com.AlephAlliance.service.PhoneServiceImpl;
import com.AlephAlliance.utils.PhoneTXTParser;

import java.io.IOException;

/**
 * Created by Vitalii on 09.09.2015.
 */
public class SaveToDBRun {

    public static final String PHONES = "E:\\Programming\\internetShop\\src\\main\\resources\\phones";

    public static void main(String[] args) {

        PhoneDAO dao = new HibernatePhoneDAOImpl();
        PhoneService service = new PhoneServiceImpl(dao);
        PhoneTXTParser parser = new PhoneTXTParser(service);
        try {
            parser.parse(PHONES);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

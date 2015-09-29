package com.AlephAlliance;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.model.IPhone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Vitalii on 08.09.2015.
 */
public class RunApp {
    public static void main(String[] args) {
        HibernatePhoneDAOImpl dao = new HibernatePhoneDAOImpl();
        IPhone phone = new IPhone();
        phone.setColor("white");
//        phone.setModel("4s");
//        phone.setCondition("new");
//        phone.setMemory("8");

        List<IPhone> list = dao.getPhoneByParameters(phone);

        if(list.size() > 0) {
            for (IPhone p : list)
                System.out.println(p);
        }else System.out.println("Sorry, we dont have such phones");
    }
}

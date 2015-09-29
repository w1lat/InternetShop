package com.AlephAlliance.service;

import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.model.IPhone;

/**
 * Created by Vitalii on 09.09.2015.
 */
public class PhoneServiceImpl implements PhoneService {

    private PhoneDAO dao;

    public PhoneServiceImpl() {
    }

    public PhoneServiceImpl(PhoneDAO dao) {
        this.dao = dao;
    }

    public Integer addToDB(IPhone phone) {

        return dao.saveIPhone(phone);
    }
}

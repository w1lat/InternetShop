package com.AlephAlliance.service;

import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.model.IPhone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Vitalii on 09.09.2015.
 */
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
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

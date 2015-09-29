package com.AlephAlliance.DAO;

import com.AlephAlliance.model.IPhone;

import java.util.List;
import java.util.Map;

/**
 * Created by Vitalii on 08.09.2015.
 */
public interface PhoneDAO {

    public List<IPhone> getPhoneByParameters(IPhone phone);
    Integer saveIPhone(IPhone phone);
    IPhone getPhoneById(long id);
}

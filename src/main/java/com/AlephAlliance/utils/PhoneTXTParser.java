package com.AlephAlliance.utils;

import com.AlephAlliance.model.IPhone;
import com.AlephAlliance.service.PhoneService;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Vitalii on 09.09.2015.
 */
public class PhoneTXTParser {

    private PhoneService service;

    public PhoneTXTParser() {
    }

    public PhoneTXTParser(PhoneService service) {
        this.service = service;
    }

    public void parse(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String line = reader.readLine();
        do{
            String[] param = line.split(" ");
            IPhone phone = new IPhone(param[2], param[1], param[3], param[0]);
            System.out.println(phone);
            service.addToDB(phone);
            line = reader.readLine();
        }while (line != null);

    }
}

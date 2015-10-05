package com.AlephAlliance.servlet;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.DAO.PhoneDAO;
import com.AlephAlliance.model.IPhone;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Vitalii on 28.09.2015.
 */
public class ShowIPhoneServlet extends HttpServlet {

    private static final String PARAM_PHONE_ID = "id";
    public static final String PAGE_OK = "WEB-INF/pages/phone.jsp";

    private PhoneDAO dao;

    @Override
    public void init() throws ServletException {
        ApplicationContext applicationContext = (ApplicationContext)getServletContext()
              .getAttribute("springContext");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext
//                ("classpath:app-context.xml");
        dao = applicationContext.getBean(PhoneDAO.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IPhone phone = dao.getPhoneById(Long.parseLong(req.getParameter(PARAM_PHONE_ID)));
        req.setAttribute("phone", phone);
        req.getRequestDispatcher(PAGE_OK).forward(req,resp);
    }
}

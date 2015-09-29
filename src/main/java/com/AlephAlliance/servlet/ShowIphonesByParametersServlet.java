package com.AlephAlliance.servlet;

import com.AlephAlliance.DAO.HibernatePhoneDAOImpl;
import com.AlephAlliance.model.IPhone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Vitalii on 08.09.2015.
 */
public class ShowIphonesByParametersServlet extends HttpServlet {


    private static final String PARAM_COLOR = "color";
    private static final String PARAM_MODEL = "model";
    private static final String PARAM_CONDITION = "condition";
    private static final String PARAM_MEMORY = "memory";
    private static final String PAGE_OK = "WEB-INF/pages/items.jsp";

    private HibernatePhoneDAOImpl dao;

    @Override
    public void init() throws ServletException {
        dao = new HibernatePhoneDAOImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IPhone phone = new IPhone();

        phone.setColor(req.getParameter(PARAM_COLOR));
        phone.setModel(req.getParameter(PARAM_MODEL));
        phone.setCondition(req.getParameter(PARAM_CONDITION));
        phone.setMemory(req.getParameter(PARAM_MEMORY));

        List<IPhone> list = dao.getPhoneByParameters(phone);
        req.setAttribute("phones", list);
        req.getRequestDispatcher(PAGE_OK).forward(req, resp);
    }
}

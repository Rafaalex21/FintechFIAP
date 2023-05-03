package classes;
import java.io.IOException;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;

public class ListFinanceServlet extends HttpServlet {
	 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        FinanceDAO financeDAO = new FinanceDAO();
        List<Finance> finances = financeDAO.getAll();
        
        request.setAttribute("finances", finances);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/listFinance.jsp");
        dispatcher.forward(request, response);
    }
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
 
}

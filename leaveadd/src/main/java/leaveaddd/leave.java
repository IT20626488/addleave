package leaveaddd;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/leave")
public class leave extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String staffmid=request.getParameter("staffmid");
		String name=request.getParameter("name");
		String leavetype=request.getParameter("leavetype");
		String startdate=request.getParameter("startdate");
		String enddate=request.getParameter("enddate");
		String reason=request.getParameter("reason");
		String assignamem=request.getParameter("assignamem");
		String askapp=request.getParameter("askapp");
		boolean isTrue;
		
		isTrue = CostomerDBUtil.insertcustomer(staffmid, name, leavetype, startdate, enddate, assignamem, askapp);
		
		if(isTrue==true) {
			RequestDispatcher dis=request.getRequestDispatcher("Success.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2=request.getRequestDispatcher("UnSuccess.jsp");
			dis2.forward(request, response);}
		
	}}
		


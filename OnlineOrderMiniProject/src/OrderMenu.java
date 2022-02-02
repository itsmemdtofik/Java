import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class OrderMenu extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter outPrintWriter = res.getWriter();
		String uname = req.getParameter("userName");
		String modeString = req.getParameter("group1");
		int item1 = 0;
		int item2 = 0;
		int item3 = 0;
		int item4 = 0;
		int price1 = 10;
		int price2 = 20;
		int price3 = 30;
		int price4 = 50;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		if (req.getParameter("option1") != null) {
			String s1 = req.getParameter("val1");
			item1 = Integer.parseInt(s1);

		}
		if (req.getParameter("option2") != null) {
			String s2 = req.getParameter("val2");
			item2 = Integer.parseInt(s2);
		}
		if (req.getParameter("option3") != null) {
			String s3 = req.getParameter("val3");
			item3 = Integer.parseInt(s3);
		}
		if (req.getParameter("option4") != null) {
			String s4 = req.getParameter("val4");
			item4 = Integer.parseInt(s4);
		}

		total1 = item1 * price1;
		total2 = item2 * price2;
		total3 = item3 * price3;
		total4 = item4 * price4;
		double total = total1 + total2 + total3 + total4;
		double total5 = total + (total * 2.0) / 100;
		outPrintWriter.println("<html><head><title>Order | Menu</title><style>" + "h5{" + "background-color:yellow;"
				+ "width:100px;" + "text-align:center;" + "font-weight:bolder;" + "}"
						+ "input[type='button']{"
						+ "width:150px;"
						+ "background-color:black;"
						+ "color:white;"
						+ "font-family:sans-serif;"
						+ "font-weight:bolder;"
						+ "text-align:center;"
						+ "cursor:pointer;"
						+ "position:relative;"
						+ "top:10px;"
						+ "left:600px;"
						+ "}"
						+ "input[type='button']:active{"
						+ "transition:.2s ease;"
						+ "transform:scale(1.2);"
						+ "}</style></head><body>");
		outPrintWriter.println("<h4>USER NAME : </h4>" + uname);
		outPrintWriter.println("<h3>You have ordered following items : </h3>");
		outPrintWriter.println("<div><table border=1>");

		outPrintWriter.println("<tr>");
		outPrintWriter.println("<th>Quantity</th>");
		outPrintWriter.println("<th>Price</th>");
		outPrintWriter.println("<th>Total</th>");
		outPrintWriter.println("</tr>");

		outPrintWriter.println("<tr>");
		outPrintWriter.println("<td>" + item1 + "</td>");
		outPrintWriter.println("<td>" + price1 + "</td>");
		outPrintWriter.println("<td>" + total1 + "</td>");
		outPrintWriter.println("</tr>");

		outPrintWriter.println("<tr>");
		outPrintWriter.println("<td>" + item2 + "</td>");
		outPrintWriter.println("<td>" + price2 + "</td>");
		outPrintWriter.println("<td>" + total2 + "</td>");
		outPrintWriter.println("</tr>");

		outPrintWriter.println("<tr>");
		outPrintWriter.println("<td>" + item3 + "</td>");
		outPrintWriter.println("<td>" + price3 + "</td>");
		outPrintWriter.println("<td>" + total3 + "</td>");
		outPrintWriter.println("</tr>");

		outPrintWriter.println("<tr>");
		outPrintWriter.println("<td>" + item4 + "</td>");
		outPrintWriter.println("<td>" + price4 + "</td>");
		outPrintWriter.println("<td>" + total4 + "</td>");
		outPrintWriter.println("</tr>");

		outPrintWriter.println("</table></div>");
		outPrintWriter.println("<br>");
		outPrintWriter.println("----------------------------------<br>");
		outPrintWriter.println("Total Cost is : <h5>" + total + "</h5><br>");
		outPrintWriter.println("<b><i>Total Bill (Including sales tax of 20%) : <h5>" + total5 + "</h5></i></b><br>");
		outPrintWriter.println("Payment Method : <h5>" + modeString + "</h5>");
		outPrintWriter.println("<a href='http://localhost:8080/OrderJava/OrderMenu.html'><input type='button' name='button' value='HOME'/></a>");
		outPrintWriter.println("</body></html>");
		

	}
}
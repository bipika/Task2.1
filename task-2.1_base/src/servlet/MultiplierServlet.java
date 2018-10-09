package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ClientWS_Multiplier.Multiplier;
import ClientWS_Convertor.NumberConvertor;

//import clientWS_NC.NumberConvertor;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/multiply")
public class MultiplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiplierServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

				Multiplier client = new Multiplier();
				
				String num1 = request.getParameter("num1");
				String num2 = request.getParameter("num2");
				
				String result = client.MultiplyIntegers(Integer.parseInt(num1), Integer.parseInt(num2));
				
				NumberConvertor convertor = new NumberConvertor();
				
				String result_string = convertor.convert2dollars(result);
				
				PrintWriter out = response.getWriter();

				out.write(result_string); 			
							 
				out.flush();
			    out.close();
		
	}

}

package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//obtemos o resultado da pagina, podia ser na mesma pagina ou em outra
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//adicionamos os valores obtidos no formulario dentro de variaveis
	String principleAmount = request.getParameter("principleamount");
	String interestPercentage = request.getParameter("interestPercentage");
	String years = request.getParameter("years");
	String compoundingPeriod = request.getParameter("compoundingPeriod");
		
	
	String error;
	//verificamos se os valores estão vazios e retornamos mensagens de erro amigaveis
	if(principleAmount == "" || interestPercentage == "" || years =="" || compoundingPeriod == "") {
		error = "um ou mais campos está em branco, tente novamente";
		request.setAttribute("error", error);
	}else {
		double result = Utils.calculateCompoundingInterest(Double.parseDouble(principleAmount), (Double.parseDouble(interestPercentage) / 100), Integer.parseInt(years), Integer.parseInt(compoundingPeriod));
	request.setAttribute("result", result);
	}
	//enviamos o formulario e as tratativas
	getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}

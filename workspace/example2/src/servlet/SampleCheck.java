package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.SampleEnzan;
import model.SampleModel;
import model.SampleModel.ErrorStatus;;

/**
 * Servlet implementation class SampleCheck
 */
@WebServlet("/SampleCheck")
public class SampleCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SampleCheck() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//		request.setAttribute("message", "");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/sample.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doPost(request, response);

		//パラメータの取得
		String number1 = request.getParameter("number1"); //入力１を取得
		String number2 = request.getParameter("number2"); //入力２を取得
		String enzan = request.getParameter("enzan"); //セレクトの四則演算を取得

		//		System.out.printf("number1: %s number2: %s enzan: %s\n", number1, number2, enzan);

		//入力値をプロパティーに設定
		SampleModel sampleModel = new SampleModel(number1, number2, enzan);

		ErrorStatus ret = sampleModel.checkError();

		if (ret.getId() != 0) {

			//リクエストスコープに保存
			request.setAttribute("message", ret.getMsg());

			//計算結果に表示を指示
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/sample.jsp");
			dispatcher.forward(request, response);
		}

		//入力した値で計算を実行する
		int result = SampleEnzan.execute(sampleModel);
		sampleModel.setResult(result);

		//リクエストスコープに保存
		request.setAttribute("samplemodel", sampleModel);

		//計算結果に表示を指示
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/sampleReslut.jsp");
		dispatcher.forward(request, response);

	}

}

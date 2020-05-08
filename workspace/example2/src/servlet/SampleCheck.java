package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Calculator;
import controller.Validator;
import model.InputModel;
import model.OutputModel;

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
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("UTF-8");
		response.getWriter().append("Served at: ").append(request.getContextPath());

		//最初の入力を空文字にしてる
		OutputModel outputModel = new OutputModel();
		outputModel.setMessage("");
		request.setAttribute("model", outputModel);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/sample.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// パラメータの取得
		String number1 = request.getParameter("number1"); //入力１を取得
		String number2 = request.getParameter("number2"); //入力２を取得
		String enzan = request.getParameter("enzan"); //セレクトの四則演算を取得

		// 入力値を入力モデルに格納
		InputModel inputModel = new InputModel(number1, number2, enzan);
		OutputModel outputModel = new OutputModel();

		// 値のチェックを行う
		boolean err = Validator.check(inputModel, outputModel);

		// 計算を行う
		if (!err) { // エラー出なければ計算
			Calculator.calculate(inputModel, outputModel);
		}

		// 結果をjspに送信する
		//リクエストスコープに保存
		request.setAttribute("model", outputModel);

		//計算結果に表示を指示
		String forwardUrl = (!err ? "/WEB-INF/jsp/sampleReslut.jsp" : "/WEB-INF/jsp/sample.jsp");
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardUrl);
		dispatcher.forward(request, response);

		//		//エラーのチェック
		//		ErrorStatus ret = sampleModel.checkError();
		//
		//		if (ret.getId() != 0) {
		//			//リクエストスコープに保存
		//			request.setAttribute("message", ret.getMsg());
		//
		//			//計算結果に表示を指示
		//			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/sample.jsp");
		//			dispatcher.forward(request, response);
		//		}
		//
		//		//入力した値で計算を実行する
		//		int result = SampleEnzan.execute(sampleModel);
		//		sampleModel.setResult(result);

	}

}

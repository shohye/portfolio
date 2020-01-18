package ksmart.pentagon.mypage;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ksmart.pentagon.vo.BookInformation;
import ksmart.pentagon.vo.BookReport;

/**
 * @file BookReportController.java
 * @name BookReportController
 * @brief 독후감 관련 주소요청 처리
 * @author 최지혜
 */
@Controller
public class BookReportController {
	
	@Autowired private BookReportService bookReportService;
	
	/**
	 * @brief 독후감 공유 리스트
	 * @return /librarypage/bookReport/bookReportSearchList
	 * @author 최지혜
	 */
	@GetMapping("/lifrary/bookReportSearchList")
	public String bookReportSearchList(@RequestParam Map<String, Object> params
									   ,@RequestParam(value = "currentPage", required = false, defaultValue = "1") String currentPageStr
			                           ,HttpSession session, Model model) {

		String libNum = (String) session.getAttribute("LIBNUM");
		params.put("libNum", libNum);
	
		Map<String, Object> map = bookReportService.bookReportList(params, currentPageStr);

		model.addAttribute("bookReporList", map.get("bookReporList"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
		model.addAttribute("pageViewBlock", map.get("pageViewBlock"));
		model.addAttribute("pageViewArray", map.get("pageViewArray"));
		
		
		return "/librarypage/bookReport/bookReportSearchList";

	}
	
	@RequestMapping(value = "/lifrary/booKInfo", produces = "application/json")
	public @ResponseBody List<BookInformation> booKInfo(@RequestParam(value = "biName") String biName) {

		return bookReportService.booKInfo(biName);
	}
	/**
	 * @brief 마이페이지 내 독후감 리스트
	 * @return /librarypage/bookReport/myBookReportSearchList
	 * @author 최지혜
	 */
	@GetMapping("/lifrary/myBookReportSearchList")
	public String myBookReportSearchList(@RequestParam Map<String, Object> params
			   							 ,@RequestParam(value = "currentPage", required = false, defaultValue = "1") String currentPageStr
			   							 ,HttpSession session, Model model) {
		
		String libNum = (String) session.getAttribute("LIBNUM");
		String uId = (String) session.getAttribute("SID");
		params.put("libNum", libNum);
		params.put("uId", uId);
	
		Map<String, Object> map = bookReportService.myBookReportSearchList(params, currentPageStr);

		model.addAttribute("myReporList", map.get("myReporList"));
		model.addAttribute("currentPage", map.get("currentPage"));
		model.addAttribute("lastPage", map.get("lastPage"));
		model.addAttribute("startPageNum", map.get("startPageNum"));
		model.addAttribute("lastPageNum", map.get("lastPageNum"));
		model.addAttribute("pageViewBlock", map.get("pageViewBlock"));
		model.addAttribute("pageViewArray", map.get("pageViewArray"));

		return "/librarypage/bookReport/myBookReportSearchList";

	}

	/**
	 * @brief 독후감 등록 화면
	 * @return /librarypage/bookReport/bookReportInsert
	 * @author 최지혜
	 */
	@GetMapping("/lifrary/bookReportInsert")
	public String bookReportInsert() {

		return "/librarypage/bookReport/bookReportInsert";

	}
	@PostMapping("/lifrary/bookReportInsert")
	public String bookReportInsert(BookReport bookreport, HttpSession session) {
		String libNum = (String) session.getAttribute("LIBNUM");
		String uId = (String) session.getAttribute("SID");
		
		bookreport.setlCode(libNum);
		bookreport.setuId(uId);
		
		int result = bookReportService.bookReportInsert(bookreport);
		
		if(result == 1) {
			return "redirect:/lifrary/myBookReportSearchList";
		}else {
			return "/lifrary/bookReportInsert";
		}
		

	}

	/**
	 * @brief 독후감 상세
	 * @return /librarypage/bookReport/bookReportDetail
	 * @author 최지혜
	 */
	@GetMapping("/lifrary/bookReportDetail")
	public String bookReportDetail() {

		return "/librarypage/bookReport/bookReportDetail";

	}
}

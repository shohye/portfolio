package ksmart.pentagon.mypage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ksmart.pentagon.vo.Paging;

@Service
public class BookReportService {
	@Autowired private BookReportMapper bookReportMapper;
	
	public Map<String, Object> bookReportList(Map<String, Object> params, String currentPageStr) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		String svDate = (String) params.get("svDate");
		if(("all").equals(svDate)) {
			params.put("svDate", "");	
		}else if (("week").equals(svDate)) {
			cal.add(Calendar.DATE, -7);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("month").equals(svDate)) {
			cal.add(Calendar.MONTH, -1);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("6month").equals(svDate)) {
			cal.add(Calendar.MONTH, -6);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("year").equals(svDate)) {
			cal.add(Calendar.YEAR, -1);
			params.put("svDate", df.format(cal.getTime()));
		}

		int reportCnt = bookReportMapper.bookReportCnt(params);
		
		Paging paging = new Paging(reportCnt, currentPageStr);
		int currentPage = paging.getCurrentPage();
		int lastPage = paging.getLastPage();
		int startPageNum = paging.getStartPageNum();
		int lastPageNum = paging.getLastPageNum();

		int startRow = paging.getStartRow();
		int ROW_PER_PAGE = Paging.getRowPerPage();

		params.put("startRow", startRow);
		params.put("rowPerPage", ROW_PER_PAGE);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("bookReporList", bookReportMapper.bookReportList(params));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);

		return resultMap;
		
	}
public Map<String, Object> myBookReportSearchList(Map<String, Object> params, String currentPageStr) {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		String svDate = (String) params.get("svDate");
		if(("all").equals(svDate)) {
			params.put("svDate", "");	
		}else if (("week").equals(svDate)) {
			cal.add(Calendar.DATE, -7);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("month").equals(svDate)) {
			cal.add(Calendar.MONTH, -1);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("6month").equals(svDate)) {
			cal.add(Calendar.MONTH, -6);
			params.put("svDate", df.format(cal.getTime()));
		} else if (("year").equals(svDate)) {
			cal.add(Calendar.YEAR, -1);
			params.put("svDate", df.format(cal.getTime()));
		}

		String open = (String) params.get("open");
		if("all".equals(open)) {
			params.put("open", "");
		}
		
		int reportCnt = bookReportMapper.myBookReportCnt(params);
		
		Paging paging = new Paging(reportCnt, currentPageStr);
		int currentPage = paging.getCurrentPage();
		int lastPage = paging.getLastPage();
		int startPageNum = paging.getStartPageNum();
		int lastPageNum = paging.getLastPageNum();

		int startRow = paging.getStartRow();
		int ROW_PER_PAGE = Paging.getRowPerPage();

		params.put("startRow", startRow);
		params.put("rowPerPage", ROW_PER_PAGE);

		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("myReporList", bookReportMapper.myBookReportList(params));
		resultMap.put("currentPage", currentPage);
		resultMap.put("lastPage", lastPage);
		resultMap.put("startPageNum", startPageNum);
		resultMap.put("lastPageNum", lastPageNum);

		return resultMap;
		
	}
	

}
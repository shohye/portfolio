package ksmart.pentagon.mypage;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart.pentagon.vo.BookReport;

@Mapper
public interface BookReportMapper {
	
	//독후감리스트 카운트
	public int bookReportCnt(Map<String,Object> params);
	//독후감리스트
	public List<BookReport> bookReportList(Map<String,Object> params);
	//독후감리스트 카운트
	public int myBookReportCnt(Map<String,Object> params);
	//독후감리스트
	public List<BookReport> myBookReportList(Map<String,Object> params);
}

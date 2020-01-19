package ksmart.pentagon.mypage;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import ksmart.pentagon.vo.BoardComment;
import ksmart.pentagon.vo.BookInformation;
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
	//도서 정보
	public List<BookInformation> booKInfo(String biName);
	//독후감 등록
	public int bookReportInsert(BookReport bookreport);
	//독후감 조회수 증가
	public int viewUpdate(String bReportCode); 
	//독후감 상세
	public BookReport bookReportDetail(String bReportCode);
	//댓글 리스트
	public List<BoardComment> bookReportComment(String bReportCode);
	//독후감 정보
	public BookReport getBookReport(String bReportCode);
	//독후감 수정
	public int bookReportUpdate(BookReport bookreport);
	//독후감 삭제
	public int bookReportDelete(String bReportCode);
}

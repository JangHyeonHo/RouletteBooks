package dto;

import java.util.Date;

import command.SignUpCommand;
import command.TBoardWriteCommand;

public class TBoard {
  
	private int TNUM;
	private String TKIND;
	private String TSUBJECT;
	private String TCONTENT;
	private String TMETHOD;
	private String TSITUATION;
	private Date TREG_DATE;
	private String TBOOK_NAME;
	private String TBOOK_ORI_IMG_NAME;
	private String TBOOK_STORE_IMG_NAME;
	private int TPRICE;
	private String TBOOK_STATUS;
	private String TBOOK_GENRE;
	private Date TSTART_DATE;
	private String TDELIVERY_NUM;
	private String TDELIVERY_NAME;
	private Date TDELIVERY_NUM_DATE;
	private int TCHARGE;
	private String TBUYERADDR;
	
	
	
	public int getTNUM() {
		return TNUM;
	}
	public void setTNUM(int tNUM) {
		TNUM = tNUM;
	}
	public String getTKIND() {
		return TKIND;
	}
	public void setTKIND(String tKIND) {
		TKIND = tKIND;
	}
	public String getTSUBJECT() {
		return TSUBJECT;
	}
	public void setTSUBJECT(String tSUBJECT) {
		TSUBJECT = tSUBJECT;
	}
	public String getTCONTENT() {
		return TCONTENT;
	}
	public void setTCONTENT(String tCONTENT) {
		TCONTENT = tCONTENT;
	}
	public String getTMETHOD() {
		return TMETHOD;
	}
	public void setTMETHOD(String tMETHOD) {
		TMETHOD = tMETHOD;
	}
	public String getTSITUATION() {
		return TSITUATION;
	}
	public void setTSITUATION(String tSITUATION) {
		TSITUATION = tSITUATION;
	}
	public Date getTREG_DATE() {
		return TREG_DATE;
	}
	public void setTREG_DATE(Date tREG_DATE) {
		TREG_DATE = tREG_DATE;
	}
	public String getTBOOK_NAME() {
		return TBOOK_NAME;
	}
	public void setTBOOK_NAME(String tBOOK_NAME) {
		TBOOK_NAME = tBOOK_NAME;
	}
	public String getTBOOK_ORI_IMG_NAME() {
		return TBOOK_ORI_IMG_NAME;
	}
	public void setTBOOK_ORI_IMG_NAME(String tBOOK_ORI_IMG_NAME) {
		TBOOK_ORI_IMG_NAME = tBOOK_ORI_IMG_NAME;
	}
	public String getTBOOK_STORE_IMG_NAME() {
		return TBOOK_STORE_IMG_NAME;
	}
	public void setTBOOK_STORE_IMG_NAME(String tBOOK_STORE_IMG_NAME) {
		TBOOK_STORE_IMG_NAME = tBOOK_STORE_IMG_NAME;
	}
	public int getTPRICE() {
		return TPRICE;
	}
	public void setTPRICE(int tPRICE) {
		TPRICE = tPRICE;
	}
	public String getTBOOK_STATUS() {
		return TBOOK_STATUS;
	}
	public void setTBOOK_STATUS(String tBOOK_STATUS) {
		TBOOK_STATUS = tBOOK_STATUS;
	}
	public String getTBOOK_GENRE() {
		return TBOOK_GENRE;
	}
	public void setTBOOK_GENRE(String tBOOK_GENRE) {
		TBOOK_GENRE = tBOOK_GENRE;
	}
	public Date getTSTART_DATE() {
		return TSTART_DATE;
	}
	public void setTSTART_DATE(Date tSTART_DATE) {
		TSTART_DATE = tSTART_DATE;
	}
	public String getTDELIVERY_NUM() {
		return TDELIVERY_NUM;
	}
	public void setTDELIVERY_NUM(String tDELIVERY_NUM) {
		TDELIVERY_NUM = tDELIVERY_NUM;
	}
	public String getTDELIVERY_NAME() {
		return TDELIVERY_NAME;
	}
	public void setTDELIVERY_NAME(String tDELIVERY_NAME) {
		TDELIVERY_NAME = tDELIVERY_NAME;
	}
	public Date getTDELIVERY_NUM_DATE() {
		return TDELIVERY_NUM_DATE;
	}
	public void setTDELIVERY_NUM_DATE(Date tDELIVERY_NUM_DATE) {
		TDELIVERY_NUM_DATE = tDELIVERY_NUM_DATE;
	}
	public int getTCHARGE() {
		return TCHARGE;
	}
	public void setTCHARGE(int tCHARGE) {
		TCHARGE = tCHARGE;
	}
	public String getTBUYERADDR() {
		return TBUYERADDR;
	}
	public void setTBUYERADDR(String tBUYERADDR) {
		TBUYERADDR = tBUYERADDR;
	}
	
	public void DTOTEST() {
		System.out.println(TKIND);
		System.out.println(TSUBJECT);
		System.out.println(TCONTENT);
		System.out.println(TMETHOD);
		System.out.println(TBOOK_NAME);
		System.out.println(TPRICE);
		System.out.println(TBOOK_STATUS);
		System.out.println(TBOOK_GENRE);
		
	}
	
	
	
	
	public TBoard commandChange(TBoardWriteCommand command) {
		
		  TKIND = command.getTrade_board_horsehead();
		  TSUBJECT = command.getTrade_board_subject();
		  TCONTENT = command.getTextarea();
		  TMETHOD = command.getTrade_method();
		  TBOOK_NAME = command.getTrade_book_name();
//		  TBOOK_ORI_IMG_NAME
//		  TBOOK_STORE_IMG_NAME
		  TPRICE = command.getTrade_book_price();
		  TBOOK_STATUS = command.getTrade_book_status();
		  TBOOK_GENRE = command.getTrade_genre();


		  
		  return this;
		
	}
	
}

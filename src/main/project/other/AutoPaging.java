package other;

public class AutoPaging {
	
	private int page; //현재 페이지
	private int limit; //한 페이지에 쓸 게시글의 갯수7
	private int startPage; //현재 페이지에서 보이는 가장 처음 숫자(1 2 3 4 5 6 7 8 9 10 에서 1을 담당함)
	private int endPage; //현재 페이지에서 보이는 가장 마지막 숫자(11 12 13 14 15 16 17 18 19 20에서 20을 담당함)
	private int maxPage; //최종 페이지
	private int pageCount; //현재 페이지에서 보이는 처음 숫자와 마지막 숫자 사이의 숫자 개수 (1 2 3 4 5 6 7) => 7개
	private int listCount; //총 게시글의 갯수7
	
	//생성자 생성시 현재 페이지와 페이지의 개수, 페이지 사이의 개수를 받아오게 함.
	//예시 1~10까지 3페이지에서 불러오게 하고 싶고 개수는 한 페이지당 게시글 20개만 불러오고 싶을 때
	//AutoPaging paging = new AutoPaging(3,20,10);
	public AutoPaging(int page, int limit, int pageCount) {
		this.page = page;
		this.limit = limit;
		this.pageCount = pageCount;
		setAutoStartPage();
	}
	
	public int getPage() {
		return page;
	}
	public AutoPaging setPage(int page) {
		this.page = page;
		return this;
	}
	public int getLimit() {
		return limit;
	}
	public AutoPaging setLimit(int limit) {
		this.limit = limit;
		return this;
	}
	public int getStartPage() {
		return startPage;
	}
	public AutoPaging setStartPage(int startPage) {
		this.startPage = startPage;
		return this;
	}
	public int getEndPage() {
		return endPage;
	}
	public AutoPaging setEndPage(int endPage) {
		this.endPage = endPage;
		return this;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public AutoPaging setMaxPage(int maxPage) {
		this.maxPage = maxPage;
		return this;
	}
	public int getPageCount() {
		return pageCount;
	}
	public AutoPaging setPageCount(int pageCount) {
		this.pageCount = pageCount;
		return this;
	}
	public int getListCount() {
		return listCount;
	}
	//리스트 개수를 쿼리문에서 불러와서 여기에 저장시키면 끝
	public AutoPaging setListCount(int listCount) {
		this.listCount = listCount;
		return setAutoMaxPage();
	}
	
	//오토 페이징(StartPage후 자동으로 EndPage까지 해줌)
	public AutoPaging setAutoStartPage() {
		startPage = (int)(((double)page/pageCount)-0.05)+1;
		return setAutoEndPage();
	}
	public AutoPaging setAutoEndPage() {
		endPage = (startPage+pageCount-1);
		return this;
	}
	//ListCount이후 MaxPage까지 잡아줌
	private AutoPaging setAutoMaxPage() {
		// TODO Auto-generated method stub
		maxPage = (int)(((double)listCount/limit)+0.95);
		return endMaxisBig();
	}
	//MaxPage가 EndPage보다 작을 때
	private AutoPaging endMaxisBig() {
		// TODO Auto-generated method stub
		if(maxPage < endPage) {
			endPage = maxPage;
		}
		return this;
	}

	public void PagingTest() {
		AutoLinePrint.println("페이징 처리 확인","현재 페이지 번호 : " + page,
				"현재 페이지에 표시되는 게시글 갯수 : " + limit,
				"현재 페이지에서 표시되는 가장 첫 페이지 번호 : " + startPage,
				"현재 페이지에서 표시되는 가장 마지막 페이지 번호 : " + endPage,
				"최종 페이지 번호 : " + maxPage,
				"현재 페이지에 사용되고 있는 첫번호에서 마지막 번호까지의 번호 갯수 : " + pageCount,
				"검색한 모든 게시글의 갯수 : " + listCount);
	}
	
}

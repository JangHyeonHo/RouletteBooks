package command;

import other.AutoLinePrint;

public class FreeBoardListPageCommand {
	private String search;
	private String query;
	private int page;
	
	public String getSearch() {
		return search;
	}
	public FreeBoardListPageCommand setSearch(String search) {
		this.search = search;
		return this;
	}
	public String getQuery() {
		return query;
	}
	public FreeBoardListPageCommand setQuery(String query) {
		this.query = query;
		return this;
	}
	public int getPage() {
		return page;
	}
	public FreeBoardListPageCommand setPage(int page) {
		this.page = page;
		return this;
	}
	
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("멤버 리스트 커멘드", "무엇으로 찾기 : " + search,"질문 내용 : " + query, "페이지 수 : " + page);
	}
	
}

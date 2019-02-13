package command;

import other.AutoLinePrint;

public class MemberListPageCommand implements CommandTestInterface {
	
	private String searchSet;
	private String query;
	private int page;
	/*private String position;
	private String department;*/
	
	
	public String getSearchSet() {
		return searchSet;
	}
	public MemberListPageCommand setSearchSet(String searchSet) {
		this.searchSet = searchSet;
		return this;
	}
	public String getQuery() {
		return query;
	}
	public MemberListPageCommand setQuery(String query) {
		this.query = query;
		return this;
	}
	public int getPage() {
		return page;
	}
	public MemberListPageCommand setPage(int page) {
		this.page = page;
		return this;
	}
	/*public String getPosition() {
		return position;
	}
	public MemberListPageCommand setPosition(String position) {
		this.position = position;
		return this;
	}
	public String getDepartment() {
		return department;
	}
	public MemberListPageCommand setDepartment(String department) {
		this.department = department;
		return this;
	}
*/

	@Override
	public void CommandTest() {
		// TODO Auto-generated method stub
		AutoLinePrint.println("멤버 리스트 커멘드", "무엇으로 찾기 : " + searchSet,"질문 내용 : " + query, "페이지 수 : " + page);
	}

}

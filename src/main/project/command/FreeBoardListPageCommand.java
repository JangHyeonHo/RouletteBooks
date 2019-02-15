package command;

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
	
}

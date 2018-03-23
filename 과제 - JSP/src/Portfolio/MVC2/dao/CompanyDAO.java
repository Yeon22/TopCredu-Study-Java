package Portfolio.MVC2.dao;

public class CompanyDAO {
	private CompanyDAO() {}
	
	private static CompanyDAO instance = new CompanyDAO();
	
	public static CompanyDAO getInstance() {
		return instance;
	}
}

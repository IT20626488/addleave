package leaveaddd;

public class Customer {
	
	private String staffmid;
	private String name;
	private String leavetype;
	private String startdate;
	private String enddate;
	private String reason;
	private String assignamem;
	private String askapp;
	public Customer( String staffmid, String name, String leavetype, String startdate, String enddate,
			String reason, String assignamem, String askapp) {
		
		
		this.staffmid = staffmid;
		this.name = name;
		this.leavetype = leavetype;
		this.startdate = startdate;
		this.enddate = enddate;
		this.reason = reason;
		this.assignamem = assignamem;
		this.askapp = askapp;
	}
	
	
	public String getStaffmid() {
		return staffmid;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLeavetype() {
		return leavetype;
	}
	
	public String getStartdate() {
		return startdate;
	}
	
	public String getEnddate() {
		return enddate;
	}
	
	public String getReason() {
		return reason;
	}
	
	public String getAssignamem() {
		return assignamem;
	}
	
	public String getAskapp() {
		return askapp;
	}
	
	

}

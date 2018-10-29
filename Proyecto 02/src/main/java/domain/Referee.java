
package domain;

import java.util.List;

import javax.validation.Valid;

public class Referee extends Actor {

	private List<Report>	reports;
	private List<Complaint>	complaints;


	@Valid
	public List<Complaint> getComplaints() {
		return this.complaints;
	}

	@Valid
	public void setComplaints(final List<Complaint> complaints) {
		this.complaints = complaints;
	}

	@Valid
	public List<Report> getReports() {
		return this.reports;
	}

	@Valid
	public void setReports(final List<Report> reports) {
		this.reports = reports;
	}

}

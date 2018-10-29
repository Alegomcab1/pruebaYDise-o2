
package domain;

import java.util.List;

import javax.validation.Valid;

public class Referee extends Actor {

	private List<Report>	reports;


	@Valid
	public List<Report> getReports() {
		return this.reports;
	}

	@Valid
	public void setReports(final List<Report> reports) {
		this.reports = reports;
	}

}


package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class ProfessionalRecord extends DomainEntity {

	private String			nameCompany;
	private Date			startDate;
	private Date			endDate;
	private String			role;
	private String			url;
	private List<String>	comments;


	@NotBlank
	public String getNameCompany() {
		return this.nameCompany;
	}

	@NotBlank
	public void setNameCompany(final String nameCompany) {
		this.nameCompany = nameCompany;
	}

	@Past
	@NotNull
	public Date getStartDate() {
		return this.startDate;
	}

	@Past
	@NotNull
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@Past
	public Date getEndDate() {
		return this.endDate;
	}

	@Past
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

	@NotBlank
	public String getRole() {
		return this.role;
	}

	@NotBlank
	public void setRole(final String role) {
		this.role = role;
	}

	@URL
	public String getUrl() {
		return this.url;
	}

	@URL
	public void setUrl(final String url) {
		this.url = url;
	}

	@Valid
	public List<String> getComments() {
		return this.comments;
	}

	@Valid
	public void setComments(final List<String> comments) {
		this.comments = comments;
	}

}

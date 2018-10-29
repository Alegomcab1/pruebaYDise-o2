
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Complaint extends DomainEntity {

	private String			ticker;
	private Date			moment;
	private String			description;
	private List<String>	attachments;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	@NotBlank
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Past
	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	@Past
	@NotNull
	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	@NotBlank
	public void setDescription(final String description) {
		this.description = description;
	}

	@Valid
	public List<String> getAttachments() {
		return this.attachments;
	}

	@Valid
	public void setAttachments(final List<String> attachments) {
		this.attachments = attachments;
	}

}

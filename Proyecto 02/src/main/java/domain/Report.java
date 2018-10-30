
package domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Report extends DomainEntity {

	private Date			moment;
	private String			description;
	private List<String>	attachments;
	private List<Note>		notes;


	@Valid
	public List<Note> getNotes() {
		return this.notes;
	}

	@Valid
	public void setNotes(final List<Note> notes) {
		this.notes = notes;
	}

	@NotNull
	@Past
	public Date getMoment() {
		return this.moment;
	}

	@NotNull
	@Past
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

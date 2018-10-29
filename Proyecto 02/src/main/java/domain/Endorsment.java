
package domain;

import java.util.Collection;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Endorsment extends DomainEntity {

	private Date				moment;
	private Collection<String>	comments;
	private String				writtenBy;
	private String				writtenTo;


	public Endorsment() {
		super();
	}

	@Past
	@NotNull
	public Date getMoment() {
		return this.moment;
	}

	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@Valid
	public Collection<String> getComments() {
		return this.comments;
	}

	public void setComments(final Set<String> comments) {
		this.comments = comments;
	}

	@NotBlank
	public String getWrittenBy() {
		return this.writtenBy;
	}

	public void setWrittenBy(final String writtenBy) {
		this.writtenBy = writtenBy;
	}

	@NotBlank
	public String getWrittenTo() {
		return this.writtenTo;
	}

	public void setWrittenTo(final String writtenTo) {
		this.writtenTo = writtenTo;
	}

}

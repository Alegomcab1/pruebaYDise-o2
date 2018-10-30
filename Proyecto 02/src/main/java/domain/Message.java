
package domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.swing.Box;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Message {

	private Date			moment;
	private String			subject;
	private String			body;
	private Priority		priority;
	private List<String>	tags;
	private List<Box>		box;


	@Past
	public Date getMoment() {
		return this.moment;
	}

	@Past
	public void setMoment(final Date moment) {
		this.moment = moment;
	}

	@NotBlank
	public String getSubject() {
		return this.subject;
	}

	@NotBlank
	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@NotBlank
	public String getBody() {
		return this.body;
	}

	@NotBlank
	public void setBody(final String body) {
		this.body = body;
	}

	@NotNull
	public Priority getPriority() {
		return this.priority;
	}

	@NotNull
	public void setPriority(final Priority priority) {
		this.priority = priority;
	}

	@Valid
	public List<String> getTags() {
		return this.tags;
	}

	public void setTags(final List<String> tags) {
		this.tags = tags;
	}

	@Valid
	public List<Box> getBox() {
		return this.box;
	}

	@Valid
	public void setBox(final List<Box> box) {
		this.box = box;
	}

}

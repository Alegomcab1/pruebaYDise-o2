
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class MiscellaneousRecord extends DomainEntity {

	private String			title;
	private String			linkAttachement;
	private List<String>	comments;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}

	@URL
	public String getLinkAttachement() {
		return this.linkAttachement;
	}

	@URL
	public void setLinkAttachement(final String linkAttachement) {
		this.linkAttachement = linkAttachement;
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

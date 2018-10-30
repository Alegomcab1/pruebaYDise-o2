
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class EndorserRecord extends DomainEntity {

	private String			fullName;
	private String			email;
	private String			phoneNumber;
	private String			linkLinkedInProfile;
	private List<String>	comments;


	@NotBlank
	public String getFullName() {
		return this.fullName;
	}

	@NotBlank
	public void setFullName(final String fullName) {
		this.fullName = fullName;
	}

	@NotBlank
	@Email
	public String getEmail() {
		return this.email;
	}

	@NotBlank
	@Email
	public void setEmail(final String email) {
		this.email = email;
	}

	@NotBlank
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@NotBlank
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@NotBlank
	@URL
	public String getLinkLinkedInProfile() {
		return this.linkLinkedInProfile;
	}

	@NotBlank
	@URL
	public void setLinkLinkedInProfile(final String linkLinkedInProfile) {
		this.linkLinkedInProfile = linkLinkedInProfile;
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

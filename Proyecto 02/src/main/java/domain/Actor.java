
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Actor extends DomainEntity {

	private String				name;
	private String				middleName;
	private String				surname;
	private String				photo;
	private String				email;
	private String				phoneNumber;
	private String				address;
	private List<SocialProfile>	socialProfiles;
	private List<Box>			boxes;


	@Valid
	public List<Box> getBoxes() {
		return this.boxes;
	}

	@Valid
	public void setBoxes(final List<Box> boxes) {
		this.boxes = boxes;
	}

	@Valid
	public List<SocialProfile> getSocialProfiles() {
		return this.socialProfiles;
	}

	@Valid
	public void setSocialProfiles(final List<SocialProfile> socialProfiles) {
		this.socialProfiles = socialProfiles;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	@NotBlank
	public void setName(final String name) {
		this.name = name;
	}

	@Valid
	public String getMiddleName() {
		return this.middleName;
	}
	@Valid
	public void setMiddleName(final String middleName) {
		this.middleName = middleName;
	}

	@NotBlank
	public String getSurname() {
		return this.surname;
	}

	@NotBlank
	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@URL
	public String getPhoto() {
		return this.photo;
	}

	@URL
	public void setPhoto(final String photo) {
		this.photo = photo;
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

	@Valid
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	@Valid
	public void setPhoneNumber(final String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Valid
	public String getAddress() {
		return this.address;
	}

	@Valid
	public void setAddress(final String address) {
		this.address = address;
	}

}


package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Sponsorship {

	private String			bannerUrl;
	private String			link;
	private List<Tutorial>	tutoriales;


	@URL
	@NotBlank
	public String getBannerUrl() {
		return this.bannerUrl;
	}

	@URL
	@NotBlank
	public void setBannerUrl(final String bannerUrl) {
		this.bannerUrl = bannerUrl;
	}

	@URL
	@NotBlank
	public String getLink() {
		return this.link;
	}

	@URL
	@NotBlank
	public void setLink(final String link) {
		this.link = link;
	}

	@Valid
	public List<Tutorial> getTutoriales() {
		return this.tutoriales;
	}

	@Valid
	public void setTutoriales(final List<Tutorial> tutoriales) {
		this.tutoriales = tutoriales;
	}

}

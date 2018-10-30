
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Warranty extends DomainEntity {

	private String			title;
	private List<String>	terms;
	private List<String>	laws;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}

	@Valid
	public List<String> getTerms() {
		return this.terms;
	}

	@Valid
	public void setTerms(final List<String> terms) {
		this.terms = terms;
	}

	@Valid
	public List<String> getLaws() {
		return this.laws;
	}

	@Valid
	public void setLaws(final List<String> laws) {
		this.laws = laws;
	}

}

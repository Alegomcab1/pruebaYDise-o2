
package domain;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class HadnyWorker extends Endorser {

	private String	make;


	@NotBlank
	@Valid
	public String getMake() {
		return this.make;
	}

	@NotBlank
	@Valid
	public void setMake(final String make) {
		this.make = make;
	}

}

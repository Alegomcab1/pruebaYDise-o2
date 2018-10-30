
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class Curriculum extends DomainEntity {

	private String						ticker;
	private List<EndorserRecord>		endorserRecords;
	private List<MiscellaneousRecord>	miscellaneousRecords;
	private List<EducationRecord>		educationRecords;
	private List<ProfessionalRecord>	professionalRecords;
	private PersonalRecord				personalRecords;


	@NotBlank
	public String getTicker() {
		return this.ticker;
	}

	@NotBlank
	public void setTicker(final String ticker) {
		this.ticker = ticker;
	}

	@Valid
	public List<EndorserRecord> getEndorserRecords() {
		return this.endorserRecords;
	}

	@Valid
	public void setEndorserRecords(final List<EndorserRecord> endorserRecords) {
		this.endorserRecords = endorserRecords;
	}

	@Valid
	public List<MiscellaneousRecord> getMiscellaneousRecords() {
		return this.miscellaneousRecords;
	}

	@Valid
	public void setMiscellaneousRecords(final List<MiscellaneousRecord> miscellaneousRecords) {
		this.miscellaneousRecords = miscellaneousRecords;
	}

	@Valid
	public List<EducationRecord> getEducationRecords() {
		return this.educationRecords;
	}

	@Valid
	public void setEducationRecords(final List<EducationRecord> educationRecords) {
		this.educationRecords = educationRecords;
	}

	@Valid
	public List<ProfessionalRecord> getProfessionalRecords() {
		return this.professionalRecords;
	}

	@Valid
	public void setProfessionalRecords(final List<ProfessionalRecord> professionalRecords) {
		this.professionalRecords = professionalRecords;
	}

	@NotBlank
	public PersonalRecord getPersonalRecords() {
		return this.personalRecords;
	}

	@NotBlank
	public void setPersonalRecords(final PersonalRecord personalRecords) {
		this.personalRecords = personalRecords;
	}

}

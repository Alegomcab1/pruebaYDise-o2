
package domain;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.xml.datatype.Duration;

import org.hibernate.validator.constraints.NotBlank;

@Entity
public class FixUpTask extends DomainEntity {

	public FixUpTask() {

	}


	private String					ticket;
	private Date					momentPublished;
	private String					description;
	private String					address;
	private double					maxPrice;
	private Duration				realizationTime;

	private Collection<Category>	categories;
	private Collection<Phase>		phases;
	private Collection<Warranty>	warranties;
	private Collection<Complaint>	complaints;		//opt


	@NotBlank
	@Pattern(regexp = "yymmdd_xxxxxx")
	public String getTicket() {
		return this.ticket;
	}

	public void setTicket(final String ticket) {
		this.ticket = ticket;
	}

	@NotNull
	public Date getMomentPublished() {
		return this.momentPublished;
	}

	public void setMomentPublished(final Date momentPublished) {
		this.momentPublished = momentPublished;
	}

	@NotBlank
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	@NotBlank
	public String getAddress() {
		return this.address;
	}

	public void setAddress(final String address) {
		this.address = address;
	}

	@NotNull
	@Min(0)
	@Digits(fraction = 2, integer = 7)
	public double getMaxPrice() {
		return this.maxPrice;
	}

	public void setMaxPrice(final double maxPrice) {
		this.maxPrice = maxPrice;
	}

	@NotNull
	public Duration getRealizationTime() {
		return this.realizationTime;
	}

	public void setRealizationTime(final Duration realizationTime) {
		this.realizationTime = realizationTime;
	}

	@Valid
	public Collection<Category> getCategories() {
		return this.categories;
	}

	public void setCategories(final List<Category> categories) {
		this.categories = categories;
	}

	@Valid
	public Collection<Phase> getPhases() {
		return this.phases;
	}

	public void setPhases(final List<Phase> phases) {
		this.phases = phases;
	}

	@Valid
	public Collection<Warranty> getWarranties() {
		return this.warranties;
	}

	public void setWarranties(final List<Warranty> warranties) {
		this.warranties = warranties;
	}

	@Valid
	public Collection<Complaint> getComplaints() {
		return this.complaints;
	}

	public void setComplaints(final Set<Complaint> complaints) {
		this.complaints = complaints;
	}

}

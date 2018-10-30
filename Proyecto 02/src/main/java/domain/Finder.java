
package domain;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;

public class Finder {

	private String		keyWord;
	private Category	category;
	private Warranty	warranty;
	private double		minPrice;
	private double		maxPrice;
	private Date		startDate;
	private Date		endDate;
	private long		prueba;


	@Valid
	@NotBlank
	public String getKeyWord() {
		return this.keyWord;
	}

	@Valid
	@NotBlank
	public void setKeyWord(final String keyWord) {
		this.keyWord = keyWord;
	}

	@Valid
	@NotNull
	public Category getCategory() {
		return this.category;
	}

	@Valid
	@NotNull
	public void setCategory(final Category category) {
		this.category = category;
	}

	@Valid
	@NotNull
	public Warranty getWarranty() {
		return this.warranty;
	}

	@Valid
	@NotNull
	public void setWarranty(final Warranty warranty) {
		this.warranty = warranty;
	}

	@Valid
	@NotNull
	@Min(0)
	@Digits(fraction = 2, integer = 9)
	public double getMinPrice() {
		return this.minPrice;
	}

	@Valid
	@NotNull
	@Min(0)
	@Digits(fraction = 2, integer = 9)
	public void setMinPrice(final double minPrice) {
		this.minPrice = minPrice;
	}

	@Valid
	@NotNull
	@Digits(fraction = 2, integer = 9)
	public double getMaxPrice() {
		return this.maxPrice;
	}

	@Valid
	@NotNull
	@Digits(fraction = 2, integer = 9)
	public void setMaxPrice(final double maxPrice) {
		if (maxPrice >= this.minPrice)
			this.maxPrice = maxPrice;
	}

	@Past
	@Valid
	@NotNull
	public Date getStartDate() {
		return this.startDate;
	}

	@Past
	@Valid
	@NotNull
	public void setStartDate(final Date startDate) {
		this.startDate = startDate;
	}

	@Valid
	@NotNull
	public Date getEndDate() {
		return this.endDate;
	}

	@Valid
	@NotNull
	public void setEndDate(final Date endDate) {
		this.endDate = endDate;
	}

}


package domain;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

public class Section extends DomainEntity {

	private String			title;
	private String			text;
	private List<String>	pictures;
	private int				number;


	@NotBlank
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
	}

	@NotBlank
	public String getText() {
		return this.text;
	}

	@NotBlank
	public void setText(final String text) {
		this.text = text;
	}

	@URL
	public List<String> getPictures() {
		return this.pictures;
	}

	@URL
	public void setPictures(final List<String> pictures) {
		this.pictures = pictures;
	}

	@NotNull
	@Min(0)
	public int getNumber() {
		return this.number;
	}

	@NotNull
	@Min(0)
	public void setNumber(final int number) {
		this.number = number;
	}

}

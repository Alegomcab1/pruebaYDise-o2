
package domain;

import java.util.List;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
public class Section {

	private String			sectionTitle;
	private String			text;
	private List<String>	sectionPictures;
	private int				number;


	@NotBlank
	public String getSectionTitle() {
		return this.sectionTitle;
	}

	@NotBlank
	public void setSectionTitle(final String sectionTitle) {
		this.sectionTitle = sectionTitle;
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
	public List<String> getSectionPictures() {
		return this.sectionPictures;
	}

	@URL
	public void setSectionPictures(final List<String> sectionPictures) {
		this.sectionPictures = sectionPictures;
	}

	@NotNull
	public int getNumber() {
		return this.number;
	}

	@NotNull
	public void setNumber(final int number) {
		this.number = number;
	}

}

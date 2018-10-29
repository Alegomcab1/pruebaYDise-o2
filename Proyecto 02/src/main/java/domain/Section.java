
package domain;

import java.util.List;

<<<<<<< HEAD
import javax.persistence.Entity;
=======
import javax.validation.constraints.Min;
>>>>>>> 0cb384a603f914f79f7964aeb6270b511b5f2d53
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

<<<<<<< HEAD
@Entity
public class Section {

	private String			sectionTitle;
	private String			text;
	private List<String>	sectionPictures;
=======
public class Section extends DomainEntity {

	private String			title;
	private String			text;
	private List<String>	pictures;
>>>>>>> 0cb384a603f914f79f7964aeb6270b511b5f2d53
	private int				number;


	@NotBlank
<<<<<<< HEAD
	public String getSectionTitle() {
		return this.sectionTitle;
	}

	@NotBlank
	public void setSectionTitle(final String sectionTitle) {
		this.sectionTitle = sectionTitle;
=======
	public String getTitle() {
		return this.title;
	}

	@NotBlank
	public void setTitle(final String title) {
		this.title = title;
>>>>>>> 0cb384a603f914f79f7964aeb6270b511b5f2d53
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
<<<<<<< HEAD
	public List<String> getSectionPictures() {
		return this.sectionPictures;
	}

	@URL
	public void setSectionPictures(final List<String> sectionPictures) {
		this.sectionPictures = sectionPictures;
	}

	@NotNull
=======
	public List<String> getPictures() {
		return this.pictures;
	}

	@URL
	public void setPictures(final List<String> pictures) {
		this.pictures = pictures;
	}

	@NotNull
	@Min(0)
>>>>>>> 0cb384a603f914f79f7964aeb6270b511b5f2d53
	public int getNumber() {
		return this.number;
	}

	@NotNull
<<<<<<< HEAD
=======
	@Min(0)
>>>>>>> 0cb384a603f914f79f7964aeb6270b511b5f2d53
	public void setNumber(final int number) {
		this.number = number;
	}

}

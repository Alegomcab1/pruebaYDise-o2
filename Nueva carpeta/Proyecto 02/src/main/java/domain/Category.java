
package domain;

import java.util.List;

import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

public class Category extends Actor {

	private List<Category>	subCategorys;
	private String			name;


	@Valid
	public List<Category> getSubCategorys() {
		return this.subCategorys;
	}

	@Valid
	public void setSubCategorys(final List<Category> subCategorys) {
		this.subCategorys = subCategorys;
	}

	@NotBlank
	public String getName() {
		return this.name;
	}

	@NotBlank
	public void setName(final String name) {
		this.name = name;
	}

}

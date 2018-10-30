
package domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class Endorser extends Actor {

	private Score	score;


	@Valid
	@NotNull
	public Score getScore() {
		return this.score;
	}

	@Valid
	@NotNull
	public void setScore(final Score score) {
		this.score = score;
	}

}

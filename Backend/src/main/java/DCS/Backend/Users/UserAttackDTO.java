package DCS.Backend.Users;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class UserAttackDTO {
	@NotNull
	@Min(1)
	Long attackerId, victimId;

	public UserAttackDTO(@NotNull @Min(1) Long attackerId, @NotNull @Min(1) Long victimId) {
		super();
		this.attackerId = attackerId;
		this.victimId = victimId;
	}

	public Long getAttackerId() {
		return attackerId;
	}

	public void setAttackerId(Long attackerId) {
		this.attackerId = attackerId;
	}

	public Long getVictimId() {
		return victimId;
	}

	public void setVictimId(Long victimId) {
		this.victimId = victimId;
	}

}

package BackendApplication.SpringBackend;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CreateDTO {
	@NotBlank
	String name, element;

	@NotNull
	@Min(50)
	Integer hp;

	@NotNull
	@Min(5)
	Integer attackPower;

	public CreateDTO(@NotBlank String name, @NotBlank String element, @NotNull @Min(50) Integer hp,
			@NotNull @Min(5) Integer attackPower) {
		this.name = name;
		this.element = element;
		this.hp = hp;
		this.attackPower = attackPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public Integer getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(Integer attackPower) {
		this.attackPower = attackPower;
	}
}

// Source: Alex Pokemon Spring course
// https://github.com/nology-tech/mexico-consultancy/blob/main/code-alongs/spring/mexicospringfull/src/main/java/io/noloy/mexicospringfull/pokemon/PokemonCreateDTO.java

package DCS.Backend.Users;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column
	String name;
	@Column
	String element;
	@Column
	Integer level;
	@Column
	Integer hp;
	@Column
	Integer attackPower;
	@Column
	Integer remainingHp;

	public User() {

	}

	public User(String name, String element, Integer hp, Integer attackPower) {
		this.name = name;
		this.element = element;
		this.hp = hp;
		this.attackPower = attackPower;
		this.level = 1;
		this.remainingHp = hp;
	}

	public Integer getRemainingHp() {
		return remainingHp;
	}

	public void setRemainingHp(Integer remainingHp) {
		this.remainingHp = remainingHp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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

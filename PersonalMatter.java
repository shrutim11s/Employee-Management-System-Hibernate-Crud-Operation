import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PersonalMatter {

	
	@Id
	int id;
	String FirstName;
	String LastName;
	String BirthDate;
	String Gender;
	
	public PersonalMatter() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public PersonalMatter(int id, String firstName, String lastName, String birthDate, String gender) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		BirthDate = birthDate;
		Gender = gender;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	
	@Override
	public String toString() {
		return "PersonalMatter [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", BirthDate="
				+ BirthDate + ", Gender=" + Gender + "]";
	}
	
	
	
}


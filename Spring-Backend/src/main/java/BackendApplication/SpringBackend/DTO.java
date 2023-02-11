package BackendApplication.SpringBackend;

import org.springframework.data.annotation.Id;

public class DTO {

	public DTO () {
		
	}
	

    public DTO(String description, String details, boolean done) {
        this.description = description;
        this.details = details;
        this.done = done;
    }

    @Id
    private Long id;

    private String description;

    private String details;

    private boolean done;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
	
}


// Source: https://github.com/Azure-Samples/quickstart-spring-data-jdbc-sql-server/blob/master/src/main/java/com/example/demo/Todo.java
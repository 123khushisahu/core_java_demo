package rahul_oops;

public class Person {
	  private String name; // private = restricted access
	  public String cast;

	  public String getCast() {
		return cast;
	}

	  public void setCast(String cast) {
		  this.cast = cast;
	  }

	  // Getter
	 public String getName() {
	    return name;
	  }

	  // Setter
	  public void setName(String newName) {
	    this.name = newName;
	  }
	}


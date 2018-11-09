package hello.model;

public class User {
	private String username;
	private String fullName;

	public User(String username, String fullName) {
		this.username = username;
		this.fullName = fullName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getUsername() {
		return username;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return String.format("[User: ] Username: %s, FullName: %s", username, fullName);
	}
}

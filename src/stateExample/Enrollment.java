package stateExample;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
	private List<Subject> subjects;
	
	public Enrollment() {
		this.subjects = new ArrayList<Subject>();
	}
	
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
	
	public void removeSubject(Subject subject) {
		subjects.remove(subject);
	}
	
	public Double getTotalCost() {
		return subjects.stream().mapToDouble(subject -> subject.getCost())
				.sum();
				
	}
	
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("** ENROLLMENT **\n");
		subjects.forEach(subject -> stringBuilder.append(" - " + subject.toString() + " €\n"));
		stringBuilder.append("Total cost: ");
		stringBuilder.append(this.getTotalCost());
		stringBuilder.append(" €");
		return stringBuilder.toString();
	}
}

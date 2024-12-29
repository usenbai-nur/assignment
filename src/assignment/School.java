package assignment;

import java.util.*;

public class School {
    private List<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    @Override
    public String toString() {
        members.sort(Comparator.comparing(Object::toString));
        StringBuilder sb = new StringBuilder();
        for (Person member : members) {
            sb.append(member.toString()).append("\\n");
        }
        return sb.toString();
    }
}

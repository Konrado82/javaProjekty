package example.org;

import java.util.List;

public record User(String name, int age, List<String>skills, boolean isActive) {
}

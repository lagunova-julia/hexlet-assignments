package exercise.dto.users;

import exercise.model.User;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

// BEGIN
@AllArgsConstructor
@Getter
public final class UsersPage {
    private List<User> users;
    private String term;

    public UsersPage(List<User> users) {
        this.users = users;
    }
}
// END

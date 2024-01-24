package by.academy.lesson14;

import java.util.Objects;

public class BadDog {

    private String nickname;

    public BadDog(String nickname) {
        this.nickname = nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BadDog badDog = (BadDog) o;

        return Objects.equals(nickname, badDog.nickname);
    }

    @Override
    public int hashCode() {
        return nickname != null ? nickname.hashCode() : 0;
    }
}

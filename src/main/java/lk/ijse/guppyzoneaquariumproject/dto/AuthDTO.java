package lk.ijse.guppyzoneaquariumproject.dto;

import org.springframework.stereotype.Component;


@Component
public class AuthDTO {
    private String username;
    private String token;

    public AuthDTO() {
    }

    public AuthDTO(String username, String token) {
        this.username = username;
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "AuthDTO{" +
                "username='" + username + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
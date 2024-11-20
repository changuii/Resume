package dev.portfolio.portfolio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Getter;

@Getter
public class UserDTO {
    @JsonProperty("name")
    private final String name;
    @JsonProperty("githubLink")
    private final String githubLink;
    @JsonProperty("blogLink")
    private final String blogLink;
    @JsonProperty("emailLink")
    private final String emailLink;
    @JsonProperty("introductions")
    private final List<String> introductions;

    public UserDTO(@JsonProperty("name") final String name, @JsonProperty("githubLink") final String githubLink,
                   @JsonProperty("blogLink") final String blogLink, @JsonProperty("emailLink") final String emailLink,
                   @JsonProperty("introductions") final List<String> introductions) {
        this.name = name;
        this.githubLink = githubLink;
        this.blogLink = blogLink;
        this.emailLink = emailLink;
        this.introductions = introductions;
    }

    public static UserDTO of(final String name, final String githubLink, final String blogLink, final String emailLink,
                             final List<String> introductions) {
        return new UserDTO(name, githubLink, blogLink, emailLink, introductions);
    }
}

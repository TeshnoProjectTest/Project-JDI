package io.github.epam.data;

import io.github.com.search.Result;

public class ListData {
    public static Result CORRECT = new Result().set(r -> {
        r.name = "JDI SKYPE";
        r.description = "JDI Skype group with active JDI users";
        r.link = "Join Skype group";
    });

    public static Result CORRECT_2 = new Result().set(r -> {
        r.name = "JDI VK GROUP";
        r.description = "Russian Community VK group";
        r.link = "Visit Group";
    });

    public static Result CORRECT_3 = new Result().set(r -> {
        r.name = "JDI YOUTUBE CHANNEL";
        r.description = "JDI Tutorial Official Youtube";
        r.link = "Visit Channel";
    });

    public static Result WRONG = new Result().set(r -> {
        r.name = "Missing someone?";
        r.description = "Let us know!";
        r.link = "Write email";
    });

    public static Result WRONG_2 = new Result().set(r -> {
        r.name = "JDI Changed";
        r.description = "Now we have new adress, check it out";
        r.link = "Check adress";
    });
}

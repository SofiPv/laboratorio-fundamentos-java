package dev.sofipv.fundamentos.common;

import java.util.Scanner;

public class ExerciseOption {
    private final String category;
    private final String title;
    private final String description;
    private final ExerciseAction action;

    public ExerciseOption(String category, String title, String description, ExerciseAction action) {
        this.category = category;
        this.title = title;
        this.description = description;
        this.action = action;
    }

    public String getCategory() {
        return category;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void run(Scanner scanner) {
        action.run(scanner);
    }

    @FunctionalInterface
    public interface ExerciseAction {
        void run(Scanner scanner);
    }
}

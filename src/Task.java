class Task {

    String title;
    String description;
    boolean isCompleted;

    public Task(String title, String description, boolean isCompleted) {
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public String toString() {
        return "название: " + title + "  описание: " + description + " статус выполнения: " + isCompleted;
    }

}

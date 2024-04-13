package app;

public enum Color {
    WHITE("білий"),
    BLACK("чорний"),
    RED("червоний"),
    BLUE("синій"),
    GRAY("сірий");

    public final String name;

    Color(String name) {
        this.name = name;
    }
}

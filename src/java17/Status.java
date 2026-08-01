package java17;

public enum Status {

    SUCCESS("SUCCESS"),
    FAILED("FAILED");
    private final String value;

    Status(String value) {
        this.value = value;
    }
}

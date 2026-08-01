package java17;

/**
 *
 *  we can perform validation as usual
 *
 *  public record StudentRecord(@NotBlank int id, @NotBlank @Min(value=5) String name) {
 * }
 *
 */
public record StudentRecord(int id, String name) {
}

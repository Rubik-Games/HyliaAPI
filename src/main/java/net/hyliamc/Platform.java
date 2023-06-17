package net.hyliamc;

/**
 * <p>
 * @author joshy56
 * @since 16/6/2023
 * </p>
 */
public interface Platform extends Identifiable{
    /**
     * Gives version of this platform.
     * <p>Why string? Well exists many forms or patterns of versioning.
     * <p>- Ex. 1 (Traditional): {@code 1.0.0} or {@code Major.Minor.BugFixes}
     * <p>- Ex. 2: {@code 1.0.0-SNAPSHOT} or {@code Major.Minor.BugFixes-ReleaseStage}
     * @return {@link String} - Version of this platform.
     */
    String version();
}

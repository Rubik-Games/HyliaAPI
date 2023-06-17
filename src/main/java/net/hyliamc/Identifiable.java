package net.hyliamc;

import java.util.Optional;
import java.util.UUID;

/**
 * Identifiable class aims to identify in many ways.
 * <p>For example a Player.
 * <p>
 * @author joshy56
 * @since 17/6/2023
 * </p>
 */
public interface Identifiable {
    /**
     * Gives a name that identify this, maybe be unique.
     * <p>For a secure way to unique identify this, see {@link #uniqueId()}
     * @return {@link String} - Name of this.
     */
    String name();

    /**
     * Gives a no formal name that identify this, maybe be unique.
     * <p>For a secure way to identify this, see {@link #uniqueId()}
     * @return {@link String} - Friendly name of this.
     */
    Optional<String> friendlyName();

    /**
     * Gives a unique identifier that identify this.
     * @return {@link UUID} - Unique identifier.
     */
    UUID uniqueId();
}

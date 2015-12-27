package @@moduleName@@;


public class @@name@@ {

    private final String id;

    public @@name@@(
        @Nonnull String id
    ) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Overrides
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Overrides
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Overrides
    public boolean equals(Object o) {
        return EqualsBuilder.reflectionEquals(this, o);
    }

}

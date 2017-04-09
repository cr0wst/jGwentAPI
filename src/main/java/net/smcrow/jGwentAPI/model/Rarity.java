package net.smcrow.jGwentAPI.model;

/**
 * Rarity Model.
 * @author Steve Crow (steve@smcrow.net)
 */
public class Rarity {
    //TODO: Consider making this an enum
    private String name;
    private String href;
    private String uuid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}

package net.smcrow.jGwentAPI.model;

/**
 * Variation Model
 * @author Steve Crow (steve@smcrow.net)
 */
public class Variation {
    // TODO: Consider making this an Enum
    private String availability;
    private Cost craft;
    private Cost mill;
    private Rarity rarity;
    private String uuid;
    private String href;

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public Cost getCraft() {
        return craft;
    }

    public void setCraft(Cost craft) {
        this.craft = craft;
    }

    public Cost getMill() {
        return mill;
    }

    public void setMill(Cost mill) {
        this.mill = mill;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}

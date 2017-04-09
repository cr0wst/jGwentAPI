package net.smcrow.jGwentAPI.model;

import com.google.gson.annotations.SerializedName;

/**
 * Enum which represents the card's position on the playfield.
 * @author Steve Crow (steve@smcrow.net)
 */
public enum Position {
    @SerializedName("Siege")
    SIEGE,
    @SerializedName("Melee")
    MELEE,
    @SerializedName("Ranged")
    RANGED,
    @SerializedName("Event")
    EVENT
}

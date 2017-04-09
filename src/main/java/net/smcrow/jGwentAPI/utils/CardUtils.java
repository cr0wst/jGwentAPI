package net.smcrow.jGwentAPI.utils;

/**
 * Utility class for working with card results.
 * @author Steve Crow (steve@smcrow.net)
 */
public class CardUtils {
    /**
     * Get the UUID at the end of the URL coming back from the API.
     * @param url The URL to get the UUID from.
     * @return The resulting UUID.
     */
    public static String getUuidFromUrl(String url) {
        return url.substring(url.lastIndexOf("/") + 1, url.length());
    }
}

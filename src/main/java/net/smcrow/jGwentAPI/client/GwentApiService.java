package net.smcrow.jGwentAPI.client;

import net.smcrow.jGwentAPI.model.*;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * Retrofit Interface for the API
 * @author Steve Crow (steve@smcrow.net)
 */
public interface GwentApiService {

    // Card Endpoints
    @GET("cards")
    Call<CardResults> getCards();

    @GET("cards")
    Call<CardResults> getCards(@Query("limit") int limit, @Query("offset") int offset);

    @GET("cards/{cardID}")
    Call<Card> getCard(@Path("cardID") String cardId);

    @GET("cards")
    Call<CardResults> getCardsByName(@Query("name") String name);

    @GET("cards/{cardID}/variations")
    Call<List<Variation>> getCardVariation(@Path("cardID") String cardId);

    @GET("cards/{cardID}/variations/{variationID}")
    Call<Variation> getCardVariation(@Path("cardID") String cardId, @Path("variationID") String variationId);

    @GET("cards/leaders")
    Call<List<Card>> getCardLeaders();

    //TODO: Missing /cards/factions, not sure if that's an active endpoint anymore.

    // Category Endpoints
    @GET("categories")
    Call<List<Category>> getCategories();

    @GET("categories/{categoryID}")
    Call<Category> getCategory(@Path("categoryID") String categoryId);

    // Group Endpoints
    @GET("groups")
    Call<List<Group>> getGroups();

    @GET("groups/{groupID}")
    Call<Group> getGroup(@Path("groupID") String groupId);

    // Rarity Endpoints
    @GET("rarities")
    Call<List<Rarity>> getRarities();

    @GET("rarities/{rarityID}")
    Call<Rarity> getRarity(@Path("rarityID") String rarityId);

    @GET("factions/")
    Call<List<Faction>> getFactions();

    @GET("factions/{factionID}")
    Call<Faction> getFaction(@Path("factionID") String factionId);
}

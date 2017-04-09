package net.smcrow.jGwentAPI.client;

import net.smcrow.jGwentAPI.model.*;

import java.util.List;

/**
 * Interface for the GwentApi and the available methods for the client.
 * @author Steve Crow (steve@smcrow.net)
 */
public interface GwentApi {
    // Lists
    CardResults getCardList();

    CardResults getCardList(int limit, int offset);

    CardResults getCardListByName(String name);

    List<Variation> getCardVariationList(String cardId);

    List<Card> getLeaderList();

    List<Category> getCategoryList();

    List<Group> getGroupList();

    List<Rarity> getRarityList();

    List<Faction> getFactionList();

    // Single Results
    Card getCard(String cardId);

    Variation getCardVariation(String cardId, String variationId);

    Category getCategory(String categoryId);

    Group getGroup(String groupId);

    Rarity getRarity(String rarityId);
}

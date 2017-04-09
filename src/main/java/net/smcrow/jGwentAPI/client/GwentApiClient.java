package net.smcrow.jGwentAPI.client;

import com.google.gson.GsonBuilder;
import net.smcrow.jGwentAPI.model.*;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Steve Crow (steve@smcrow.net)
 */
public class GwentApiClient implements GwentApi {
    private static final String BASE_URL = "https://api.gwentapi.com/v0/";

    private static final GwentApiService GWENT_API_SERVICE = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
            .build()
            .create(GwentApiService.class);

    @Override
    public CardResults getCardList() {
        try {
            return GWENT_API_SERVICE.getCards().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public CardResults getCardList(int limit, int offset) {
        try {
            return GWENT_API_SERVICE.getCards(limit, offset).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public CardResults getCardListByName(String name) {
        try {
            return GWENT_API_SERVICE.getCardsByName(name).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Variation> getCardVariationList(String cardId) {
        try {
            return GWENT_API_SERVICE.getCardVariation(cardId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public List<Card> getLeaderList() {
        try {
            return GWENT_API_SERVICE.getCardLeaders().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public List<Category> getCategoryList() {
        try {
            return GWENT_API_SERVICE.getCategories().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public List<Group> getGroupList() {
        try {
            return GWENT_API_SERVICE.getGroups().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public List<Rarity> getRarityList() {
        try {
            return GWENT_API_SERVICE.getRarities().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public List<Faction> getFactionList() {
        try {
            return GWENT_API_SERVICE.getFactions().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    @Override
    public Card getCard(String cardId) {
        try {
            return GWENT_API_SERVICE.getCard(cardId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Variation getCardVariation(String cardId, String variationId) {
        try {
            return GWENT_API_SERVICE.getCardVariation(cardId, variationId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Category getCategory(String categoryId) {
        try {
            return GWENT_API_SERVICE.getCategory(categoryId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Group getGroup(String groupId) {
        try {
            return GWENT_API_SERVICE.getGroup(groupId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Rarity getRarity(String rarityId) {
        try {
            return GWENT_API_SERVICE.getRarity(rarityId).execute().body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

# jGwentAPI
A Java wrapper library for [GwentAPI](https://gwentapi.com/)

## Libraries
jGwentAPI uses Retrofit along with OkHttp to query [GwentAPI](https://gwentapi.com/).

 ## Status
 This is a current work-in-progress.  Please report any bugs you may find and open issues for any suggestions you may have.

 ## Usage
 Here's some basic usage.  Note that not all of the fields are used on all of the different requests.  Only the information sent from the API in the single call will be filled in.
 ### Getting Card List
```java
 GwentApi gwentApi = new GwentApiClient();
 // No parameters gives default value of 20,0
 CardResults results = gwentApi.getCardList(2, 30);
 List<Card> cards = results.getResults();
```

Note: If you want to retrieve a card from the results you can use the
```java
CardUtils.getgetUuidFromUrl(...)
```

method to pull the uuid off the URL.

### Getting Specific Card (By UUID)
```java
GwentApi gwentApi = new GwentApiClient();
Card card = gwentApi.getCard("MGEzZWQwMjktMWNhNS00NGRhLTkyMzEtMWJhYmQyNWM2ZjI2");
```

### Searching for Card By Name
```java
GwentApi gwentApi = new GwentApiClient();
CardResults results = gwentApi.getCardListByName("Geralt");
List<Card> cards = results.getResults();
```


I've never worked with Retrofit, OkHttp, or even Java 8 so this will be a learning process.
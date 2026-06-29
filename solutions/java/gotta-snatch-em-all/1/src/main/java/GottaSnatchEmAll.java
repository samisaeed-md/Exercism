import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        boolean iHaveSomethingTheyDont = false;
        boolean theyHaveSomethingIDont = false;

        for (String card : myCollection) {
            if (!theirCollection.contains(card)) {
                iHaveSomethingTheyDont = true;
                break;
            }
        }

        for (String card : theirCollection) {
            if (!myCollection.contains(card)) {
                theyHaveSomethingIDont = true;
                break;
            }
        }

        return iHaveSomethingTheyDont && theyHaveSomethingIDont;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> common = new HashSet<>(collections.getFirst());
        for (Set<String> collection : collections) common.retainAll(collection);
        return common;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> uniqueCards = new HashSet<>();
        for (Set<String> collection : collections) uniqueCards.addAll(collection);
        return uniqueCards;
    }
}

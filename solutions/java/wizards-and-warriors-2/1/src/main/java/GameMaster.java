public class GameMaster {
    public String describe(Character character) {
        return "You're a level " + character.getLevel() + " " + character.getCharacterClass() + " with " + character.getHitPoints() + " hit points.";
    }

    public String describe(Destination destination) {
        return "You've arrived at " + destination.getName() + ", which has " + destination.getInhabitants() + " inhabitants.";
    }

    public String describe(TravelMethod travelMethod) {
        return travelMethod.name().equalsIgnoreCase("walking") ? "You're traveling to your destination by " + travelMethod.name().toLowerCase() + "." : "You're traveling to your destination on " + travelMethod.name().toLowerCase() + ".";
    }

    public String describe(Character ch, Destination d, TravelMethod tm) {
        return "You're a level " + ch.getLevel() + " " + ch.getCharacterClass() + " with " + ch.getHitPoints() + " hit points. You're traveling to your destination on " + TravelMethod.HORSEBACK.toString().toLowerCase() + ". You've arrived at " + d.getName() + ", which has " + d.getInhabitants() + " inhabitants.";
    }

    public String describe(Character ch, Destination d) {
        return "You're a level " + ch.getLevel() + " " + ch.getCharacterClass() + " with " + ch.getHitPoints() + " hit points. You're traveling to your destination by walking. You've arrived at " + d.getName() + ", which has " + d.getInhabitants() + " inhabitants.";
    }
}

import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        String s = Pattern.compile("-([a-zA-Z])")
                .matcher(identifier)
                .replaceAll(match -> match.group(1).toUpperCase());

        return s.replace(" ", "_")
                .replace("4", "a")
                .replace("3", "e")
                .replace("0", "o")
                .replace("1", "l")
                .replace("7", "t")
                .replaceAll("[^a-zA-Z0-9_]", "");
    }
}
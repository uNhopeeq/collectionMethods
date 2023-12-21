package Lists;

public class collectionLists{
    public static boolean scrabble(String line1, String line2) {

        var symbols = line2.toLowerCase().toCharArray();  //
        line1 =line1.toLowerCase();

        for (var symbol : symbols) {

            if (line1.indexOf(symbol) != -1) {
                line1.replace(symbol, ' ');
            }
            else {
                return false;
            }
        }
        return true;
    }
}

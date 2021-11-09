package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        char[] stringAsCharArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringAsCharArray.length; i += 2) {
            stringBuilder.append(stringAsCharArray[i]);
        }
        return stringBuilder.toString();
    }
}

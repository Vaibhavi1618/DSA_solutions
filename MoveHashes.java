public class MoveHashes {
    public static String moveHashesToFront(String s) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#') hashes.append(c);
            else others.append(c);
        }
        return hashes.toString() + others.toString();
    }
    public static void main(String[] args) {
        String s = "Move#Hash#to#Front";
        System.out.println(moveHashesToFront(s));
    }
}
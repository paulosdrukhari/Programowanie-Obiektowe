public class PairUtilDemo {
    public static void main(String[] args) {
    
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min=" + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        Pair<String> xd = new Pair<String>();
        xd = PairUtil.swap(mm);
        System.out.println("min = " +xd.getFirst());
        System.out.println("max = " + xd.getSecond());

    
}
}
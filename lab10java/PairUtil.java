public class PairUtil<T>{

    public static <T>Pair<T> swap(Pair<T> a)
    {
        Pair<T> pair = new Pair<T>(a.getSecond(), a.getFirst());
        return pair;
    }
}

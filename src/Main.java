public class Main {
    public static void main(String[] args) {
        USATV usa = new USATV();

        System.out.println("USA TV");

        usa.broadcast();
        usa.nextChannel();
        usa.broadcast();

        System.out.println("ADAPTED USA TV");

        USATVAdapter tv = new USATVAdapter();
        tv.broadcast(tv.checkSocialRating(10));

        System.out.println("CHINESE TV");

        ChinaTV cTV = new ChinaTV();
        cTV.broadcast(cTV.checkSocialRating(10));
    }
}
import java.util.HashMap;

public class HashMaping {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<>();

        trackList.put("budy, budy", "LYRICS");
        trackList.put("I will return", "LYRICS");
        trackList.put("Forever Love", "LYRICS");
        trackList.put("National Song", "LYRICS");

        String track = trackList.get("LYRICS");
        System.out.println(track);

        for(String key : trackList.keySet()) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}

public class FourSeason {
	
	public static void main(String[] args) {
        int[] results = {1, 5, -5, 6, 0, 1, 5,100};

        System.out.println(solution(results));

    }

    public static String solution(int[] t) {
        String [] seasons = {"SPRING", "SUMMER", "FALL", "WINTER"};

        int seasonLength = t.length / seasons.length;
        int maxAmpl = 0;
        int maxSeasonId = 0;

        for(int i = 0; i < 4; i ++) {
            int seasonMin = 100;
            int seasonMax = -100;
            int currentAmpl = 0;
            for(int j = (seasonLength)*i; j<(seasonLength)*(i+1); j++) {
                if (t[j] > seasonMax) {
                    seasonMax = t[j];
                }
                if(t[j] < seasonMin) {
                    seasonMin = t[j];
                }
            }
            currentAmpl = seasonMax - seasonMin;
            if(currentAmpl > maxAmpl) {
                maxAmpl = currentAmpl;
                maxSeasonId = i;
            }
        }
        return seasons[maxSeasonId];
    }
}

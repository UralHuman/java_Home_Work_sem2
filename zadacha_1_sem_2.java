public class zadacha_1_sem_2 {

    
    public static void main(String[] args) {
        zadacha_1_sem_2 task = new zadacha_1_sem_2();
        String jewels = "aB";
        String stones = "aaaAbbbB";
        String result = task.findJewelsInStones(jewels, stones);
        System.out.println(result);
    }

    public String findJewelsInStones(String jewels, String stones) {
        StringBuilder sb = new StringBuilder();
        for (char jewel : jewels.toCharArray()) {
            int count = 0;
            for (char stone : stones.toCharArray()) {
                if (stone == jewel) {
                    count++;
                }
            }
            sb.append(jewel).append(count);
        }
        return sb.toString();
    }
}
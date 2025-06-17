public class 26_FootballTeamHeights {
    public static int[] generateHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {
            heights[i] = (int) (Math.random() * 101 + 150);
        }
        return heights;
    }

    public static int sumHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        return (double) sumHeights(heights) / heights.length;
    }

    public static int shortestHeight(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            min = Math.min(min, height);
        }
        return min;
    }

    public static int tallestHeight(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            max = Math.max(max, height);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = generateHeights();
        System.out.println("Heights: " + java.util.Arrays.toString(heights));
        System.out.println("Shortest: " + shortestHeight(heights));
        System.out.println("Tallest: " + tallestHeight(heights));
        System.out.println("Mean height: " + meanHeight(heights));
    }
}
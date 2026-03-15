class Main {
    public static void main(String[] args) {
        int[] values = {2, 4, 6, 8};

        if (values.length == 0) {
            System.out.println("No data provided");
            return;
        }

        System.out.println("Hello World");
        System.out.println("Calculating statistics...");
        System.out.println("Average: " + StatisticsHelper.calculateAverage(values));
    }
}
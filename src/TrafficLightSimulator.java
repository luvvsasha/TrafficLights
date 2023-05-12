public class TrafficLightSimulator {

    public enum TrafficLightColor {
        RED,
        YELLOW,
        GREEN
    }

    private TrafficLightColor currentColor;

    public TrafficLightSimulator() {
        currentColor = TrafficLightColor.RED;
    }

    public void changeColor() {
        switch (currentColor) {
            case RED:
                currentColor = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                currentColor = TrafficLightColor.RED;
                break;
            case GREEN:
                currentColor = TrafficLightColor.YELLOW;
                break;
        }
    }

    public static void main(String[] args) {
        TrafficLightSimulator simulator = new TrafficLightSimulator();

        int iterations = 5; // Number of iterations

        for (int i = 0; i < iterations; i++) {
            System.out.println("Current Traffic Light Color: " + simulator.currentColor);
            simulator.changeColor();
        }
    }
}

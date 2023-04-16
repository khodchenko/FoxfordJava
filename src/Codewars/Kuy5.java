package Codewars;

public class Kuy5 {
    /**
     * 5: Codewars Human Readable Time
     *
     * @param seconds a non-negative integer (seconds) as input
     * @return returns the time in a human-readable format (HH:MM:SS)
     */
    public static String makeReadable(int seconds) { //Codewars
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        seconds = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}

public class P4 {
    public static void main(String[] args) {
        int dayOfWeek = 3;

        // --- 1. Traditional switch-case Statement ---
        System.out.print("Traditional Switch: ");
        switch (dayOfWeek) {
            case 1 -> System.out.println("Monday");
            // Prevents fall-through to the next case
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            default -> System.out.println("Weekend or Invalid Day");
        }

        // --- 2. Modern Switch Expression (Java 14+) ---
        // Concise, eliminates need for explicit 'break' statements
        String dayType = switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7          -> "Weekend";
            default            -> "Invalid Day";
        };

        System.out.println("Day Type: " + dayType);
    }
}
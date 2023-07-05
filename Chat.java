import java.util.Scanner;
class Chatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! How can I assist you today?");

        boolean running = true;
        while (running) {
            String userInput = scanner.nextLine().toLowerCase();
            String response = getResponse(userInput);
            System.out.println(response);

            if (userInput.equals("bye")) {
                running = false;
            }
        }

        System.out.println("Goodbye! Have a great day!");
        scanner.close();
    }

    public static String getResponse(String userInput) {
        if (userInput.contains("hello") || userInput.contains("hi")) {
            return "Hi there!";
        } else if (userInput.contains("how are you")) {
            return "I'm doing well, thank you!";
        } else if (userInput.contains("weather")) {
            return "I'm sorry, I don't have weather information.";
        } else {
            return "I'm sorry, I didn't understand that. Can you please rephrase?";
        }
    }
}

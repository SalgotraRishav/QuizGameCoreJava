import java.util.Scanner;

public class QuestionService {
    // Array to store a set of questions for the quiz
    Question[] questions = new Question[5];
    // Array to store user selections for answers
    String[] selection = new String[5];
    
    // Constructor to initialize the QuestionService with a set of predefined questions
    public QuestionService() {
        // Creating questions with their corresponding options and answers
        questions[0] = new Question(1, "What is the capital of France?", new String[]{"London", "Berlin", "Paris", "Rome"}, "Paris");
        questions[1] = new Question(2, "What is 4 + 4?", new String[]{"8", "10", "12", "14"}, "8");
        questions[2] = new Question(3, "Which is the closest planet to the Sun?", new String[]{"Mars", "Venus", "Earth", "Mercury"}, "Mercury");
        questions[3] = new Question(4, "Which gas is essential for human respiration?", new String[]{"Carbon", "Nitrogen", "Oxygen", "Hydrogen"}, "Oxygen");
        questions[4] = new Question(5, "Which is the largest ocean on Earth?", new String[]{"Atlantic", "Pacific", "Indian", "Arctic"}, "Pacific");
    }

    // Method to start the quiz
    public void playQuiz() {
        int i = 0; // Index for user selection tracking
        for (Question q : questions) {
            // Display the question ID and text
            System.out.println(q.getId() + ") " + q.getQuestion());

            // Get the options for the current question
            String[] options = q.getOptions();

            // Display all options for the user to choose from
            for (String option : options) {
                System.out.println(option);
            }
            
            // Read user input for the selected answer
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine(); // Store the user's selection
            i++; // Increment the index for the next question
            System.err.println(); // Print a blank line for better readability
        }
        // Print the user's score after the quiz
        printScore();
    }

    // Method to calculate and print the user's score based on their answers
    public void printScore() {
        int count = 0; // Counter for correct answers
        int i = 0; // Index for user selections

        // Check each question's answer against the user's selection
        for (Question q : questions) {
            if (q.getAnswer().equals(selection[i])) {
                count++; // Increment count for each correct answer
            }
            i++; // Move to the next user's selection
        }
        // Display the final score to the user
        System.out.println(String.format("You scored %d out of %d", count, questions.length));
    }
}

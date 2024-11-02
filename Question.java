public class Question {
    // Unique identifier for the question
    private int id;
    // The actual question text
    private String question;
    // Array of answer options for the question
    private String[] options;
    // The correct answer to the question
    private String answer;

    // Constructor to initialize a Question object
    public Question(int id, String question, String[] options, String answer) {
        this.answer = answer; // Set the correct answer
        this.id = id; // Set the question ID
        this.options = options; // Set the available options
        this.question = question; // Set the question text
    }
    
    // Getter for the question ID
    public int getId() {
        return id;
    }

    // Setter for the question ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for the question text
    public String getQuestion() {
        return question;
    }

    // Setter for the question text
    public void setQuestion(String question) {
        this.question = question;
    }

    // Getter for the options
    public String[] getOptions() {
        return options;
    }

    // Setter for the options
    public void setOptions(String[] options) {
        this.options = options;
    }

    // Getter for the correct answer
    public String getAnswer() {
        return answer;
    }

    // Setter for the correct answer
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // list of questions
        String[] questions = {
                "What is the third person singular form of the verb 'to be'?",
                "What is the negative form of the sentence 'She plays tennis'?",
                "Which option is correct: 'He ___ to the gym every day.'",
                "What is the correct form of the verb 'to have' in the third person singular?",
                "What is the opposite of the word 'always'?"
        };

        //there im make some changes and commit again

        //list of available answers
        String[][] options = {
                {"a. am", "b. is", "c. are", "d. be"},
                {"a. She doesn't plays tennis.", "b. She don't plays tennis.", "c. She not plays tennis.", "d. She doesn't play tennis."},
                {"a. go", "b. goes", "c. to go", "d. is going"},
                {"a. has", "b. have", "c. had", "d. having"},
                {"a. never", "b. sometimes", "c. often", "d. usually"}
        };

        int[] correctAnswers = {2, 1, 2, 1, 1};

        //cadet entering his name
        System.out.print("Enter your surname, name and patronymic: ");
        String fullName = scanner.nextLine();

        System.out.println("Hello, " + fullName + "!");
        System.out.println("So, let's go.");

        //calculate results
        int totalQuestions = questions.length;
        int correctAnswersCount = 0;

        //this is testing
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (a, b, c, d) or *q* to exit: ");
            String answer = scanner.nextLine();

            if (answer.equals("q")) {
                System.out.println("You closed the program.");
                return;
            }

            if (!answer.matches("[a-d]")) {
                System.out.println("Incorrect input! You must input only (a, b, c, d).");
                i--;
                continue;
            }

            int chosenOption = answer.charAt(0) - 'a';
            if (chosenOption == correctAnswers[i] - 1) {
                correctAnswersCount++;
            }
        }

        //results output
        System.out.println("\nEnd of the test!");
        System.out.println("You answer correctly on" + correctAnswersCount + " from " + totalQuestions + " answers.");
        double percentage = (double) correctAnswersCount / totalQuestions * 100;
        System.out.println("Your result is: " + percentage + "% correct answers.");

        System.out.print("Enter the password to see the correct answers: ");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Correct answers:");
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println("Question " + (i + 1) + ": " + options[i][correctAnswers[i] - 1]);
            }
        } else {
            System.out.println("Incorrect password. You have not access to correct answers.");
        }

    }
}

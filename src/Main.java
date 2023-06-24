import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Питання та відповіді
        String[] questions = {
                "What is the third person singular form of the verb 'to be'?",
                "What is the negative form of the sentence 'She plays tennis'?",
                "Which option is correct: 'He ___ to the gym every day.'",
                "What is the correct form of the verb 'to have' in the third person singular?",
                "What is the opposite of the word 'always'?"
        };

        String[][] options = {
                {"a. am", "b. is", "c. are", "d. be"},
                {"a. She doesn't plays tennis.", "b. She don't plays tennis.", "c. She not plays tennis.", "d. She doesn't play tennis."},
                {"a. go", "b. goes", "c. to go", "d. is going"},
                {"a. has", "b. have", "c. had", "d. having"},
                {"a. never", "b. sometimes", "c. often", "d. usually"}
        };

        int[] correctAnswers = {2, 1, 2, 1, 1};

        // Ім'я курсанта
        System.out.print("Введіть ваше прізвище, ім'я та по батькові: ");
        String fullName = scanner.nextLine();

        System.out.println("Привіт, " + fullName + "!");
        System.out.println("Почнемо тестування.");

        // Змінні для підрахунку результатів
        int totalQuestions = questions.length;
        int correctAnswersCount = 0;

        // Проходження тесту
        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nПитання " + (i + 1) + ":");
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Введіть відповідь (a, b, c, d) або q для виходу: ");
            String answer = scanner.nextLine();

            if (answer.equals("q")) {
                System.out.println("Ви вийшли з програми.");
                return;
            }

            if (!answer.matches("[a-d]")) {
                System.out.println("Будь ласка, введіть правильну букву варіанту (a, b, c, d).");
                i--;
                continue;
            }

            int chosenOption = answer.charAt(0) - 'a';
            if (chosenOption == correctAnswers[i] - 1) {
                correctAnswersCount++;
            }
        }
///hghgjjhgghjghj
        // Виведення результатів
        System.out.println("\nТестування завершено!");
        System.out.println("Ви дали правильну відповідь на " + correctAnswersCount + " з " + totalQuestions + " запитань.");
        double percentage = (double) correctAnswersCount / totalQuestions * 100;
        System.out.println("Ваш результат: " + percentage + "% правильних відповідей.");

        System.out.print("Введіть пароль для перегляду правильних відповідей: ");
        String password = scanner.nextLine();

        if (password.equals("1111")) {
            System.out.println("Правильні відповіді:");
            for (int i = 0; i < totalQuestions; i++) {
                System.out.println("Питання " + (i + 1) + ": " + options[i][correctAnswers[i] - 1]);
            }
        } else {
            System.out.println("Неправильний пароль. Ви не маєте доступу до правильних відповідей.");
        }

    }
}

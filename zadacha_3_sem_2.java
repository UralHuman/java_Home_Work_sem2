import java.util.*;

public class zadacha_3_sem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // Считываем перевод строки после числа n

        // Считываем n строк книги в список
        List<String> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            book.add(sc.nextLine());
        }

        int m = sc.nextInt();
        sc.nextLine(); // Считываем перевод строки после числа m

        // Создаем словарь для хранения замен продуктов
        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] tokens = sc.nextLine().split(" - ");
            replacements.put(tokens[0], tokens[1]);
        }

        // Проходим по каждой строке книги и заменяем продукты
        for (String recipe : book) {
            String[] tokens = recipe.split(" ");
            StringBuilder sb = new StringBuilder();

            for (String token : tokens) {
                if (replacements.containsKey(token.toLowerCase())) {
                    String replacement = replacements.get(token.toLowerCase());
                    if (Character.isUpperCase(token.charAt(0))) {
                        // Если первая буква продукта - заглавная, то замена должна начинаться с заглавной
                        replacement = replacement.substring(0, 1).toUpperCase() + replacement.substring(1);
                    }
                    sb.append(replacement).append(" ");
                } else {
                    sb.append(token).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}
package exercise;

import exercise.model.Address;
import exercise.annotation.Inspect;
import java.lang.reflect.Method;

public class Application {
    public static void main(String[] args) {
        var address = new Address("London", 12345678);

        // BEGIN
        // Итерируем все методы класса
        for (Method method : Address.class.getDeclaredMethods()) {

            // Проверяем, есть ли у метода аннотация @LogExecutionTime
            if (method.isAnnotationPresent(Inspect.class)) {

                try {
                    // Выполняем метод с аннотацией LogExecutionTime
                    method.invoke(address);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                var returnedType = method.getAnnotatedReturnType().toString();
                String returned = "";
                if (returnedType.contains("\\.")) {
                    String[] arr = returnedType.split("\\.");
                    returned = arr[arr.length - 1];
                } else {
                    returned = returnedType;
                }


                System.out.println("Method " + method.getName() + " returns a value of type "
                                    + returned);
            }
        }
        // END
    }
}

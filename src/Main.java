public class Main {
    /*
    План занятия
    1) Модульное тестирование JUnit
    2) Теоретическое знакомство с аннотациями
    3) Практика
     */

    /*
    Теория
    После данного урока, я бы хотел как можно чаще, а желательно всегда видеть тесты в домашних заданиях!
    Unit(модульное) тестирование - тестированние отдельных частей приложения, эффективно выявляет проблемы с функционалом
    отдельных частей программы, но не позволяет полноценно оценить функционал всей системы(см. первую часть видео в чате)
    Тестирование бывает разное: альфа, бетта, стрессовое, модульное, ручное, автоматическое, интергационное.
    Тестирование может проводиться, как специалистом, так и простыми пользователями.
    Тестировать возможно просто проверяя функционал во время использования, с пременением специализированного программного
    обеспечения, написание специальной программы - теста.

    Модульное тестирование сводится к написанию простейшей программы, которая будет запускать наш код и проверять соответсвие
    его результата ожидаемому результату.
    В Java существует бибилиотека Junit для написание модульных тестов

    Assert - утверждение
    assertEqual(утверждение, тест) - проверяет значение возвращаемого параметра метода.



     */

    /*
    Заметки
    Всестороннее тестирование повзоляет значительно упростить разработку программы. Для эффективного тестирования достаточно
    часто необходимо объединить несколько видов тестирования.

    Откладка - подгон работы программы под определенный шаблон(трассировка).


     */

    /*
    Задачи
    1) Написать класс для осуществления арифметических операций
    2) Написать тест для этого класса

    3) Написать класс и тест к этому классу. Использовать аннотации Test, BeforeAll, BeforeEach, AfterEach, AfterAll
     */
    public static void main(String[] args) {
           Calculator calculator = new Calculator();
           System.out.println(calculator.div(3, 2));
    }

    /*
    1) Создать класс
    2) Сделать класс для теста
    3) Написать как можно больше вариантов проверок и аннотаций

     */
}

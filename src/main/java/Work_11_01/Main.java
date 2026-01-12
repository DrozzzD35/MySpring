package Work_11_01;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*

        Концепции:

        1) IoC (инверсия управления), спринг берет ответственность за создание объектов на себя.

            Без спринга:
            UserService us = new UserService(new UserRepository());

            Со спрингом:
            @Autowired
            UserService userService;

        2) DI (внедрения зависимостей)

        3) AOP (аспекты)
            Сквозная функциональность (логирования, транзакции, безопастность), без изменения основного кода

         Модули спринга:
             Spring Core
             Spring MVC
             Spring Data
             Spring Security
             Spring Cloud
             Spring Boot



         Практика:
         1) https://start.spring.io


         */

        /*
        @SpringBootApplication
        - @Configuration - конфигурвции
        - @EnableAutoConfiguration
        - @ComponentScan
         */


        /*
        DI - это паттерн, при котором объект не создает свои зависимости САМ! А получает их извне

        public class OrderService {

            private final OrderRepository orderRepository;
            private final NotificationService notificationService;

            public OrderService(OrderRepository orderRepository, NotificationService notificationService) {
                this.orderRepository = orderRepository;
                this.notificationService = notificationService;
            }
        }

         */


    }
}
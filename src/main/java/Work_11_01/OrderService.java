package Work_11_01;

//@Service - дает сигнал спрингу создать бин этого класса
public class OrderService {


    /*
    Первый вариант внедрения - через конструктор

    плюсы:
    1) зависимости явные
    2) поля final
    3) легко тестировать
    4) невозможно создать объект без зависимостей

     */
    private final OrderRepository orderRepository1;

    public OrderService(OrderRepository orderRepository1) {
        this.orderRepository1 = orderRepository1;
    }

    /*
    2 вариант через сеттер

    Когда использовать:
    - опциональная зависимость
    - изменить зависимость


    Нельз делать:

    @Autowired
    private OrderRepository orderRepository2;

    Почему плохо:
    1) нельзя сделать поле final
    2) сложно тестировать
    3) зависимость не явная
     */
    private OrderRepository orderRepository2;

//    @Autowired
    public void setOrderRepository2(OrderRepository orderRepository2) {
        this.orderRepository2 = orderRepository2;
    }

    /*
    Аннотации для di:
    - @Component - помечает класс как бин
    - @Service - тот компонент НО для сервисов
    - @Repository - для бд
    - @Controller - для контроллеров
    - @Autowired - сигнал для внедрения зависимости
     */

}
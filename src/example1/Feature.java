package example1;

interface Feature {
    default void action() {
        System.out.println("Default action");
    }

    default void action2() {
        String answer = subAction();
        System.out.println(answer);
    }
    // для декомпозиции какого-либо большого дефолтного метода
    // java позволяет нам декларировать приватные методы в интерфейсе
    private String subAction() {
        return "Default Action";
    }

}

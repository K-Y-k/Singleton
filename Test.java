public class Test {
    public static void main(String[] args) {
        try {
            // 프로토타입 객체
            Book book1 = new Book();
            Book book2 = new Book();

            // 싱글톤타입 객체
            Configurator conf1 = new Configurator();
            Configurator conf2 = new Configurator();

            Framework.register(book1);
            Framework.register(book2);
            Framework.register(conf1);
            Framework.register(conf2);

            System.out.println(Framework.getObject("Book"));
            System.out.println(Framework.getObject("Book"));
            System.out.println(Framework.getObject("Configurator"));
            System.out.println(Framework.getObject("Configurator"));

        } catch (IllegalArgumentException e) {
        }
    }
}
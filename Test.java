public class Test {
    public static void main(String[] args) {
        try {
            // 프로토타입 객체
            Book book = new Book();

            // 싱글톤타입 객체
            Configurator conf = new Configurator();

            ObjectRepository.register(book);
            ObjectRepository.register(book);

            System.out.println(Framework.repository.getObject("Book"));
            System.out.println(Framework.repository.getObject("Book"));
            System.out.println(Framework.repository.getObject("Configurator"));
            System.out.println(Framework.repository.getObject("Configurator"));

        } catch (IllegalArgumentException e) {
        }
    }
}
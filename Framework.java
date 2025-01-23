import java.util.*;

public class Framework {
    static final Map<String, Object> repository = new HashMap();


    public static void register(Object object) {
        repository.put(object.getClass().getName(), object);
    }

    public static Object getObject(String objectString) {
        Object object = repository.get(objectString);
        String className = object.getClass().getName();

        // 싱글톤 타입 객체일 경우
        // 기존 생성한 객체의 참조 값으로 반환한다.
        if (object.getClass().getDeclaredAnnotation(CreationType.class).type() == ObjectType.Singleton) {
            return object;
        } 
        else { 
            // 프로토타입일 경우
            Object newObject = new (className)Object();
            return newObject;
        }
    }
}

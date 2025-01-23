import java.util.*;

public class Framework {
    Map<String, Object> repository = new HashMap();


    public void register(String objectString) {
        

        repository.put(objectString, );
    }

    public Object getObject(String objectString) {
        Object object = repository.get(objectString);

        // 싱글톤 타입 객체일 경우
        // 기존 생성한 객체의 참조 값으로 반환한다.
        if (object.getClass().getDeclaredAnnotation(CreationType.class).type() == ObjectType.Singleton) {

        }

        // 프로토타입 객체일 경우
        // 기존 객체를 복사해서 반환한다.
        if () {
            
        }

        return repository.get(s);
    }
}

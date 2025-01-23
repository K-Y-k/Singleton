// public class PrototypeRegistry implements Prototype {
//     Prototype[] items;
//     public static final int INITIAL_CAPACITY = 1000;

//     public PrototypeRegistry() {
//         items = new Prototype[INITIAL_CAPACITY];
//     }

//     public void addItem(String id, Prototype p) {
//         int index = Math.abs(id.hashCode()) % INITIAL_CAPACITY;
//         items[index] = p;
//     }


//     public Prototype getById(String id) {
//         int fineIndex = Math.abs(id.hashCode()) % INITIAL_CAPACITY;
//         return items[fineIndex];
//     }
// }

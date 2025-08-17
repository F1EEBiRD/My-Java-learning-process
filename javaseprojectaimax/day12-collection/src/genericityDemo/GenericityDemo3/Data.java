package genericityDemo.GenericityDemo3;
//自定义泛型接口
public interface Data<T> {
    void add(T t);
    void delete(T t);
    void update(T t);
    T query(T t);
}

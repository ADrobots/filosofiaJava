package generics.coffee;
public interface Generator<T> { T next(); } ///:~

/**
 * Возвращаемый тип метода параметризируется по T.
 * Обобщения с интерфейсами работают так же как и с классами.
 *
 */
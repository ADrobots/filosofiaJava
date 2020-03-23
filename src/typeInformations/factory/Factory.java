package typeInformations.factory;

public interface Factory<T> {
    T create();
}
/**
 * Параметр-тип Т позволяет методу create() возвращает
 * типы для разных реализаций Factory
 */

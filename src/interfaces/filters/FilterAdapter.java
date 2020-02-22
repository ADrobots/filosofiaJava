package interfaces.filters;

public class FilterAdapter implements Processor {
    Filter filter;
    public FilterAdapter(Filter filter){
        this.filter=filter;
    }

    //Конструктор получает исходный интерфейс Filter и создает
    //объект с требуемым интерфейсом Processor

    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform)input);
    }
}

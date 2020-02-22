package interfaces.filters;

public interface Processor {

        String name();
        Object process(Object input);

}

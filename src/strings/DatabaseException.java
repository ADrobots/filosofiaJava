package strings;

public class DatabaseException extends Exception {
    public DatabaseException(int transactionID, int queryID, String message){
        super(String.format("(t%d, q%d) %s",transactionID, queryID, message));
    }

    public static void main(String[] args) {
        try {
            throw new DatabaseException(3,5,"Ошибка");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

/**
 * Во внутренней реализации String.format() всего лишь создает экземпляр Formatter и
 * передает ему аргументы.
 */
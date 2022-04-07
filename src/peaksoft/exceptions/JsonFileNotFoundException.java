package peaksoft.exceptions;

/**
 * @author Beksultan
 */
public class JsonFileNotFoundException extends RuntimeException {
    public JsonFileNotFoundException(String message) {
        super(message);
    }
}

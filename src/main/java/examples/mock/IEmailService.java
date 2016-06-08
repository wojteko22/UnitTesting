package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
public interface IEmailService {
    void sendEmail(String to, String subject, String body);
}

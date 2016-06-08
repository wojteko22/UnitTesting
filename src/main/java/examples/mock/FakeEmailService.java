package examples.mock;

/**
 * @author Dawid on 2016-06-08.
 */
public class FakeEmailService implements IEmailService {
    String to, subject, body;

    @Override
    public void sendEmail(String to, String subject, String body) {
        this.to=to;
        this.subject=subject;
        this.body=body;
    }
}

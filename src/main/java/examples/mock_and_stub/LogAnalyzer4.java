package examples.mock_and_stub;

/**
 * @author Dawid on 2016-06-08.
 */
class LogAnalyzer4 {
    private IWebService service;
    private IEmailService email;

    LogAnalyzer4(IWebService service, IEmailService email) {
        this.email=email;
        this.service = service;
    }

    void analyze(String fileName) {
        if (fileName.length() < 8) {
            try {
                service.LogError("File name is too short: " + fileName);
            }
            catch (Exception e){
                email.sendEmail("someone@somewhere.com","Brak mozliwosci rejestracji",e.getMessage());
            }
        }
    }
}
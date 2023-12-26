package tasksecond;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MailInfo {
    private Client client;
    private String mailCode;

    public MailInfo(Client client, String type) {
        this.client = client;
        this.mailCode = type;
    }
}

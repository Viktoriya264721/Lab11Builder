package tasksecond;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    private static final String API_KEY = null;
    private static final String API_SECRET = null;

public static void main(String[] args) throws MailjetException,
MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        client = new MailjetClient(API_KEY, API_SECRET,
        new ClientOptions("v3.1"));
        request = new MailjetRequest(Emailv31.resource)
        .property(Emailv31.MESSAGES, new JSONArray()
        .put(new JSONObject()
        .put(Emailv31.Message.FROM, new JSONObject()
        .put("Email", "stetsyshyn.pn@ucu.edu.ua")
        .put("Name", "Viktoriia"))
        .put(Emailv31.Message.TO, new JSONArray()
        .put(new JSONObject()
        .put("Email", "stetsyshyn.pn@ucu.edu.ua")
        .put("Name", "Viktoriia")))
        .put(Emailv31.Message.SUBJECT, "Greetings ")
        .put(Emailv31.Message.TEXTPART, "My first ")
        .put(Emailv31.Message.HTMLPART, "<h3>Dear ")
        .put(Emailv31.Message.CUSTOMID, "AppGetting")));
        response = client.post(request);
        System.out.println(response.getStatus());
        System.out.println(response.getData());
    }
}
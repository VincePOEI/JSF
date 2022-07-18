
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "messageBean")
@RequestScoped
public class Message {

    private String message;

    public Message() {
        message = "Message from new bean !";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

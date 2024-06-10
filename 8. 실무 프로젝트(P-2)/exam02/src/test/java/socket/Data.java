package socket;


import java.io.Serializable;

@lombok.Data
public class Data implements Serializable {
    private String from;
    private String to;
    private String message;
}

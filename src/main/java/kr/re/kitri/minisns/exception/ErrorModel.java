package kr.re.kitri.minisns.exception;

public class ErrorModel {
    private int code;
    private String message;
    private String rootCause;

    public ErrorModel(int code, String message, String rootCause) {
        this.code = code;
        this.message = message;
        this.rootCause = rootCause;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getRootCause() {
        return rootCause;
    }

    @Override
    public String toString() {
        return "ErrorModel{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", rootCause='" + rootCause + '\'' +
                '}';
    }
}

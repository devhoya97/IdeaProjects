package Ex1;

class UnsupportedFunctionException extends RuntimeException{
    final private int ERR_CODE;
    UnsupportedFunctionException(String msg, int errCode){
        super(msg);
        ERR_CODE = errCode;
    }
    public int getErrorCode(){
        return ERR_CODE;
    }
    public String getMessage(){
        return "["+getErrorCode()+"]"+super.getMessage();
    }
}
public class ExceptionClassTest {
    public static void main(String[] args) {
        throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
    }
}

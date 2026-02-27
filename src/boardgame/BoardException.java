package boardgame;

public class BoardException extends RuntimeException{
    private static final long serialVersionUID = 1l;

    //construtor que recebe a mensagem
    public BoardException(String msg){
        super(msg);
    }
}

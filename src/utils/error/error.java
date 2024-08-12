package src.utils.error;

import src.utils.pos.Position;

public class error extends RuntimeException{
    public Position pos;
    public String message;

    public error(String msg, Position pos){
        this.pos = pos;
        this.message = msg;
    }
}

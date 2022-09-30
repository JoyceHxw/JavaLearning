package service;

public class TeamException extends RuntimeException{
    static final long serialVersionUID = -70342471907866939L;

    public TeamException(){

    }
    public TeamException(String msg){
        super(msg);
    } 
}

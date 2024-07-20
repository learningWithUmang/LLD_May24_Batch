package TicTacToe.models;

public class Symbol {
    private char aChar;
    public Symbol(char aChar){
        this.aChar = aChar;
    }
    private String avatarURl;

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public String getAvatarURl() {
        return avatarURl;
    }

    public void setAvatarURl(String avatarURl) {
        this.avatarURl = avatarURl;
    }
}

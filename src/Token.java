//Class to store our tokens
//Couldn't make this in the main Lexer file for some reason, so I just gave it its own file
public class Token {
    public String tokenType;
    public String name;
    public int progNum;
    public int lineNum;

    public Token(String tokenType, String name, int progNum, int lineNum) {
        this.tokenType = tokenType;
        this.name = name;
        this.progNum = progNum;
        this.lineNum = lineNum;
        
    }
}
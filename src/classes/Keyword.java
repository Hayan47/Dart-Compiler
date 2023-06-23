package classes;

public class Keyword {
    public final String class_name = "Keyword";

    String keyword;

    public Keyword() {
    }

    public Keyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        String s="";
        if (keyword!=null)
            s+="Keyword{" + "keyword='" + keyword + '\n' + '}';;
        return s;
    }
}

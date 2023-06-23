package classes;

public class Classs {
    public final String class_name = "Class";

    Keyword keyword;
    Identifier identifier;
    ClasssBody classsBody;

    public Classs() {
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier identifier) {
        this.identifier = identifier;
    }

    public ClasssBody getClasssBody() {
        return classsBody;
    }

    public void setClasssBody(ClasssBody classsBody) {
        this.classsBody = classsBody;
    }

    @Override
    public String toString() {
        return "Classs{" +
                "keyword=" + keyword +
                ", identifier=" + identifier +
                ", classsBody=" + classsBody +
                '}';
    }
}

package classes;

import java.util.List;

public class IfBody {
    public final String class_name = "If Body";

    Button button;
    List<Program> program;
    List<TextFormFiled> textFormFileds;

    public IfBody() {
    }

    public Button getButton() {
        return button;
    }

    public void setButton(Button button) {
        this.button = button;
    }

    public List<Program> getProgram() {
        return program;
    }

    public void setProgram(List<Program> program) {
        this.program = program;
    }

    public List<TextFormFiled> getTextFormFileds() {
        return textFormFileds;
    }

    public void setTextFormFileds(List<TextFormFiled> textFormFileds) {
        this.textFormFileds = textFormFileds;
    }

    @Override
    public String toString() {
        String s="";
        s+="IfBody{";
        if(program!=null)
            for (int i=0;i<program.size();i++)
                s+="program" + String.valueOf(i+1) + "=" + program.get(i) + "\n";
        if(button!=null)
                s+="button" + "=" + button + "\n";
        if(textFormFileds!=null)
            for (int i=0;i<textFormFileds.size();i++)
                s+="TextFormField" + String.valueOf(i+1) + "=" + textFormFileds.get(i) + "\n";
        s+='}';
        return  s;
    }
    public String toHtml() {
        String html = "";
//        html+="if(isset($_POST['" +
//                identifiers.get(0).getParameter()  + "']) " +
//                "&& " +
//                "isset($_POST[" +
//                "'" +
//                identifiers.get(2).getParameter() +
//                "']))";
        return html;
    }

    public  String toPhp(){
        String php = "";
        php+="{";
        if (button!=null){
            php+=button.toPhp();
        }

        if (program!=null){
            for(int i=0;i<program.size();i++) {
                php += program.get(i).toPhp();
            }
        }
        if (textFormFileds!=null){
            for(int i=0;i<textFormFileds.size();i++) {
                php += textFormFileds.get(i).toPhp();
            }
        }
        php+="}";
        return php;
    }
}

package classes;

import java.util.List;

public class Container {
    public final String class_name = "Container";

    String container;
    List<String> C_Properties;
    Text text;
    List<Identifier> identifiers;
    Program program;

    public Container() {
    }

    public Container(String container, List<String> c_Properties, Text text) {
        this.container = container;
        C_Properties = c_Properties;
        this.text = text;
    }


    public Container(String container, Text text) {
        this.container = container;
        this.text = text;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public List<String> getC_Properties() {
        return C_Properties;
    }

    public void setC_Properties(List<String> c_Properties) {
        C_Properties = c_Properties;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public List<Identifier> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<Identifier> identifiers) {
        this.identifiers = identifiers;
    }

    @Override
    public String toString() {
        String s="";
        s+="Container{" + "container='" + container + '\'';
        if (C_Properties!=null)
            for (int i=0;i<C_Properties.size();i++)
                s+="c_Property" + String.valueOf(i+1) + "=" + C_Properties.get(i) + "\n";
        if (text!=null)
            s+=", text=" + text;
        if (identifiers!=null)
            for (int i=0;i<identifiers.size();i++)
                s+="identifier" + String.valueOf(i+1) + "=" + identifiers.get(i) + "\n";
        if (program!=null)
            s+=", program=" + program;
        s+='}';
        return s;
    }

    public String toHtml() {
        String html = "<div ";

        if (C_Properties != null) {
           // html += "style=";
            for (int i=0;i<C_Properties.size();i++) {
//                html+=  C_Properties;
            }
        }
        html+=">";
        if (text != null) {
            System.out.println();
            html += "<span>" + text.toHtml() + "</span>";
        }

        html += "</div>";
        return html;
    }

    public String toPhp() {
        String php = "";

        if (program != null) {
            php += "<?php\n" + program.toPhp() + "?>\n";
        }

        // Add PHP code for other components of the container

        return php;
    }
}

package classes;

import java.util.List;

public class ListWedget {
    public final String class_name = "ListWedget";

    String listWedget;
    List<Container> containers;
    List<Text> texts;
    List<TextFormFiled> textFormFileds;
    List<Button> buttons;
    If iff;

    public ListWedget() {
    }

    public ListWedget(String listWedget) {
        this.listWedget = listWedget;
    }

    public String getClass_name() {
        return class_name;
    }

    public String getListWedget() {
        return listWedget;
    }

    public void setListWedget(String listWedget) {
        this.listWedget = listWedget;
    }

    public List<Container> getContainers() {
        return containers;
    }

    public void setContainers(List<Container> containers) {
        this.containers = containers;
    }

    public List<Text> getTexts() {
        return texts;
    }

    public void setTexts(List<Text> texts) {
        this.texts = texts;
    }

    public List<TextFormFiled> getTextFormFileds() {
        return textFormFileds;
    }

    public void setTextFormFileds(List<TextFormFiled> textFormFileds) {
        this.textFormFileds = textFormFileds;
    }

    public List<Button> getButtons() {
        return buttons;
    }

    public void setButtons(List<Button> buttons) {
        this.buttons = buttons;
    }

    public If getIff() {
        return iff;
    }

    public void setIff(If iff) {
        this.iff = iff;
    }

    @Override
    public String toString() {
        String s="";
        s+="ListWedget{" +
                ", listWedget='" + listWedget + '\'';
        if (containers!=null) {
            for (int i = 0; i < containers.size(); i++) {
                s += "Container" + String.valueOf(i + 1) + "=" + containers.get(i) + "\n";
            }
        }
        if (texts!=null) {
            for (int i = 0; i < texts.size(); i++) {
                s += "Text" + String.valueOf(i + 1) + "=" + texts.get(i) + "\n";
            }
        }
        if (textFormFileds!=null) {
            for (int i = 0; i < textFormFileds.size(); i++) {
                s += "TextFormFiled" + String.valueOf(i + 1) + "=" + textFormFileds.get(i) + "\n";
            }
        }
        if (buttons!=null) {
            for (int i = 0; i < buttons.size(); i++) {
                s += "Button" + String.valueOf(i + 1) + "=" + buttons.get(i) + "\n";
            }
        }
        if (iff!=null){
            s+= "if" + iff;
        }
        s+='}';
        return s;
    }

    public String toHtml() {
        String html = "<ul>";

        if (containers!=null)
            for(int i=0;i<containers.size();i++) {
                html+="<li>";
                html += containers.get(i).toHtml();
                html+="</li>";
            }
        if (texts!=null)
            for(int i=0;i<texts.size();i++) {
                //html+="<li>";
                html += texts.get(i).toHtml();
                //html+="</li>";
            }
        if (textFormFileds!=null)
            for(int i=0;i<textFormFileds.size();i++) {
                html+="<li>";
                html += textFormFileds.get(i).toHtml();
                html+="</li>";
            }
        if (buttons!=null){
            for(int i=0;i<buttons.size();i++) {
                html += "<li>";
                html += buttons.get(i).toHtml();
                html += "</li>";
            }
        }
        if (iff!=null){
            html+= iff.toHtml();
        }
        html+="</ul>";
        return html;
    }

    public String toPhp() {
        String php = "";

        if (containers!=null)
            for(int i=0;i<containers.size();i++) {
                php += containers.get(i).toPhp();
            }
        if (buttons!=null) {
            for (int i = 0; i < buttons.size(); i++) {
                php += buttons.get(i).toPhp();
//                php+="\n}\n";
                if (textFormFileds != null) {
                    for (int j = 0; j < textFormFileds.size(); j++) {
                        php += textFormFileds.get(j).toPhp();
                    }
                    if (texts != null) {
                        for (int k = 0; k < texts.size(); k++) {
                            php += texts.get(k).toPhp();
                        }
                    }
                    php += "\n}\n";
                } else {
                    php += "\n}\n";
                }
            }
        }

//        if (textFormFileds!=null) {
//            for (int i = 0; i < textFormFileds.size(); i++) {
//                php += textFormFileds.get(i).toPhp();
//
//            }
//        }
        if (iff!=null){
            System.out.println("HH");
            php+= iff.toPhp();
        }
        return php;
    }
}

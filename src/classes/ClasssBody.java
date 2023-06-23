package classes;

import java.util.List;

public class ClasssBody {
    public final String class_name = "ClassBody";

    List<Program> programs;
    Constructorr constructors;

    public ClasssBody() {
    }

    public List<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(List<Program> programs) {
        this.programs = programs;
    }

    public Constructorr getConstructors() {
        return constructors;
    }

    public void setConstructors(Constructorr constructors) {
        this.constructors = constructors;
    }
@Override
    public String toString() {
        String s= "";
        s+="ClasssBody{";
        if (programs!=null){
            for (int i=0;i<programs.size();i++)
                s+="programs" + String.valueOf(i+1) + "=" + programs.get(i) + "\n";
        }
        if(constructors!=null)
            s+=", constructors=" + constructors;
        s+='}';
        return s;
    }
}

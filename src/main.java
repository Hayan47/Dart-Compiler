import GenerationCode.CodeGenerator;
import SymbolTable.SymbolTable;
import classes.Program;
import classes.visitor.Visitor;
import com.google.gson.Gson;
import gen.comLexer;
import gen.comParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class main {
    public static void main(String[] args) {
        try {
            // Create a new instance of your SymbolTable class
            SymbolTable symbolTable = new SymbolTable();

            // Create a new instance of your Visitor class and pass it the SymbolTable object
            Visitor visitor = new Visitor(symbolTable);

            String source = "test.txt";
            CharStream cs = fromFileName(source);
            comLexer lexer = new comLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            comParser parser = new comParser(token);
            parser.removeErrorListeners();

            ParseTree tree = parser.program();
            Program program = (Program) visitor.visit(tree);

            // Generate HTML code for the program
            for (int i=0;i<program.getListtss().size();i++){
                String html = CodeGenerator.generateHtml(program.getListtss().get(i));
                // Write the generated HTML code to a file
                File file = new File("output"+i+".html");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(html);
                fileWriter.close();
            }

            //AST result file json
            File file = new File("output.json");
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(new Gson().toJson(program));
            fileWriter.close();

            //AST result file text
            file = new File("output.txt");
            fileWriter = new FileWriter(file);
            fileWriter.write(program.toString());
            fileWriter.close();

            // Generate PHP code for the program
            String php = CodeGenerator.generatePhp(program);

            // Write the generated PHP code to a file
            file = new File("output.php");
            fileWriter = new FileWriter(file);
            fileWriter.write(php);
            fileWriter.close();

            // Print a success message to the console
            System.out.println("Generated output.html and output.php");

            String source2 = "test2.txt";
            CharStream cs2 = fromFileName(source2);
            comLexer lexer2 = new comLexer(cs2);
            CommonTokenStream token2 = new CommonTokenStream(lexer2);
            comParser parser2 = new comParser(token2);
            parser2.removeErrorListeners();
            ParseTree tree2 = parser2.program();
            Program program2 = (Program) visitor.visit(tree2);
            // Generate Php code for the program
                String php2 = CodeGenerator.generateHtml(program2.getListtss().get(0));
                // Write the generated HTML code to a file
                file = new File("output.php");
                fileWriter = new FileWriter(file);
                fileWriter.write(php + php2);
                fileWriter.close();



            System.out.println(symbolTable.toString());
            visitor.printError();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
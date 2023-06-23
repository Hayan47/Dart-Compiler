package classes.visitor;

import ErrorHandling.*;
import SymbolTable.MyIdentifier;
import SymbolTable.SymbolTable;
import classes.*;
import gen.comParser;
import gen.comParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class Visitor extends comParserBaseVisitor {

    private SymbolTable symbolTable;
    List Errors = new ArrayList<>();

    public Visitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }
    @Override
    public Program visitProgram(comParser.ProgramContext ctx) {
        //Dec
        Program program = new Program();
        List<Dec> decs = new ArrayList<>();
        if (ctx.dec() != null) {
            for (int i = 0; i < ctx.dec().size(); i++) {
                decs.add((Dec) visitDec(ctx.dec(i)));
            }
            program.setDec(decs);
        }

        //Loop
        List<Loop> loops = new ArrayList<>();
        if (ctx.loop() != null) {
            for (int i = 0; i < ctx.loop().size(); i++) {
                loops.add((Loop) visitLoop(ctx.loop(i)));
            }
            program.setLoops(loops);
        }

        //Condition
        List<Condition> conditions = new ArrayList<>();
        if (ctx.conditions() != null) {
            for (int i = 0; i < ctx.conditions().size(); i++) {
                conditions.add((Condition) visitConditions(ctx.conditions(i)));
            }
            program.setCon(conditions);
        }

        //Function
        List<Function> functions = new ArrayList<>();
        if (ctx.function() != null) {
            for (int i = 0; i < ctx.function().size(); i++) {
                functions.add((Function) visitFunction(ctx.function(i)));
            }
            program.setFun(functions);
        }

        //Class
        List<Classs> classses = new ArrayList<>();
        if (ctx.class_() != null) {
            for (int i = 0; i < ctx.class_().size(); i++) {
                classses.add((Classs) visitClass(ctx.class_(i)));
            }
            program.set_class(classses);
        }

        //Exp
        List<Exp> exps = new ArrayList<>();
        if (ctx.exp() != null) {
            for (int i = 0; i < ctx.exp().size(); i++) {
                exps.add(visitExp(ctx.exp(i)));
            }
            program.setExps(exps);
        }

        //Call Functions
        List<CallFunction> callFunctions = new ArrayList<>();
        if (ctx.call_function() != null) {
            for (int i = 0; i < ctx.call_function().size(); i++) {
                callFunctions.add((CallFunction) visitCall_function(ctx.call_function(i)));
            }
            program.setCallFunctions(callFunctions);
        }

        //Lists
        List<Listt> listts = new ArrayList<>();
        if (ctx.list() != null) {
            for (int i = 0; i < ctx.list().size(); i++) {
                listts.add((Listt) visitList(ctx.list(i)));
            }
            program.setListts(listts);
        }

        //Call Lists
        List<ListAsParameter> listAsParameters = new ArrayList<>();
        if (ctx.list_as_parameter() != null) {
            for (int i = 0; i < ctx.list_as_parameter().size(); i++) {
                listAsParameters.add((ListAsParameter) visitList_as_parameter(ctx.list_as_parameter(i)));
            }
            program.setListAsParameters(listAsParameters);
        }
        //Call Container
        if (ctx.container()!=null)
            program.setContainer(visitContainer(ctx.container()));


        //Call Text
        if (ctx.text()!=null)
            program.setText(visitText(ctx.text()));

        //Call ListWidget
        List<ListWedget> listtss = new ArrayList<>();
        if (ctx.listwedget() != null) {
            for (int i = 0; i < ctx.listwedget().size(); i++) {
                listtss.add((ListWedget) visitListwedget(ctx.listwedget(i)));
            }
            program.setListtss(listtss);
        }

        return program;
    }


    @Override
    public Dec visitDec(comParser.DecContext ctx) {
        Dec dec = new Dec();

        MyIdentifier identifier;

        if (ctx.DATA_TYPE() != null) {
            dec.setDataType(new DataType(ctx.DATA_TYPE().getText()));
        }

        if (ctx.identifier() != null) {
            String identifierName = ctx.identifier(0).getText();
            Object initialValue = null; // set initial value to null by default

            identifier = new MyIdentifier(identifierName, dec.getDataType(), initialValue, ctx.getStart().getLine());
            // Check if the identifier is already declared
            if (symbolTable.lookup(identifierName) != null) {
                // Throw a DartError if the Identifier has already been declared
                try {
                    throw new DECLARATION_ERROR(
                            identifierName);
                } catch (DartError e) {
                    //throw new RuntimeException(e);
                    Errors.add(e);
                    //System.out.println(Errors);

                }
            }
            // Add identifier to the symbol table
            symbolTable.insert(identifier);
            //
            dec.setIdentifier1(visitIdentifier(ctx.identifier().get(0)));

            // Check if the initial value is valid
        if (ctx.OPERATION() != null) {
            dec.setOperation(new Operation(ctx.OPERATION().getText()));
            String initialValueText = ctx.identifier(1).getText();
            // Convert the initial value to the appropriate data type
            Object value = convertStringToValue(initialValueText, dec.getDataType().getString());
            identifier.setInitialValue(value);
            dec.setIdentifier2(visitIdentifier(ctx.identifier().get(1)));
        }
        }
        return dec;
    }
    //check the datatype for the initial value
    private Object convertStringToValue(String valueText, String dataType) {
        try {
        switch (dataType) {
            case "int":
                    return Integer.valueOf(valueText);
            case "float":
                return Float.valueOf(valueText);
            case "double":
                return Double.valueOf(valueText);
            case "bool":
                return Boolean.valueOf(valueText);
            case "string":
                return valueText;
            case "char":
                return valueText.charAt(0);
            case "long":
                return Long.valueOf(valueText);
            case "var":
                return valueText;
            default:
                throw new IllegalArgumentException("Unsupported data type: " + dataType);
        }}catch (Exception e){
            try {
                throw new ASSIGNMENT_ERROR();
            } catch (ASSIGNMENT_ERROR ex) {
                throw new RuntimeException(ex);
            }
        }
    }
    public Identifier visitIdentifier(comParser.IdentifierContext ctx) {
        Identifier identifier = new Identifier();
        if (ctx.PARAMETER() != null)
            identifier.setParameter(ctx.PARAMETER().getText());
        return identifier;
    }

    @Override
    public Exp visitExp(comParser.ExpContext ctx) {
        Exp exp = new Exp();
        try {
        if (ctx.identifier() != null) {
            // Retrieve the existing MyIdentifier object from the symbol table
            String name = ctx.identifier().getText();
            MyIdentifier myIdentifier = symbolTable.lookup(name);
            if (myIdentifier == null) {
                    throw new VARIBALE_ERROR(name);
            } else {
                // Set the identifier and its type and scope information in the expression
                exp.setIdentifier(visitIdentifier(ctx.identifier()));
            }

        if (ctx.exp1() != null) {
            exp.setExp1(visitExp1(ctx.exp1()));
        }
        // Check if the expression has a valid data type
        if (exp.getIdentifier() != null && exp.getExp1() != null && myIdentifier.getType().isValidValue(exp.getExp1().getIdentifiers().get(0).getParameter())) {
            myIdentifier.setInitialValue(exp.getExp1().getIdentifiers().get(0).getParameter());
        } else {
            // Handle error: invalid data type for expression
            throw new ASSIGNMENT_ERROR();
        }
        }
        } catch (DartError e) {
            //throw new RuntimeException(e);
            Errors.add(e);
          //  System.err.println(Errors);
        }
        return exp;


    }

    @Override
    public Exp1 visitExp1(comParser.Exp1Context ctx) {
        Exp1 exp1 = new Exp1();

        List<Operation> operations = new ArrayList<>();

        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.OPERATION() != null) {
            for (int i = 0; i < ctx.OPERATION().size(); i++) {
                operations.add(new Operation(ctx.OPERATION(i).getText()));
            }
            exp1.setOperations(operations);
        }

        if (ctx.identifier()!=null) {
                for (int i = 0; i < ctx.identifier().size(); i++){
                    identifiers.add(visitIdentifier(ctx.identifier(i)));
            }
            exp1.setIdentifiers(identifiers);
        }
        return exp1;
    }

    @Override
    public Condition visitConditions(comParser.ConditionsContext ctx) {
        Condition condition = new Condition();

        List<ElseIf> _elseif = new ArrayList<>();


        if (ctx.if_() != null) {
            condition.set_if(visitIf(ctx.if_()));
        }
        if (ctx.else_() != null) {
            condition.set_else(visitElse(ctx.else_()));
        }
        if (ctx.else_if() != null) {
            for (int i=0;i< _elseif.size();i++) {
                _elseif.add(visitElse_if(ctx.else_if(i)));
            }
            condition.set_elseif(_elseif);
        }
        return condition;
    }

    @Override
    public If visitIf(comParser.IfContext ctx) {
        If iff = new If();

        List<Identifier> identifiers = new ArrayList<>();
        List<Operation> operations = new ArrayList<>();

        iff.set_if(new Ifw(ctx.IF().getText()));
        if (ctx.OPERATION() != null) {
            for (int i = 0; i < ctx.OPERATION().size(); i++)
                operations.add(new Operation(ctx.OPERATION(i).getText()));
            iff.setOperation(operations);
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++)
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            iff.setIdentifiers(identifiers);
        }

        if (ctx.if_body() != null) {
            iff.setIfBody(visitIf_body(ctx.if_body()));
        }

        return iff;
    }

    @Override
    public IfBody visitIf_body(comParser.If_bodyContext ctx) {
        IfBody ifBody = new IfBody();

        List<Program> programs = new ArrayList<>();
        List<TextFormFiled> textFormFileds = new ArrayList<>();

        if (ctx.program() != null) {
            for (int i = 0; i <ctx.program().size(); i++)
                programs.add(visitProgram(ctx.program(i)));
            ifBody.setProgram(programs);
        }
        if (ctx.button() != null) {
            ifBody.setButton(visitButton(ctx.button()));
        }
        if (ctx.textFormField() != null) {
            for (int i = 0; i <ctx.textFormField().size(); i++)
                textFormFileds.add(visitTextFormField(ctx.textFormField(i)));
            ifBody.setTextFormFileds(textFormFileds);
        }

        return ifBody;
    }

    @Override
    public Else visitElse(comParser.ElseContext ctx) {
        Else elsee = new Else();
        if (ctx.if_body() != null)
            elsee.setIfBody(visitIf_body(ctx.if_body()));
        return elsee;
    }

    @Override
    public ElseIf visitElse_if(comParser.Else_ifContext ctx) {
        ElseIf elseIf = new ElseIf();

        return elseIf;
    }

    @Override
    public For visitFor(comParser.ForContext ctx) {
        For forr = new For();
        if (ctx.FOR() != null)
            forr.setFOR(String.valueOf(ctx.FOR()));
        if (ctx.init() != null)
            forr.setInit(visitInit(ctx.init()));
        if (ctx.exp() != null)
            forr.setExp(visitExp(ctx.exp()));
        if (ctx.increment_section() != null)
            forr.setIncSec(visitIncrement_section(ctx.increment_section()));
        if (ctx.for_body() != null)
            forr.setForBody(visitFor_body(ctx.for_body()));

        return forr;
    }

    @Override
    public Init visitInit(comParser.InitContext ctx) {
        Init init = new Init();
        if (ctx.dec() != null)
            init.setDec(visitDec(ctx.dec()));
        if (ctx.exp() != null)
            init.setExp(visitExp(ctx.exp()));
        return init;
    }

    @Override
    public IncrementSection visitIncrement_section(comParser.Increment_sectionContext ctx) {
        IncrementSection incrementSection = new IncrementSection();

        List<Identifier> identifiers = new ArrayList<>();
        List<Operation> operations = new ArrayList<>();

        if (ctx.OPERATION() != null) {
            for (int i = 0; i < ctx.OPERATION().size(); i++)
                operations.add(new Operation(ctx.OPERATION(i).getText()));
            incrementSection.setOperations(operations);
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++)
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            incrementSection.setIdentifiers(identifiers);
        }
        return incrementSection;

    }


    @Override
    public ForBody visitFor_body(comParser.For_bodyContext ctx) {
        ForBody forBody = new ForBody();

        List<Program> programs = new ArrayList<>();

        if (ctx.program() != null) {
            for (int i = 0; i < programs.size(); i++)
                programs.add(visitProgram(ctx.program(i)));
            forBody.setProgram(programs);
        }

        return forBody;
    }

    @Override
    public While visitWhile(comParser.WhileContext ctx) {
        While aWhile = new While();

        List<Identifier> identifiers = new ArrayList<>();
        List<Operation> operations = new ArrayList<>();

        aWhile.setWhilew(new Whilew(ctx.WHILE().getText()));
        if (ctx.OPERATION() != null) {
            for (int i = 0; i < ctx.OPERATION().size(); i++)
                operations.add(new Operation(ctx.OPERATION(i).getText()));
            aWhile.setOperations(operations);
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++)
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            aWhile.setIdentifiers(identifiers);
        }

        if (ctx.while_body() != null) {
            aWhile.setWhileBody(visitWhile_body(ctx.while_body()));
        }

        return aWhile;
    }

    @Override
    public WhileBody visitWhile_body(comParser.While_bodyContext ctx) {
        WhileBody whileBody = new WhileBody();

        if (ctx.for_body() != null)
            whileBody.setForBody(visitFor_body(ctx.for_body()));

        return whileBody;
    }

    @Override
    public Function visitFunction(comParser.FunctionContext ctx) {
        Function function = new Function();

        List<Dec> decs = new ArrayList<>();

        if (ctx.DATA_TYPE() != null){
            function.setDataType(new DataType(ctx.DATA_TYPE().getText()));
        }
        if (ctx.identifier() != null) {
            function.setIdentifier(visitIdentifier(ctx.identifier()));
        }

        // Insert the function name and type into the symbol table
        MyIdentifier myIdentifier = new MyIdentifier(ctx.identifier().getText(), function.getDataType(), null, ctx.getStart().getLine());
        symbolTable.insert(myIdentifier);

        if (ctx.dec() != null) {
            for (int i = 0; i < ctx.dec().size(); i++) {
                Dec dec = visitDec(ctx.dec(i));
                decs.add(dec);

            }
            function.setDec(decs);
        }
        if (ctx.function_body() != null) {
            function.setFunBody(visitFunction_body(ctx.function_body()));
        }
        return function;
    }

    @Override
    public FunctionBody visitFunction_body(comParser.Function_bodyContext ctx) {
        FunctionBody functionBody = new FunctionBody();

        if (ctx.for_body() != null)
            functionBody.setForBody(visitFor_body(ctx.for_body()));

        return functionBody;
    }

    @Override
    public Classs visitClass(comParser.ClassContext ctx) {
        Classs classs = new Classs();

        if (ctx.KEYWORD() != null)
            classs.setKeyword(new Keyword(ctx.KEYWORD().getText()));
        if (ctx.identifier() != null)
            classs.setIdentifier(visitIdentifier(ctx.identifier()));
        // Insert the class name and type into the symbol table
        MyIdentifier myIdentifier = new MyIdentifier(classs.getIdentifier().getParameter(), null, null, ctx.getStart().getLine());
        symbolTable.insert(myIdentifier);

        if (ctx.class_body() != null)
            classs.setClasssBody(visitClass_body(ctx.class_body()));

        return classs;

    }

    @Override
    public ClasssBody visitClass_body(comParser.Class_bodyContext ctx) {
        ClasssBody classsBody = new ClasssBody();

        List<Program> programs = new ArrayList<>();

        if (ctx.program() != null) {
            for (int i = 0; i < programs.size(); i++)
                programs.add(visitProgram(ctx.program(i)));
            classsBody.setPrograms(programs);
        }

        if (ctx.constructor() != null)
            classsBody.setConstructors(visitConstructor(ctx.constructor()));

        return classsBody;
    }

    @Override
    public Constructorr visitConstructor(comParser.ConstructorContext ctx) {
        Constructorr constructorr = new Constructorr();

        List<ConstructorrHeader> constructorrHeader = new ArrayList<>();


        if (ctx.identifier() != null)
            constructorr.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.constructor_header() != null) {
            for (int i = 0; i <ctx.constructor_header().size(); i++)
                constructorrHeader.add(visitConstructor_header(ctx.constructor_header(i)));
            constructorr.setConstructorrHeader(constructorrHeader);
        }
        if (ctx.constructor_body() != null)
            constructorr.setConstructorrBody(visitConstructor_body(ctx.constructor_body()));

        return constructorr;
    }

    @Override
    public ConstructorrHeader visitConstructor_header(comParser.Constructor_headerContext ctx) {
        ConstructorrHeader constructorrHeader = new ConstructorrHeader();

        List<DataType> dataType = new ArrayList<>();
        List<Identifier> identifier = new ArrayList<>();

        if (ctx.DATA_TYPE() != null) {
            for (int i = 0; i < ctx.DATA_TYPE().size(); i++)
                dataType.add(new DataType(ctx.DATA_TYPE(i).getText()));
            constructorrHeader.setDataType(dataType);
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++)
                identifier.add((visitIdentifier(ctx.identifier(i))));
            constructorrHeader.setIdentifier(identifier);
        }
        return constructorrHeader;
    }

    @Override
    public ConstructorrBody visitConstructor_body(comParser.Constructor_bodyContext ctx) {
        ConstructorrBody constructorrBody = new ConstructorrBody();

        List<Keyword> keywords = new ArrayList<>();
        List<Init> inits = new ArrayList<>();

        if (ctx.KEYWORD() != null) {
            for (int i = 0; i < ctx.KEYWORD().size(); i++) {
                keywords.add(new Keyword(ctx.KEYWORD(i).getText()));
            }
            constructorrBody.setKeywords(keywords);
        }
        if (ctx.init() != null) {
            for (int i = 0; i < ctx.init().size(); i++)
                inits.add((visitInit(ctx.init(i))));
        }
        constructorrBody.setInits(inits);
        return constructorrBody;
    }


    @Override
    public Loop visitLoop(comParser.LoopContext ctx) {
        Loop loop = new Loop();

        if (ctx.for_() != null)
            loop.set_for(visitFor(ctx.for_()));
        if (ctx.while_() != null)
            loop.set_while(visitWhile(ctx.while_()));
        return loop;
    }

    @Override
    public CallFunction visitCall_function(comParser.Call_functionContext ctx) {
        CallFunction callFunction = new CallFunction();
        try{
        if (ctx.identifier() != null)
            callFunction.setIdentifier(visitIdentifier(ctx.identifier()));
        if (ctx.header_body() != null)
            callFunction.setHeaderBody(visitHeader_body(ctx.header_body()));
        // Lookup the function in the symbol table
        MyIdentifier myIdentifier = symbolTable.lookup(callFunction.getIdentifier().getParameter());
        if (myIdentifier == null) {
            //DartError.ErrorType.SEMANTIC_ERROR,, ctx.getStart().getCharPositionInLine()
                throw new CALLFUNCTION_ERROR(
                        callFunction.getIdentifier().getParameter());
            }
        }
        catch (DartError e) {
            //throw new RuntimeException(e);
            Errors.add(e);
          //  System.err.println(Errors);
        }
        return callFunction;
    }

    @Override
    public HeaderBody visitHeader_body(comParser.Header_bodyContext ctx) {
        HeaderBody headerBody = new HeaderBody();

        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }
            headerBody.setIdentifiers(identifiers);
        }
        return headerBody;
    }

    @Override
    public Listt visitList(comParser.ListContext ctx) {
        Listt listt = new Listt();

        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.DATA_TYPE() != null) {
            listt.setDataType(new DataType(ctx.DATA_TYPE().getText()));
        }

        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                Identifier identifier = visitIdentifier(ctx.identifier(i));
                identifiers.add(identifier);
                // Add the identifier to the symbol table
            }
                MyIdentifier myIdentifier = new MyIdentifier(identifiers.get(0).getParameter(), listt.getDataType(), null, ctx.getStart().getLine());
                symbolTable.insert(myIdentifier);
            listt.setIdentifiers(identifiers);
        }

        if (ctx.OPERATION() != null)
            listt.setOperation(new Operation(ctx.OPERATION().getText()));

        if (ctx.KEYWORD() != null)
            listt.setKeyword(new Keyword(ctx.KEYWORD().getText()));

        return listt;

    }

    @Override
    public ListAsParameter visitList_as_parameter(comParser.List_as_parameterContext ctx) {
        ListAsParameter listAsParameter = new ListAsParameter();

        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }

                // Lookup the identifier in the symbol table and set its value
                String name = ctx.identifier(0).getText();
            MyIdentifier myIdentifier = symbolTable.lookup(name);
            if (myIdentifier == null){
                // Handle error: identifier not found in symbol table
                try {
                    //DartError.ErrorType.SEMANTIC_ERROR,, ctx.getStart().getCharPositionInLine()
                    throw new CALLLIST_ERROR(
                           name);
                } catch (DartError e) {
                    //throw new RuntimeException(e);
                    Errors.add(e);
                   // System.err.println(Errors);
                }

            }
            listAsParameter.setIdentifiers(identifiers);
        }

        if (ctx.OPERATION() != null)
            listAsParameter.setOperation(new Operation(ctx.OPERATION().getText()));

        return listAsParameter;

    }


    @Override
    public Container visitContainer(comParser.ContainerContext ctx) {
        Container container = new Container();

        List<Identifier> identifiers = new ArrayList<>();
        List<String> cProperties = new ArrayList<>();

        if (ctx.CONTAINER() != null) {
            container.setContainer(String.valueOf((ctx.CONTAINER())));
        }


        if (ctx.C_PROPERTIES()!=null) {
            for (int i = 0; i < ctx.C_PROPERTIES().size(); i++) {
                String cProperty = ctx.C_PROPERTIES(i).getText();
                if (cProperties.contains(cProperty)) {
                    // Throw a DartError if the cProperty has already been declared
                    try {
                        //DartError.ErrorType.SEMANTIC_ERROR,, ctx.getStart().getCharPositionInLine()
                        throw new CONTAINER_ERROR(
                                cProperty);
                    } catch (DartError e) {
                        //throw new RuntimeException(e);
                        Errors.add(e);
                        //System.err.println(Errors);
                    }
                } else {
                    cProperties.add(cProperty);
                    container.setC_Properties(cProperties);
                }
            }
        }
        if (ctx.text() != null)
            container.setText(visitText(ctx.text()));
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }
            container.setIdentifiers(identifiers);
        }
        if (ctx.program() != null)
            container.setProgram(visitProgram(ctx.program()));

        return container;
    }

    @Override
    public Text visitText(comParser.TextContext ctx) {
        Text text = new Text();

        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.TEXT() != null)
            text.setText(String.valueOf((ctx.TEXT())));
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }
            text.setIdentifiers(identifiers);
        }
        if (ctx.program() != null)
            text.setProgram(visitProgram(ctx.program()));
        return text;

    }

    @Override
    public ListWedget visitListwedget(comParser.ListwedgetContext ctx) {
        ListWedget listWedget = new ListWedget();

        List<Container> containers = new ArrayList<>();
        List<Text> texts = new ArrayList<>();
        List<TextFormFiled> textFormFileds = new ArrayList<>();
        List<Button> buttons = new ArrayList<>();

        if (ctx.LISTT() != null) {
            listWedget.setListWedget(String.valueOf((ctx.LISTT())));
        }
        if (ctx.text() != null) {
            for (int i = 0; i < ctx.text().size(); i++) {
                texts.add((visitText(ctx.text(i))));
            }
            listWedget.setTexts(texts);
        }
        if (ctx.container() != null) {
            for (int i = 0; i < ctx.container().size(); i++) {
                containers.add((visitContainer(ctx.container(i))));
            }
            listWedget.setContainers(containers);
        }
        if (ctx.textFormField() != null) {
            for (int i = 0; i < ctx.textFormField().size(); i++) {
                textFormFileds.add((visitTextFormField(ctx.textFormField(i))));
            }
            listWedget.setTextFormFileds(textFormFileds);
        }
        if (ctx.button() != null) {
            for (int i = 0; i < ctx.button().size(); i++) {
                buttons.add((visitButton(ctx.button(i))));
            }
            listWedget.setButtons(buttons);
        }
        if (ctx.if_() != null) {
            listWedget.setIff(visitIf(ctx.if_()));
        }
        return listWedget;
    }

    @Override
    public TextFormFiled visitTextFormField(comParser.TextFormFieldContext ctx) {
        TextFormFiled textFormFiled = new TextFormFiled();
        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.TextFormFiled() != null) {
            textFormFiled.setTextFormField(String.valueOf((ctx.TextFormFiled())));
        }
        if (ctx.LABEL() != null) {
            textFormFiled.setLabel(String.valueOf((ctx.LABEL())));
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }
            textFormFiled.setIdentifiers(identifiers);
        }
        if (ctx.CONTROLLER() != null) {
            textFormFiled.setController(String.valueOf((ctx.CONTROLLER())));
        }
        if (ctx.program() != null) {
            textFormFiled.setProgram(visitProgram(ctx.program()));
        }
        return textFormFiled;
    }

    @Override
    public Button visitButton(comParser.ButtonContext ctx) {
        Button button = new Button();
        List<Identifier> identifiers = new ArrayList<>();

        if (ctx.BUTTON() != null) {
            button.setButton(String.valueOf((ctx.BUTTON())));
        }
        if (ctx.LABEL() != null) {
            button.setLabel(String.valueOf((ctx.LABEL())));
        }
        if (ctx.identifier() != null) {
            for (int i = 0; i < ctx.identifier().size(); i++) {
                identifiers.add((visitIdentifier(ctx.identifier(i))));
            }
            button.setIdentifiers(identifiers);
        }
        if (ctx.ONPRESSED() != null) {
            button.setOnPressed(String.valueOf((ctx.ONPRESSED())));
        }
        if (ctx.NAVIGATOR() != null) {
            button.setNavigator(String.valueOf((ctx.NAVIGATOR())));
        }

        if (ctx.program() != null) {
            button.setProgram(visitProgram(ctx.program()));
        }
        return button;
    }
    public void printError(){
        if (Errors.size()>0){
            for (int i = 0 ; i<Errors.size();i++){
                System.err.println(Errors.get(i));
            }
            throw new RuntimeException();
        }
    }
}

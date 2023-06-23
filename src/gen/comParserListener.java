// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link comParser}.
 */
public interface comParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link comParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(comParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(comParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(comParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(comParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(comParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(comParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#exp1}.
	 * @param ctx the parse tree
	 */
	void enterExp1(comParser.Exp1Context ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#exp1}.
	 * @param ctx the parse tree
	 */
	void exitExp1(comParser.Exp1Context ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#conditions}.
	 * @param ctx the parse tree
	 */
	void enterConditions(comParser.ConditionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#conditions}.
	 * @param ctx the parse tree
	 */
	void exitConditions(comParser.ConditionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(comParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(comParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#if_body}.
	 * @param ctx the parse tree
	 */
	void enterIf_body(comParser.If_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#if_body}.
	 * @param ctx the parse tree
	 */
	void exitIf_body(comParser.If_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_if(comParser.Else_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_if(comParser.Else_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(comParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(comParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(comParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(comParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(comParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(comParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#increment_section}.
	 * @param ctx the parse tree
	 */
	void enterIncrement_section(comParser.Increment_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#increment_section}.
	 * @param ctx the parse tree
	 */
	void exitIncrement_section(comParser.Increment_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#for_body}.
	 * @param ctx the parse tree
	 */
	void enterFor_body(comParser.For_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#for_body}.
	 * @param ctx the parse tree
	 */
	void exitFor_body(comParser.For_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(comParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(comParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#while_body}.
	 * @param ctx the parse tree
	 */
	void enterWhile_body(comParser.While_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#while_body}.
	 * @param ctx the parse tree
	 */
	void exitWhile_body(comParser.While_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(comParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(comParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#function_body}.
	 * @param ctx the parse tree
	 */
	void enterFunction_body(comParser.Function_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#function_body}.
	 * @param ctx the parse tree
	 */
	void exitFunction_body(comParser.Function_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#class}.
	 * @param ctx the parse tree
	 */
	void enterClass(comParser.ClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#class}.
	 * @param ctx the parse tree
	 */
	void exitClass(comParser.ClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#class_body}.
	 * @param ctx the parse tree
	 */
	void enterClass_body(comParser.Class_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#class_body}.
	 * @param ctx the parse tree
	 */
	void exitClass_body(comParser.Class_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#constructor}.
	 * @param ctx the parse tree
	 */
	void enterConstructor(comParser.ConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#constructor}.
	 * @param ctx the parse tree
	 */
	void exitConstructor(comParser.ConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#constructor_header}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_header(comParser.Constructor_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#constructor_header}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_header(comParser.Constructor_headerContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void enterConstructor_body(comParser.Constructor_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#constructor_body}.
	 * @param ctx the parse tree
	 */
	void exitConstructor_body(comParser.Constructor_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(comParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(comParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(comParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(comParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#call_function}.
	 * @param ctx the parse tree
	 */
	void enterCall_function(comParser.Call_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#call_function}.
	 * @param ctx the parse tree
	 */
	void exitCall_function(comParser.Call_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#space}.
	 * @param ctx the parse tree
	 */
	void enterSpace(comParser.SpaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#space}.
	 * @param ctx the parse tree
	 */
	void exitSpace(comParser.SpaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#header_body}.
	 * @param ctx the parse tree
	 */
	void enterHeader_body(comParser.Header_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#header_body}.
	 * @param ctx the parse tree
	 */
	void exitHeader_body(comParser.Header_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#bracket}.
	 * @param ctx the parse tree
	 */
	void enterBracket(comParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#bracket}.
	 * @param ctx the parse tree
	 */
	void exitBracket(comParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#square_bracket}.
	 * @param ctx the parse tree
	 */
	void enterSquare_bracket(comParser.Square_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#square_bracket}.
	 * @param ctx the parse tree
	 */
	void exitSquare_bracket(comParser.Square_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#array_bracket}.
	 * @param ctx the parse tree
	 */
	void enterArray_bracket(comParser.Array_bracketContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#array_bracket}.
	 * @param ctx the parse tree
	 */
	void exitArray_bracket(comParser.Array_bracketContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(comParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(comParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#list_as_parameter}.
	 * @param ctx the parse tree
	 */
	void enterList_as_parameter(comParser.List_as_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#list_as_parameter}.
	 * @param ctx the parse tree
	 */
	void exitList_as_parameter(comParser.List_as_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(comParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(comParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(comParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(comParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#listwedget}.
	 * @param ctx the parse tree
	 */
	void enterListwedget(comParser.ListwedgetContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#listwedget}.
	 * @param ctx the parse tree
	 */
	void exitListwedget(comParser.ListwedgetContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#textFormField}.
	 * @param ctx the parse tree
	 */
	void enterTextFormField(comParser.TextFormFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#textFormField}.
	 * @param ctx the parse tree
	 */
	void exitTextFormField(comParser.TextFormFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link comParser#button}.
	 * @param ctx the parse tree
	 */
	void enterButton(comParser.ButtonContext ctx);
	/**
	 * Exit a parse tree produced by {@link comParser#button}.
	 * @param ctx the parse tree
	 */
	void exitButton(comParser.ButtonContext ctx);
}
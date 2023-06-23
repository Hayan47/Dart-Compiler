// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link comParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface comParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link comParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(comParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(comParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(comParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#exp1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp1(comParser.Exp1Context ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(comParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(comParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#if_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_body(comParser.If_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(comParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(comParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(comParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(comParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#increment_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrement_section(comParser.Increment_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#for_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_body(comParser.For_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(comParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#while_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_body(comParser.While_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(comParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(comParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(comParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#class_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_body(comParser.Class_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(comParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#constructor_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_header(comParser.Constructor_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#constructor_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor_body(comParser.Constructor_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(comParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(comParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(comParser.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpace(comParser.SpaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#header_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_body(comParser.Header_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(comParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#square_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSquare_bracket(comParser.Square_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#array_bracket}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_bracket(comParser.Array_bracketContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(comParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#list_as_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_as_parameter(comParser.List_as_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(comParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(comParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#listwedget}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListwedget(comParser.ListwedgetContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#textFormField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextFormField(comParser.TextFormFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link comParser#button}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitButton(comParser.ButtonContext ctx);
}
// Generated from D:/Lenguajes/Lab3/TraductorPSICODER/lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiLenguajeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiLenguajeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funcandstruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncandstruct(MiLenguajeParser.FuncandstructContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declarearguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarearguments(MiLenguajeParser.DeclareargumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declareargumentslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareargumentslist(MiLenguajeParser.DeclareargumentslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#mainfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainfunction(MiLenguajeParser.MainfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#standardtype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandardtype(MiLenguajeParser.StandardtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#funccontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccontent(MiLenguajeParser.FunccontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#structcontent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructcontent(MiLenguajeParser.StructcontentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MiLenguajeParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MiLenguajeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#argumentlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentlist(MiLenguajeParser.ArgumentlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#binaryoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryoperator(MiLenguajeParser.BinaryoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#unaryoperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryoperator(MiLenguajeParser.UnaryoperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#declarationlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationlist(MiLenguajeParser.DeclarationlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionlist(MiLenguajeParser.InstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(MiLenguajeParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(MiLenguajeParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#whilePSI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilePSI(MiLenguajeParser.WhilePSIContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#forPSI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForPSI(MiLenguajeParser.ForPSIContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDowhile(MiLenguajeParser.DowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#switchPSI}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchPSI(MiLenguajeParser.SwitchPSIContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#caselist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaselist(MiLenguajeParser.CaselistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#expressionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionlist(MiLenguajeParser.ExpressionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#structurelist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructurelist(MiLenguajeParser.StructurelistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#stinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStinstructionlist(MiLenguajeParser.StinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#fninstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFninstructionlist(MiLenguajeParser.FninstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#ifinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfinstructionlist(MiLenguajeParser.IfinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#whinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhinstructionlist(MiLenguajeParser.WhinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#frinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrinstructionlist(MiLenguajeParser.FrinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dwinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDwinstructionlist(MiLenguajeParser.DwinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#swinstructionlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwinstructionlist(MiLenguajeParser.SwinstructionlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiLenguajeParser#dwinstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDwinstruction(MiLenguajeParser.DwinstructionContext ctx);
}
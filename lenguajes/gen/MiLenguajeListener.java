// Generated from D:/Lenguajes/Lab3/TraductorPSICODER/lenguajes/grammar\MiLenguaje.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiLenguajeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funcandstruct}.
	 * @param ctx the parse tree
	 */
	void enterFuncandstruct(MiLenguajeParser.FuncandstructContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funcandstruct}.
	 * @param ctx the parse tree
	 */
	void exitFuncandstruct(MiLenguajeParser.FuncandstructContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declarearguments}.
	 * @param ctx the parse tree
	 */
	void enterDeclarearguments(MiLenguajeParser.DeclareargumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declarearguments}.
	 * @param ctx the parse tree
	 */
	void exitDeclarearguments(MiLenguajeParser.DeclareargumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declareargumentslist}.
	 * @param ctx the parse tree
	 */
	void enterDeclareargumentslist(MiLenguajeParser.DeclareargumentslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declareargumentslist}.
	 * @param ctx the parse tree
	 */
	void exitDeclareargumentslist(MiLenguajeParser.DeclareargumentslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#mainfunction}.
	 * @param ctx the parse tree
	 */
	void enterMainfunction(MiLenguajeParser.MainfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#mainfunction}.
	 * @param ctx the parse tree
	 */
	void exitMainfunction(MiLenguajeParser.MainfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiLenguajeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#standardtype}.
	 * @param ctx the parse tree
	 */
	void enterStandardtype(MiLenguajeParser.StandardtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#standardtype}.
	 * @param ctx the parse tree
	 */
	void exitStandardtype(MiLenguajeParser.StandardtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#funccontent}.
	 * @param ctx the parse tree
	 */
	void enterFunccontent(MiLenguajeParser.FunccontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#funccontent}.
	 * @param ctx the parse tree
	 */
	void exitFunccontent(MiLenguajeParser.FunccontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#structcontent}.
	 * @param ctx the parse tree
	 */
	void enterStructcontent(MiLenguajeParser.StructcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#structcontent}.
	 * @param ctx the parse tree
	 */
	void exitStructcontent(MiLenguajeParser.StructcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiLenguajeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiLenguajeParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiLenguajeParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MiLenguajeParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MiLenguajeParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void enterArgumentlist(MiLenguajeParser.ArgumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#argumentlist}.
	 * @param ctx the parse tree
	 */
	void exitArgumentlist(MiLenguajeParser.ArgumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryoperator(MiLenguajeParser.BinaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#binaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryoperator(MiLenguajeParser.BinaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(MiLenguajeParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(MiLenguajeParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationlist(MiLenguajeParser.DeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declarationlist}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationlist(MiLenguajeParser.DeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instructionlist}.
	 * @param ctx the parse tree
	 */
	void enterInstructionlist(MiLenguajeParser.InstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instructionlist}.
	 * @param ctx the parse tree
	 */
	void exitInstructionlist(MiLenguajeParser.InstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(MiLenguajeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(MiLenguajeParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(MiLenguajeParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(MiLenguajeParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#whilePSI}.
	 * @param ctx the parse tree
	 */
	void enterWhilePSI(MiLenguajeParser.WhilePSIContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#whilePSI}.
	 * @param ctx the parse tree
	 */
	void exitWhilePSI(MiLenguajeParser.WhilePSIContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#forPSI}.
	 * @param ctx the parse tree
	 */
	void enterForPSI(MiLenguajeParser.ForPSIContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#forPSI}.
	 * @param ctx the parse tree
	 */
	void exitForPSI(MiLenguajeParser.ForPSIContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void enterDowhile(MiLenguajeParser.DowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dowhile}.
	 * @param ctx the parse tree
	 */
	void exitDowhile(MiLenguajeParser.DowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#switchPSI}.
	 * @param ctx the parse tree
	 */
	void enterSwitchPSI(MiLenguajeParser.SwitchPSIContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#switchPSI}.
	 * @param ctx the parse tree
	 */
	void exitSwitchPSI(MiLenguajeParser.SwitchPSIContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#caselist}.
	 * @param ctx the parse tree
	 */
	void enterCaselist(MiLenguajeParser.CaselistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#caselist}.
	 * @param ctx the parse tree
	 */
	void exitCaselist(MiLenguajeParser.CaselistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(MiLenguajeParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(MiLenguajeParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#structurelist}.
	 * @param ctx the parse tree
	 */
	void enterStructurelist(MiLenguajeParser.StructurelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#structurelist}.
	 * @param ctx the parse tree
	 */
	void exitStructurelist(MiLenguajeParser.StructurelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#stinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterStinstructionlist(MiLenguajeParser.StinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#stinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitStinstructionlist(MiLenguajeParser.StinstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#fninstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterFninstructionlist(MiLenguajeParser.FninstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#fninstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitFninstructionlist(MiLenguajeParser.FninstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#ifinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterIfinstructionlist(MiLenguajeParser.IfinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#ifinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitIfinstructionlist(MiLenguajeParser.IfinstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#whinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterWhinstructionlist(MiLenguajeParser.WhinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#whinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitWhinstructionlist(MiLenguajeParser.WhinstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#frinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterFrinstructionlist(MiLenguajeParser.FrinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#frinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitFrinstructionlist(MiLenguajeParser.FrinstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#dwinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterDwinstructionlist(MiLenguajeParser.DwinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#dwinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitDwinstructionlist(MiLenguajeParser.DwinstructionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#swinstructionlist}.
	 * @param ctx the parse tree
	 */
	void enterSwinstructionlist(MiLenguajeParser.SwinstructionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#swinstructionlist}.
	 * @param ctx the parse tree
	 */
	void exitSwinstructionlist(MiLenguajeParser.SwinstructionlistContext ctx);
}
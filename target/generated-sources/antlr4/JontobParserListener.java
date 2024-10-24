// Generated from JontobParser.g4 by ANTLR 4.13.2

package org.example.aufgabe2;
import org.example.aufgabe2.JontobLexer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JontobParser}.
 */
public interface JontobParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JontobParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(JontobParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(JontobParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(JontobParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(JontobParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(JontobParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(JontobParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(JontobParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(JontobParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(JontobParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(JontobParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(JontobParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(JontobParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JontobParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(JontobParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JontobParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(JontobParser.ValueContext ctx);
}
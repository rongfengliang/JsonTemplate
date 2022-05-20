// Generated from com/github/jsontemplate/antlr4/JsonTemplateAntlr.g4 by ANTLR 4.7
package com.github.jsontemplate.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JsonTemplateAntlrParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JsonTemplateAntlrVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JsonTemplateAntlrParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#templatePart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplatePart(JsonTemplateAntlrParser.TemplatePartContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#jsonObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonObject(JsonTemplateAntlrParser.JsonObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#objectTypeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectTypeInfo(JsonTemplateAntlrParser.ObjectTypeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperties(JsonTemplateAntlrParser.PropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(JsonTemplateAntlrParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#singleProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleProperty(JsonTemplateAntlrParser.SinglePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#pairProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairProperty(JsonTemplateAntlrParser.PairPropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#propertyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyName(JsonTemplateAntlrParser.PropertyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(JsonTemplateAntlrParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#typeDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDef(JsonTemplateAntlrParser.TypeDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(JsonTemplateAntlrParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#propertyValueSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyValueSpec(JsonTemplateAntlrParser.PropertyValueSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#propertyVariableWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyVariableWrapper(JsonTemplateAntlrParser.PropertyVariableWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#jsonValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonValue(JsonTemplateAntlrParser.JsonValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#typeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInfo(JsonTemplateAntlrParser.TypeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#typeParamSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParamSpec(JsonTemplateAntlrParser.TypeParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#variableWrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableWrapper(JsonTemplateAntlrParser.VariableWrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#singleParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleParam(JsonTemplateAntlrParser.SingleParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#listParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListParams(JsonTemplateAntlrParser.ListParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#mapParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapParams(JsonTemplateAntlrParser.MapParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#mapParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapParam(JsonTemplateAntlrParser.MapParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#jsonArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonArray(JsonTemplateAntlrParser.JsonArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#arrayTypeInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeInfo(JsonTemplateAntlrParser.ArrayTypeInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#itemsArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItemsArray(JsonTemplateAntlrParser.ItemsArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#arrayParamSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayParamSpec(JsonTemplateAntlrParser.ArrayParamSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#items}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItems(JsonTemplateAntlrParser.ItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(JsonTemplateAntlrParser.ItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(JsonTemplateAntlrParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link JsonTemplateAntlrParser#variableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableName(JsonTemplateAntlrParser.VariableNameContext ctx);
}
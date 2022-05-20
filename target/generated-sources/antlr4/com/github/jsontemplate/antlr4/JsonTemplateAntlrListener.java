// Generated from com/github/jsontemplate/antlr4/JsonTemplateAntlr.g4 by ANTLR 4.7
package com.github.jsontemplate.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JsonTemplateAntlrParser}.
 */
public interface JsonTemplateAntlrListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(JsonTemplateAntlrParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(JsonTemplateAntlrParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#templatePart}.
	 * @param ctx the parse tree
	 */
	void enterTemplatePart(JsonTemplateAntlrParser.TemplatePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#templatePart}.
	 * @param ctx the parse tree
	 */
	void exitTemplatePart(JsonTemplateAntlrParser.TemplatePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void enterJsonObject(JsonTemplateAntlrParser.JsonObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#jsonObject}.
	 * @param ctx the parse tree
	 */
	void exitJsonObject(JsonTemplateAntlrParser.JsonObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#objectTypeInfo}.
	 * @param ctx the parse tree
	 */
	void enterObjectTypeInfo(JsonTemplateAntlrParser.ObjectTypeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#objectTypeInfo}.
	 * @param ctx the parse tree
	 */
	void exitObjectTypeInfo(JsonTemplateAntlrParser.ObjectTypeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterProperties(JsonTemplateAntlrParser.PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitProperties(JsonTemplateAntlrParser.PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(JsonTemplateAntlrParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(JsonTemplateAntlrParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#singleProperty}.
	 * @param ctx the parse tree
	 */
	void enterSingleProperty(JsonTemplateAntlrParser.SinglePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#singleProperty}.
	 * @param ctx the parse tree
	 */
	void exitSingleProperty(JsonTemplateAntlrParser.SinglePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#pairProperty}.
	 * @param ctx the parse tree
	 */
	void enterPairProperty(JsonTemplateAntlrParser.PairPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#pairProperty}.
	 * @param ctx the parse tree
	 */
	void exitPairProperty(JsonTemplateAntlrParser.PairPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void enterPropertyName(JsonTemplateAntlrParser.PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#propertyName}.
	 * @param ctx the parse tree
	 */
	void exitPropertyName(JsonTemplateAntlrParser.PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(JsonTemplateAntlrParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(JsonTemplateAntlrParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(JsonTemplateAntlrParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(JsonTemplateAntlrParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(JsonTemplateAntlrParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(JsonTemplateAntlrParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#propertyValueSpec}.
	 * @param ctx the parse tree
	 */
	void enterPropertyValueSpec(JsonTemplateAntlrParser.PropertyValueSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#propertyValueSpec}.
	 * @param ctx the parse tree
	 */
	void exitPropertyValueSpec(JsonTemplateAntlrParser.PropertyValueSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#propertyVariableWrapper}.
	 * @param ctx the parse tree
	 */
	void enterPropertyVariableWrapper(JsonTemplateAntlrParser.PropertyVariableWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#propertyVariableWrapper}.
	 * @param ctx the parse tree
	 */
	void exitPropertyVariableWrapper(JsonTemplateAntlrParser.PropertyVariableWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void enterJsonValue(JsonTemplateAntlrParser.JsonValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#jsonValue}.
	 * @param ctx the parse tree
	 */
	void exitJsonValue(JsonTemplateAntlrParser.JsonValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#typeInfo}.
	 * @param ctx the parse tree
	 */
	void enterTypeInfo(JsonTemplateAntlrParser.TypeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#typeInfo}.
	 * @param ctx the parse tree
	 */
	void exitTypeInfo(JsonTemplateAntlrParser.TypeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#typeParamSpec}.
	 * @param ctx the parse tree
	 */
	void enterTypeParamSpec(JsonTemplateAntlrParser.TypeParamSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#typeParamSpec}.
	 * @param ctx the parse tree
	 */
	void exitTypeParamSpec(JsonTemplateAntlrParser.TypeParamSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#variableWrapper}.
	 * @param ctx the parse tree
	 */
	void enterVariableWrapper(JsonTemplateAntlrParser.VariableWrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#variableWrapper}.
	 * @param ctx the parse tree
	 */
	void exitVariableWrapper(JsonTemplateAntlrParser.VariableWrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#singleParam}.
	 * @param ctx the parse tree
	 */
	void enterSingleParam(JsonTemplateAntlrParser.SingleParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#singleParam}.
	 * @param ctx the parse tree
	 */
	void exitSingleParam(JsonTemplateAntlrParser.SingleParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#listParams}.
	 * @param ctx the parse tree
	 */
	void enterListParams(JsonTemplateAntlrParser.ListParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#listParams}.
	 * @param ctx the parse tree
	 */
	void exitListParams(JsonTemplateAntlrParser.ListParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#mapParams}.
	 * @param ctx the parse tree
	 */
	void enterMapParams(JsonTemplateAntlrParser.MapParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#mapParams}.
	 * @param ctx the parse tree
	 */
	void exitMapParams(JsonTemplateAntlrParser.MapParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void enterMapParam(JsonTemplateAntlrParser.MapParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#mapParam}.
	 * @param ctx the parse tree
	 */
	void exitMapParam(JsonTemplateAntlrParser.MapParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void enterJsonArray(JsonTemplateAntlrParser.JsonArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#jsonArray}.
	 * @param ctx the parse tree
	 */
	void exitJsonArray(JsonTemplateAntlrParser.JsonArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#arrayTypeInfo}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeInfo(JsonTemplateAntlrParser.ArrayTypeInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#arrayTypeInfo}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeInfo(JsonTemplateAntlrParser.ArrayTypeInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#itemsArray}.
	 * @param ctx the parse tree
	 */
	void enterItemsArray(JsonTemplateAntlrParser.ItemsArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#itemsArray}.
	 * @param ctx the parse tree
	 */
	void exitItemsArray(JsonTemplateAntlrParser.ItemsArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#arrayParamSpec}.
	 * @param ctx the parse tree
	 */
	void enterArrayParamSpec(JsonTemplateAntlrParser.ArrayParamSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#arrayParamSpec}.
	 * @param ctx the parse tree
	 */
	void exitArrayParamSpec(JsonTemplateAntlrParser.ArrayParamSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(JsonTemplateAntlrParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(JsonTemplateAntlrParser.ItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(JsonTemplateAntlrParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(JsonTemplateAntlrParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(JsonTemplateAntlrParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(JsonTemplateAntlrParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link JsonTemplateAntlrParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(JsonTemplateAntlrParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JsonTemplateAntlrParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(JsonTemplateAntlrParser.VariableNameContext ctx);
}
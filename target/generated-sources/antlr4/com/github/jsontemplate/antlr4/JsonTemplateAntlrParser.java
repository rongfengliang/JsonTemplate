// Generated from com/github/jsontemplate/antlr4/JsonTemplateAntlr.g4 by ANTLR 4.7
package com.github.jsontemplate.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonTemplateAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, RAW=12, IDENTIFIER=13, VALUE=14, WS=15;
	public static final int
		RULE_root = 0, RULE_templatePart = 1, RULE_jsonObject = 2, RULE_objectTypeInfo = 3, 
		RULE_properties = 4, RULE_property = 5, RULE_singleProperty = 6, RULE_pairProperty = 7, 
		RULE_propertyName = 8, RULE_typeDefinition = 9, RULE_typeDef = 10, RULE_typeName = 11, 
		RULE_propertyValueSpec = 12, RULE_propertyVariableWrapper = 13, RULE_jsonValue = 14, 
		RULE_typeInfo = 15, RULE_typeParamSpec = 16, RULE_variableWrapper = 17, 
		RULE_singleParam = 18, RULE_listParams = 19, RULE_mapParams = 20, RULE_mapParam = 21, 
		RULE_jsonArray = 22, RULE_arrayTypeInfo = 23, RULE_itemsArray = 24, RULE_arrayParamSpec = 25, 
		RULE_items = 26, RULE_item = 27, RULE_variable = 28, RULE_variableName = 29;
	public static final String[] ruleNames = {
		"root", "templatePart", "jsonObject", "objectTypeInfo", "properties", 
		"property", "singleProperty", "pairProperty", "propertyName", "typeDefinition", 
		"typeDef", "typeName", "propertyValueSpec", "propertyVariableWrapper", 
		"jsonValue", "typeInfo", "typeParamSpec", "variableWrapper", "singleParam", 
		"listParams", "mapParams", "mapParam", "jsonArray", "arrayTypeInfo", "itemsArray", 
		"arrayParamSpec", "items", "item", "variable", "variableName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'{'", "'}'", "':'", "'@'", "'('", "')'", "'='", "'['", "']'", 
		"'$'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"RAW", "IDENTIFIER", "VALUE", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "JsonTemplateAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonTemplateAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RootContext extends ParserRuleContext {
		public List<TemplatePartContext> templatePart() {
			return getRuleContexts(TemplatePartContext.class);
		}
		public TemplatePartContext templatePart(int i) {
			return getRuleContext(TemplatePartContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			templatePart();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(61);
				match(T__0);
				setState(62);
				templatePart();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemplatePartContext extends ParserRuleContext {
		public TypeDefinitionContext typeDefinition() {
			return getRuleContext(TypeDefinitionContext.class,0);
		}
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public JsonArrayContext jsonArray() {
			return getRuleContext(JsonArrayContext.class,0);
		}
		public TemplatePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templatePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTemplatePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTemplatePart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTemplatePart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplatePartContext templatePart() throws RecognitionException {
		TemplatePartContext _localctx = new TemplatePartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_templatePart);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				typeDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				jsonObject();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				jsonArray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonObjectContext extends ParserRuleContext {
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public ObjectTypeInfoContext objectTypeInfo() {
			return getRuleContext(ObjectTypeInfoContext.class,0);
		}
		public JsonObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterJsonObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitJsonObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitJsonObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonObjectContext jsonObject() throws RecognitionException {
		JsonObjectContext _localctx = new JsonObjectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_jsonObject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(73);
				objectTypeInfo();
				}
			}

			setState(76);
			match(T__1);
			setState(77);
			properties();
			setState(78);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectTypeInfoContext extends ParserRuleContext {
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public ObjectTypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTypeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterObjectTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitObjectTypeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitObjectTypeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectTypeInfoContext objectTypeInfo() throws RecognitionException {
		ObjectTypeInfoContext _localctx = new ObjectTypeInfoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_objectTypeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			jsonValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_properties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			property();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(83);
				match(T__0);
				setState(84);
				property();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public SinglePropertyContext singleProperty() {
			return getRuleContext(SinglePropertyContext.class,0);
		}
		public PairPropertyContext pairProperty() {
			return getRuleContext(PairPropertyContext.class,0);
		}
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_property);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				singleProperty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				pairProperty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinglePropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public SinglePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterSingleProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitSingleProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitSingleProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinglePropertyContext singleProperty() throws RecognitionException {
		SinglePropertyContext _localctx = new SinglePropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			propertyName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairPropertyContext extends ParserRuleContext {
		public PropertyNameContext propertyName() {
			return getRuleContext(PropertyNameContext.class,0);
		}
		public PropertyValueSpecContext propertyValueSpec() {
			return getRuleContext(PropertyValueSpecContext.class,0);
		}
		public PairPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pairProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterPairProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitPairProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitPairProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairPropertyContext pairProperty() throws RecognitionException {
		PairPropertyContext _localctx = new PairPropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pairProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			propertyName();
			setState(97);
			match(T__3);
			setState(98);
			propertyValueSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonTemplateAntlrParser.IDENTIFIER, 0); }
		public PropertyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterPropertyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitPropertyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitPropertyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyNameContext propertyName() throws RecognitionException {
		PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_propertyName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeDefContext typeDef() {
			return getRuleContext(TypeDefContext.class,0);
		}
		public PropertyValueSpecContext propertyValueSpec() {
			return getRuleContext(PropertyValueSpecContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			typeDef();
			setState(103);
			match(T__3);
			setState(104);
			propertyValueSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTypeDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTypeDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__4);
			setState(107);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonTemplateAntlrParser.IDENTIFIER, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyValueSpecContext extends ParserRuleContext {
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public JsonArrayContext jsonArray() {
			return getRuleContext(JsonArrayContext.class,0);
		}
		public JsonObjectContext jsonObject() {
			return getRuleContext(JsonObjectContext.class,0);
		}
		public PropertyVariableWrapperContext propertyVariableWrapper() {
			return getRuleContext(PropertyVariableWrapperContext.class,0);
		}
		public PropertyValueSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValueSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterPropertyValueSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitPropertyValueSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitPropertyValueSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueSpecContext propertyValueSpec() throws RecognitionException {
		PropertyValueSpecContext _localctx = new PropertyValueSpecContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_propertyValueSpec);
		try {
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				jsonValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				jsonArray();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				jsonObject();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				propertyVariableWrapper();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyVariableWrapperContext extends ParserRuleContext {
		public VariableWrapperContext variableWrapper() {
			return getRuleContext(VariableWrapperContext.class,0);
		}
		public PropertyVariableWrapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyVariableWrapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterPropertyVariableWrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitPropertyVariableWrapper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitPropertyVariableWrapper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyVariableWrapperContext propertyVariableWrapper() throws RecognitionException {
		PropertyVariableWrapperContext _localctx = new PropertyVariableWrapperContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_propertyVariableWrapper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			variableWrapper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonValueContext extends ParserRuleContext {
		public TypeInfoContext typeInfo() {
			return getRuleContext(TypeInfoContext.class,0);
		}
		public TypeParamSpecContext typeParamSpec() {
			return getRuleContext(TypeParamSpecContext.class,0);
		}
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterJsonValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitJsonValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitJsonValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsonValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			typeInfo();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(120);
				typeParamSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInfoContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTypeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTypeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeInfoContext typeInfo() throws RecognitionException {
		TypeInfoContext _localctx = new TypeInfoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(T__4);
			setState(124);
			typeName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParamSpecContext extends ParserRuleContext {
		public SingleParamContext singleParam() {
			return getRuleContext(SingleParamContext.class,0);
		}
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public MapParamsContext mapParams() {
			return getRuleContext(MapParamsContext.class,0);
		}
		public TypeParamSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterTypeParamSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitTypeParamSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitTypeParamSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParamSpecContext typeParamSpec() throws RecognitionException {
		TypeParamSpecContext _localctx = new TypeParamSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeParamSpec);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(T__5);
				setState(127);
				singleParam();
				setState(128);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__5);
				setState(131);
				listParams();
				setState(132);
				match(T__6);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__5);
				setState(135);
				mapParams();
				setState(136);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableWrapperContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(JsonTemplateAntlrParser.IDENTIFIER, 0); }
		public TerminalNode VALUE() { return getToken(JsonTemplateAntlrParser.VALUE, 0); }
		public TerminalNode RAW() { return getToken(JsonTemplateAntlrParser.RAW, 0); }
		public VariableWrapperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableWrapper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterVariableWrapper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitVariableWrapper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitVariableWrapper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableWrapperContext variableWrapper() throws RecognitionException {
		VariableWrapperContext _localctx = new VariableWrapperContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableWrapper);
		try {
			setState(144);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				variable();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(IDENTIFIER);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				match(VALUE);
				}
				break;
			case RAW:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(RAW);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleParamContext extends ParserRuleContext {
		public VariableWrapperContext variableWrapper() {
			return getRuleContext(VariableWrapperContext.class,0);
		}
		public SingleParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterSingleParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitSingleParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitSingleParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleParamContext singleParam() throws RecognitionException {
		SingleParamContext _localctx = new SingleParamContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			variableWrapper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListParamsContext extends ParserRuleContext {
		public List<VariableWrapperContext> variableWrapper() {
			return getRuleContexts(VariableWrapperContext.class);
		}
		public VariableWrapperContext variableWrapper(int i) {
			return getRuleContext(VariableWrapperContext.class,i);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterListParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitListParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitListParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListParamsContext listParams() throws RecognitionException {
		ListParamsContext _localctx = new ListParamsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			variableWrapper();
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				match(T__0);
				setState(150);
				variableWrapper();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapParamsContext extends ParserRuleContext {
		public List<MapParamContext> mapParam() {
			return getRuleContexts(MapParamContext.class);
		}
		public MapParamContext mapParam(int i) {
			return getRuleContext(MapParamContext.class,i);
		}
		public MapParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterMapParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitMapParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitMapParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapParamsContext mapParams() throws RecognitionException {
		MapParamsContext _localctx = new MapParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mapParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			mapParam();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(156);
				match(T__0);
				setState(157);
				mapParam();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MapParamContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonTemplateAntlrParser.IDENTIFIER, 0); }
		public VariableWrapperContext variableWrapper() {
			return getRuleContext(VariableWrapperContext.class,0);
		}
		public MapParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterMapParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitMapParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitMapParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapParamContext mapParam() throws RecognitionException {
		MapParamContext _localctx = new MapParamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IDENTIFIER);
			setState(164);
			match(T__7);
			setState(165);
			variableWrapper();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonArrayContext extends ParserRuleContext {
		public ItemsArrayContext itemsArray() {
			return getRuleContext(ItemsArrayContext.class,0);
		}
		public ArrayTypeInfoContext arrayTypeInfo() {
			return getRuleContext(ArrayTypeInfoContext.class,0);
		}
		public JsonArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterJsonArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitJsonArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitJsonArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonArrayContext jsonArray() throws RecognitionException {
		JsonArrayContext _localctx = new JsonArrayContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jsonArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4) {
				{
				setState(167);
				arrayTypeInfo();
				}
			}

			setState(170);
			itemsArray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayTypeInfoContext extends ParserRuleContext {
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public ArrayTypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayTypeInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterArrayTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitArrayTypeInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitArrayTypeInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayTypeInfoContext arrayTypeInfo() throws RecognitionException {
		ArrayTypeInfoContext _localctx = new ArrayTypeInfoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arrayTypeInfo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			jsonValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsArrayContext extends ParserRuleContext {
		public ItemsContext items() {
			return getRuleContext(ItemsContext.class,0);
		}
		public ArrayParamSpecContext arrayParamSpec() {
			return getRuleContext(ArrayParamSpecContext.class,0);
		}
		public ItemsArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_itemsArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterItemsArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitItemsArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitItemsArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsArrayContext itemsArray() throws RecognitionException {
		ItemsArrayContext _localctx = new ItemsArrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_itemsArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__8);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__4) | (1L << T__8) | (1L << T__10) | (1L << RAW) | (1L << IDENTIFIER) | (1L << VALUE))) != 0)) {
				{
				setState(175);
				items();
				}
			}

			setState(178);
			match(T__9);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(179);
				arrayParamSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayParamSpecContext extends ParserRuleContext {
		public TypeParamSpecContext typeParamSpec() {
			return getRuleContext(TypeParamSpecContext.class,0);
		}
		public ArrayParamSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayParamSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterArrayParamSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitArrayParamSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitArrayParamSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayParamSpecContext arrayParamSpec() throws RecognitionException {
		ArrayParamSpecContext _localctx = new ArrayParamSpecContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_arrayParamSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			typeParamSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemsContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_items; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitItems(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitItems(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemsContext items() throws RecognitionException {
		ItemsContext _localctx = new ItemsContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_items);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			item();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(185);
				match(T__0);
				setState(186);
				item();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ItemContext extends ParserRuleContext {
		public PropertyValueSpecContext propertyValueSpec() {
			return getRuleContext(PropertyValueSpecContext.class,0);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			propertyValueSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__10);
			setState(195);
			variableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JsonTemplateAntlrParser.IDENTIFIER, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonTemplateAntlrListener ) ((JsonTemplateAntlrListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonTemplateAntlrVisitor ) return ((JsonTemplateAntlrVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\21\u00ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\7\2B\n\2\f\2\16\2E\13\2\3\3\3\3\3\3\5\3J\n\3\3\4\5\4M\n\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\7\3\7\5\7_\n\7\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\5\16v\n\16\3\17\3\17\3\20\3\20\5\20|\n\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5"+
		"\22\u008d\n\22\3\23\3\23\3\23\3\23\5\23\u0093\n\23\3\24\3\24\3\25\3\25"+
		"\3\25\6\25\u009a\n\25\r\25\16\25\u009b\3\26\3\26\3\26\7\26\u00a1\n\26"+
		"\f\26\16\26\u00a4\13\26\3\27\3\27\3\27\3\27\3\30\5\30\u00ab\n\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\5\32\u00b3\n\32\3\32\3\32\5\32\u00b7\n\32\3"+
		"\33\3\33\3\34\3\34\3\34\7\34\u00be\n\34\f\34\16\34\u00c1\13\34\3\35\3"+
		"\35\3\36\3\36\3\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\2\2\u00c0\2>\3\2\2\2\4I\3\2\2\2\6L\3"+
		"\2\2\2\bR\3\2\2\2\nT\3\2\2\2\f^\3\2\2\2\16`\3\2\2\2\20b\3\2\2\2\22f\3"+
		"\2\2\2\24h\3\2\2\2\26l\3\2\2\2\30o\3\2\2\2\32u\3\2\2\2\34w\3\2\2\2\36"+
		"y\3\2\2\2 }\3\2\2\2\"\u008c\3\2\2\2$\u0092\3\2\2\2&\u0094\3\2\2\2(\u0096"+
		"\3\2\2\2*\u009d\3\2\2\2,\u00a5\3\2\2\2.\u00aa\3\2\2\2\60\u00ae\3\2\2\2"+
		"\62\u00b0\3\2\2\2\64\u00b8\3\2\2\2\66\u00ba\3\2\2\28\u00c2\3\2\2\2:\u00c4"+
		"\3\2\2\2<\u00c7\3\2\2\2>C\5\4\3\2?@\7\3\2\2@B\5\4\3\2A?\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2D\3\3\2\2\2EC\3\2\2\2FJ\5\24\13\2GJ\5\6\4\2HJ"+
		"\5.\30\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\5\3\2\2\2KM\5\b\5\2LK\3\2\2\2"+
		"LM\3\2\2\2MN\3\2\2\2NO\7\4\2\2OP\5\n\6\2PQ\7\5\2\2Q\7\3\2\2\2RS\5\36\20"+
		"\2S\t\3\2\2\2TY\5\f\7\2UV\7\3\2\2VX\5\f\7\2WU\3\2\2\2X[\3\2\2\2YW\3\2"+
		"\2\2YZ\3\2\2\2Z\13\3\2\2\2[Y\3\2\2\2\\_\5\16\b\2]_\5\20\t\2^\\\3\2\2\2"+
		"^]\3\2\2\2_\r\3\2\2\2`a\5\22\n\2a\17\3\2\2\2bc\5\22\n\2cd\7\6\2\2de\5"+
		"\32\16\2e\21\3\2\2\2fg\7\17\2\2g\23\3\2\2\2hi\5\26\f\2ij\7\6\2\2jk\5\32"+
		"\16\2k\25\3\2\2\2lm\7\7\2\2mn\5\30\r\2n\27\3\2\2\2op\7\17\2\2p\31\3\2"+
		"\2\2qv\5\36\20\2rv\5.\30\2sv\5\6\4\2tv\5\34\17\2uq\3\2\2\2ur\3\2\2\2u"+
		"s\3\2\2\2ut\3\2\2\2v\33\3\2\2\2wx\5$\23\2x\35\3\2\2\2y{\5 \21\2z|\5\""+
		"\22\2{z\3\2\2\2{|\3\2\2\2|\37\3\2\2\2}~\7\7\2\2~\177\5\30\r\2\177!\3\2"+
		"\2\2\u0080\u0081\7\b\2\2\u0081\u0082\5&\24\2\u0082\u0083\7\t\2\2\u0083"+
		"\u008d\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u0086\5(\25\2\u0086\u0087\7\t"+
		"\2\2\u0087\u008d\3\2\2\2\u0088\u0089\7\b\2\2\u0089\u008a\5*\26\2\u008a"+
		"\u008b\7\t\2\2\u008b\u008d\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0084\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008d#\3\2\2\2\u008e\u0093\5:\36\2\u008f\u0093"+
		"\7\17\2\2\u0090\u0093\7\20\2\2\u0091\u0093\7\16\2\2\u0092\u008e\3\2\2"+
		"\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093%"+
		"\3\2\2\2\u0094\u0095\5$\23\2\u0095\'\3\2\2\2\u0096\u0099\5$\23\2\u0097"+
		"\u0098\7\3\2\2\u0098\u009a\5$\23\2\u0099\u0097\3\2\2\2\u009a\u009b\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c)\3\2\2\2\u009d\u00a2"+
		"\5,\27\2\u009e\u009f\7\3\2\2\u009f\u00a1\5,\27\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3+\3\2\2\2"+
		"\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8"+
		"\5$\23\2\u00a8-\3\2\2\2\u00a9\u00ab\5\60\31\2\u00aa\u00a9\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\5\62\32\2\u00ad/\3\2\2"+
		"\2\u00ae\u00af\5\36\20\2\u00af\61\3\2\2\2\u00b0\u00b2\7\13\2\2\u00b1\u00b3"+
		"\5\66\34\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2"+
		"\u00b4\u00b6\7\f\2\2\u00b5\u00b7\5\64\33\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7\63\3\2\2\2\u00b8\u00b9\5\"\22\2\u00b9\65\3\2\2\2\u00ba"+
		"\u00bf\58\35\2\u00bb\u00bc\7\3\2\2\u00bc\u00be\58\35\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0"+
		"\67\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\5\32\16\2\u00c39\3\2\2\2\u00c4"+
		"\u00c5\7\r\2\2\u00c5\u00c6\5<\37\2\u00c6;\3\2\2\2\u00c7\u00c8\7\17\2\2"+
		"\u00c8=\3\2\2\2\21CILY^u{\u008c\u0092\u009b\u00a2\u00aa\u00b2\u00b6\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package antlr;// Generated from /home/bino/workspace/plsql_parser/src/PLSQL.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PLSQLParser}.
 */
public interface PLSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(PLSQLParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(PLSQLParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#show_errors}.
	 * @param ctx the parse tree
	 */
	void enterShow_errors(PLSQLParser.Show_errorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#show_errors}.
	 * @param ctx the parse tree
	 */
	void exitShow_errors(PLSQLParser.Show_errorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_object}.
	 * @param ctx the parse tree
	 */
	void enterCreate_object(PLSQLParser.Create_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_object}.
	 * @param ctx the parse tree
	 */
	void exitCreate_object(PLSQLParser.Create_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_heading}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_heading(PLSQLParser.Procedure_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_heading}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_heading(PLSQLParser.Procedure_headingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_heading}.
	 * @param ctx the parse tree
	 */
	void enterFunction_heading(PLSQLParser.Function_headingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_heading}.
	 * @param ctx the parse tree
	 */
	void exitFunction_heading(PLSQLParser.Function_headingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_declarations}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declarations(PLSQLParser.Parameter_declarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_declarations}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declarations(PLSQLParser.Parameter_declarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(PLSQLParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_section(PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#declare_section}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_section(PLSQLParser.Declare_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void enterCursor_definition(PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#cursor_definition}.
	 * @param ctx the parse tree
	 */
	void exitCursor_definition(PLSQLParser.Cursor_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterItem_declaration(PLSQLParser.Item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitItem_declaration(PLSQLParser.Item_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(PLSQLParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConstant_declaration(PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#constant_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConstant_declaration(PLSQLParser.Constant_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void enterException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_declaration}.
	 * @param ctx the parse tree
	 */
	void exitException_declaration(PLSQLParser.Exception_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void enterType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#type_definition}.
	 * @param ctx the parse tree
	 */
	void exitType_definition(PLSQLParser.Type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#subtype_definition}.
	 * @param ctx the parse tree
	 */
	void enterSubtype_definition(PLSQLParser.Subtype_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#subtype_definition}.
	 * @param ctx the parse tree
	 */
	void exitSubtype_definition(PLSQLParser.Subtype_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRecord_type_definition(PLSQLParser.Record_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#record_field_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRecord_field_declaration(PLSQLParser.Record_field_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#record_field_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRecord_field_declaration(PLSQLParser.Record_field_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitCollection_type_definition(PLSQLParser.Collection_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#varray_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterVarray_type_definition(PLSQLParser.Varray_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#varray_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitVarray_type_definition(PLSQLParser.Varray_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#nested_table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterNested_table_type_definition(PLSQLParser.Nested_table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#nested_table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitNested_table_type_definition(PLSQLParser.Nested_table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#associative_index_type}.
	 * @param ctx the parse tree
	 */
	void enterAssociative_index_type(PLSQLParser.Associative_index_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#associative_index_type}.
	 * @param ctx the parse tree
	 */
	void exitAssociative_index_type(PLSQLParser.Associative_index_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#ref_cursor_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitRef_cursor_type_definition(PLSQLParser.Ref_cursor_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void enterDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#datatype}.
	 * @param ctx the parse tree
	 */
	void exitDatatype(PLSQLParser.DatatypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_declaration_or_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration_or_definition(PLSQLParser.Function_declaration_or_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_declaration_or_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration_or_definition(PLSQLParser.Function_declaration_or_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(PLSQLParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(PLSQLParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(PLSQLParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(PLSQLParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_declaration_or_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration_or_definition(PLSQLParser.Procedure_declaration_or_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_declaration_or_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration_or_definition(PLSQLParser.Procedure_declaration_or_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_declaration(PLSQLParser.Procedure_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_declaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_declaration(PLSQLParser.Procedure_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_definition(PLSQLParser.Procedure_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#procedure_definition}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_definition(PLSQLParser.Procedure_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(PLSQLParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(PLSQLParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void enterException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exception_handler}.
	 * @param ctx the parse tree
	 */
	void exitException_handler(PLSQLParser.Exception_handlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PLSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(PLSQLParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(PLSQLParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#assign_or_call_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_or_call_statement(PLSQLParser.Assign_or_call_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#assign_or_call_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_or_call_statement(PLSQLParser.Assign_or_call_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(PLSQLParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(PLSQLParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#delete_call}.
	 * @param ctx the parse tree
	 */
	void enterDelete_call(PLSQLParser.Delete_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#delete_call}.
	 * @param ctx the parse tree
	 */
	void exitDelete_call(PLSQLParser.Delete_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#basic_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitBasic_loop_statement(PLSQLParser.Basic_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PLSQLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void enterClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#close_statement}.
	 * @param ctx the parse tree
	 */
	void exitClose_statement(PLSQLParser.Close_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(PLSQLParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#execute_immediate_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_immediate_statement(PLSQLParser.Execute_immediate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void enterExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exit_statement}.
	 * @param ctx the parse tree
	 */
	void exitExit_statement(PLSQLParser.Exit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void enterFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#fetch_statement}.
	 * @param ctx the parse tree
	 */
	void exitFetch_statement(PLSQLParser.Fetch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void enterInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#into_clause}.
	 * @param ctx the parse tree
	 */
	void exitInto_clause(PLSQLParser.Into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bulk_collect_into_clause}.
	 * @param ctx the parse tree
	 */
	void enterBulk_collect_into_clause(PLSQLParser.Bulk_collect_into_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bulk_collect_into_clause}.
	 * @param ctx the parse tree
	 */
	void exitBulk_collect_into_clause(PLSQLParser.Bulk_collect_into_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void enterUsing_clause(PLSQLParser.Using_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#using_clause}.
	 * @param ctx the parse tree
	 */
	void exitUsing_clause(PLSQLParser.Using_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#param_modifiers}.
	 * @param ctx the parse tree
	 */
	void enterParam_modifiers(PLSQLParser.Param_modifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#param_modifiers}.
	 * @param ctx the parse tree
	 */
	void exitParam_modifiers(PLSQLParser.Param_modifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void enterDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#dynamic_returning_clause}.
	 * @param ctx the parse tree
	 */
	void exitDynamic_returning_clause(PLSQLParser.Dynamic_returning_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(PLSQLParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void enterForall_statement(PLSQLParser.Forall_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#forall_statement}.
	 * @param ctx the parse tree
	 */
	void exitForall_statement(PLSQLParser.Forall_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void enterBounds_clause(PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#bounds_clause}.
	 * @param ctx the parse tree
	 */
	void exitBounds_clause(PLSQLParser.Bounds_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(PLSQLParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PLSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void enterNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#null_statement}.
	 * @param ctx the parse tree
	 */
	void exitNull_statement(PLSQLParser.Null_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void enterOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#open_statement}.
	 * @param ctx the parse tree
	 */
	void exitOpen_statement(PLSQLParser.Open_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(PLSQLParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(PLSQLParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#raise_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaise_statement(PLSQLParser.Raise_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(PLSQLParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void enterPlsql_block(PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#plsql_block}.
	 * @param ctx the parse tree
	 */
	void exitPlsql_block(PLSQLParser.Plsql_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(PLSQLParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(PLSQLParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#qual_id}.
	 * @param ctx the parse tree
	 */
	void enterQual_id(PLSQLParser.Qual_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#qual_id}.
	 * @param ctx the parse tree
	 */
	void exitQual_id(PLSQLParser.Qual_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void enterSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#sql_statement}.
	 * @param ctx the parse tree
	 */
	void exitSql_statement(PLSQLParser.Sql_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void enterCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#commit_statement}.
	 * @param ctx the parse tree
	 */
	void exitCommit_statement(PLSQLParser.Commit_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(PLSQLParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(PLSQLParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterLock_table_statement(PLSQLParser.Lock_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#lock_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitLock_table_statement(PLSQLParser.Lock_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void enterRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#rollback_statement}.
	 * @param ctx the parse tree
	 */
	void exitRollback_statement(PLSQLParser.Rollback_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#savepoint_statement}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_statement(PLSQLParser.Savepoint_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(PLSQLParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#set_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_transaction_statement(PLSQLParser.Set_transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#set_transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_transaction_statement(PLSQLParser.Set_transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(PLSQLParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void enterSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 */
	void exitSwallow_to_semi(PLSQLParser.Swallow_to_semiContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#while_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop_statement(PLSQLParser.While_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#match_parens}.
	 * @param ctx the parse tree
	 */
	void enterMatch_parens(PLSQLParser.Match_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#match_parens}.
	 * @param ctx the parse tree
	 */
	void exitMatch_parens(PLSQLParser.Match_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#label_name}.
	 * @param ctx the parse tree
	 */
	void enterLabel_name(PLSQLParser.Label_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#label_name}.
	 * @param ctx the parse tree
	 */
	void exitLabel_name(PLSQLParser.Label_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PLSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void enterOr_expr(PLSQLParser.Or_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#or_expr}.
	 * @param ctx the parse tree
	 */
	void exitOr_expr(PLSQLParser.Or_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd_expr(PLSQLParser.And_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#and_expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd_expr(PLSQLParser.And_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void enterNot_expr(PLSQLParser.Not_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#not_expr}.
	 * @param ctx the parse tree
	 */
	void exitNot_expr(PLSQLParser.Not_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare_expr(PLSQLParser.Compare_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#compare_expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare_expr(PLSQLParser.Compare_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#is_null_expr}.
	 * @param ctx the parse tree
	 */
	void enterIs_null_expr(PLSQLParser.Is_null_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#is_null_expr}.
	 * @param ctx the parse tree
	 */
	void exitIs_null_expr(PLSQLParser.Is_null_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#like_expr}.
	 * @param ctx the parse tree
	 */
	void enterLike_expr(PLSQLParser.Like_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#like_expr}.
	 * @param ctx the parse tree
	 */
	void exitLike_expr(PLSQLParser.Like_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#between_expr}.
	 * @param ctx the parse tree
	 */
	void enterBetween_expr(PLSQLParser.Between_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#between_expr}.
	 * @param ctx the parse tree
	 */
	void exitBetween_expr(PLSQLParser.Between_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void enterIn_expr(PLSQLParser.In_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#in_expr}.
	 * @param ctx the parse tree
	 */
	void exitIn_expr(PLSQLParser.In_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_expression(PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_expression}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_expression(PLSQLParser.Numeric_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd_expr(PLSQLParser.Add_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#add_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd_expr(PLSQLParser.Add_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void enterMul_expr(PLSQLParser.Mul_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#mul_expr}.
	 * @param ctx the parse tree
	 */
	void exitMul_expr(PLSQLParser.Mul_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary_sign_expr(PLSQLParser.Unary_sign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary_sign_expr(PLSQLParser.Unary_sign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#exponent_expr}.
	 * @param ctx the parse tree
	 */
	void enterExponent_expr(PLSQLParser.Exponent_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#exponent_expr}.
	 * @param ctx the parse tree
	 */
	void exitExponent_expr(PLSQLParser.Exponent_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(PLSQLParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(PLSQLParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#variable_or_function_call}.
	 * @param ctx the parse tree
	 */
	void enterVariable_or_function_call(PLSQLParser.Variable_or_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#variable_or_function_call}.
	 * @param ctx the parse tree
	 */
	void exitVariable_or_function_call(PLSQLParser.Variable_or_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(PLSQLParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(PLSQLParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#call_args}.
	 * @param ctx the parse tree
	 */
	void enterCall_args(PLSQLParser.Call_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#call_args}.
	 * @param ctx the parse tree
	 */
	void exitCall_args(PLSQLParser.Call_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_atom}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_atom(PLSQLParser.Boolean_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_atom}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_atom(PLSQLParser.Boolean_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_atom}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_atom(PLSQLParser.Numeric_atomContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_atom}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_atom(PLSQLParser.Numeric_atomContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterNumeric_literal(PLSQLParser.Numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitNumeric_literal(PLSQLParser.Numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_literal(PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#boolean_literal}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_literal(PLSQLParser.Boolean_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void enterString_literal(PLSQLParser.String_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#string_literal}.
	 * @param ctx the parse tree
	 */
	void exitString_literal(PLSQLParser.String_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#collection_exists}.
	 * @param ctx the parse tree
	 */
	void enterCollection_exists(PLSQLParser.Collection_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#collection_exists}.
	 * @param ctx the parse tree
	 */
	void exitCollection_exists(PLSQLParser.Collection_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#conditional_predicate}.
	 * @param ctx the parse tree
	 */
	void enterConditional_predicate(PLSQLParser.Conditional_predicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#conditional_predicate}.
	 * @param ctx the parse tree
	 */
	void exitConditional_predicate(PLSQLParser.Conditional_predicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PLSQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(PLSQLParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(PLSQLParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package(PLSQLParser.Create_packageContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_package}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package(PLSQLParser.Create_packageContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void enterCreate_package_body(PLSQLParser.Create_package_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_package_body}.
	 * @param ctx the parse tree
	 */
	void exitCreate_package_body(PLSQLParser.Create_package_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_procedure(PLSQLParser.Create_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_procedure(PLSQLParser.Create_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function(PLSQLParser.Create_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#create_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function(PLSQLParser.Create_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void enterInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#invoker_rights_clause}.
	 * @param ctx the parse tree
	 */
	void exitInvoker_rights_clause(PLSQLParser.Invoker_rights_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void enterCall_spec(PLSQLParser.Call_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#call_spec}.
	 * @param ctx the parse tree
	 */
	void exitCall_spec(PLSQLParser.Call_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kERRORS}.
	 * @param ctx the parse tree
	 */
	void enterKERRORS(PLSQLParser.KERRORSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kERRORS}.
	 * @param ctx the parse tree
	 */
	void exitKERRORS(PLSQLParser.KERRORSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kEXCEPTIONS}.
	 * @param ctx the parse tree
	 */
	void enterKEXCEPTIONS(PLSQLParser.KEXCEPTIONSContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kEXCEPTIONS}.
	 * @param ctx the parse tree
	 */
	void exitKEXCEPTIONS(PLSQLParser.KEXCEPTIONSContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kFOUND}.
	 * @param ctx the parse tree
	 */
	void enterKFOUND(PLSQLParser.KFOUNDContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kFOUND}.
	 * @param ctx the parse tree
	 */
	void exitKFOUND(PLSQLParser.KFOUNDContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kINDICES}.
	 * @param ctx the parse tree
	 */
	void enterKINDICES(PLSQLParser.KINDICESContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kINDICES}.
	 * @param ctx the parse tree
	 */
	void exitKINDICES(PLSQLParser.KINDICESContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kMOD}.
	 * @param ctx the parse tree
	 */
	void enterKMOD(PLSQLParser.KMODContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kMOD}.
	 * @param ctx the parse tree
	 */
	void exitKMOD(PLSQLParser.KMODContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kNAME}.
	 * @param ctx the parse tree
	 */
	void enterKNAME(PLSQLParser.KNAMEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kNAME}.
	 * @param ctx the parse tree
	 */
	void exitKNAME(PLSQLParser.KNAMEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kOF}.
	 * @param ctx the parse tree
	 */
	void enterKOF(PLSQLParser.KOFContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kOF}.
	 * @param ctx the parse tree
	 */
	void exitKOF(PLSQLParser.KOFContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kREPLACE}.
	 * @param ctx the parse tree
	 */
	void enterKREPLACE(PLSQLParser.KREPLACEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kREPLACE}.
	 * @param ctx the parse tree
	 */
	void exitKREPLACE(PLSQLParser.KREPLACEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kROWCOUNT}.
	 * @param ctx the parse tree
	 */
	void enterKROWCOUNT(PLSQLParser.KROWCOUNTContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kROWCOUNT}.
	 * @param ctx the parse tree
	 */
	void exitKROWCOUNT(PLSQLParser.KROWCOUNTContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kSAVE}.
	 * @param ctx the parse tree
	 */
	void enterKSAVE(PLSQLParser.KSAVEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kSAVE}.
	 * @param ctx the parse tree
	 */
	void exitKSAVE(PLSQLParser.KSAVEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kSHOW}.
	 * @param ctx the parse tree
	 */
	void enterKSHOW(PLSQLParser.KSHOWContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kSHOW}.
	 * @param ctx the parse tree
	 */
	void exitKSHOW(PLSQLParser.KSHOWContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kTYPE}.
	 * @param ctx the parse tree
	 */
	void enterKTYPE(PLSQLParser.KTYPEContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kTYPE}.
	 * @param ctx the parse tree
	 */
	void exitKTYPE(PLSQLParser.KTYPEContext ctx);
	/**
	 * Enter a parse tree produced by {@link PLSQLParser#kVALUES}.
	 * @param ctx the parse tree
	 */
	void enterKVALUES(PLSQLParser.KVALUESContext ctx);
	/**
	 * Exit a parse tree produced by {@link PLSQLParser#kVALUES}.
	 * @param ctx the parse tree
	 */
	void exitKVALUES(PLSQLParser.KVALUESContext ctx);
}
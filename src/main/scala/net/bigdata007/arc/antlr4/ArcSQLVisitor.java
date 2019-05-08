// Generated from /Users/huanghuanlai/dounine/github/arc/src/main/resources/ArcSQL.g4 by ANTLR 4.7.2
package net.bigdata007.arc.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArcSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArcSQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#multiStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiStatement(ArcSQLParser.MultiStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(ArcSQLParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(ArcSQLParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(ArcSQLParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetDatabaseProperties(ArcSQLParser.SetDatabasePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(ArcSQLParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(ArcSQLParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateHiveTable(ArcSQLParser.CreateHiveTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(ArcSQLParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(ArcSQLParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(ArcSQLParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(ArcSQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(ArcSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(ArcSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeColumn(ArcSQLParser.ChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(ArcSQLParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(ArcSQLParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(ArcSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(ArcSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(ArcSQLParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(ArcSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(ArcSQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(ArcSQLParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(ArcSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(ArcSQLParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(ArcSQLParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(ArcSQLParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(ArcSQLParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(ArcSQLParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(ArcSQLParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(ArcSQLParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(ArcSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(ArcSQLParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(ArcSQLParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(ArcSQLParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(ArcSQLParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(ArcSQLParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDatabase(ArcSQLParser.DescribeDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeTable(ArcSQLParser.DescribeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(ArcSQLParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(ArcSQLParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(ArcSQLParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(ArcSQLParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(ArcSQLParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(ArcSQLParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadTable(ArcSQLParser.LoadTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code registerUdf}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegisterUdf(ArcSQLParser.RegisterUdfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code saveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveTable(ArcSQLParser.SaveTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(ArcSQLParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(ArcSQLParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(ArcSQLParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(ArcSQLParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(ArcSQLParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(ArcSQLParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceVar}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceVar(ArcSQLParser.ReplaceVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSets(ArcSQLParser.SetsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#rv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRv(ArcSQLParser.RvContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#saveModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSaveModel(ArcSQLParser.SaveModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(ArcSQLParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(ArcSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(ArcSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(ArcSQLParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(ArcSQLParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(ArcSQLParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ArcSQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteTable(ArcSQLParser.InsertOverwriteTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(ArcSQLParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(ArcSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(ArcSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(ArcSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(ArcSQLParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(ArcSQLParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(ArcSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(ArcSQLParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(ArcSQLParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(ArcSQLParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(ArcSQLParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(ArcSQLParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(ArcSQLParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(ArcSQLParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(ArcSQLParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(ArcSQLParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(ArcSQLParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(ArcSQLParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(ArcSQLParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(ArcSQLParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(ArcSQLParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(ArcSQLParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(ArcSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(ArcSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(ArcSQLParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(ArcSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(ArcSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(ArcSQLParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(ArcSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(ArcSQLParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(ArcSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(ArcSQLParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(ArcSQLParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(ArcSQLParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(ArcSQLParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(ArcSQLParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(ArcSQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation(ArcSQLParser.AggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(ArcSQLParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(ArcSQLParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(ArcSQLParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(ArcSQLParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(ArcSQLParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(ArcSQLParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(ArcSQLParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(ArcSQLParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(ArcSQLParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(ArcSQLParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(ArcSQLParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(ArcSQLParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(ArcSQLParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(ArcSQLParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(ArcSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(ArcSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(ArcSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(ArcSQLParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(ArcSQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(ArcSQLParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(ArcSQLParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(ArcSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(ArcSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(ArcSQLParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(ArcSQLParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(ArcSQLParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(ArcSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(ArcSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(ArcSQLParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(ArcSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(ArcSQLParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(ArcSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ArcSQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(ArcSQLParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanDefault(ArcSQLParser.BooleanDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(ArcSQLParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(ArcSQLParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#predicated}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(ArcSQLParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(ArcSQLParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(ArcSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ArcSQLParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(ArcSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(ArcSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(ArcSQLParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(ArcSQLParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(ArcSQLParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(ArcSQLParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(ArcSQLParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(ArcSQLParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(ArcSQLParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(ArcSQLParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(ArcSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(ArcSQLParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(ArcSQLParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(ArcSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ArcSQLParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(ArcSQLParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(ArcSQLParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(ArcSQLParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(ArcSQLParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(ArcSQLParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(ArcSQLParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(ArcSQLParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(ArcSQLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(ArcSQLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(ArcSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(ArcSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(ArcSQLParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(ArcSQLParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(ArcSQLParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(ArcSQLParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(ArcSQLParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(ArcSQLParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(ArcSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(ArcSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(ArcSQLParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(ArcSQLParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(ArcSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(ArcSQLParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(ArcSQLParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#windows}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindows(ArcSQLParser.WindowsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(ArcSQLParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(ArcSQLParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(ArcSQLParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(ArcSQLParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(ArcSQLParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ArcSQLParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ArcSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(ArcSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(ArcSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(ArcSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(ArcSQLParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ArcSQLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(ArcSQLParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(ArcSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(ArcSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(ArcSQLParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(ArcSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArcSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(ArcSQLParser.NonReservedContext ctx);
}
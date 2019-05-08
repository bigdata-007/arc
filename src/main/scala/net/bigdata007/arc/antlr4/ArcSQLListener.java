// Generated from /Users/huanghuanlai/dounine/github/arc/src/main/resources/ArcSQL.g4 by ANTLR 4.7.2
package net.bigdata007.arc.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArcSQLParser}.
 */
public interface ArcSQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultiStatement(ArcSQLParser.MultiStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#multiStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultiStatement(ArcSQLParser.MultiStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(ArcSQLParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(ArcSQLParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(ArcSQLParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(ArcSQLParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(ArcSQLParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(ArcSQLParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetDatabaseProperties(ArcSQLParser.SetDatabasePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setDatabaseProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetDatabaseProperties(ArcSQLParser.SetDatabasePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(ArcSQLParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(ArcSQLParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(ArcSQLParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(ArcSQLParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(ArcSQLParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(ArcSQLParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(ArcSQLParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(ArcSQLParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(ArcSQLParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(ArcSQLParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(ArcSQLParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(ArcSQLParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(ArcSQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(ArcSQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(ArcSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(ArcSQLParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(ArcSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(ArcSQLParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterChangeColumn(ArcSQLParser.ChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code changeColumn}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitChangeColumn(ArcSQLParser.ChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(ArcSQLParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(ArcSQLParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(ArcSQLParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(ArcSQLParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(ArcSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(ArcSQLParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(ArcSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(ArcSQLParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(ArcSQLParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(ArcSQLParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(ArcSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(ArcSQLParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(ArcSQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(ArcSQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(ArcSQLParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(ArcSQLParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(ArcSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(ArcSQLParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(ArcSQLParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(ArcSQLParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(ArcSQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(ArcSQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(ArcSQLParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(ArcSQLParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(ArcSQLParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(ArcSQLParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(ArcSQLParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(ArcSQLParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(ArcSQLParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(ArcSQLParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(ArcSQLParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showDatabases}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(ArcSQLParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(ArcSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(ArcSQLParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(ArcSQLParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(ArcSQLParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(ArcSQLParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(ArcSQLParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(ArcSQLParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(ArcSQLParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(ArcSQLParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(ArcSQLParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(ArcSQLParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(ArcSQLParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDatabase(ArcSQLParser.DescribeDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDatabase}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDatabase(ArcSQLParser.DescribeDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeTable(ArcSQLParser.DescribeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeTable(ArcSQLParser.DescribeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(ArcSQLParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(ArcSQLParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(ArcSQLParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(ArcSQLParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(ArcSQLParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(ArcSQLParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(ArcSQLParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(ArcSQLParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(ArcSQLParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(ArcSQLParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(ArcSQLParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(ArcSQLParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadTable(ArcSQLParser.LoadTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadTable(ArcSQLParser.LoadTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code registerUdf}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRegisterUdf(ArcSQLParser.RegisterUdfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code registerUdf}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRegisterUdf(ArcSQLParser.RegisterUdfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code saveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSaveTable(ArcSQLParser.SaveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code saveTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSaveTable(ArcSQLParser.SaveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(ArcSQLParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(ArcSQLParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(ArcSQLParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(ArcSQLParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(ArcSQLParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(ArcSQLParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(ArcSQLParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(ArcSQLParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(ArcSQLParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(ArcSQLParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(ArcSQLParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(ArcSQLParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceVar}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceVar(ArcSQLParser.ReplaceVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceVar}
	 * labeled alternative in {@link ArcSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceVar(ArcSQLParser.ReplaceVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#sets}.
	 * @param ctx the parse tree
	 */
	void enterSets(ArcSQLParser.SetsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#sets}.
	 * @param ctx the parse tree
	 */
	void exitSets(ArcSQLParser.SetsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#rv}.
	 * @param ctx the parse tree
	 */
	void enterRv(ArcSQLParser.RvContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#rv}.
	 * @param ctx the parse tree
	 */
	void exitRv(ArcSQLParser.RvContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#saveModel}.
	 * @param ctx the parse tree
	 */
	void enterSaveModel(ArcSQLParser.SaveModelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#saveModel}.
	 * @param ctx the parse tree
	 */
	void exitSaveModel(ArcSQLParser.SaveModelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ArcSQLParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ArcSQLParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(ArcSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(ArcSQLParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(ArcSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(ArcSQLParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(ArcSQLParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(ArcSQLParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(ArcSQLParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(ArcSQLParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(ArcSQLParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(ArcSQLParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ArcSQLParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ArcSQLParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(ArcSQLParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(ArcSQLParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(ArcSQLParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(ArcSQLParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(ArcSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(ArcSQLParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(ArcSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link ArcSQLParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(ArcSQLParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(ArcSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(ArcSQLParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(ArcSQLParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(ArcSQLParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(ArcSQLParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(ArcSQLParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(ArcSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(ArcSQLParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(ArcSQLParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(ArcSQLParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(ArcSQLParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(ArcSQLParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(ArcSQLParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(ArcSQLParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(ArcSQLParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(ArcSQLParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(ArcSQLParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(ArcSQLParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(ArcSQLParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(ArcSQLParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(ArcSQLParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(ArcSQLParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(ArcSQLParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(ArcSQLParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(ArcSQLParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(ArcSQLParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(ArcSQLParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(ArcSQLParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(ArcSQLParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(ArcSQLParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(ArcSQLParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(ArcSQLParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(ArcSQLParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link ArcSQLParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(ArcSQLParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(ArcSQLParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(ArcSQLParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ArcSQLParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ArcSQLParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(ArcSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(ArcSQLParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(ArcSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link ArcSQLParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(ArcSQLParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(ArcSQLParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(ArcSQLParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(ArcSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(ArcSQLParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(ArcSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(ArcSQLParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(ArcSQLParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link ArcSQLParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(ArcSQLParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(ArcSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(ArcSQLParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(ArcSQLParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(ArcSQLParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(ArcSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(ArcSQLParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ArcSQLParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link ArcSQLParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ArcSQLParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(ArcSQLParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(ArcSQLParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(ArcSQLParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(ArcSQLParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(ArcSQLParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(ArcSQLParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(ArcSQLParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(ArcSQLParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ArcSQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ArcSQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void enterAggregation(ArcSQLParser.AggregationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#aggregation}.
	 * @param ctx the parse tree
	 */
	void exitAggregation(ArcSQLParser.AggregationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(ArcSQLParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(ArcSQLParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(ArcSQLParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(ArcSQLParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(ArcSQLParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(ArcSQLParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(ArcSQLParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(ArcSQLParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(ArcSQLParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(ArcSQLParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(ArcSQLParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(ArcSQLParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(ArcSQLParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(ArcSQLParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(ArcSQLParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(ArcSQLParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(ArcSQLParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(ArcSQLParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(ArcSQLParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(ArcSQLParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(ArcSQLParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(ArcSQLParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(ArcSQLParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link ArcSQLParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(ArcSQLParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(ArcSQLParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(ArcSQLParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(ArcSQLParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(ArcSQLParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(ArcSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(ArcSQLParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(ArcSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(ArcSQLParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(ArcSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(ArcSQLParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(ArcSQLParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(ArcSQLParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(ArcSQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(ArcSQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(ArcSQLParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(ArcSQLParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(ArcSQLParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(ArcSQLParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(ArcSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(ArcSQLParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(ArcSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link ArcSQLParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(ArcSQLParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(ArcSQLParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(ArcSQLParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(ArcSQLParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(ArcSQLParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(ArcSQLParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(ArcSQLParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(ArcSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(ArcSQLParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(ArcSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link ArcSQLParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(ArcSQLParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ArcSQLParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ArcSQLParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(ArcSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(ArcSQLParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(ArcSQLParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(ArcSQLParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(ArcSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(ArcSQLParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ArcSQLParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ArcSQLParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(ArcSQLParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(ArcSQLParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanDefault(ArcSQLParser.BooleanDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanDefault}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanDefault(ArcSQLParser.BooleanDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(ArcSQLParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(ArcSQLParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(ArcSQLParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link ArcSQLParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(ArcSQLParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#predicated}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(ArcSQLParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#predicated}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(ArcSQLParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(ArcSQLParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(ArcSQLParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(ArcSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(ArcSQLParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ArcSQLParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ArcSQLParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(ArcSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(ArcSQLParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(ArcSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link ArcSQLParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(ArcSQLParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(ArcSQLParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(ArcSQLParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(ArcSQLParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(ArcSQLParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(ArcSQLParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(ArcSQLParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(ArcSQLParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(ArcSQLParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(ArcSQLParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(ArcSQLParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(ArcSQLParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(ArcSQLParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(ArcSQLParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(ArcSQLParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(ArcSQLParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(ArcSQLParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(ArcSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(ArcSQLParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(ArcSQLParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(ArcSQLParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(ArcSQLParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(ArcSQLParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(ArcSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(ArcSQLParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ArcSQLParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ArcSQLParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(ArcSQLParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(ArcSQLParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(ArcSQLParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(ArcSQLParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(ArcSQLParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link ArcSQLParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(ArcSQLParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(ArcSQLParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(ArcSQLParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(ArcSQLParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(ArcSQLParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(ArcSQLParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(ArcSQLParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(ArcSQLParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(ArcSQLParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(ArcSQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(ArcSQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(ArcSQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link ArcSQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(ArcSQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(ArcSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(ArcSQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(ArcSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(ArcSQLParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(ArcSQLParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(ArcSQLParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(ArcSQLParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(ArcSQLParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(ArcSQLParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(ArcSQLParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(ArcSQLParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(ArcSQLParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(ArcSQLParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(ArcSQLParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(ArcSQLParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(ArcSQLParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(ArcSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(ArcSQLParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(ArcSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link ArcSQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(ArcSQLParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(ArcSQLParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(ArcSQLParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(ArcSQLParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(ArcSQLParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(ArcSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(ArcSQLParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(ArcSQLParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(ArcSQLParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(ArcSQLParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(ArcSQLParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#windows}.
	 * @param ctx the parse tree
	 */
	void enterWindows(ArcSQLParser.WindowsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#windows}.
	 * @param ctx the parse tree
	 */
	void exitWindows(ArcSQLParser.WindowsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(ArcSQLParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(ArcSQLParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(ArcSQLParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(ArcSQLParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(ArcSQLParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link ArcSQLParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(ArcSQLParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(ArcSQLParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(ArcSQLParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(ArcSQLParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(ArcSQLParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ArcSQLParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ArcSQLParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ArcSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ArcSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(ArcSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(ArcSQLParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(ArcSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link ArcSQLParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(ArcSQLParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(ArcSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(ArcSQLParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(ArcSQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(ArcSQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ArcSQLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ArcSQLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(ArcSQLParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(ArcSQLParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(ArcSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(ArcSQLParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(ArcSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(ArcSQLParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(ArcSQLParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(ArcSQLParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(ArcSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link ArcSQLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(ArcSQLParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArcSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(ArcSQLParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArcSQLParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(ArcSQLParser.NonReservedContext ctx);
}
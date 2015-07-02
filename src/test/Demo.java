package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.*;
import com.mysql.jdbc.log.Log;

/**
 * Servlet implementation class Demo
 */
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Connection connection = new Connection() {
			
			@Override
			public boolean useUnbufferedInput() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setZeroDateTimeBehavior(String behavior) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setYearIsDateType(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVerifyServerCertificate(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUtf8OutsideBmpIncludedColumnNamePattern(String regexPattern) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUtf8OutsideBmpExcludedColumnNamePattern(String regexPattern) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseUsageAdvisor(boolean useUsageAdvisorFlag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseUnicode(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseUnbufferedInput(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseUltraDevWorkAround(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseTimezone(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseStreamLengthsInPrepStmts(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseSqlStateCodes(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseServerPreparedStmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseServerPrepStmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseSSPSCompatibleTimezoneShift(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseSSL(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseReadAheadInput(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseOnlyServerErrorMessages(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseOldUTF8Behavior(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseOldAliasMetadataBehavior(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseNanosForElapsedTime(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseLocalTransactionState(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseLocalSessionState(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseLegacyDatetimeCode(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseJvmCharsetConverters(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseJDBCCompliantTimezoneShift(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseInformationSchema(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseHostsInPrivileges(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseGmtMillisForDatetimes(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseFastIntParsing(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseFastDateParsing(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseDynamicCharsetInfo(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseDirectRowUnpack(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseCursorFetch(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseConfigs(String configs) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseCompression(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseColumnNamesInFindColumn(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseBlobToStoreUTF8OutsideBMP(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUseAffectedRows(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setUltraDevHack(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTrustCertificateKeyStoreUrl(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTrustCertificateKeyStoreType(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTrustCertificateKeyStorePassword(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTreatUtilDateAsTimestamp(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTransformedBitIsBoolean(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTraceProtocol(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTinyInt1isBit(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTcpTrafficClass(int classFlags) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTcpSndBuf(int bufSize) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTcpRcvBuf(int bufSize) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTcpNoDelay(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTcpKeepAlive(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStrictUpdates(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStrictFloatingPoint(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStatementInterceptors(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSocksProxyPort(int socksProxyPort) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSocksProxyHost(String socksProxyHost) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSocketTimeout(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSocketFactoryClassName(String property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSocketFactory(String name) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSlowQueryThresholdNanos(long nanos) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSlowQueryThresholdMillis(int millis) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSessionVariables(String variables) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setServerTimezone(String property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setServerRSAPublicKeyFile(String serverRSAPublicKeyFile)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setServerConfigCacheFactory(String factoryClassname) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSelfDestructOnPingSecondsLifetime(int seconds)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSelfDestructOnPingMaxOperations(int maxOperations)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSecondsBeforeRetryMaster(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRunningCTS13(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRoundRobinLoadBalance(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRollbackOnPooledClose(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRewriteBatchedStatements(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRetriesAllDown(int retriesAllDown) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRetainStatementAfterResultSetClose(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setResultSetSizeThreshold(int threshold) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setResourceId(String resourceId) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRequireSSL(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setReportMetricsIntervalMillis(int millis) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setReplicationEnableJMX(boolean replicationEnableJMX) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setRelaxAutoCommit(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setReconnectAtTxEnd(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setReadOnlyPropagatesToServer(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setQueryTimeoutKillsConnection(
					boolean queryTimeoutKillsConnection) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setQueriesBeforeRetryMaster(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPropertiesTransform(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setProfilerEventHandler(String handler) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setProfileSql(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setProfileSQL(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setProcessEscapeCodesForPrepStmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPreparedStatementCacheSqlLimit(int cacheSqlLimit)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPreparedStatementCacheSize(int cacheSize)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPrepStmtCacheSqlLimit(int sqlLimit) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPrepStmtCacheSize(int cacheSize) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPopulateInsertRowWithDefaultValues(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPinGlobalTxToPhysicalConnection(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPedantic(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPasswordCharacterEncoding(String characterSet) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setParseInfoCacheFactory(String factoryClassname) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setParanoid(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPadCharsWithSpace(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPacketDebugBufferSize(int size) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setOverrideSupportsIntegrityEnhancementFacility(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNullNamePatternMatchesAll(boolean value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNullCatalogMeansCurrent(boolean value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNoTimezoneConversionForTimeType(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNoTimezoneConversionForDateType(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNoDatetimeStringSync(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNoAccessToProcedureBodies(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNetTimeoutForStreamingResults(int value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMetadataCacheSize(int value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxRows(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxReconnects(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaxQuerySizeToLog(int sizeInBytes) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setMaintainTimeStats(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoggerClassName(String className) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLogger(String property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLogXaCommands(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLogSlowQueries(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLocatorFetchBufferSize(String value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLocalSocketAddress(String address) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceValidateConnectionOnSwapServer(
					boolean loadBalanceValidateConnectionOnSwapServer) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceStrategy(String strategy) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceSQLStateFailover(
					String loadBalanceSQLStateFailover) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceSQLExceptionSubclassFailover(
					String loadBalanceSQLExceptionSubclassFailover) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalancePingTimeout(int loadBalancePingTimeout)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceExceptionChecker(
					String loadBalanceExceptionChecker) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceEnableJMX(boolean loadBalanceEnableJMX) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceConnectionGroup(String loadBalanceConnectionGroup) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceBlacklistTimeout(int loadBalanceBlacklistTimeout)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceAutoCommitStatementThreshold(
					int loadBalanceAutoCommitStatementThreshold) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLoadBalanceAutoCommitStatementRegex(
					String loadBalanceAutoCommitStatementRegex) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLargeRowSizeThreshold(String value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJdbcCompliantTruncationForReads(
					boolean jdbcCompliantTruncationForReads) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setJdbcCompliantTruncation(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIsInteractiveClient(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setInteractiveClient(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setInitialTimeout(int property) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIncludeThreadNamesAsStatementComment(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIncludeThreadDumpInDeadlockExceptions(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIncludeInnodbStatusInDeadlockExceptions(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setIgnoreNonTxTables(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setHoldResultsOpenOverStatementClose(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setGetProceduresReturnsFunctions(
					boolean getProcedureReturnsFunctions) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setGenerateSimpleParameterMetadata(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setGatherPerformanceMetrics(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setGatherPerfMetrics(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFunctionsNeverReturnBlobs(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFailOverReadOnly(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setExplainSlowQueries(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setExceptionInterceptors(String exceptionInterceptors) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEncoding(String property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEnabledSSLCipherSuites(String cipherSuites) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEnableQueryTimeouts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEnablePacketDebug(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEmulateUnsupportedPstmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEmulateLocators(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setEmptyStringsConvertToZero(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setElideSetAutoCommits(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDynamicCalendars(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDumpQueriesOnException(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDumpMetadataOnColumnNotFound(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDontTrackOpenResources(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDontCheckOnDuplicateKeyUpdateInSQL(
					boolean dontCheckOnDuplicateKeyUpdateInSQL) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDisconnectOnExpiredPasswords(
					boolean disconnectOnExpiredPasswords) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDisabledAuthenticationPlugins(
					String disabledAuthenticationPlugins) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDetectServerPreparedStmts(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDetectCustomCollations(boolean detectCustomCollations) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDefaultFetchSize(int n) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setDefaultAuthenticationPlugin(
					String defaultAuthenticationPlugin) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCreateDatabaseIfNotExist(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setContinueBatchOnError(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setConnectionLifecycleInterceptors(String interceptors) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setConnectionCollation(String collation) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setConnectTimeout(int timeoutMs) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCompensateOnDuplicateKeyUpdateCounts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClobberStreamingResults(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClobCharacterEncoding(String encoding) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientInfoProvider(String classname) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientCertificateKeyStoreUrl(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientCertificateKeyStoreType(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientCertificateKeyStorePassword(String value) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterSetResults(String characterSet) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCharacterEncoding(String encoding) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCapitalizeTypeNames(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCapitalizeDBMDTypes(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCallableStmtCacheSize(int cacheSize) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCallableStatementCacheSize(int size) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCacheServerConfiguration(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCacheResultSetMetadata(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCachePreparedStatements(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCachePrepStmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCacheDefaultTimezone(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCacheCallableStmts(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCacheCallableStatements(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlobsAreStrings(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setBlobSendChunkSize(String value) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoSlowLog(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoReconnectForPools(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoReconnectForConnectionPools(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoReconnect(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoGenerateTestcaseScript(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoDeserialize(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoClosePStmtStreams(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAuthenticationPlugins(String authenticationPlugins) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAlwaysSendSetIsolation(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowUrlInLocalInfile(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowPublicKeyRetrieval(boolean allowPublicKeyRetrieval)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowNanAndInf(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowMultiQueries(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowMasterDownConnections(boolean connectIfMasterDown) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAllowLoadLocalInfile(boolean property) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public String getZeroDateTimeBehavior() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getYearIsDateType() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getVerifyServerCertificate() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getUtf8OutsideBmpIncludedColumnNamePattern() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getUtf8OutsideBmpExcludedColumnNamePattern() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getUseUsageAdvisor() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseUnicode() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseUnbufferedInput() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseUltraDevWorkAround() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseTimezone() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseStreamLengthsInPrepStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseSqlStateCodes() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseServerPreparedStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseServerPrepStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseSSPSCompatibleTimezoneShift() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseSSL() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseReadAheadInput() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseOnlyServerErrorMessages() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseOldUTF8Behavior() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseOldAliasMetadataBehavior() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseNanosForElapsedTime() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseLocalTransactionState() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseLocalSessionState() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseLegacyDatetimeCode() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseJvmCharsetConverters() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseJDBCCompliantTimezoneShift() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseInformationSchema() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseHostsInPrivileges() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseGmtMillisForDatetimes() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseFastIntParsing() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseFastDateParsing() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseDynamicCharsetInfo() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseDirectRowUnpack() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseCursorFetch() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getUseConfigs() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getUseCompression() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseColumnNamesInFindColumn() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseBlobToStoreUTF8OutsideBMP() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUseAffectedRows() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getUltraDevHack() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getTrustCertificateKeyStoreUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTrustCertificateKeyStoreType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getTrustCertificateKeyStorePassword() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getTreatUtilDateAsTimestamp() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getTransformedBitIsBoolean() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getTraceProtocol() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getTinyInt1isBit() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getTcpTrafficClass() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getTcpSndBuf() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getTcpRcvBuf() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getTcpNoDelay() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getTcpKeepAlive() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getStrictUpdates() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getStrictFloatingPoint() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getStatementInterceptors() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSocksProxyPort() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSocksProxyHost() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSocketTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSocketFactoryClassName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSocketFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getSlowQueryThresholdNanos() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getSlowQueryThresholdMillis() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getSessionVariables() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getServerTimezone() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getServerRSAPublicKeyFile() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getServerConfigCacheFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSelfDestructOnPingSecondsLifetime() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getSelfDestructOnPingMaxOperations() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getSecondsBeforeRetryMaster() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getRunningCTS13() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getRoundRobinLoadBalance() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getRollbackOnPooledClose() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getRewriteBatchedStatements() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getRetriesAllDown() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getRetainStatementAfterResultSetClose() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getResultSetSizeThreshold() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getResourceId() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getRequireSSL() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getReportMetricsIntervalMillis() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getReplicationEnableJMX() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getRelaxAutoCommit() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getReconnectAtTxEnd() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getReadOnlyPropagatesToServer() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getQueryTimeoutKillsConnection() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getQueriesBeforeRetryMaster() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getPropertiesTransform() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getProfilerEventHandler() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getProfileSql() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getProfileSQL() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getProcessEscapeCodesForPrepStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getPreparedStatementCacheSqlLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getPreparedStatementCacheSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getPrepStmtCacheSqlLimit() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getPrepStmtCacheSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getPopulateInsertRowWithDefaultValues() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getPinGlobalTxToPhysicalConnection() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getPedantic() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getPasswordCharacterEncoding() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getParseInfoCacheFactory() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getParanoid() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getPadCharsWithSpace() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getPacketDebugBufferSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getOverrideSupportsIntegrityEnhancementFacility() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNullNamePatternMatchesAll() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNullCatalogMeansCurrent() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNoTimezoneConversionForTimeType() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNoTimezoneConversionForDateType() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNoDatetimeStringSync() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getNoAccessToProcedureBodies() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getNetTimeoutForStreamingResults() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMetadataCacheSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxRows() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxReconnects() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxQuerySizeToLog() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaxAllowedPacket() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getMaintainTimeStats() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getLoggerClassName() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLogger() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getLogXaCommands() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getLogSlowQueries() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getLocatorFetchBufferSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getLocalSocketAddress() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getLoadBalanceValidateConnectionOnSwapServer() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getLoadBalanceStrategy() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLoadBalanceSQLStateFailover() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLoadBalanceSQLExceptionSubclassFailover() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getLoadBalancePingTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getLoadBalanceExceptionChecker() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getLoadBalanceEnableJMX() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getLoadBalanceConnectionGroup() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getLoadBalanceBlacklistTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getLoadBalanceAutoCommitStatementThreshold() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getLoadBalanceAutoCommitStatementRegex() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getLargeRowSizeThreshold() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getJdbcCompliantTruncationForReads() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getJdbcCompliantTruncation() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getIsInteractiveClient() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getInteractiveClient() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getInitialTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getIncludeThreadNamesAsStatementComment() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getIncludeThreadDumpInDeadlockExceptions() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getIncludeInnodbStatusInDeadlockExceptions() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getIgnoreNonTxTables() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getHoldResultsOpenOverStatementClose() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getGetProceduresReturnsFunctions() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getGenerateSimpleParameterMetadata() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getGatherPerformanceMetrics() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getGatherPerfMetrics() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getFunctionsNeverReturnBlobs() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getFailOverReadOnly() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getExplainSlowQueries() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getExceptionInterceptors() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ExceptionInterceptor getExceptionInterceptor() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getEncoding() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getEnabledSSLCipherSuites() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getEnableQueryTimeouts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getEnablePacketDebug() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getEmulateUnsupportedPstmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getEmulateLocators() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getEmptyStringsConvertToZero() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getElideSetAutoCommits() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDynamicCalendars() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDumpQueriesOnException() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDumpMetadataOnColumnNotFound() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDontTrackOpenResources() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDontCheckOnDuplicateKeyUpdateInSQL() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getDisconnectOnExpiredPasswords() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getDisabledAuthenticationPlugins() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getDetectCustomCollations() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getDefaultFetchSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getDefaultAuthenticationPlugin() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getCreateDatabaseIfNotExist() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getContinueBatchOnError() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getConnectionLifecycleInterceptors() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getConnectionCollation() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getConnectionAttributes() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getConnectTimeout() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getCompensateOnDuplicateKeyUpdateCounts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getClobberStreamingResults() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getClobCharacterEncoding() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getClientInfoProvider() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getClientCertificateKeyStoreUrl() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getClientCertificateKeyStoreType() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getClientCertificateKeyStorePassword() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCharacterSetResults() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getCapitalizeTypeNames() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getCallableStmtCacheSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getCallableStatementCacheSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getCacheServerConfiguration() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCacheResultSetMetadata() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCachePreparedStatements() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCachePrepStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCacheDefaultTimezone() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCacheCallableStmts() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getCacheCallableStatements() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getBlobsAreStrings() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public int getBlobSendChunkSize() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public boolean getAutoSlowLog() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAutoReconnectForPools() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAutoGenerateTestcaseScript() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAutoDeserialize() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAutoClosePStmtStreams() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getAuthenticationPlugins() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getAlwaysSendSetIsolation() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowUrlInLocalInfile() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowPublicKeyRetrieval() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowNanAndInf() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowMultiQueries() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowMasterDownConnections() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean getAllowLoadLocalInfile() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String exposeAsXml() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public <T> T unwrap(Class<T> iface) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isWrapperFor(Class<?> iface) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setTransactionIsolation(int level) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Savepoint setSavepoint(String name) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Savepoint setSavepoint() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void setReadOnly(boolean readOnly) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setHoldability(int holdability) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientInfo(String name, String value)
					throws SQLClientInfoException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setClientInfo(Properties properties)
					throws SQLClientInfoException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setCatalog(String catalog) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setAutoCommit(boolean autoCommit) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rollback(Savepoint savepoint) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void rollback() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void releaseSavepoint(Savepoint savepoint) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql, int resultSetType,
					int resultSetConcurrency, int resultSetHoldability)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql, int resultSetType,
					int resultSetConcurrency) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql, String[] columnNames)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql, int[] columnIndexes)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement prepareStatement(String sql) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CallableStatement prepareCall(String sql, int resultSetType,
					int resultSetConcurrency, int resultSetHoldability)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CallableStatement prepareCall(String sql, int resultSetType,
					int resultSetConcurrency) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public CallableStatement prepareCall(String sql) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String nativeSQL(String sql) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean isValid(int timeout) throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isReadOnly() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isClosed() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public SQLWarning getWarnings() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, Class<?>> getTypeMap() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getTransactionIsolation() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public DatabaseMetaData getMetaData() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getHoldability() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getClientInfo(String name) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Properties getClientInfo() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getCatalog() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public boolean getAutoCommit() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public Struct createStruct(String typeName, Object[] attributes)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Statement createStatement(int resultSetType,
					int resultSetConcurrency, int resultSetHoldability)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Statement createStatement(int resultSetType, int resultSetConcurrency)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Statement createStatement() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public SQLXML createSQLXML() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public NClob createNClob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Clob createClob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Blob createBlob() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Array createArrayOf(String typeName, Object[] elements)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void commit() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void close() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void clearWarnings() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean versionMeetsMinimum(int major, int minor, int subminor)
					throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean supportsTransactions() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean supportsQuotedIdentifiers() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean supportsIsolationLevel() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void shutdownServer() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setStatementComment(String comment) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSessionMaxRows(int max) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setSchema(String schema) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setProxy(MySQLConnection proxy) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setPreferSlaveDuringFailover(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setNetworkTimeout(Executor executor, int milliseconds)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setInGlobalTx(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setFailedOver(boolean flag) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql,
					int resultSetType, int resultSetConcurrency,
					int resultSetHoldability) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql,
					int resultSetType, int resultSetConcurrency) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql,
					String[] autoGenKeyColNames) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql,
					int[] autoGenKeyIndexes) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql,
					int autoGenKeyIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement serverPrepareStatement(String sql)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void resetServerState() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void reportQueryTime(long millisOrNanos) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void ping() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean parserKnowsUnicode() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean lowerCaseTableNames() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isServerLocal() throws SQLException {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isSameResource(Connection c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isNoBackslashEscapesSet() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isMasterConnection() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isInGlobalTx() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean isAbonormallyLongQuery(long millisOrNanos) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public void initializeExtension(Extension ex) throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public boolean hasTriedMaster() {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public boolean hasSameProperties(Connection c) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			public String getStatementComment() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getSessionMaxRows() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public TimeZone getServerTimezoneTZ() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getServerCharset() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getServerCharacterEncoding() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getSchema() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Properties getProperties() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getNetworkTimeout() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Log getLog() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public long getIdleFor() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public String getHost() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getConnectionMutex() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getAutoIncrementIncrement() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getActiveStatementCount() {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql,
					int resultSetType, int resultSetConcurrency,
					int resultSetHoldability) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql,
					int resultSetType, int resultSetConcurrency) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql,
					String[] autoGenKeyColNames) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql,
					int[] autoGenKeyIndexes) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql,
					int autoGenKeyIndex) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public PreparedStatement clientPrepareStatement(String sql)
					throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void clearHasTriedMaster() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void checkClosed() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void changeUser(String userName, String newPassword)
					throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void abortInternal() throws SQLException {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void abort(Executor executor) throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};

		if (connection instanceof Connection) {
			out.println("Got it baby");
		}else {
			out.println("Mairala");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

package app.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Configuration {

    @JsonProperty("ControllerId")
    private int controllerId;

    @JsonProperty("PendingCommandsQueryInterval")
    private int pendingCommandsQueryInterval;

    @JsonProperty("AccessCardsQueryInterval")
    private int accessCardsQueryInterval;

    @JsonProperty("AccessCardsConfirmationBatchSize")
    private int accessCardsConfirmationBatchSize;

    @JsonProperty("DatabaseCleanupInterval")
    private int databaseCleanupInterval;

    @JsonProperty("EnableDatabaseDataExpirationCleanup")
    private boolean enableDatabaseDataExpirationCleanup;

    @JsonProperty("DataExpirationThreshold")
    private int dataExpirationThreshold;

    @JsonProperty("HardwareStatusNotificationInterval")
    private int hardwareStatusNotificationInterval;

    @JsonProperty("TransactionsNotificationInterval")
    private int transactionsNotificationInterval;

    @JsonProperty("AlarmsNotificationInterval")
    private int alarmsNotificationInterval;

    @JsonProperty("MaxDataNotificationRetries")
    private int maxDataNotificationRetries;

    @JsonProperty("CommandsConfirmationNotificationInterval")
    private int commandsConfirmationNotificationInterval;

    @JsonProperty("OpensApiUri")
    private String opensApiUri;

    @JsonProperty("OpensApiUser")
    private String opensApiUser;

    @JsonProperty("OpensApiPassword")
    private String opensApiPassword;

    @JsonProperty("OpensApiKey")
    private String opensApiKey;

    @JsonProperty("OpensClientId")
    private int opensClientId;


    public int getControllerId() {
        return controllerId;
    }

    public int getPendingCommandsQueryInterval() {
        return pendingCommandsQueryInterval;
    }

    public int getAccessCardsQueryInterval() {
        return accessCardsQueryInterval;
    }

    public int getAccessCardsConfirmationBatchSize() {
        return accessCardsConfirmationBatchSize;
    }

    public int getDatabaseCleanupInterval() {
        return databaseCleanupInterval;
    }

    public boolean isEnableDatabaseDataExpirationCleanup() {
        return enableDatabaseDataExpirationCleanup;
    }

    public int getDataExpirationThreshold() {
        return dataExpirationThreshold;
    }

    public int getHardwareStatusNotificationInterval() {
        return hardwareStatusNotificationInterval;
    }

    public int getTransactionsNotificationInterval() {
        return transactionsNotificationInterval;
    }

    public int getAlarmsNotificationInterval() {
        return alarmsNotificationInterval;
    }

    public int getMaxDataNotificationRetries() {
        return maxDataNotificationRetries;
    }

    public int getCommandsConfirmationNotificationInterval() {
        return commandsConfirmationNotificationInterval;
    }

    public String getOpensApiUri() {
        return opensApiUri;
    }

    public String getOpensApiUser() {
        return opensApiUser;
    }

    public String getOpensApiPassword() {
        return opensApiPassword;
    }

    public String getOpensApiKey() {
        return opensApiKey;
    }

    public int getOpensClientId() {
        return opensClientId;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "controllerId=" + controllerId +
                ", pendingCommandsQueryInterval=" + pendingCommandsQueryInterval +
                ", accessCardsQueryInterval=" + accessCardsQueryInterval +
                ", accessCardsConfirmationBatchSize=" + accessCardsConfirmationBatchSize +
                ", databaseCleanupInterval=" + databaseCleanupInterval +
                ", enableDatabaseDataExpirationCleanup=" + enableDatabaseDataExpirationCleanup +
                ", dataExpirationThreshold=" + dataExpirationThreshold +
                ", hardwareStatusNotificationInterval=" + hardwareStatusNotificationInterval +
                ", transactionsNotificationInterval=" + transactionsNotificationInterval +
                ", alarmsNotificationInterval=" + alarmsNotificationInterval +
                ", maxDataNotificationRetries=" + maxDataNotificationRetries +
                ", commandsConfirmationNotificationInterval=" + commandsConfirmationNotificationInterval +
                ", opensApiUri='" + opensApiUri + '\'' +
                ", opensApiUser='" + opensApiUser + '\'' +
                ", opensApiPassword='" + opensApiPassword + '\'' +
                ", opensApiKey='" + opensApiKey + '\'' +
                ", opensClientId=" + opensClientId +
                '}';
    }
}

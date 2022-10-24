package app.config;

import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConfigurationReaderTest {

    @Test
    public void whenDeserializingConfigFileToConfigObject_thenCorrect() throws IOException {
        ConfigurationReader configReader = new ConfigurationReader();

        Configuration config = configReader.readConfigurationFrom("src/test/resources/config.json");

        assertEquals(0, config.getControllerId());
        assertEquals(5, config.getPendingCommandsQueryInterval());
        assertEquals(30, config.getAccessCardsQueryInterval());
        assertEquals(10, config.getAccessCardsConfirmationBatchSize());
        assertEquals(1440, config.getDatabaseCleanupInterval());
        assertTrue(config.isEnableDatabaseDataExpirationCleanup());
        assertEquals(7, config.getDataExpirationThreshold());
        assertEquals(30, config.getHardwareStatusNotificationInterval());
        assertEquals(60, config.getTransactionsNotificationInterval());
        assertEquals(10, config.getAlarmsNotificationInterval());
        assertEquals(5, config.getMaxDataNotificationRetries());
        assertEquals(5, config.getCommandsConfirmationNotificationInterval());
        assertEquals("https://127.0.0.1:5555/open-s", config.getOpensApiUri());
        assertEquals("user", config.getOpensApiUser());
        assertEquals("password", config.getOpensApiPassword());
        assertEquals("", config.getOpensApiKey());
        assertEquals(0, config.getOpensClientId());
    }

    @Test
    public void whenFileNotFound_thenThrowsFileNotFoundException() {
        ConfigurationReader configReader = new ConfigurationReader();
        assertThrows(FileNotFoundException.class, () -> configReader.readConfigurationFrom("WrongFile.json"));
    }

    @Test
    public void whenDeserializingWrongFileToConfigObject_thenThrowsUnrecognizedPropertyException() {
        ConfigurationReader configReader = new ConfigurationReader();
        assertThrows(UnrecognizedPropertyException.class, () -> configReader.readConfigurationFrom("src/test/resources/invalid.json"));
    }
}

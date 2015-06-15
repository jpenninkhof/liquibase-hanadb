package liquibase.ext.hana.datatype;

import liquibase.database.Database;
import liquibase.datatype.DatabaseDataType;
import liquibase.datatype.core.BooleanType;
import liquibase.ext.hana.HanaDatabase;

public class HanaBooleanType extends BooleanType {

    @Override
    public int getPriority() {
        return PRIORITY_DATABASE;
    }

    @Override
    public boolean supports(Database database) {
        return database instanceof HanaDatabase;
    }

    @Override
    public DatabaseDataType toDatabaseDataType(Database database) {
        return new DatabaseDataType("SMALLINT");
    }
    
    @Override
	protected boolean isNumericBoolean(Database database) {
		return true;
	}
}

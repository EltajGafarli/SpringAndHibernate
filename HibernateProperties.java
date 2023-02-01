import java.util.Properties;

public class HibernatePropertiesClass {

    public static Properties properties(){
        return getProperties();
    }

    static Properties getProperties() {
        Properties prop = new Properties();
        prop.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        prop.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/{enterDBName}");
        prop.setProperty("hibernate.connection.username", "{username}");
        prop.setProperty("hibernate.connection.password", "{password}");
        prop.setProperty("hibernate.connection.pool_size", "1");
        prop.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        prop.setProperty("current_session_context_class", "thread");
        prop.setProperty("cache.provider_class", "org.hibernate.cache.internal.NoCacheProvider");
        prop.setProperty("show_sql", "true");
        prop.setProperty("hbm2ddl.auto", "create");

        return prop;
    }
}

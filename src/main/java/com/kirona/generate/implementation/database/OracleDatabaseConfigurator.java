package com.kirona.generate.implementation.database;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration

public class OracleDatabaseConfigurator
{  
      @Bean(name = "oracleDataSource1")
      @ConfigurationProperties(prefix = "spring.oracleds1") 
      public DataSource oracleDataSource1() {
          return  DataSourceBuilder.create().build();
      }

      @Bean(name = "oracleJdbcTemplate1")
      public JdbcTemplate oracleJdbcTemplate1(@Qualifier("oracleDataSource1") DataSource dsOracle) {
          return new JdbcTemplate(dsOracle);
      }

//      @Bean(name = "oracleDataSource2")
//      @ConfigurationProperties(prefix = "spring.oracleds2") 
//      public DataSource oracleDataSource2() {
//          return  DataSourceBuilder.create().build();
//      }
//
//      @Bean(name = "oracleJdbcTemplate2")
//      public JdbcTemplate oracleJdbcTemplate2(@Qualifier("oracleDataSource2") DataSource dsOracle) {
//          return new JdbcTemplate(dsOracle);
//      }
//      
//      @Bean(name = "oracleDataSource3")
//      @ConfigurationProperties(prefix = "spring.oracleds3") 
//      public DataSource oracleDataSource3() {
//          return  DataSourceBuilder.create().build();
//      }
//
//      @Bean(name = "oracleJdbcTemplate3")
//      public JdbcTemplate oracleJdbcTemplate3(@Qualifier("oracleDataSource3") DataSource dsOracle) {
//          return new JdbcTemplate(dsOracle);
//      }
            
}

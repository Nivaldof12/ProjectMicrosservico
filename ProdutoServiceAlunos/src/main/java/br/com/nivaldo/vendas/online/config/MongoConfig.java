/**
 * 
 */
package br.com.nivaldo.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author nivaldo
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.nivaldo.vendas.online.repository")
public class MongoConfig {

}

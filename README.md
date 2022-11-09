# twodata
Estudo para acessar dois bancos de dados por uma mesma aplicação.

# Tecnologias usadas:
Java
SQL SERVER

#Framework
Spring Boot

#Recursos
Spring Web

Lombok

JPA

#Motivação
Antigo cliente utiliza duas ferramentas para gerenciar um dos patios de estacionamento. Como dois bancos de dados distintos.
Observando que o usuario poderia fazer de uma só tela, procurei sobre soluções que poderia atender o cliente.
Encontrei um tutorial que mostrava como conectar um serviço Rest em duas base de dados diferentes.
No projeto é demonstrado que isso é possivel.

#Metodologia.
Para criar a conexao em dois bancos utilizei uma classe de configuração para criar as duas gerenciadoras de entidade:
Inclui essa anotação em cada uma delas, dizendo onde seria o pacote base dos repostirorios de cada banco de dados e o nome do gerenciador de entidade.

@EnableJpaRepositories( basePackages = "com.roger.twodata.repositories.access",
entityManagerFactoryRef = "accessEntityManager")

depois um metodo @Bean com as seguintes configurações
````sh
@Bean
@Primary
@ConfigurationProperties(prefix = "access.datasource")
public DataSource accessDataSource() {
return DataSourceBuilder.create().build();
}
@Bean
@Primary
public LocalContainerEntityManagerFactoryBean accessEntityManager(
EntityManagerFactoryBuilder builder,
@Qualifier("accessDataSource") DataSource dataSource) {
return builder
.dataSource(dataSource)
.packages("com.roger.twodata.model.access")
.build();
}
````


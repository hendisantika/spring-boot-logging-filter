# spring-boot-logging-filter

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-logging-filter.git`
2. Navigate to the folder: `cd spring-boot-logging-filter`
3. Run the application: `mvn clean spring-boot:run`
4. Open your favorite browser: http://localhost:8081/customer

```json
// 20231228075631
// http://localhost:8081/customers

[
  {
    "id": 1,
    "name": "Naruto",
    "address": "Naruto"
  },
  {
    "id": 2,
    "name": "Sasuke",
    "address": "Naruto"
  },
  {
    "id": 3,
    "name": "Yuji",
    "address": "Jujustu Kaisen"
  },
  {
    "id": 4,
    "name": "Roronoa Zoro",
    "address": "One Piece"
  },
  {
    "id": 5,
    "name": "Tanjiro",
    "address": "Kimetsu no Yaiba"
  }
]
```

Console Log:

```shell

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.2.1)

2023-12-28T07:56:19.545+07:00  INFO 59385 --- [  restartedMain] c.h.l.SpringBootLoggingFilterApplication : Starting SpringBootLoggingFilterApplication using Java 21 with PID 59385 (/Users/hendisantika/IdeaProjects/spring-boot-logging-filter/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-logging-filter)
2023-12-28T07:56:19.545+07:00  INFO 59385 --- [  restartedMain] c.h.l.SpringBootLoggingFilterApplication : No active profile set, falling back to 1 default profile: "default"
2023-12-28T07:56:19.638+07:00  INFO 59385 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8081 (http)
2023-12-28T07:56:19.639+07:00  INFO 59385 --- [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-12-28T07:56:19.639+07:00  INFO 59385 --- [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.17]
2023-12-28T07:56:19.643+07:00  INFO 59385 --- [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-12-28T07:56:19.643+07:00  INFO 59385 --- [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 96 ms
2023-12-28T07:56:19.682+07:00  INFO 59385 --- [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2023-12-28T07:56:19.689+07:00  INFO 59385 --- [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8081 (http) with context path ''
2023-12-28T07:56:19.691+07:00  INFO 59385 --- [  restartedMain] c.h.l.SpringBootLoggingFilterApplication : Started SpringBootLoggingFilterApplication in 0.162 seconds (process running for 48.647)
2023-12-28T07:56:19.692+07:00  INFO 59385 --- [  restartedMain] .ConditionEvaluationDeltaLoggingListener : Condition evaluation unchanged
2023-12-28T07:56:31.467+07:00  INFO 59385 --- [nio-8081-exec-1] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2023-12-28T07:56:31.467+07:00  INFO 59385 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2023-12-28T07:56:31.470+07:00  INFO 59385 --- [nio-8081-exec-1] o.s.web.servlet.DispatcherServlet        : Completed initialization in 2 ms
2023-12-28T07:56:31.506+07:00  INFO 59385 --- [nio-8081-exec-1] c.h.loggingfilter.config.LoggingFilter   : FINISHED PROCESSING : METHOD=GET; REQUEST URI=/customers; REQUEST PAYLOAD=; RESPONSE CODE=200; RESPONSE=[{"id":1,"name":"Naruto","address":"Naruto"},{"id":2,"name":"Sasuke","address":"Naruto"},{"id":3,"name":"Yuji","address":"Jujustu Kaisen"},{"id":4,"name":"Roronoa Zoro","address":"One Piece"},{"id":5,"name":"Tanjiro","address":"Kimetsu no Yaiba"}]; TIME TAKEN=34
2023-12-28T07:56:31.680+07:00  INFO 59385 --- [nio-8081-exec-2] c.h.loggingfilter.config.LoggingFilter   : FINISHED PROCESSING : METHOD=GET; REQUEST URI=/favicon.ico; REQUEST PAYLOAD=; RESPONSE CODE=404; RESPONSE=; TIME TAKEN=15
```

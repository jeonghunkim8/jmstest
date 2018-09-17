# jmstest
Project for testing Amazon MQ(active mq)

- after importing the project(with pom.xml), then make "application.properties"
- copy and paste below text, modify &lt;url&gt;, &lt;username&gt;, &lt;password&gt;
```
spring.activemq.broker-url=<url>
spring.activemq.user=<username>
spring.activemq.password=<password>
```
- add this to vm option(http://activemq.apache.org/objectmessage.html)
```
-Dorg.apache.activemq.SERIALIZABLE_PACKAGES="com.kurly.jmstest"
```
- run testclass, then check the result.
  


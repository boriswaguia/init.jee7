init.jee7
=========
What we are doing is to write some samples implementations of JEE7's new features.

1. init.jee7 : top level mave project.
2. init.api  : api shared between all jee7 init module
3. init.rest : simple <b>JEE7</b> rest service implementation

compile
============

1. clone <code>https://github.com/boriswaguia/init.jee7.git</code>
2. <code>cd ~/init.jee7</code>
3. <code>mvn clean install </code>

Actually, I'm testing this on <b>glassfish4</b>

deploy and test
===============

1. start glassfish4 : <b>$AS_HOME/bin/asadmin start-domain</b>
2. deploy the application : <b>$AS_HOME/bin/asadmin deploy ./init.jee7/init.rest/target/init.rest.war</b>
3. <code>localhost:8080/init.rest/rs/catalog/</code> for a JSON list of catalogs
4. <code>localhost:8080/init.rest/rs/catalog/{catalog_id} for a single JSON catalog result.

thanks !

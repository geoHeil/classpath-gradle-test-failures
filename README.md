Executing:

```bash
git clone git@github.com:geoHeil/classpath-gradle-test-failures.git
cd classpath-gradle-test-failure
gradle test
```

fails with:

```
> Task :test
WARNING: An illegal reflective access operation has occurred
WARNING: Illegal reflective access by org.parboiled.transform.AsmUtils (file:/Users/geoheil/.gradle/caches/modules-2/files-2.1/org.parboiled/parboiled-java/1.1.7/2298c64ce8ee8e2fb37e97e16d7be52f0c7cf61f/parboiled-java-1.1.7.jar) to method java.lang.ClassLoader.findLoadedClass(java.lang.String)
WARNING: Please consider reporting this to the maintainers of org.parboiled.transform.AsmUtils
WARNING: Use --illegal-access=warn to enable warnings of further illegal reflective access operations
WARNING: All illegal access operations will be denied in a future release
Discovery starting.
Discovery completed in 122 milliseconds.
Run starting. Expected test count is: 2
18/10/19 09:13:15 WARN NativeCodeLoader: Unable to load native-hadoop library for your platform... using builtin-java classes where applicable
18/10/19 09:13:17 WARN SparkContext: Using an existing SparkContext; some configuration may not take effect.
Test2:
foo2est
- should test fine *** FAILED *** (2 seconds, 151 milliseconds)
  java.lang.IllegalArgumentException: Error while instantiating 'org.apache.spark.sql.hive.HiveSessionStateBuilder':
  at org.apache.spark.sql.SparkSession$.org$apache$spark$sql$SparkSession$$instantiateSessionState(SparkSession.scala:1075)
  at org.apache.spark.sql.SparkSession$$anonfun$sessionState$2.apply(SparkSession.scala:142)
  at org.apache.spark.sql.SparkSession$$anonfun$sessionState$2.apply(SparkSession.scala:141)
  at scala.Option.getOrElse(Option.scala:121)
  at org.apache.spark.sql.SparkSession.sessionState$lzycompute(SparkSession.scala:141)
  at org.apache.spark.sql.SparkSession.sessionState(SparkSession.scala:138)
  at org.apache.spark.sql.Dataset.<init>(Dataset.scala:171)
  at org.apache.spark.sql.Dataset$.apply(Dataset.scala:62)
  at org.apache.spark.sql.SparkSession.createDataset(SparkSession.scala:471)
  at org.apache.spark.sql.SQLContext.createDataset(SQLContext.scala:377)
  ...
  Cause: java.lang.ClassNotFoundException: java.lang.NoClassDefFoundError: org/apache/hadoop/hive/ql/session/SessionState when creating Hive client using classpath: file:/Users/geoheil/Downloads/gradle-test-hive/build/classes/java/test, file:/Users/geoheil/Downloads/gradle-test-hive/build/classes/scala/test/
Please make sure that jars for your version of hive and hadoop are included in the paths passed to spark.sql.hive.metastore.jars.
  at org.apache.spark.sql.hive.client.IsolatedClientLoader.createClient(IsolatedClientLoader.scala:274)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:362)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:266)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client$lzycompute(HiveExternalCatalog.scala:66)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client(HiveExternalCatalog.scala:65)
  at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply$mcZ$sp(HiveExternalCatalog.scala:195)
  at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply(HiveExternalCatalog.scala:195)
  at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply(HiveExternalCatalog.scala:195)
  at org.apache.spark.sql.hive.HiveExternalCatalog.withClient(HiveExternalCatalog.scala:97)
  at org.apache.spark.sql.hive.HiveExternalCatalog.databaseExists(HiveExternalCatalog.scala:194)
  ...
  Cause: java.lang.reflect.InvocationTargetException:
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  at org.apache.spark.sql.hive.client.IsolatedClientLoader.createClient(IsolatedClientLoader.scala:268)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:362)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:266)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client$lzycompute(HiveExternalCatalog.scala:66)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client(HiveExternalCatalog.scala:65)
  at org.apache.spark.sql.hive.HiveExternalCatalog$$anonfun$databaseExists$1.apply$mcZ$sp(HiveExternalCatalog.scala:195)
  ...
  Cause: java.lang.NoClassDefFoundError: org/apache/hadoop/hive/ql/session/SessionState
  at org.apache.spark.sql.hive.client.HiveClientImpl.<init>(HiveClientImpl.scala:136)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  at org.apache.spark.sql.hive.client.IsolatedClientLoader.createClient(IsolatedClientLoader.scala:268)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:362)
  at org.apache.spark.sql.hive.HiveUtils$.newClientForMetadata(HiveUtils.scala:266)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client$lzycompute(HiveExternalCatalog.scala:66)
  at org.apache.spark.sql.hive.HiveExternalCatalog.client(HiveExternalCatalog.scala:65)
  ...
  Cause: java.lang.ClassNotFoundException: org.apache.hadoop.hive.ql.session.SessionState
  at java.base/java.net.URLClassLoader.findClass(URLClassLoader.java:471)
  at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:588)
  at org.apache.spark.sql.hive.client.IsolatedClientLoader$$anon$1.doLoadClass(IsolatedClientLoader.scala:225)
  at org.apache.spark.sql.hive.client.IsolatedClientLoader$$anon$1.loadClass(IsolatedClientLoader.scala:214)
  at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
  at org.apache.spark.sql.hive.client.HiveClientImpl.<init>(HiveClientImpl.scala:136)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
  at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
  at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
  at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
  ...
hello
Test1:
footest
- should test fine (1 millisecond)
Run completed in 4 seconds, 381 milliseconds.
Total number of tests run: 2
Suites: completed 3, aborted 0
Tests: succeeded 1, failed 1, canceled 0, ignored 0, pending 0
*** 1 TEST FAILED ***

```

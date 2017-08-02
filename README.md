# Log Log 

Biblioteca reconstruída a partir do arquivo Jar
Versão disponível em: https://bintray.com/godoy/opla-tool/loglog

# Forma de utilização

Para utilização devem ser configurados repositório remoto e dependência conforme descrito abaixo:

#### Configuração repositório

```xml

    <repository>
	<id>bintray-godoy-opla-tool</id>
	<name>bintray</name>
	<url>http://dl.bintray.com/godoy/opla-tool</url>
	<snapshots>
		<enabled>true</enabled>
	</snapshots>
	<releases>
		<enabled>false</enabled>
	</releases>
    </repository>

```
#### Declaração de dependência

```xml

    <dependency>
	<groupId>br.ufpr.dinf.gres</groupId>
	<artifactId>loglog</artifactId>
	<version>0.0.1</version>
    </dependency>

```

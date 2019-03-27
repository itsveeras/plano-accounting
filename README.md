# plano-accounting
Craft Demo

mvn package

Run Standlone with H2 in memory repository: java -jar target/demo-0.0.1-SNAPSHOT.jar


GET:
curl --request GET \
  --url http://localhost:8080/client
  
  

ADD:
curl --request POST \
  --url http://localhost:8080/client/ \
  --header 'content-type: application/json' \
  --data '{
	"firstName": "Sony",
	"lastName": "Pet"
}'


DELETE:

curl --request DELETE \
  --url http://localhost:8080/client/%60
  
  
curl --request PUT \
  --url http://localhost:8080/client/5 \
  --header 'content-type: application/json' \
  --data '{
	"firstName": "Charl",
	"lastName": "Les"
}'  
  
TODO: 
--Security token
--Move Account type to new table
--Add Test cases
--RAML /Swagger REST documentation
  
  

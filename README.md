# PIK
# Requirements

Java JRE 1.8+

# How to run project?

Compile
```
mvnw clean install
```
And run
```
java -jar target/pik-0.0.1-SNAPSHOT.jar
```

# How to run project - in progress version
1. Click "Run" in Intellij.
2. Being in project directory:
```
cd client
ng serve
```
3. In browser go to:
```
localhost:4200
```

# How to make HTTP request with CURL:
Example for adding new task:
```
curl -X POST -d @filename.txt http://localhost:8080/tasks --header "Content-Type:application/json"`
```
where in filename.txt proper JSON is put, e.g. 
```json
{
    "id": 10,
    "name": "NEW-TASK"
}
```



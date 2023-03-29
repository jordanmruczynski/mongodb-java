package pl.jordanmruczynski;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoDatabaseImpl;
import org.bson.Document;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    //    MongoClientURI mongoClientURI = new MongoClientURI("mongodb://uwbzgy9v33yeg4weguus:JAoVh38uQ8iv5OyAPROp@n1-c2-mongodb-clevercloud-customers.services.clever-cloud.com:27017,n2-c2-mongodb-clevercloud-customers.services.clever-cloud.com:27017/blkdwzz0e0eoacb?replicaSet=rs0");
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        MongoDatabase mongoDatabase = mongoClient.getDatabase("testowabaza");
        MongoCollection mongoCollection = mongoDatabase.getCollection("bans");

        Document ban = new Document();
        ban.put("User", "Test");
        ban.put("Admin", "AdminTest");
        ban.put("Reason", "Default Reason");

        mongoCollection.insertOne(ban);
    }
}
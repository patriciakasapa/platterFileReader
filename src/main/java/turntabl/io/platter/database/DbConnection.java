package turntabl.io.platter.database;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.asm.TypeReference;
import turntabl.io.platter.model.DomainPlatter;

import java.io.InputStream;
import java.sql.*;

public class DbConnection {
    public static final String url = "jdbc:postgresql:tplatterdb";

    public DbConnection() throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        try (Connection connection = DriverManager.getConnection(url, "postgres", "my111")) {
            JSONObject jsonObject = new JSONObject();
             InputStream inputStream =  TypeReference.class.getResourceAsStream("/json/platterdb.json");
            String jsonConvertedString = jsonObject.getString(String.valueOf(inputStream));
            String query = "INSERT INTO weather (city, temp) VALUES (jsonConvertedString::json))";
            PreparedStatement requestedQuery = connection.prepareStatement(query);
            requestedQuery.clearParameters();
            requestedQuery.setString(1, query);
            ResultSet rs = requestedQuery.executeQuery();

            while (rs.next()){
//                        rs.getString("id"),
//                        rs.getString("city"),
//                        rs.getString("temp")
            }

        }catch (SQLException | JSONException sqlEx){
            System.err.println("Connection error: " + sqlEx);
        }


    }
}

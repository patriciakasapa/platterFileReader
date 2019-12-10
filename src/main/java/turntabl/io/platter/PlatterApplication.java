package turntabl.io.platter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import turntabl.io.platter.controller.ControllerPlatter;
import turntabl.io.platter.database.DbConnection;
import turntabl.io.platter.model.DomainPlatter;

import java.sql.*;
import java.util.Scanner;

@SpringBootApplication
public class PlatterApplication {

	public static void main(String[] args) throws ClassNotFoundException {
		SpringApplication.run(PlatterApplication.class, args);
		DbConnection dbConnection = new DbConnection();
//		ControllerPlatter controllerPlatter = new ControllerPlatter(dbConnection);
//		controllerPlatter.list();
	}
}

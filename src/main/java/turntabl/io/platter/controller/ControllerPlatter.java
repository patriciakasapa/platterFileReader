package turntabl.io.platter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turntabl.io.platter.database.DbConnection;
import turntabl.io.platter.model.DomainPlatter;

@RestController
@RequestMapping("/")
public class ControllerPlatter {

    @Autowired
    private DbConnection dbConnection;

    public ControllerPlatter(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    @GetMapping("/list")
    public Iterable<DomainPlatter> list(){
        return (Iterable<DomainPlatter>) dbConnection;
    }
}

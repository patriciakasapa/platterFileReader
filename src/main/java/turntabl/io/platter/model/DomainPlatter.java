package turntabl.io.platter.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomainPlatter {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("city")
    private String city;
    @JsonProperty("temp")
    private String temp;

    public DomainPlatter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}

package androidwarriors.retrofitexample.POJO;

/**
 * Created by macbookpro on 1/7/16.
 */
public class City {


    private Integer id;
    private String name;
    private Boolean active;
    private Object accessRight;
    private String createdAt;
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Object getAccessRight() {
        return accessRight;
    }

    public void setAccessRight(Object accessRight) {
        this.accessRight = accessRight;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}

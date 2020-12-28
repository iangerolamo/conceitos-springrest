package me.iangerolamo;

public class Repository {
    private int id;
    private String title;
    private String url;
    private String techs;

    public Repository(){

    }

    public Repository(int id, String title, String url, String techs) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.techs = techs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTechs() {
        return techs;
    }

    public void setTechs(String techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Repositories{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", techs='" + techs + '\'' +
                '}';
    }
}

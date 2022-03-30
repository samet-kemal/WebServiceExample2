package Model;

public class Information {

   private Integer userId;

   private Integer id;

   private String title;

   private Boolean  completed;

    @Override
    public String toString() {
        return "Information{" +
                "userId=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", completed=" + completed +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }
    public String getStringUserId() {
        return userId.toString();
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }
    public String getStringId() {
        return id.toString();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}

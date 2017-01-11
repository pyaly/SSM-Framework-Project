package swust.edu.cn.postdoctors.model;

import java.util.Date;

public class Article {
    private Integer artiId;

    private Integer artiColmid;

    private String artiTitle;

    private String artiAuthor;

    private Date artiDate;

    private Boolean artiState;

    private String artiContent;

    public Integer getArtiId() {
        return artiId;
    }

    public void setArtiId(Integer artiId) {
        this.artiId = artiId;
    }

    public Integer getArtiColmid() {
        return artiColmid;
    }

    public void setArtiColmid(Integer artiColmid) {
        this.artiColmid = artiColmid;
    }

    public String getArtiTitle() {
        return artiTitle;
    }

    public void setArtiTitle(String artiTitle) {
        this.artiTitle = artiTitle == null ? null : artiTitle.trim();
    }

    public String getArtiAuthor() {
        return artiAuthor;
    }

    public void setArtiAuthor(String artiAuthor) {
        this.artiAuthor = artiAuthor == null ? null : artiAuthor.trim();
    }

    public Date getArtiDate() {
        return artiDate;
    }

    public void setArtiDate(Date artiDate) {
        this.artiDate = artiDate;
    }

    public Boolean getArtiState() {
        return artiState;
    }

    public void setArtiState(Boolean artiState) {
        this.artiState = artiState;
    }

    public String getArtiContent() {
        return artiContent;
    }

    public void setArtiContent(String artiContent) {
        this.artiContent = artiContent == null ? null : artiContent.trim();
    }
}
package swust.edu.cn.postdoctors.model;

public class Attachments {
    private Integer attaId;

    private Integer attaArtiid;

    private String attaName;

    private String attaPath;

    private String attaServername;

    private String attaType;

    private String attaNote;

    public Integer getAttaId() {
        return attaId;
    }

    public void setAttaId(Integer attaId) {
        this.attaId = attaId;
    }

    public Integer getAttaArtiid() {
        return attaArtiid;
    }

    public void setAttaArtiid(Integer attaArtiid) {
        this.attaArtiid = attaArtiid;
    }

    public String getAttaName() {
        return attaName;
    }

    public void setAttaName(String attaName) {
        this.attaName = attaName == null ? null : attaName.trim();
    }

    public String getAttaPath() {
        return attaPath;
    }

    public void setAttaPath(String attaPath) {
        this.attaPath = attaPath == null ? null : attaPath.trim();
    }

    public String getAttaServername() {
        return attaServername;
    }

    public void setAttaServername(String attaServername) {
        this.attaServername = attaServername == null ? null : attaServername.trim();
    }

    public String getAttaType() {
        return attaType;
    }

    public void setAttaType(String attaType) {
        this.attaType = attaType == null ? null : attaType.trim();
    }

    public String getAttaNote() {
        return attaNote;
    }

    public void setAttaNote(String attaNote) {
        this.attaNote = attaNote == null ? null : attaNote.trim();
    }
}
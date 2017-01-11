package swust.edu.cn.postdoctors.model;

public class Columnss {
    private Integer colmId;

    private String colmName;

    private Integer colmType;

    private String colmNote;

    public Integer getColmId() {
        return colmId;
    }

    public void setColmId(Integer colmId) {
        this.colmId = colmId;
    }

    public String getColmName() {
        return colmName;
    }

    public void setColmName(String colmName) {
        this.colmName = colmName == null ? null : colmName.trim();
    }

    public Integer getColmType() {
        return colmType;
    }

    public void setColmType(Integer colmType) {
        this.colmType = colmType;
    }

    public String getColmNote() {
        return colmNote;
    }

    public void setColmNote(String colmNote) {
        this.colmNote = colmNote == null ? null : colmNote.trim();
    }
}
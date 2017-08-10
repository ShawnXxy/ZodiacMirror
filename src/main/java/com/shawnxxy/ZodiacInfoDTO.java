package com.shawnxxy;

import java.util.List;

public class ZodiacInfoDTO {

    private String zodiaId;
    private String zodiaName;
    private int type;
    private int typeName; // 1 = today; 2 = tomorrow; 3 = week; 4 = month; 5 =
                          // year
    private List<ZodiacInfoDetailDTO> zodiacInfoDetail;

    public String getZodiaId() {
        return zodiaId;
    }

    public void setZodiaId(String zodiaId) {
        this.zodiaId = zodiaId;
    }

    public String getZodiaName() {
        return zodiaName;
    }

    public void setZodiaName(String zodiaName) {
        this.zodiaName = zodiaName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTypeName() {
        return typeName;
    }

    public void setTypeName(int typeName) {
        this.typeName = typeName;
    }

    public List<ZodiacInfoDetailDTO> getZodiacInfoDetail() {
        return zodiacInfoDetail;
    }

    public void setZodiacInfoDetail(List<ZodiacInfoDetailDTO> zodiacInfoDetail) {
        this.zodiacInfoDetail = zodiacInfoDetail;
    }

}

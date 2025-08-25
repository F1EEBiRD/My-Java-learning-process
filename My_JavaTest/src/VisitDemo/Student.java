package VisitDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    public long id;
    public String name;
    public String sex;
    public LocalDateTime chooseTime;
    public List<String> VisitPlace;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public LocalDateTime getChooseTime() {
        return chooseTime;
    }

    public void setChooseTime(LocalDateTime chooseTime) {
        this.chooseTime = chooseTime;
    }

    public List<String> getVisitPlace() {
        return VisitPlace;
    }

    public void setVisitPlace(List<String> visitPlace) {
        VisitPlace = visitPlace;
    }
}

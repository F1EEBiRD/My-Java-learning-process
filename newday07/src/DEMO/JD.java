package DEMO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//家电
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD implements  Switch{
    private String name;
    //状态：开or关
    private boolean status;//默认folse


    @Override
    public void press(){
        status = !status;//判断，每次都会相反触发，实现开关

    }



}

package cn.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data

public class T_admin {
    private Integer admin_id;
    private String admin_name;
    private String admin_pwd;

}

package org.qingqiao.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.events.Event;

@Data
@Component
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class People {
    @TableId(value = "id")
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
}

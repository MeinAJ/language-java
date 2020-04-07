package com.anjun.springboot.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.dataofx.base.enums.DeleteEnum;
import lombok.Data;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BaseEntity implements Serializable {

    @TableId
    private Long id;

    private LocalDateTime createTime;

    private LocalDateTime deleteTime;

    private DeleteEnum isDelete;

    private Long createId;

    private Long businessId;

    private String createName;

    public void delete() {
        this.isDelete = DeleteEnum.DELETE;
        this.deleteTime = LocalDateTime.now();
    }

    public boolean isDelete() {
        return DeleteEnum.DELETE == this.isDelete;
    }

}

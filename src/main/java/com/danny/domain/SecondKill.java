package com.danny.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author jiazhang-676002187@qq.com
 * @date 2019-05-13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SecondKill implements Serializable {
    private String  userId;
    private String  subUserId;
    private Integer subStatus;
    private Integer createTime;
    private Integer lastModifyTime;


    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
}

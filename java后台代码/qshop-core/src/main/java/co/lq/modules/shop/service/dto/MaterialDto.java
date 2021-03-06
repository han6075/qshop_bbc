package co.lq.modules.shop.service.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.Data;

/**
 * @author billy
 * @date 2020-01-09
 */
@Data
public class MaterialDto implements Serializable {

    /** PK */
    private String    id;

    /** 逻辑删除标记（0：显示；1：隐藏） */
    private String    delFlag;

    /** 创建时间 */
    private Timestamp createTime;

    /** 创建者ID */
    private String    createId;

    /** 类型1、图片；2、视频 */
    private String    type;

    /** 分组ID */
    private String    groupId;

    /** 素材名 */
    private String    name;

    /** 素材链接 */
    private String    url;
}

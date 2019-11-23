package com.tengu.experiment;

import com.tengu.annotation.*;
import lombok.Data;

import java.util.Date;


/**
 * @author 404NotFoundx
 * @version 1.0.0
 * @date 2019/11/12 9:51
 * @since 1.8
 */
@Data
@Model(value = "user_model")
@Indexes({
        @Index(alias = "uuid_index",columns = {"uuid"}, type = IndexType.UNIQUE),
        @Index(alias = "user_name_index",columns = {"userName,password"}, type = IndexType.NORMAL),
        @Index(alias = "google_email_index",columns = {"googleEmail"}, type = IndexType.FULLTEXT)
})
public class UserModel {

    @PrimaryKey
    @Column("int(11) not null")
    private Long id;

    // user_name
    @Column("varchar(255) not null")
    @Comment(value = "用户账号", index = "用户账号")
    private String userName;

    // password
    @Column("varchar(255) not null default '123456'")
    @Comment("用户密码")
    private String password;

    @Column("int(11) not null default 18")
    @Comment("用户年龄")
    private Integer userAge;

    @Column("varchar(255) not null default '地球'")
    @Comment("地址")
    private String address;

    @Column("varchar(500) not null")
    @Comment("uuid")
    private String uuid;

    // google_email
    @Column("varchar(255) not null default 'NoEmail'")
    @Comment("Google邮箱")
    private String googleEmail;

    // product_name
    @Column("varchar(255) not null default '敌敌畏'")
    @Comment("产品名称")
    private String productName;

    @Column("datetime not null")
    @Comment("创建时间")
    private Date createTime;

    @Ignore
    private String name;

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", userAge=" + userAge +
                ", address='" + address + '\'' +
                ", googleEmail='" + googleEmail + '\'' +
                ", productName='" + productName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

package io.metersphere.base.domain;

import java.io.Serializable;
import lombok.Data;

@Data
public class LoadTestReport implements Serializable {
    private String id;

    private String testId;

    private String name;

    private Long createTime;

    private Long updateTime;

    private String status;

    private String userId;

    private String triggerMode;

    private String fileId;

    private String maxUsers;

    private String avgResponseTime;

    private String tps;

    private static final long serialVersionUID = 1L;
}
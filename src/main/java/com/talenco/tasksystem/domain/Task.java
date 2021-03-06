package com.talenco.tasksystem.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * 任务
 *
 * @author echcz
 * @date 2019-04-20 22:45:28
 */
@Getter
@Setter
@NoArgsConstructor
@Document(collection = "task")
public class Task {
    public static final Integer STATE_READY = 1;
    public static final Integer STATE_ACTIVATE = 2;
    public static final Integer STATE_REVIEW = 3;
    public static final Integer STATE_DONE = 4;
    public static final Integer STATE_CLOSE = 5;
    public static final Integer STATE_EXCEPTION = 6;
    /**
     * id
     */
    @Id
    private String id;
    /**
     * 所属项目id
     */
    @Indexed
    private String project;
    /**
     * 所属模块名
     */
    @Indexed
    private String module;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String desc;
    /**
     * 状态 1:待命，2:激活，3:审核，4:完成，5:关闭，6:异常
     */
    @Indexed
    private Integer state;
    /**
     * 状态描述
     */
    private String stateDesc;
    /**
     * 负责人ids
     * 推荐是所属模块负责人的子集
     */
    private List<String> principals;
    /**
     * 处理人ids
     */
    private List<String> processors;
    /**
     * 处理信息ids
     */
    private List<String> processInfos;
    /**
     * 创建时间
     */
    private Long createTm;
    /**
     * 创建人
     */
    private String creator;
    /**
     * 预期完成时间
     */
    private Long tobeTm;
    /**
     * 实际完成时间
     */
    private Long doneTm;
    /**
     * 优先级
     * 值越大优先级越高
     */
    private Integer priority;
}

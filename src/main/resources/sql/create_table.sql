-- -----------------------------------------------------
-- 创建敏捷精益开发平台数据库
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS agile_platform DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
USE agile_platform;

-- -----------------------------------------------------
-- 1. 用户表 - 存储平台用户信息
-- -----------------------------------------------------
CREATE TABLE `users` (
                         `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '用户ID，主键',
                         `username` VARCHAR(50) NOT NULL COMMENT '用户名，登录账号',
                         `password` VARCHAR(100) NOT NULL COMMENT '密码，加密存储',
                         `name` VARCHAR(50) NOT NULL COMMENT '用户真实姓名',
                         `email` VARCHAR(100) NOT NULL COMMENT '用户邮箱',
                         `phone` VARCHAR(20) DEFAULT NULL COMMENT '手机号码',
                         `avatar` VARCHAR(255) DEFAULT NULL COMMENT '头像URL',
                         `role` VARCHAR(20) NOT NULL DEFAULT 'member' COMMENT '角色：admin-管理员，po-产品负责人，sm-敏捷管理者，member-团队成员',
                         `status` TINYINT NOT NULL DEFAULT 1 COMMENT '状态：1-启用，0-禁用',
                         `last_login_time` DATETIME DEFAULT NULL COMMENT '最后登录时间',
                         `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                         `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                         `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `uk_username` (`username`),
                         UNIQUE KEY `uk_email` (`email`),
                         KEY `idx_status` (`status`),
                         KEY `idx_role` (`role`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='用户表';

-- -----------------------------------------------------
-- 2. 组织表 - 存储组织信息
-- -----------------------------------------------------
CREATE TABLE `organizations` (
                                 `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '组织ID，主键',
                                 `name` VARCHAR(100) NOT NULL COMMENT '组织名称',
                                 `description` TEXT DEFAULT NULL COMMENT '组织描述',
                                 `logo` VARCHAR(255) DEFAULT NULL COMMENT '组织Logo URL',
                                 `owner_id` BIGINT UNSIGNED NOT NULL COMMENT '组织拥有者ID',
                                 `status` TINYINT NOT NULL DEFAULT 1 COMMENT '状态：1-正常，0-禁用',
                                 `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                                 PRIMARY KEY (`id`),
                                 UNIQUE KEY `uk_name` (`name`),
                                 KEY `idx_owner` (`owner_id`),
                                 KEY `idx_status` (`status`),
                                 CONSTRAINT `fk_org_owner` FOREIGN KEY (`owner_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='组织表';

-- -----------------------------------------------------
-- 3. 组织成员表 - 存储组织与用户的关联
-- -----------------------------------------------------
CREATE TABLE `organization_members` (
                                        `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                        `org_id` BIGINT UNSIGNED NOT NULL COMMENT '组织ID',
                                        `user_id` BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
                                        `role` VARCHAR(20) NOT NULL DEFAULT 'member' COMMENT '角色：owner-拥有者，admin-管理员，member-成员',
                                        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                        `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                        PRIMARY KEY (`id`),
                                        UNIQUE KEY `uk_org_user` (`org_id`, `user_id`),
                                        KEY `idx_user_id` (`user_id`),
                                        CONSTRAINT `fk_org_member_org` FOREIGN KEY (`org_id`) REFERENCES `organizations` (`id`) ON DELETE CASCADE,
                                        CONSTRAINT `fk_org_member_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='组织成员表';

-- -----------------------------------------------------
-- 4. 团队表 - 存储团队信息
-- -----------------------------------------------------
CREATE TABLE `teams` (
                         `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '团队ID，主键',
                         `org_id` BIGINT UNSIGNED NOT NULL COMMENT '所属组织ID',
                         `name` VARCHAR(100) NOT NULL COMMENT '团队名称',
                         `description` TEXT DEFAULT NULL COMMENT '团队描述',
                         `avatar` VARCHAR(255) DEFAULT NULL COMMENT '团队头像URL',
                         `status` TINYINT NOT NULL DEFAULT 1 COMMENT '状态：1-正常，0-禁用',
                         `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                         `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                         `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                         PRIMARY KEY (`id`),
                         UNIQUE KEY `uk_org_team_name` (`org_id`, `name`),
                         KEY `idx_org_id` (`org_id`),
                         CONSTRAINT `fk_team_org` FOREIGN KEY (`org_id`) REFERENCES `organizations` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='团队表';

-- -----------------------------------------------------
-- 5. 团队成员表 - 存储团队与用户的关联
-- -----------------------------------------------------
CREATE TABLE `team_members` (
                                `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                `team_id` BIGINT UNSIGNED NOT NULL COMMENT '团队ID',
                                `user_id` BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
                                `role` VARCHAR(20) NOT NULL DEFAULT 'developer' COMMENT '角色：leader-团队负责人，developer-开发者，tester-测试，designer-设计师',
                                `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                PRIMARY KEY (`id`),
                                UNIQUE KEY `uk_team_user` (`team_id`, `user_id`),
                                KEY `idx_user_id` (`user_id`),
                                CONSTRAINT `fk_team_member_team` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`) ON DELETE CASCADE,
                                CONSTRAINT `fk_team_member_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='团队成员表';

-- -----------------------------------------------------
-- 6. 项目表 - 存储项目信息
-- -----------------------------------------------------
CREATE TABLE `projects` (
                            `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '项目ID，主键',
                            `org_id` BIGINT UNSIGNED NOT NULL COMMENT '所属组织ID',
                            `name` VARCHAR(100) NOT NULL COMMENT '项目名称',
                            `code` VARCHAR(20) NOT NULL COMMENT '项目代号，用于创建任务编号前缀',
                            `description` TEXT DEFAULT NULL COMMENT '项目描述',
                            `status` VARCHAR(20) NOT NULL DEFAULT 'active' COMMENT '状态：planning-规划中，active-进行中，completed-已完成，archived-已归档',
                            `start_date` DATE DEFAULT NULL COMMENT '开始日期',
                            `end_date` DATE DEFAULT NULL COMMENT '计划结束日期',
                            `actual_end_date` DATE DEFAULT NULL COMMENT '实际结束日期',
                            `owner_id` BIGINT UNSIGNED NOT NULL COMMENT '项目负责人ID',
                            `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                            `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                            PRIMARY KEY (`id`),
                            UNIQUE KEY `uk_org_project_code` (`org_id`, `code`),
                            UNIQUE KEY `uk_org_project_name` (`org_id`, `name`),
                            KEY `idx_status` (`status`),
                            KEY `idx_owner` (`owner_id`),
                            CONSTRAINT `fk_project_org` FOREIGN KEY (`org_id`) REFERENCES `organizations` (`id`) ON DELETE CASCADE,
                            CONSTRAINT `fk_project_owner` FOREIGN KEY (`owner_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='项目表';

-- -----------------------------------------------------
-- 7. 项目团队关联表 - 存储项目与团队的关联
-- -----------------------------------------------------
CREATE TABLE `project_teams` (
                                 `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                 `project_id` BIGINT UNSIGNED NOT NULL COMMENT '项目ID',
                                 `team_id` BIGINT UNSIGNED NOT NULL COMMENT '团队ID',
                                 `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 PRIMARY KEY (`id`),
                                 UNIQUE KEY `uk_project_team` (`project_id`, `team_id`),
                                 KEY `idx_team_id` (`team_id`),
                                 CONSTRAINT `fk_project_team_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                                 CONSTRAINT `fk_project_team_team` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='项目团队关联表';

-- -----------------------------------------------------
-- 8. 项目成员表 - 存储项目与用户的直接关联
-- -----------------------------------------------------
CREATE TABLE `project_members` (
                                   `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                   `project_id` BIGINT UNSIGNED NOT NULL COMMENT '项目ID',
                                   `user_id` BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
                                   `role` VARCHAR(20) NOT NULL DEFAULT 'member' COMMENT '角色：owner-负责人，po-产品负责人，sm-敏捷管理者，member-团队成员',
                                   `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                   PRIMARY KEY (`id`),
                                   UNIQUE KEY `uk_project_user` (`project_id`, `user_id`),
                                   KEY `idx_user_id` (`user_id`),
                                   CONSTRAINT `fk_project_member_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                                   CONSTRAINT `fk_project_member_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='项目成员表';

-- -----------------------------------------------------
-- 9. 迭代表 - 存储敏捷迭代信息
-- -----------------------------------------------------
CREATE TABLE `sprints` (
                           `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '迭代ID，主键',
                           `project_id` BIGINT UNSIGNED NOT NULL COMMENT '所属项目ID',
                           `name` VARCHAR(100) NOT NULL COMMENT '迭代名称',
                           `goal` TEXT DEFAULT NULL COMMENT '迭代目标',
                           `start_date` DATE NOT NULL COMMENT '开始日期',
                           `end_date` DATE NOT NULL COMMENT '结束日期',
                           `status` VARCHAR(20) NOT NULL DEFAULT 'planning' COMMENT '状态：planning-规划中，active-进行中，completed-已完成，cancelled-已取消',
                           `created_by` BIGINT UNSIGNED NOT NULL COMMENT '创建人ID',
                           `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                           `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                           `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                           PRIMARY KEY (`id`),
                           UNIQUE KEY `uk_project_sprint_name` (`project_id`, `name`),
                           KEY `idx_status` (`status`),
                           KEY `idx_dates` (`start_date`, `end_date`),
                           CONSTRAINT `fk_sprint_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                           CONSTRAINT `fk_sprint_creator` FOREIGN KEY (`created_by`) REFERENCES `users` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='迭代表';

-- -----------------------------------------------------
-- 10. 产品待办项表 - 存储产品待办事项
-- -----------------------------------------------------
CREATE TABLE `backlog_items` (
                                 `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '待办项ID，主键',
                                 `project_id` BIGINT UNSIGNED NOT NULL COMMENT '所属项目ID',
                                 `parent_id` BIGINT UNSIGNED DEFAULT NULL COMMENT '父级待办项ID，用于构建层级关系',
                                 `title` VARCHAR(200) NOT NULL COMMENT '标题',
                                 `description` TEXT DEFAULT NULL COMMENT '描述',
                                 `type` VARCHAR(20) NOT NULL DEFAULT 'story' COMMENT '类型：epic-史诗，story-用户故事，task-任务，bug-缺陷',
                                 `status` VARCHAR(20) NOT NULL DEFAULT 'backlog' COMMENT '状态：backlog-待办，ready-就绪，in_progress-进行中，in_review-评审中，done-已完成',
                                 `priority` VARCHAR(20) NOT NULL DEFAULT 'medium' COMMENT '优先级：highest-最高，high-高，medium-中，low-低，lowest-最低',
                                 `story_points` INT DEFAULT NULL COMMENT '故事点数，估算工作量',
                                 `business_value` INT DEFAULT NULL COMMENT '业务价值',
                                 `acceptance_criteria` TEXT DEFAULT NULL COMMENT '验收标准',
                                 `assignee_id` BIGINT UNSIGNED DEFAULT NULL COMMENT '负责人ID',
                                 `reporter_id` BIGINT UNSIGNED NOT NULL COMMENT '报告人ID',
                                 `sprint_id` BIGINT UNSIGNED DEFAULT NULL COMMENT '所属迭代ID',
                                 `due_date` DATE DEFAULT NULL COMMENT '截止日期',
                                 `order_index` INT NOT NULL DEFAULT 0 COMMENT '排序索引',
                                 `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                                 PRIMARY KEY (`id`),
                                 KEY `idx_project` (`project_id`),
                                 KEY `idx_parent` (`parent_id`),
                                 KEY `idx_type` (`type`),
                                 KEY `idx_status` (`status`),
                                 KEY `idx_priority` (`priority`),
                                 KEY `idx_assignee` (`assignee_id`),
                                 KEY `idx_sprint` (`sprint_id`),
                                 KEY `idx_order` (`project_id`, `order_index`),
                                 CONSTRAINT `fk_backlog_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                                 CONSTRAINT `fk_backlog_parent` FOREIGN KEY (`parent_id`) REFERENCES `backlog_items` (`id`) ON DELETE SET NULL,
                                 CONSTRAINT `fk_backlog_assignee` FOREIGN KEY (`assignee_id`) REFERENCES `users` (`id`) ON DELETE SET NULL,
                                 CONSTRAINT `fk_backlog_reporter` FOREIGN KEY (`reporter_id`) REFERENCES `users` (`id`) ON DELETE RESTRICT,
                                 CONSTRAINT `fk_backlog_sprint` FOREIGN KEY (`sprint_id`) REFERENCES `sprints` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='产品待办项表';

-- -----------------------------------------------------
-- 11. 任务看板表 - 存储看板信息
-- -----------------------------------------------------
CREATE TABLE `boards` (
                          `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '看板ID，主键',
                          `project_id` BIGINT UNSIGNED NOT NULL COMMENT '所属项目ID',
                          `name` VARCHAR(100) NOT NULL COMMENT '看板名称',
                          `description` TEXT DEFAULT NULL COMMENT '看板描述',
                          `is_default` TINYINT NOT NULL DEFAULT 0 COMMENT '是否默认看板：1-是，0-否',
                          `created_by` BIGINT UNSIGNED NOT NULL COMMENT '创建人ID',
                          `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                          `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                          `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                          PRIMARY KEY (`id`),
                          UNIQUE KEY `uk_project_board_name` (`project_id`, `name`),
                          KEY `idx_project_default` (`project_id`, `is_default`),
                          CONSTRAINT `fk_board_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                          CONSTRAINT `fk_board_creator` FOREIGN KEY (`created_by`) REFERENCES `users` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='任务看板表';

-- -----------------------------------------------------
-- 12. 看板列表 - 存储看板中的列
-- -----------------------------------------------------
CREATE TABLE `board_columns` (
                                 `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '列ID，主键',
                                 `board_id` BIGINT UNSIGNED NOT NULL COMMENT '所属看板ID',
                                 `name` VARCHAR(50) NOT NULL COMMENT '列名称',
                                 `status` VARCHAR(20) NOT NULL COMMENT '对应的任务状态',
                                 `wip_limit` INT DEFAULT NULL COMMENT '在制品限制数量',
                                 `order_index` INT NOT NULL DEFAULT 0 COMMENT '排序索引',
                                 `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 PRIMARY KEY (`id`),
                                 UNIQUE KEY `uk_board_column_name` (`board_id`, `name`),
                                 KEY `idx_board_order` (`board_id`, `order_index`),
                                 CONSTRAINT `fk_column_board` FOREIGN KEY (`board_id`) REFERENCES `boards` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='看板列表';

-- -----------------------------------------------------
-- 13. 任务评论表 - 存储对任务的评论
-- -----------------------------------------------------
CREATE TABLE `comments` (
                            `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '评论ID，主键',
                            `backlog_item_id` BIGINT UNSIGNED NOT NULL COMMENT '待办项ID',
                            `content` TEXT NOT NULL COMMENT '评论内容',
                            `user_id` BIGINT UNSIGNED NOT NULL COMMENT '评论人ID',
                            `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                            `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                            PRIMARY KEY (`id`),
                            KEY `idx_backlog_item` (`backlog_item_id`),
                            KEY `idx_user` (`user_id`),
                            CONSTRAINT `fk_comment_backlog` FOREIGN KEY (`backlog_item_id`) REFERENCES `backlog_items` (`id`) ON DELETE CASCADE,
                            CONSTRAINT `fk_comment_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='任务评论表';

-- -----------------------------------------------------
-- 14. 任务历史记录表 - 存储任务的变更历史
-- -----------------------------------------------------
CREATE TABLE `backlog_history` (
                                   `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '历史记录ID，主键',
                                   `backlog_item_id` BIGINT UNSIGNED NOT NULL COMMENT '待办项ID',
                                   `field` VARCHAR(50) NOT NULL COMMENT '变更字段',
                                   `old_value` TEXT DEFAULT NULL COMMENT '旧值',
                                   `new_value` TEXT DEFAULT NULL COMMENT '新值',
                                   `changed_by` BIGINT UNSIGNED NOT NULL COMMENT '变更人ID',
                                   `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                   PRIMARY KEY (`id`),
                                   KEY `idx_backlog_item` (`backlog_item_id`),
                                   KEY `idx_changed_by` (`changed_by`),
                                   CONSTRAINT `fk_history_backlog` FOREIGN KEY (`backlog_item_id`) REFERENCES `backlog_items` (`id`) ON DELETE CASCADE,
                                   CONSTRAINT `fk_history_user` FOREIGN KEY (`changed_by`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='任务历史记录表';

-- -----------------------------------------------------
-- 15. 附件表 - 存储待办项的附件
-- -----------------------------------------------------
CREATE TABLE `attachments` (
                               `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '附件ID，主键',
                               `backlog_item_id` BIGINT UNSIGNED NOT NULL COMMENT '待办项ID',
                               `filename` VARCHAR(255) NOT NULL COMMENT '文件名',
                               `file_path` VARCHAR(255) NOT NULL COMMENT '文件路径',
                               `file_size` BIGINT NOT NULL COMMENT '文件大小，单位字节',
                               `file_type` VARCHAR(100) NOT NULL COMMENT '文件类型',
                               `uploaded_by` BIGINT UNSIGNED NOT NULL COMMENT '上传人ID',
                               `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                               `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                               `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                               PRIMARY KEY (`id`),
                               KEY `idx_backlog_item` (`backlog_item_id`),
                               KEY `idx_uploaded_by` (`uploaded_by`),
                               CONSTRAINT `fk_attachment_backlog` FOREIGN KEY (`backlog_item_id`) REFERENCES `backlog_items` (`id`) ON DELETE CASCADE,
                               CONSTRAINT `fk_attachment_user` FOREIGN KEY (`uploaded_by`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='附件表';

-- -----------------------------------------------------
-- 16. 标签表 - 存储标签信息
-- -----------------------------------------------------
CREATE TABLE `tags` (
                        `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '标签ID，主键',
                        `project_id` BIGINT UNSIGNED NOT NULL COMMENT '所属项目ID',
                        `name` VARCHAR(50) NOT NULL COMMENT '标签名称',
                        `color` VARCHAR(20) DEFAULT '#3498db' COMMENT '标签颜色',
                        `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `uk_project_tag_name` (`project_id`, `name`),
                        CONSTRAINT `fk_tag_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='标签表';

-- -----------------------------------------------------
-- 17. 待办项标签关联表 - 存储待办项与标签的多对多关系
-- -----------------------------------------------------
CREATE TABLE `backlog_item_tags` (
                                     `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                     `backlog_item_id` BIGINT UNSIGNED NOT NULL COMMENT '待办项ID',
                                     `tag_id` BIGINT UNSIGNED NOT NULL COMMENT '标签ID',
                                     `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                     PRIMARY KEY (`id`),
                                     UNIQUE KEY `uk_backlog_tag` (`backlog_item_id`, `tag_id`),
                                     KEY `idx_tag` (`tag_id`),
                                     CONSTRAINT `fk_item_tag_backlog` FOREIGN KEY (`backlog_item_id`) REFERENCES `backlog_items` (`id`) ON DELETE CASCADE,
                                     CONSTRAINT `fk_item_tag_tag` FOREIGN KEY (`tag_id`) REFERENCES `tags` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='待办项标签关联表';

-- -----------------------------------------------------
-- 18. 会议记录表 - 存储敏捷会议记录
-- -----------------------------------------------------
CREATE TABLE `meetings` (
                            `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '会议ID，主键',
                            `project_id` BIGINT UNSIGNED NOT NULL COMMENT '所属项目ID',
                            `sprint_id` BIGINT UNSIGNED DEFAULT NULL COMMENT '相关迭代ID',
                            `title` VARCHAR(200) NOT NULL COMMENT '会议标题',
                            `type` VARCHAR(50) NOT NULL COMMENT '会议类型：daily-每日站会，planning-规划会，review-评审会，retro-回顾会',
                            `start_time` DATETIME NOT NULL COMMENT '开始时间',
                            `end_time` DATETIME DEFAULT NULL COMMENT '结束时间',
                            `summary` TEXT DEFAULT NULL COMMENT '会议摘要',
                            `notes` TEXT DEFAULT NULL COMMENT '会议记录',
                            `created_by` BIGINT UNSIGNED NOT NULL COMMENT '创建人ID',
                            `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                            `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                            `deleted_at` DATETIME DEFAULT NULL COMMENT '删除时间，软删除标记',
                            PRIMARY KEY (`id`),
                            KEY `idx_project` (`project_id`),
                            KEY `idx_sprint` (`sprint_id`),
                            KEY `idx_type` (`type`),
                            KEY `idx_datetime` (`start_time`),
                            CONSTRAINT `fk_meeting_project` FOREIGN KEY (`project_id`) REFERENCES `projects` (`id`) ON DELETE CASCADE,
                            CONSTRAINT `fk_meeting_sprint` FOREIGN KEY (`sprint_id`) REFERENCES `sprints` (`id`) ON DELETE SET NULL,
                            CONSTRAINT `fk_meeting_creator` FOREIGN KEY (`created_by`) REFERENCES `users` (`id`) ON DELETE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='会议记录表';

-- -----------------------------------------------------
-- 19. 会议参与者表 - 存储会议参与人员
-- -----------------------------------------------------
CREATE TABLE `meeting_attendees` (
                                     `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID，主键',
                                     `meeting_id` BIGINT UNSIGNED NOT NULL COMMENT '会议ID',
                                     `user_id` BIGINT UNSIGNED NOT NULL COMMENT '用户ID',
                                     `status` VARCHAR(20) NOT NULL DEFAULT 'pending' COMMENT '状态：pending-待确认，accepted-已接受，declined-已拒绝',
                                     `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                     `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                     PRIMARY KEY (`id`),
                                     UNIQUE KEY `uk_meeting_user` (`meeting_id`, `user_id`),
                                     KEY `idx_user` (`user_id`),
                                     CONSTRAINT `fk_attendee_meeting` FOREIGN KEY (`meeting_id`) REFERENCES `meetings` (`id`) ON DELETE CASCADE,
                                     CONSTRAINT `fk_attendee_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='会议参与者表';

-- -----------------------------------------------------
-- 20. 通知表 - 存储用户通知
-- -----------------------------------------------------
CREATE TABLE `notifications` (
                                 `id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '通知ID，主键',
                                 `user_id` BIGINT UNSIGNED NOT NULL COMMENT '接收用户ID',
                                 `title` VARCHAR(200) NOT NULL COMMENT '通知标题',
                                 `content` TEXT NOT NULL COMMENT '通知内容',
                                 `type` VARCHAR(50) NOT NULL COMMENT '通知类型：task_assigned-任务分配，comment_added-评论添加，mention-提及，deadline-截止日期提醒',
                                 `is_read` TINYINT NOT NULL DEFAULT 0 COMMENT '是否已读：1-已读，0-未读',
                                 `related_id` BIGINT UNSIGNED DEFAULT NULL COMMENT '相关对象ID',
                                 `related_type` VARCHAR(50) DEFAULT NULL COMMENT '相关对象类型',
                                 `created_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                 `updated_at` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                 PRIMARY KEY (`id`),
                                 KEY `idx_user` (`user_id`),
                                 KEY `idx_is_read` (`is_read`),
                                 KEY `idx_type` (`type`),
                                 KEY `idx_created_at` (`created_at`),
                                 CONSTRAINT `fk_notification_user` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='通知表';
CREATE TABLE book (
                       id BIGINT NOT NULL AUTO_INCREMENT COMMENT '图书ID',
                       title VARCHAR(255) NOT NULL COMMENT '标题',
                       author VARCHAR(255) NOT NULL COMMENT '作者',
                       publicationYear INT NOT NULL COMMENT '出版年份',
                       price DOUBLE NOT NULL COMMENT '价格',
                       createdTime DATETIME NOT NULL COMMENT '创建时间',
                       updatedTime DATETIME NOT NULL COMMENT '更新时间',
                       PRIMARY KEY (id)
) ENGINE=InnoDB;
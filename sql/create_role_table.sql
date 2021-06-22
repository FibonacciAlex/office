DROP TABLE IF EXISTS t_role;

CREATE TABLE t_role (
  role_id        BIGINT      NOT NULL AUTO_INCREMENT
  COMMENT '角色id',
  role_name      VARCHAR(50) NOT NULL
  COMMENT '角色名',
  creator        VARCHAR(50) NOT NULL
  COMMENT '创建人',
  created_date   DATETIME    NOT NULL
  COMMENT '创建时间',
  product_id     VARCHAR(10) NOT NULL
  COMMENT '产品id',
  last_update    DATETIME COMMENT '最后更新时间',
  last_update_by VARCHAR(50) COMMENT '最后更新人',
  remark         VARCHAR(500) COMMENT '备注',
  PRIMARY KEY (id)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8;



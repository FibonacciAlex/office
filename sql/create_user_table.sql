DROP TABLE IF EXISTS t_user;

CREATE TABLE t_user (
  uid             BIGINT      NOT NULL AUTO_INCREMENT,
  user_name       VARCHAR(50) NOT NULL,
  password        CHAR(64)    NOT NULL,
  expiration_date DATETIME    NOT NULL
  COMMENT '密码过期时间',
  role_id         BIGINT      NOT NULL,
  creator         VARCHAR(50) NOT NULL,
  created_date    DATETIME    NOT NULL,
  product_id      VARCHAR(10) NOT NULL,
  last_update     DATETIME,
  last_update_by  VARCHAR(50),
  remark          VARCHAR(500),
  PRIMARY KEY (uid)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1001
  DEFAULT CHARSET = utf8;



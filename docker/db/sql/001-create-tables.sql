---- drop ----
DROP TABLE IF EXISTS `log_table`;

---- create ----
create table IF not exists `log_table`
(
 `id`               INT(20) AUTO_INCREMENT,
 `keyword`          VARCHAR(100) NOT NULL,
 `created_at`       Datetime DEFAULT NULL,
 `updated_at`       Datetime DEFAULT NULL,
    PRIMARY KEY (`id`)
) DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
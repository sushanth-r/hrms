CREATE TABLE `config`(
    id bigint AUTO_INCREMENT,
    `key` text NOT NULL,
    value text,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    created_by text,
    updated_by text,
    PRIMARY KEY(ID)
);

INSERT INTO `config`(`key`, `value`) VALUES ("Cache", "False");mysql create table

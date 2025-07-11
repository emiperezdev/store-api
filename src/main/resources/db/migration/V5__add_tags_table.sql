-- -----------------------------------------------------
-- Table `fizzbuzz`.`tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`tags` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `store`.`users_tags`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`users_tags` (
  `id_user` BIGINT NOT NULL,
  `id_tag` INT NOT NULL,
  PRIMARY KEY (`id_user`, `id_tag`),
  FOREIGN KEY (`id_user`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE CASCADE,
  FOREIGN KEY (`id_tag`)
    REFERENCES `store`.`tags` (`id`)
    ON DELETE CASCADE)
ENGINE = InnoDB;
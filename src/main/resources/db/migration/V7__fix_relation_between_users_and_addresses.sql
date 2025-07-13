-- -----------------------------------------------------
-- Table `store`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`users` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `store`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`addresses` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `street` VARCHAR(255) NOT NULL,
  `city` VARCHAR(255) NOT NULL,
  `zip` VARCHAR(255) NOT NULL,
  `user_id` BIGINT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_user_addresses_users_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

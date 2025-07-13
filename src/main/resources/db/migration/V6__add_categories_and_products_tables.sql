-- -----------------------------------------------------
-- Table `store`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`categories` (
  `id` TINYINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `store`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`products` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `price` DECIMAL(10, 2) NOT NULL,
  `category_id` TINYINT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_category`
    FOREIGN KEY (`category_id`)
    REFERENCES `store`.`categories` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

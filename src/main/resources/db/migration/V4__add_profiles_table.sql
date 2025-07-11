-- -----------------------------------------------------
-- Table `store`.`profiles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `store`.`profiles` (
  `id` BIGINT NOT NULL,
  `bio` TEXT NULL,
  `phone_number` VARCHAR(255) NULL,
  `date_or_birth`  DATE NULL,
  `loyalty_points` INT UNSIGNED DEFAULT 0,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;
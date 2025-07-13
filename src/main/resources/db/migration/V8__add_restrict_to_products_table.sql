ALTER TABLE `products`
DROP FOREIGN KEY `fk_category`;

ALTER TABLE `store`.`products`
ADD CONSTRAINT `fk_category`
  FOREIGN KEY (`category_id`)
  REFERENCES `store`.`categories` (`id`)
  ON DELETE RESTRICT
  ON UPDATE NO ACTION;

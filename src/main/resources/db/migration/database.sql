-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema tmdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema tmdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tmdb` DEFAULT CHARACTER SET utf8 ;
USE `tmdb` ;

-- -----------------------------------------------------
-- Table `tmdb`.`authority`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tmdb`.`authority` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `tmdb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tmdb`.`user` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_name` VARCHAR(256) NULL DEFAULT NULL,
  `password` VARCHAR(256) NULL DEFAULT NULL,
  `account_expired` TINYINT(4) NULL DEFAULT NULL,
  `account_locked` TINYINT(4) NULL DEFAULT NULL,
  `credentials_expired` TINYINT(4) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `tmdb`.`task`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `tmdb`.`task` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `dateCreate` DATETIME NULL DEFAULT NULL,
  `dateEnd` DATETIME NULL DEFAULT NULL,
  `context` LONGTEXT NULL DEFAULT NULL,
  `User_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_task_User1_idx` (`User_id` ASC),
  CONSTRAINT `fk_task_User1`
    FOREIGN KEY (`User_id`)
    REFERENCES `tmdb`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

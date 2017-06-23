#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Level
#------------------------------------------------------------

CREATE TABLE Level(
        levelId       int (11) Auto_increment  NOT NULL ,
        levelName     Char (25) NOT NULL ,
        levelObjectif Int NOT NULL ,
        PRIMARY KEY (levelId )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Square
#------------------------------------------------------------

CREATE TABLE Square(
        squareId   int (11) Auto_increment  NOT NULL ,
        levelId    Int NOT NULL ,
        elementId  Int NOT NULL ,
        locationId Int NOT NULL ,
        PRIMARY KEY (squareId )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Element
#------------------------------------------------------------

CREATE TABLE Element(
        elementId   int (11) Auto_increment  NOT NULL ,
        elementName Char (25) NOT NULL ,
        PRIMARY KEY (elementId )
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Location
#------------------------------------------------------------

CREATE TABLE Location(
        locationId int (11) Auto_increment  NOT NULL ,
        posX       Int NOT NULL ,
        posY       Int NOT NULL ,
        PRIMARY KEY (locationId )
)ENGINE=InnoDB;

ALTER TABLE Square ADD CONSTRAINT FK_Square_levelId FOREIGN KEY (levelId) REFERENCES Level(levelId);
ALTER TABLE Square ADD CONSTRAINT FK_Square_elementId FOREIGN KEY (elementId) REFERENCES Element(elementId);
ALTER TABLE Square ADD CONSTRAINT FK_Square_locationId FOREIGN KEY (locationId) REFERENCES Location(locationId);

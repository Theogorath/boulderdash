
CREATE DEFINER=`root`@`localhost` PROCEDURE `getMap1` ()  SELECT square.elementId
FROM square
WHERE square.levelId=1$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMap2` ()  SELECT square.elementId
FROM square
WHERE square.levelId=2$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMap3` ()  SELECT square.elementId
FROM square
WHERE square.levelId=3$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMap4` ()  SELECT square.elementId
FROM square
WHERE square.levelId=4$$

CREATE DEFINER=`root`@`localhost` PROCEDURE `getMap5` ()  SELECT square.elementId
FROM square
WHERE square.levelId=5$$


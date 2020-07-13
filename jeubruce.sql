
-- Grâce à ce remaniement, vous pouvez importer toute la base jeuBruce avec sa table.

DROP DATABASE IF EXISTS `jeubruce` ; -- Cette ligne supprimera la DATABASE si elle existe déjà.

--
CREATE DATABASE IF NOT EXISTS  `jeubruce` ;

-- --------------------------------------------------------

--
-- Structure de la table `enigmes`
--

DROP TABLE IF EXISTS `enigmes`;
CREATE TABLE `enigmes` (
  `numEnigme` int(30) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Questions` varchar(1000) NOT NULL,
  `Reponse` varchar(1000) NOT NULL,
  `Etat` tinyint(1) NOT NULL DEFAULT 0
);



INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (1, 'Celui qui le fabrique n\'en a pas besoin, celui qui l\'achète ne l\'utilise pas et celui qui l\'utilise ne peut ni le voir ni le sentir, que suis-je ? ', 'Un cercueil', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (2, 'À quel endroit le jeudi se trouve-t-il avant le mercredi ?', 'le dictionnaire', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (3, 'Qu\'est-ce qui monte mais qui ne descend jamais ?', 'age', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (4, 'Qu\'est-ce qu\'on peut voir au milieu de l\'infini ?', 'F', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (5, 'Qu\'est-ce qui est toujours sur le sol et sur les murs mais qui ne se salit jamais ?', 'L\'ombre', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (6, 'Qu\'est-ce qui peut se briser sans jamais avoir été dans nos mains ?', 'Une promesse', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (7, 'J\'ai beaucoup de visages, d\'émotions et d\'expressions ; je vis à une touche de distance... que suis-je ? ', 'Une émoticône', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (8, 'Je marche sur 4 pattes a l’aube, 2 pattes durant le jour, et 3 pattes le soir ? Qui suis-je ?', 'un humain', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (9, 'Si je suis muet, aveugle et sourd combien de sens me reste-t-il ?', '3', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (10, 'Le père Noël part pour sa tournée avec 6 rennes. \r\nChaque renne transporte 3 lutins sur son dos et 2 lucioles sur ses cornes. Chaque lutin porte 3 sacs qui contiennent chacun 10 cadeaux.Combien d’êtres vivants partent pour la tournée de cadeaux ?', '37', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (11, 'Combien de nombres peut-on faire en assemblant au moins deux des mots suivants : “quatre”, “dix”, “vingt” et “cent” ?', '12', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (12, 'Un escargot est dans un puits de 10 mètres. Il monte 3 mètres chaque jour et descend 2 mètres chaque nuit. En combien de jours sera-t-il rendu en haut ?', '8 jours', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (13, 'Un peu étourdi, Simon a oublié d’écrire la virgule sur son chèque lorsqu’il a payé l’essence pour son scooter. Une bêtise qui lui coûte cher : 1826,55 € de trop.Quelle somme aurait-il dû écrire sur son chèque ?  ', '18,45', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (14, '1+4=5 | 2+5=12 | 3+6=21 | 8+11=?\r\n', '40', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (15, 'M. Hodeform et Mme Bérébask sont en bateau. Ce bateau remonte la rivière à une vitesse constante qui est, par rapport à l\'eau, de 4,5 Km/h. La vitesse du courant est elle de 0,5 Km/h\r\nIl est 15 heures juste, lorsque le chapeau de monsieur tombe à l\'eau. Mais il ne s\'en rend compte qu\'à 15h06. Il fait maintenant demi-tour (on suppose que cette manoeuvre est \"instantanée\").\r\n\r\nCombien de temps aura-t-il été privé de son couvre-chef ?\r\n', '12 minutes', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (16, 'J\'ai 2 fois l\'age que tu avais quand j\'avais l\'age que tu as aujourd\'hui.\r\nQuand tu auras l\'age que j\'ai aujourd\'hui, la somme de nos 2 age sera 90 ans.\r\nQuel est mon age ?\r\n', '40 ans', 0);
INSERT INTO `enigmes` (`numEnigme`, `Questions`, `Reponse`, `Etat`) VALUES (17, 'Résoudre l\'équation :\r\n\r\n−x² + 3x2 + 1 = 0', 'x1 = 2 x2 = 1', 0);


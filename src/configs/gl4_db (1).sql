-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : jeu. 04 jan. 2024 à 21:37
-- Version du serveur : 10.4.28-MariaDB
-- Version de PHP : 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `gl4_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `aeroport`
--

CREATE TABLE `aeroport` (
  `id` int(20) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `pays` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `aeroport`
--

INSERT INTO `aeroport` (`id`, `nom`, `pays`) VALUES
(1, 'Habib Bourguiba-Monastir', 'Tunisie'),
(2, 'Tozeur-Nefta', 'Tunisie'),
(3, 'Paris-Orly', 'France'),
(4, 'Charles de Gaulle', 'France'),
(5, 'Tunis-Cartage', 'Tunisie');

-- --------------------------------------------------------

--
-- Structure de la table `ecale`
--

CREATE TABLE `ecale` (
  `idaeroport` int(20) NOT NULL,
  `heure arrivee` time NOT NULL,
  `heure depart` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `ecale`
--

INSERT INTO `ecale` (`idaeroport`, `heure arrivee`, `heure depart`) VALUES
(1, '13:00:00', '13:30:00'),
(2, '19:00:00', '19:30:02');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(20) NOT NULL,
  `first name` char(20) NOT NULL,
  `last name` char(20) NOT NULL,
  `login` varchar(50) NOT NULL,
  `pwd` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `first name`, `last name`, `login`, `pwd`) VALUES
(1, 'Balsam', 'Nafti', 'balsamnafti', '1508'),
(2, 'Nermine', 'Torjmene', 'nerminetorjmene', '1212');

-- --------------------------------------------------------

--
-- Structure de la table `vol`
--

CREATE TABLE `vol` (
  `id` int(20) NOT NULL,
  `numvol` int(20) NOT NULL,
  `aerdepart` varchar(50) NOT NULL,
  `aerarrivee` varchar(50) NOT NULL,
  `datedep` date NOT NULL,
  `datearr` date NOT NULL,
  `heuredep` time NOT NULL,
  `heurearr` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `vol`
--

INSERT INTO `vol` (`id`, `numvol`, `aerdepart`, `aerarrivee`, `datedep`, `datearr`, `heuredep`, `heurearr`) VALUES
(1, 1212, 'Tozeur-Nefta', 'Paris-Orly', '2024-01-02', '2024-01-02', '12:00:00', '14:30:00'),
(2, 1213, 'Paris-Orly', 'Habib Bourguiba-Monastir', '2024-01-24', '2024-01-24', '18:00:00', '20:30:00');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `aeroport`
--
ALTER TABLE `aeroport`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `aeroport`
--
ALTER TABLE `aeroport`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

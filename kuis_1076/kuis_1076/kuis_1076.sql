-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.15
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1076`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1076`
--

CREATE TABLE `identitas_1076` (
  `id_mahasiswa` bigint(20) NOT NULL,
  `nama_mahasiswa` varchar(100) NOT NULL,
  `prodi` varchar(100) DEFAULT NULL,
  `tahunmasuk` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1076`
--

INSERT INTO `identitas_1076` (`id_mahasiswa`, `nama_mahasiswa`, `prodi`, `tahunmasuk`) VALUES
(1555301010, 'Annisa Harlina', 'Sistem Informasi', '2015'),
(1555301076, 'Saarah Shofia', 'Teknik Informatika', '2015');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1076`
--

CREATE TABLE `ipk_1076` (
  `id_matkul` bigint(20) NOT NULL,
  `id_mahasiswa` varchar(100) NOT NULL,
  `ipk` varchar(100) DEFAULT NULL,
  `semester` varchar(100) DEFAULT NULL,
  `identitas_1076_id_mahasiswa` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1076`
--

INSERT INTO `ipk_1076` (`id_matkul`, `id_mahasiswa`, `ipk`, `semester`, `identitas_1076_id_mahasiswa`) VALUES
(101, '1555301076', '3.89', '2', 1555301076),
(102, '1555301010', '3.79', '2', 1555301010);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1076`
--
ALTER TABLE `identitas_1076`
  ADD PRIMARY KEY (`id_mahasiswa`),
  ADD UNIQUE KEY `UK_ru1aflils6w0yootokjh4topp` (`nama_mahasiswa`);

--
-- Indexes for table `ipk_1076`
--
ALTER TABLE `ipk_1076`
  ADD PRIMARY KEY (`id_matkul`),
  ADD UNIQUE KEY `UK_61q4r43sas49js6n6m58w7smr` (`id_mahasiswa`),
  ADD KEY `FKm8v65l23do93uv21cqw8mdqvm` (`identitas_1076_id_mahasiswa`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1076`
--
ALTER TABLE `identitas_1076`
  MODIFY `id_mahasiswa` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1555301077;
--
-- AUTO_INCREMENT for table `ipk_1076`
--
ALTER TABLE `ipk_1076`
  MODIFY `id_matkul` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=103;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `ipk_1076`
--
ALTER TABLE `ipk_1076`
  ADD CONSTRAINT `FKm8v65l23do93uv21cqw8mdqvm` FOREIGN KEY (`identitas_1076_id_mahasiswa`) REFERENCES `identitas_1076` (`id_mahasiswa`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

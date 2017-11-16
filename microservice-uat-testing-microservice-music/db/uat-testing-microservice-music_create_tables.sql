--
-- Database Schema:  uatTest
-- Automatically generated sql script for the service uat-testing-microservice-music, created by the CAE.
-- --------------------------------------------------------

--
-- Table structure for table tblMusic.
--
CREATE TABLE uatTest.tblMusic (
  musicUrl VARCHAR(255) ,
  musicName VARCHAR(255) ,
CONSTRAINT musicName_PK PRIMARY KEY (musicName)
 
);




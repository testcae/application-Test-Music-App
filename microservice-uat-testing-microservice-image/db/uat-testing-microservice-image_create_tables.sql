--
-- Database Schema:  uatTest
-- Automatically generated sql script for the service uat-testing-microservice-image, created by the CAE.
-- --------------------------------------------------------

--
-- Table structure for table tblImage.
--
CREATE TABLE uatTest.tblImage (
  imageUrl VARCHAR(255) ,
  imageName VARCHAR(255) ,
CONSTRAINT imageName_PK PRIMARY KEY (imageName)
 
);




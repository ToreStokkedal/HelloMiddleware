# Introduciton
This is a descripton of installing DB2 on Centos to support I2. Its from the I2 package and have the version ...

Inspiration to install
https://www.ibm.com/support/knowledgecenter/SSXVTH_4.3.1/com.ibm.i2.deploy.example.doc/software_prerequisites.html

# Basic settings DB2

Installed on Centos 8, with downloaded SW from IBM standard

IP; 192.168.39.146 (on the wlan) <BR>
Port 50000, FW off <BR>
Database; mysample <BR>

Installdir /opt/ibm/db2/V11.1/

Standard users, password is ....
tores added to user gropus

## Preparations for I2
Done with db2inst1 <BR>
`db2set DB2_ATS_ENABLE=YES` <br>
`db2set DB2CODEPAGE=1208`

## I2 install

Tar unpacaged with db2inst1 and placed at /opt/IBM/i2analyze 

Setter opp OPal & Analyse med:

information-store-daod-opal

The information-store-daod-opal base configuration contains settings for a deployment that includes:
An Information Store that is accessed by using the i2 Analyze Opal services
i2 Analyze with the i2 Connect gateway, which can provide access to other data stores through connectors that you create

## Create schema development environment ?
https://www.ibm.com/support/knowledgecenter/SSXVTH_4.3.1/com.ibm.i2.deploy.example.doc/t_dep_schema_dev.html


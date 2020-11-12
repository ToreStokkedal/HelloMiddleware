# Introduciton
This is a descripton of installing DB2 on Centos to support I2. Its from the I2 package and have the version ...

Inspiration to install
https://www.ibm.com/support/knowledgecenter/SSXVTH_4.3.1/com.ibm.i2.deploy.example.doc/software_prerequisites.html

Disble SE Linux

Setup remote desktop:
https://www.itzgeek.com/how-tos/linux/centos-how-tos/install-xrdp-on-centos-7-rhel-7.html


# Basic settings DB2

Installed on Centos 8, with downloaded SW from IBM standard

IP; 192.168.39.139, i2.local (on the wlan) <BR>
Port 50000, FW off <BR>
English, US
Database; sample <BR>

`scp IS_V1171_u1_Linux_x86_multi.tar.gz tores@i2:/home/tores`
`scp I2_ANALYZE_V4.1.3_MP_ML.zip tores@i2 /home/tores`

Installdir /opt/IBM/db2/V11.1/


Preps:
- Assured root login on GUI - on console, no remote desktop
- Assured (changed) correct host name and answer on ping


NB !!!! 
Isntallng now 4.3.2, B2 is supposed to be a pert of the file, or not

file, one command exept, Node JS



Installed as root, with GUI. Some chices done:
- Install dir should be /opt/IBM  need to change
- Not Tivoli compoenent
- Geospatial client 
- Geospatial server component
- Standard users

 sudo firewall-cmd --add-port=50000/tcp --permanent
  sudo firewall-cmd --add-port=9082/tcp --permanent
  sudo firewall-cmd --reload

./db2setup som root
assure correct hostname and network response
Include spatial extender on client and server

Installed Fxpack v11.1.4fp5, coil not update DASserver
Had to run db2iupdt -d db2inst1 to solve linking error, see; 
https://www.ibm.com/support/knowledgecenter/SSEPGG_11.1.0/com.ibm.db2.luw.admin.dbobj.doc/doc/t0005077.html
./

./db2start

Tested with Data Client on Windows and 

Downloaded and installed 

## Preparations for I2
Done with db2inst1 <BR>
`db2set DB2_ATS_ENABLE=YES` <br>
`db2set DB2CODEPAGE=1208`

Add user to group
´usermod -a -G db2iadm1 tores
usermod -a -G db2iadm1 tores
root need to have access to db2 
usermod -a -G db2iadm1 root

## I2 install
Tar unpacaged with db2inst1 and placed at /opt/IBM/i2analyze . Then the toolkit is installed

Trying once more; From the deployment guide, page 6 in the deployment guide, https://www.ibm.com/support/knowledgecenter/SSXVTH_4.3.2/com.ibm.i2.deploy.example.doc/i2a_deploy_example_pdf.pdf?cp=SS3J58_9.2.2&view=kc

Install example store with I2 Connect, steps are:
- Install DB2, done with fixpac 5 and spatial extender etc
- Copy DB2 JDBC deiver to /
- Install I2, done (remember config allready done many times)
- Install node.js () https://linuxize.com/post/how-to-install-node-js-on-centos-7/, gjort med yum, testet OK.
- xx config file need to change ibm -> IB;



./setup -t deployExample

## Create schema development environment ?
https://www.ibm.com/support/knowledgecenter/SSXVTH_4.3.1/com.ibm.i2.deploy.example.doc/t_dep_schema_dev.html


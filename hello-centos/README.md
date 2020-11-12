# Install basic Centos


Download latest OS

Make VM, 8GB, 90GB, 4 cores

Add user root and tores
Remember English language, NO keyboard

Setup
- update with yum update
- tores to weel (in startup)
- Turn off SE linux
- Add RDP
  - `sudo yum install epel-release -y `
  - `sudo yum install xrdp -y`
  - `sudo systemctl enable xrdp`
  - `sudo systemctl start xrdp`
  - `sudo firewall-cmd --add-port=3389/tcp --permanent`
  - `sudo firewall-cmd --reload`
- Add filezilla
  - `sudo yum install filezilla -y`
- ´ssh-copy-id -i ~/.ssh/ i2a

- Disable SELinux
- https://linuxize.com/post/how-to-disable-selinux-on-centos-8/
- /etc/selinux/config
- SELINUX=permissive
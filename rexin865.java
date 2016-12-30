set password for root@localhost = password('shapolang');修改数据库密码
mysql> use mysql;  选择数据库
Database changed
mysql> update user set user="dns" where user="root";    将用户名为root的改为dns
mysql> FLUSH PRIVILEGES   刷新权限
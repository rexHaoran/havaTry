set password for root@localhost = password('shapolang');�޸����ݿ�����
mysql> use mysql;  ѡ�����ݿ�
Database changed
mysql> update user set user="dns" where user="root";    ���û���Ϊroot�ĸ�Ϊdns
mysql> FLUSH PRIVILEGES   ˢ��Ȩ��
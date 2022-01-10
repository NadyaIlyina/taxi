use taxi

db.orders.insertMany([
{
	client: {"name": "Alice", "phone": "+375291234567"}, 
	driver: {"name": "Tom", "phone": "+375291237865", "DL": 123},
	auto:{"number":12,"color": "black", "model": "Renault Logan", "type": "econom"},
	route:{"from":"Фрунзе 32", "to": "Московский 33а", "length":4},
	"cost": 5,
	"date": "2022.01.12",
	"status": "done",
	"review": "dsuvhidjos"
},

{
	client: {"name": "Ann", "phone": "+375291765567"}, 
	driver: {"name": "Tom", "phone": "+375291237865", "DL": 123},
	auto:{"number":12,"color": "black", "model": "Renault Logan", "type": "econom"},
	route:{"from":"Фрунзе 12", "to": "Московский 33а", "length":7},
	"cost": 8,
	"date": "2022.01.15",
	"status": "canceled",
	"review": ""
}])

db.orders.find({client.name:"Ann"}).pretty()

Репликация:

1.завершаем работу сервера и клиента
2. создаем папки для копии бд
3. запуск сервера: mongod --dbpath E:/data/db1 --port 27001 --replSet rs1
(можем сделать несколько таких)
4. запуск клиента и интициализация первичного сервера
	mongo --port 27001
	rs.initiate()
	rs.status()
5. добавление остальных серверов
	rs.add("myhost:27002")
	...
6. проверка:
	rs.status()
	в members должны быть все

Шардинг:

Spring Jdbc templates reduces the boiler plate code. To use jdbc template from spring we need to provide data source(data source is an interface). DriverManger 
DataSource is an implementation of data source interface. 
Jdbc temaplate consits of various methods. following are described

1 int update(Query)
2 int update (Query, arguments) //spring uses this argument as place holders
insert()
delete()

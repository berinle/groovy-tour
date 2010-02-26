class TotallyGroovy{
	
	def getItems(){
		(1..10).collect{ "Item $it" }
	}
	
	static main(args){
		println new TotallyGroovy().items
	}
}
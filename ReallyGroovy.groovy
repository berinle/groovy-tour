class ReallyGroovy{
	
	def getItems(){
		def list = []
		10.times{i -> list.add("Item $i")}
		list
	}
	
	static main(args){
		println new ReallyGroovy().items
	}
}
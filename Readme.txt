Change the mysql properties (username and password)
create a Database called "newsDB" 
Run the project in IDE (intellij)
Execute following json requests in postman to test the functions
	to add a news - http://localhost:8082/news/addNews
		-{
    "heading":"Lankadeepa",
    "details":"Sri Lanka lost the cricket world cup",
    "comment":"yes",
    "date":"2021-01-05",
    "category":[
        {
            "type":"sport"
            
            },{"type":"entertainment"}
        ]
}			
# lit 🔥

LIT DB Objekttypen

users
	uder_uuid : UUID
	creator_uuid : UUID
	groups_uuids : List<UUID>
	user_name : String
	first_name : String
	last_name : String

inbox
	inbox_item_uuid : UUID
	inbox_item_table : String

outbox
	outbox_item_uuid : UUID
	outbox_item_table : String

following
	user_uuid : UUID

followed
	user_uuid : UUID

**************************************

authors
	author_uuid : UUID
	creator_uuid : UUID
	first_name : String
	last_name : String
	publication_count : Int
	orcid : String
  
publications
	publication_uuid : UUID
	creator_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
  
departments
	department_uuid : UUID
	creator_uuid : UUID
	country_uuid : UUID
	belonging_department_uuid : department_UUID
	long_name : String
	short_name : String
	city_uuid : UUID
publishers
	publisher_uuid : UUID
	creator_uuid : UUID
	cities_uuids : List<UUID>
	long_name : String
	short_name : String
	doi : String
  
bookseries
	bookseries_uuid : UUID
	creator_uuid : UUID
	short_name : String
	long_name : String
  
books
	book_uuid : UUID
	creator_uuid : UUID
	publisher_uuid : UUID
	authors_uuids : List<UUID>
	cities_uuids : List<UUID>
	bibtex_id : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	isbn : String
	year : Int
	volume : String
	edition_ String
	number_of_pages : Int
	shop_url : String
	cover_url : String
  
collections
	collection_uuid : UUID
	creator_uuid : UUID
	series_uuid : UUID
	publisher_uuid : UUID
	authors_uuids : List<UUID>
	cities_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	to_appear : Boolean
	detail_url : String
	category : String
	isbn : String
	year : Int
	volume : String
	edition_ String
	number_of_pages : Int
	shop_url : String
	cover_url : String
  
incollections
	incollection_uuid : UUID
	creator_uuid : UUID
	belonging_collection_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	page_range : String
  
series
	series_uuid : UUID
	creator_uuid : UUID
	short_name : String
	last_name : String
  
events
	event_uuid : UUID
	creator_uuid : UUID
	belonging_event_uuid : UUID
	series_uuid : UUID
	at_department_uuid : UUID
	city_uuid : UUID
	short_name : String
	long_name : String
	month : Int
	year : Int
	virtual : Boolean
  
proceedings
	proceeding_uuid : UUID
	creator_uuid : UUID
	publisher_uuid : UUID
	editors_uuids : List<UUID>
	events_uuis : List<UUID>
	isbn : String
	issn : String
	eissn : String
	volume : Int
  
papers
	paper_uuid : UUID
	creator_uuid : UUID
	belonging_event_uuid : UUID
	proceeding_uuid : UUID
	authors_uuids : List<UUIDS<
	bibtex_id : String
	title : String
	boi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	awards : String
	peer_reviewed : Boolean
	poster_session : Boolean
	demo_session : Boolean
	acm_authorize : String
	page_range : String
  
talks
	talk_uuid : UUID
	creator_UUID : UUID
	belonging_event_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	type : String
	date : Date
  
journals
	journal_uuid : UUID
	creator_uuid : UUID
	publisher_uuid : UUID
	long_name : String
	short_name : String
	issn : String
	eissn : String
  
issues
	issue_uuid : UUID
	creator_uuid : UUID
	journal_uuid : UUID
	title : String
	month : Int
	year : Int
	volume : String
	issue : String
  
articles
	article_uuid : UUID
	creator_uuid : UUID
	issue_uuid : UUID
	journal_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	awards : String
	peer_reviewed : Boolean
	acm_authorize : String
	number of Pages : String
	page_range : String
	article_no : String
	month : Int
	year : Int
	special_issue : String 
  
patents
	patent_uuid : UUID
	creator_uuid : UUID
	first_name : String
	last_name : String
	orcid : String
	publication_count : Int
  
standards
	standard_uuid : UUID
	creator_uuid : UUID
	publisher_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	number : String
	type : String
	month : Int
	year : Int
	url : String
	draft : String
  
thesis
	thesis_uuid : UUID
	creator_uuid : UUID
	department_uuid : UUID
	advisors_uuids : List<UUID>
	reviewers_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	authors_uuids : List<UUID>
	abstract : String
	to_appear : Boolean
	detail_url : String
	awards : String
	type : String
	isbn : String
	month : Int
	year : Int
  
techreports
	techreport_uuid : UUID
	creator_uuid : UUID
	department_uuid : UUID
	authors_uuids : List<UUID>
	bibtex_id : String
	title : String
	doi : String
	abstract : String
	to_appear : Boolean
	detail_url : String
	category : String
	number : String
	page_range : String
	type : String
	url : String
	month : Int
	year : Int
  
cities
	city_uuid : UUID
	creator_uuid : UUID
	region_uuid : UUID
	country_uuid : UUID
	region_uuid : UUID
	slug : String
	display_name : String
	name : String
	name_ascii : String
	timezone : String
  
regions
	region_uuid : UUID
	creator_uuid : UUID
	country_uuid : UUID
	slug : String
	name : String
	name_ascii : String
	geoname_code : String
  
countries
	country_uuid : UUID
	creator_uuid : UUID
	slug : String
	name : String
	name_ascii : String
	code2 : String
	code3 : String
	continent : String
	tld : String
  
awards
	award_uuid : UUID
	creator_uuid : UUID
	name : String

zusätzlich für jedes Objekt mit creator_uuid Eintrag 
	proofed : Boolean
	broken : Boolean
	broken_note : String

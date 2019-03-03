1. #### CRC Cards detailsL:####

CRC#1:
Class: 
--Customer
Responsibilities: 
--RequestTableBooking
--ConfirmOrLeaveBooking
Collaborations:
--RestaurantManager

//////////////////////////////////

CRC@2:
Class:
--RestaurantManager
Responsibilities: 
--RegisterCustomerOnWaitList
--UnRegisterCustomer
--SendRegitrationNotification
--RequestTableForCustomerx`
--TableReadyNotificationToCustomer
Collaborators:
--TableHandler

///////////////////////////////////

CRC#3:
Class:
--TableHandler
Responsibility
--HandleTableRequest
--CheckSuccesorTableChain
Collaborators:
--Table

////////////////////////////////////

CRC#4
Class:
--Table
Responsibility
--SetTableSize
--GetTableSize
--SetTableId
--GetTableId
--SetTableStatus
--GetTableStatus
Collaborators:
NA

/////////////////////////////////////


2. Which pattern and Why?
Answer:- Implemented Chain responsibilty pattern along with hybrid Observer Pattern.
Chain responsibility pattern implemeneted (in class Participant - TableHandler) to handle table requests by the customer. TableHandler class maintains an array tables, and ReastaurantManager class pass the customer request for table with specific size to tableHandler, The tabkeHandler class will check the first available table, if size matches then handler will return the tableNumber else will check the next available table if that matches requested size as customer wants, this chain will continue till get a table fulfils the requirement. If no chair found will return a NUll value. And when Null value is received by ReastaurantManager class it sends next customer request to tablehandler and process repeats.
Also, while registering and unregistering and notifying cutomer of availble tables, implemeted partial/hybrid observer pattern where cutomers are observer and restaurant is subject, Its partial Observer pattern beacause we are notifying to specific customer and all customer about each message, while in observer pattern message in kind of broadcast to everyone


Why choosen this chain responsibilty pattern?
--Beacuse chain responsibility best fits when more than one object may handle a request, and the handler isn't known a priority. The handler should be ascertained automatically.
Here TableHandler is playing that role of handling a customer booking request by passing the hadler to the first availble tables that macthes customer numberOfPeople criterio.

--Pattern basically given an opportunity to handle the customer request by linking available table objects together.
--Also it avoifs coupling the sender to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along
the chain until an object handles it.

# Participant role:

-Class: TableHandler -- role - Handler for chain responsibilty client's request
-Class: RestaurantManager  -- role - client for chain responsibilty handler
-Class: Customer -- role - observer 
-Class: RestaurantManager  -- role - subject for customer observer
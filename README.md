**Lunch application**

Linux:

./gradlew bootRun

Windows:

gradlew bootRun

**Request example**

`curl --header "Content-Type: application/json" --request POST  --data "{ \"strings\": [ \"Sound boy proceed to blast into the galaxy\", \"Go back rocket man into the sky you'll see\", \"Hear it all the time, come back rewind\", \"Aliens are watching up in the sky\", \"Sound boy process to blast into the galaxy\", \"No one gonna harm you\", \"They all want you to play I watch the birds of prey\"]}" http://localhost:8080/strings/sort`
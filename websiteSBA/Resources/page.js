//Variables
var firstName = "John";
var age = 25;
var isAdmin = true;

// If statement
if (age >= 18) {
	console.log(firstName + " is an adult");
} else {
	console.log(firstName + " is a minor");
}

// Loops
for (var i = 0; i <= 10; i++) {
	console.log(i);
}

// Form of collections (using an array)
var colors = ["pink", "violet", "yellow"];

// Functions/Callbacks
function sayHello(name) {
	console.log("Hello, " + name + "!");
}

sayHello("John");

// Events
document.getElementById("myButton").addEventListener("click", function() {
	console.log("Button clicked!");
});

// Additional Functionality
window.addEventListener("DOMContentLoaded", function() {
	var myForm = document.getElementById("myForm");

	// Accessing form inputs using the elements collection
	var emailInput = myForm.elements["email"];
	var passwordInput = myForm.elements["password"];

	// Event listener for form submission
	myForm.addEventListener("submit", function(event) {
		event.preventDefault(); // Prevents the default form submission

		// Perform form validation
		if (emailInput.value === "" || passwordInput.value === "") {
			alert("Please enter both email and password.");
		} else {
			alert("Form submitted!");
			console.log("Email: " + emailInput.value);
			console.log("Password: " + passwordInput.value);
			myForm.reset(); // Reset the form inputs
		}
	});
});

//t listener)
document.addEventListener("DOMContentLoaded", function() {
	var myButton = document.getElementById("myButton");

	myButton.addEventListener("click", function() {
		// Handle button click event
		console.log("Button clicked!");

	});

	document.addEventListener("DOMContentLoaded", function() {
		var myButton = document.getElementById("myButton");

		myButton.addEventListener("click", function() {
			// Handle button click event
			console.log("Button clicked!");

			// Get the input value from a text field with id "myInput"
			var inputElement = document.getElementById("myInput");
			var inputValue = inputElement.value;

			// Regular expression pattern for email validation
			var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

			// Validate the input value using the email pattern
			if (emailPattern.test(inputValue)) {
				console.log("Valid input");
				// Add your desired action for valid input
			} else {
				console.log("Invalid input");
				// Add your desired action for invalid input
			}
		});
	});
})
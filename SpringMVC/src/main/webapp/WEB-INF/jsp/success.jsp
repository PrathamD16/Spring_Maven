<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Success Page</title>
  <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 h-screen flex items-center justify-center">
  <div class="bg-white p-8 rounded-lg shadow-lg w-full max-w-md text-center">
    <h2 class="text-3xl font-bold mb-4 text-gray-800">Welcome Back!</h2>
    <p class="text-gray-600 mb-6">You have successfully logged in. Enjoy your stay and explore the features we offer.</p>
    <div class="flex justify-center">
      <button
        class="bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline mr-2"
        onclick="location.href='#';">
        Go to Dashboard
      </button>
      <button
        class="bg-red-500 hover:bg-red-700 text-white font-bold py-2 px-4 rounded focus:outline-none focus:shadow-outline"
        onclick="location.href='#';">
        Log Out
      </button>
    </div>
  </div>
</body>
</html>

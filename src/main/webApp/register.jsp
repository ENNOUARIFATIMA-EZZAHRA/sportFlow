<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Connexion</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100 h-screen flex items-center justify-center">
    <div class="bg-white p-8 rounded-lg shadow-lg w-96">
        <h2 class="text-2xl font-semibold mb-6 text-center">Se connecter</h2>
        <form action="LoginServlet" method="post">
            <div class="mb-4">
                <label for="email" class="block text-gray-700">Email</label>
                <input type="email" id="email" name="email" class="w-full p-3 border border-gray-300 rounded-md" required />
            </div>
            <div class="mb-4">
                <label for="password" class="block text-gray-700">Mot de passe</label>
                <input type="password" id="password" name="password" class="w-full p-3 border border-gray-300 rounded-md" required />
            </div>
            <div class="mb-4">
                <button type="submit" class="w-full bg-blue-500 text-white p-3 rounded-md hover:bg-blue-600">Se connecter</button>
            </div>
        </form>
        <p class="text-center text-gray-500">Pas encore inscrit ? <a href="register.jsp" class="text-blue-500 hover:underline">Inscrivez-vous ici</a></p>
    </div>
</body>
</html>

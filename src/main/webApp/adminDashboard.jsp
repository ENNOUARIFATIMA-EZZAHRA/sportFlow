<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-100">

    <div class="container mx-auto p-6">
        <h2 class="text-2xl font-semibold mb-6 text-center">Dashboard Admin</h2>


        <h3 class="text-xl font-semibold mb-4">Membres</h3>
        <table class="min-w-full bg-white shadow-md rounded-md">
            <thead>
                <tr class="bg-gray-200">
                    <th class="px-4 py-2 text-left">Nom</th>
                    <th class="px-4 py-2 text-left">Email</th>
                    <th class="px-4 py-2 text-left">Sport</th>
                    <th class="px-4 py-2 text-left">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="member" items="${members}">
                    <tr>
                        <td class="px-4 py-2">${member.nom}</td>
                        <td class="px-4 py-2">${member.email}</td>
                        <td class="px-4 py-2">${member.sportPratique}</td>
                        <td class="px-4 py-2">
                            <a href="editMember.jsp?id=${member.id}" class="text-blue-500 hover:underline">Modifier</a>
                            <a href="deleteMember.jsp?id=${member.id}" class="text-red-500 hover:underline ml-4">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!-- Liste des Entraîneurs -->
        <h3 class="text-xl font-semibold mb-4 mt-6">Entraîneurs</h3>
        <table class="min-w-full bg-white shadow-md rounded-md">
            <thead>
                <tr class="bg-gray-200">
                    <th class="px-4 py-2 text-left">Nom</th>
                    <th class="px-4 py-2 text-left">Spécialité</th>
                    <th class="px-4 py-2 text-left">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="entraineur" items="${entraineurs}">
                    <tr>
                        <td class="px-4 py-2">${entraineur.nom}</td>
                        <td class="px-4 py-2">${entraineur.specialite}</td>
                        <td class="px-4 py-2">
                            <a href="editEntraineur.jsp?id=${entraineur.id}" class="text-blue-500 hover:underline">Modifier</a>
                            <a href="deleteEntraineur.jsp?id=${entraineur.id}" class="text-red-500 hover:underline ml-4">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!-- Liste des Séances -->
        <h3 class="text-xl font-semibold mb-4 mt-6">Séances</h3>
        <table class="min-w-full bg-white shadow-md rounded-md">
            <thead>
                <tr class="bg-gray-200">
                    <th class="px-4 py-2 text-left">Membre</th>
                    <th class="px-4 py-2 text-left">Entraîneur</th>
                    <th class="px-4 py-2 text-left">Date/Heure</th>
                    <th class="px-4 py-2 text-left">Actions</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="seance" items="${seances}">
                    <tr>
                        <td class="px-4 py-2">${seance.member.nom}</td>
                        <td class="px-4 py-2">${seance.entraineur.nom}</td>
                        <td class="px-4 py-2">${seance.dateHeure}</td>
                        <td class="px-4 py-2">
                            <a href="editSeance.jsp?id=${seance.id}" class="text-blue-500 hover:underline">Modifier</a>
                            <a href="deleteSeance.jsp?id=${seance.id}" class="text-red-500 hover:underline ml-4">Supprimer</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

</body>
</html>

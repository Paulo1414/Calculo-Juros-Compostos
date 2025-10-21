<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- link do framework tailwindcss utilizado -->
 <link href="https://unpkg.com/tailwindcss@^2/dist/tailwind.min.css" rel="stylesheet">
<title>JSP - HELLO WORLD</title>
</head>
<body class="bg-blue-700">
<div>
    <div class="bg-white mx-auto text-center w-1/2 py-5 shadow-xl rounded-3xl my-96 max-w-2xl">
        <h2 class="text-4xl font-semibold border-b pb-2 mx-6">Calculadora de juros compostos</h2>
        <!-- If the error attribute is present in the forwarded request, display it -->
        <h3 class="bg-red-300 text-red-900 font-semibold text-xl w-80 rounded-lg my-2 mx-auto">${error}</h3>
        <div>

<!-- formulário da calculadora de juros, action aponta para uma servlet
e o tipo de metodo de envio é post -->
<form action="CalculatorServlet" method="post">

 <div class="grid grid-cols-2 gap-4 my-5 mx-8">
	<label for="principal-amount"  class="text-xl flex items-center">Valor principal: <span class="text-gray-500 mx-1">$</span></label>
	<input id="principal-amount"  type="number" name="principleamount" value="${principle}" class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2">
	
	<label for="Interest Percentage: "  class="text-xl flex items-center">Porcentagem de juros</label>
	<input id="interest"  type="number" min="1" max="100" name="interestPercentage" value="${interest}" class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg  focus:outline-none focus:ring-2">
	
	<label for="years"  class="text-xl flex items-center"> # de Anos: </label>
	<input id="years"  type="number" min="1" name="years" class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg focus:outline-none focus:ring-2">
	
	<label for="compoundingperiod"  class="text-xl flex items-center"> Vezes por ano: <span class="text-gray-500">(1 a 12)</span></label>
	<input id="compoundingperiod"  type="number" min="1" max="12" name="compoundingPeriod" class="w-full p-1 border-2 placeholder-blue-800 border-blue-700 appearance-none rounded-lg  focus:outline-none focus:ring-2">
	
	<button type="submit" class="bg-blue-300 text-xl font-semibold px-4 py-1 rounded-lg hover:bg-blue-800 hover:text-white">Calcular</button>
	
	 <p class="text-3xl font-mono text-green-600">Resultado: ${result}</p>
	</div>
</form>
</body>
</html>
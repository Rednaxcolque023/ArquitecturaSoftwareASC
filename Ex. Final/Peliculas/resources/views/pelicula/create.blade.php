<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    
    <form action="{{route('agendas.store')}}" method="POST">
        @csrf
        <input type="text" name="titulo" placeholder="Titulo"><br>
        <input type="text" name="artistas" placeholder="Artistas"><br>
        <input type="number" name="anio" placeholder="Año"><br>
        <input type="submit" value="Insertar">
    </form>
    
</body>
</html>
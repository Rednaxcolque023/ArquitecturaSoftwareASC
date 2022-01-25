<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <form action="{{route('peliculas.update',$pelicula->id)}}" method="POST">
        @csrf
        @method('PUT')
        <input type="text" name="titulo" placeholder="Titulo" value="{{$pelicula->titulo}}"><br>
        <input type="text" name="artistas" placeholder="artistas" value="{{$pelicula->artistas}}"><br>
        <input type="number" name="anio" placeholder="Año" value="{{$pelicula->anio}}"><br>
        <input type="submit" value="Editar">
    </form>
    
</body>
</html>
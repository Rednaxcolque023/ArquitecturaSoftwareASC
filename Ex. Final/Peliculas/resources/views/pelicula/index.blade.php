<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Vista</title>
</head>
<body>
<table>
        <tr>
            <th>Titulo</th>
            <th>Artistas</th>
            <th>Anio</th>
        </tr>
        @foreach($peliculas as $pelicula)
        <tr>
            <td>{{$pelicula->titulo}}</td>
            <td>{{$pelicula->artistas}}</td>
            <td>{{$pelicula->anio}}</td>
            <td><a href="{{route('peliculas.edit',$pelicula->id)}}">Editar</a></td>
            <td><a href="{{route('peliculas.show',$pelicula->id)}}">Mostrar</a></td>
            <td>
            <form action="{{route('peliculas.destroy',$pelicula->id)}}" method="POST">
                @csrf
                @method('DELETE')
                <input type="submit" value="Eliminar">
            </form>
            </td>

        </tr>
        @endforeach
    </table>
    <a href="{{route('agendas.create')}}">Insertar</a>
</body>
</html>
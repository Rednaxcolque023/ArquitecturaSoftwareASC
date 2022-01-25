<?php

namespace Database\Factories;

use Illuminate\Database\Eloquent\Factories\Factory;

class PeliculaFactory extends Factory
{
    /**
     * Define the model's default state.
     *
     * @return array
     */
    public function definition()
    {
        return [
            'titulo'=>$this->faker->name(),
            'artistas'=>$this->faker->lastName(),
            'anio'=>$this->faker->numberBetween(1111, 9999),
        ];
    }
}

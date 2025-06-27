package ru.netology.oopp2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int currentStation;
    private int currentVolume;

    private int maxStation = 9;
    private int minStation = 0;

    private int maxVolume = 100;
    private int minVolume = 0;


}
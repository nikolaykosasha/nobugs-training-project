package org.example.module.expressJava.staticFinalAccessModifiers;
/*
static int maxPlayers — общее ограничение игроков
final String gameName — название (нельзя менять)
int currentPlayers — сколько игроков в игре сейчас Реализуйте конструктор,
 статический метод setMaxPlayers(int), метод addPlayer() — добавляет 1 игрока,
 метод printGameStatus() — выводит название, текущее и максимальное количество игроков.
В main: создайте 2 игры, измените maxPlayers, добавьте игроков и выведите статус.
 */
public class GameSettings {
    static int maxPlayers;
    final String gameName;
    private int currentPlayer;

    public GameSettings(String gameName, int currentPlayer) {
        this.gameName = gameName;
        this.currentPlayer = currentPlayer;
    }

    public static void setMaxPlayers(int maxPlayers) {
       GameSettings.maxPlayers = maxPlayers;
    }

    public void addPlayer() {
        currentPlayer = currentPlayer++;
    }

    public void printGameStatus() {
        System.out.println("Название игры: " + gameName);
        System.out.println("Текущее количество игроков: " + currentPlayer);
        System.out.println("Максимальное количество игроков: " + maxPlayers);
    }

}

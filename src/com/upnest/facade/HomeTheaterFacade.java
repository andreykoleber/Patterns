package com.upnest.facade;

/**
 * Паттерн фасад предоставляет унифицированный интерфейс
 * к группе интерфейсов подсистемы. Фасад определяет высокоуровневый
 * интерфейс, упрощающий работу с подсистемой.
 *
 * Принцип проектирования
 * Принцип минимальной информарованности: "общайтесь только с близкими
 * друзьями".
 */

public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             TheaterLights lights,
                             Screen screen,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }


    private class Amplifier {


        public void on() {

        }

        public void off() {

        }

        public void setDvd(DvdPlayer dvd) {

        }

        public void setSurroundSound() {

        }

        public void setVolume(int i) {

        }
    }

    private class PopcornPopper {
        public void on() {
        }

        public void pop() {

        }

        public void off() {

        }
    }

    private class Tuner {
    }

    private class DvdPlayer {
        public void off() {

        }

        public void on() {
        }

        public void eject() {

        }

        public void stop() {

        }

        public void play(String movie) {

        }
    }

    private class CdPlayer {
    }

    private class Projector {
        public void on() {

        }

        public void wideScreenMode() {

        }

        public void off() {

        }
    }

    private class TheaterLights {
        public void dim() {
        }

        public void on() {

        }
    }

    private class Screen {
        public void down() {
        }

        public void up() {

        }
    }
}

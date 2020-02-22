package chapter10;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.NANOSECONDS;

abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime){
        this.delayTime=delayTime;
        start();
    }
    public void start(){
        eventTime=System.nanoTime()+delayTime;
    }
    public boolean ready(){
        return System.nanoTime()>=eventTime;
    }
    public abstract void action();
}

//Система управления событием
class Controller{
    private List<Event> eventList=new ArrayList<Event>();
    public void addEvent(Event e){eventList.add(e);}
    public void run(){
        //Создать копию чтобы избежать модификацию списка во время
        //выборки элемента
        while(eventList.size()>0){
            for (Event e:new ArrayList<Event>(eventList)) {
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}

//Пример приложения на основе системы управления, все находится в одном
//классе. Внутренние классы дают возможность инкапсулировать различную
//функциональность для каждого отдельного события.

class GreenhouseControls extends Controller{
    SimpleDateFormat formatDate=new SimpleDateFormat("HH:mm:ss");
    private boolean light=false;
    public class LightOn extends Event{
        public LightOn(long delayTime){super(delayTime);}
        public void action(){
            //код управления оборудованием
            light=true;
        }
        public String toString(){return "свет включен "+formatDate.format(new Date());}
    }
    public class LightOff extends Event{
        public LightOff(long delayTime){super(delayTime);}
        public void action(){
            light=false;
        }
        public String toString(){return "свет выключен "+formatDate.format(new Date());}
    }

    private boolean water=false;
    public class WaterOn extends Event{
        public WaterOn(long delayTime){super(delayTime);}
        public void action() {
            water=false;
        }
        public String toString(){
            return "Вода пущена "+formatDate.format(new Date());
        }
    }
    public class WaterOff extends Event{
        public WaterOff(long delayTime){super(delayTime);}
        public void action(){water=true;}
        public String toString(){return "Вода перекрыта "+formatDate.format(new Date());}
    }

    private String termostat="День";
    public class TermostatNight extends Event{
        public TermostatNight(long delayTime){super(delayTime);}
        public void action(){termostat="Ночь";}
        public String toString(){
            return "Ночной режим "+formatDate.format(new Date());
        }

    }
    public class TermostatDay extends Event{
        public TermostatDay(long delayTime){super(delayTime);}
        public void action(){termostat="День";}
        public String toString(){
            return "Дневной режим "+formatDate.format(new Date());
        }
    }

    //Пример метода action(), вставляющий новый экземпляр объекта
    //в список событий
    public class Bell extends Event{
        public Bell(long delayEvent){super(delayEvent);}
        public void action(){addEvent(new Bell(delayTime));}
        public String toString(){return "Звонок "+formatDate.format(new Date());}

    }
    public class Restart extends Event{
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList){
            super(delayTime);
            this.eventList=eventList;
            for (Event e:eventList) {
                addEvent(e);
            }
        }
        public void action(){
            for (Event e:eventList) {
                //Перезапуск каждого события
                e.start();
                addEvent(e);
            }
            //Перезапуск текущего события
            start();
            addEvent(this);
        }
        public String toString(){
            return "Перезапуск системы "+formatDate.format(new Date());
        }
    }
    public static class Terminate extends Event{
        //прекратить
        public Terminate(long delayTime){super(delayTime);}
        public void action(){System.exit(0);}
        public String toString(){return "Отключение";}
    }
}

public class GreenHouseControllers{
    public static void main(String[] args) {
        GreenhouseControls ghc=new GreenhouseControls();
        ghc.addEvent(ghc.new Bell(9000000000L));

        Event[] eventList={
                ghc.new TermostatNight(0),
                ghc.new LightOn(2000000001L),
                ghc.new LightOff(4000000000L),
                ghc.new WaterOn(6000000000L),
                ghc.new WaterOff(8000000000L),
                ghc.new TermostatDay(14000000000L)
        };

        ghc.addEvent(ghc.new Restart(20000000000L, eventList));
        if (args.length==1)ghc.addEvent(new GreenhouseControls.Terminate(new Long(args[0])));
            ghc.run();

       /*long everyTime=System.nanoTime()+1;
        System.out.println(NANOSECONDS.toSeconds(6000000000L));*/

    }
}





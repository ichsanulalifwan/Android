package com.dicoding.picodiploma.submission_fastestman.model;
import com.dicoding.picodiploma.submission_fastestman.R;

import java.util.ArrayList;

public class AthleteBio {

    private static String[] athleteNames = {
            "Usain Bolt",
            "Wayde Van Niekerk",
            "David Rudisha",
            "Noah Ngeny",
            "Hicham El Guerrouj",
            "Daniel Komen",
            "Kenenisa Bekele",
            "Haile Gebrselassie",
            "Geoffrey Kamworor",
            "Eliud Kipchoge",
            "Nao Kazami"
    };

    private static String[] athleteCategory = {
            "100 Metres, 200 Metres",
            "400 Metres",
            "800 Metres",
            "1000 Metres",
            "1500 Metres, One Mile, 2000 Metres",
            "3000 Metres",
            "5000 Metres, 10,000 Metres",
            "20,000 Metres, One Hour",
            "Half Marathon",
            "Marathon",
            "100 Kilometres"
    };

    private static String[] athleteCountry = {
            "Jamaica",
            "Republic of South Africa",
            "Kenya",
            "Kenya",
            "Morocco",
            "Kenya",
            "Ethiopia",
            "Ethiopia",
            "Kenya",
            "Kenya",
            "Japan"
    };

    private static String[] athleteBio = {
            "Usain Bolt (born in Trelawny, Jamaica, August 21, 1986) is a Jamaican runner. Bolt is the current 100m and 200m men's world record holder, with a time of 9.58 seconds and 19.19 seconds which he set at the 2009 World Athletics Championship. \n" +
                    "Both records broke the old record he also held, 9.69 seconds and 19.30 seconds that he created at the 2008 Beijing Olympics. The 100 meter record at the Bejiing Olympics itself broke the previous record he also held, 9.72 seconds created at the New York Reebok Championship on May 31, 2008. Besides that in Beijing he also created a new world record (37.10 seconds) in the 4x100m relay number with his colleagues. In 2004 he created a new junior world record in the 200 m run with a time of 19.93 seconds.\n" +
                    " He won a silver medal at the 2007 World Championships in Osaka in the 200 m running in 19.91 seconds. At the 2009 Athletics World Championship held in Berlin he broke a new world record in the 200 meter run with a time of 19.19 seconds and was recorded as a new world record.\n",
            "Wayde van Niekerk (born 15 July 1992) is a South African track and field sprinter who competes in the 200 and 400 metres. In the 400 metres, he is the current world and Olympic record holder, and world and Olympic champion. He also holds the world-best time in the 300 metres.\n" +
                    "Van Niekerk was the silver medallist in the 400m at the 2014 Commonwealth Games and took bronze in the 4×400 metres relay at the 2013 Summer Universiade. He also represented South Africa at the 2013 and 2015 Athletics World Championships. At the 2015 World Championships, he won the gold medal in the 400 meters. He defended his title two years later, in London, where he also won the silver medal in the 200 meters race.\n" +
                    "In the 2016 Olympic Games men's 400m, Van Niekerk won the gold medal with a world record time of 43.03 seconds (reaction time 0.181 s) at age 24 years and 30 days, beating the time of 43.18 seconds set by Michael Johnson during the 1999 World Championships in Athletics in Seville, Spain.\n" +
                    "In 2016, Van Niekerk became the first, and to date, only, sprinter in history to have run the 100 metres in under 10 seconds, 200 metres in under 20 seconds, and 400 metres in under 44 seconds. In 2017, after a 30.81 seconds victory in the seldom-run 300 metres distance, breaking Michael Johnson's world-best time of 30.85 which was set in 2000, Van Niekerk became the only sprinter in history to have run sub-10, sub-20, sub-31 and sub-44 performances at 100m, 200m, 300m and 400m respectively.\n",
            "David Lekuta Rudisha, (born 17 December 1988) is a Kenyan middle-distance runner. He is the 2012 and 2016 Olympic champion, 2-time World Champion (2011 and 2015), and world record holder in the 800 metres. Rudisha is the first and only person to ever run under 1:41 for the event, and he holds the three fastest, six of the eight fastest, and half of the twenty fastest times ever run in this event. He also holds the world's best time in the 500m, with a time of 57.69,  and the African record for the 600m, with a time of 1:13.10. Rudisha has won a record 3 consecutive Track & Field Athlete of the Year awards (tied with Carl Lewis), and also won the IAAF World Athlete of the Year award in 2010.",
            "Noah Kiprono Ngeny (born 2 November 1978) is a former Kenyan athlete, Olympic gold medalist at 1500 m at the 2000 Summer Olympics, and world record holder in the 1000 m.\n" +
                    "Ngeny first came to international prominence by setting two world junior records in 1997—3:32.91 for 1500 m in Monaco and 3:50.41 for the Mile in Nice, and under the guidance of renowned manager and coach, the late Kim McDonald, his progression continued in 1998, improving his 1500 m time to 3:30.34 in Monaco.\n" +
                    "On 5 September 1999, Ngeny set the world record 2:11.96 over 1000 m in Rieti, Italy, breaking the 18-years-standing record 2:12.18 set by Sebastian Coe in 1981. Ngeny's time of 2:11.96 still stands as the world record with only one other runner coming within 2 seconds of the time since (Taoufik Makhloufi). The previous record had been the oldest standing record at the time. It was also the last world record of any running distance that had not been previously held by an athlete of African descent. \n",
            "Hicham El Guerrouj (14 September 1974) is a retired Moroccan middle-distance runner. El Guerrouj is the current world record holder of the outdoor 1500 meters, mile, and 2000 meters events. He also held indoor world records for the mile and 1500 meters until 2019, and is the only man since Paavo Nurmi to earn a gold medal in both the 1500 metres and 5000 metres at the same Olympic Games. El Guerrouj holds 7 of the fastest 9 times ever run in the 1500 meters and 7 of the 10 fastest in the mile. Given these achievements, El Guerrouj is considered by many to be the greatest middle-distance runner of all time.\n" +
                    "In November 2014, he was inducted into the International Association of Athletics Federations (IAAF) Hall of Fame.\n",
            "Daniel Kipngetich Komen (born 17 May 1976) is a Kenyan middle- and long-distance runner. Remembered for his rivalry with Haile Gebrselassie, Komen's most notable achievements came in a two-year period between 1996 and 1998, during which he broke a string of world records.\n" +
                    "He currently holds the world record for the 3000 metres both outdoors (7:20.67 set in 1996) and indoors (7:24.90 set in 1998). In addition, with his 7.58.61 world record in the 2-mile race set in 1997, he remains the only man in history to run back-to-back sub-four-minute miles, splitting circa 3:59.4 on both the first and second half of the race.\n" +
                    "Komen was also the second man, after Saïd Aouita, to break the 13-minute mark for the 5,000 m, the 7½-minute mark for 3,000 m, and the 3½-minute mark for the 1,500 m.",
            "Kenenisa Bekele (born 13 June 1982) is an Ethiopian long-distance runner and the current world record and Olympic record holder in both the 5000-metre and 10,000-metre events. He won the gold medal in both the 5000 m and 10,000 m events at the 2008 Summer Olympics. At the 2004 Olympics he won the gold medal in the 10,000 m and the silver medal in the 5000 m. He is married to actress Danawit Gebregziabher and he has one younger brother, Tariku Bekele, who is also an accomplished world-class distance runner.\n" +
                    "He is the most successful runner in the history of the IAAF World Cross Country Championships, with six long (12 km) course and five short (4 km) course titles. He won the 10,000 m title at the World Championships in Athletics in 2003, 2005, 2007 and 2009 (matching Haile Gebrselassie's four in a row win streak). Kenenisa was unbeaten over 10,000 m from his debut in 2003 until 2011, when he failed to finish at the World Championships final.\n" +
                    "At the 2009 World Championships in Athletics he became the first man to win both 5000 m and 10,000 m title at the same championships. Over 5000 m he has also won an Olympic silver (2004), World Championship bronze (2003), two African Championship titles and one All-Africa Games gold medal. He also won the 3000 metres title at the 2006 World Indoor Championships.\n" +
                    "On 6 April 2014, he produced the sixth fastest marathon debut ever on a record-eligible course with his victory at the Paris Marathon, in a course record time of 2:05:04. On 25 September 2016, Kenenisa won the Berlin Marathon in a time of 2:03:03, a new personal best, then the third-fastest marathon of all time. On 29 September 2019, he again won the Berlin Marathon in a time of 2:01:41, two seconds slower than the world record of 2:01:39 set by Eliud Kipchoge in the 2018 Berlin Marathon.\n",
            "Haile Gebrselassie (born 18 April 1973) is a retired Ethiopian long-distance track and road running athlete. He won two Olympic gold medals over 10,000 metres and four World Championship titles in the event. He won the Berlin Marathon four times consecutively and also had three straight wins at the Dubai Marathon. Further to this, he won four world titles indoors and was the 2001 World Half Marathon Champion.\n" +
                    "Haile had major competition wins at distances between 1500 metres and the marathon, moving from outdoor, indoor and cross country running to road running in the latter part of his career. He broke 61 Ethiopian national records ranging from 800 metres to the marathon, set 27 world records, and is widely regarded as the greatest distance runner in history. \n" +
                    "In September 2008, at the age of 35, he won the Berlin Marathon with a world record time of 2:03:59, breaking his own world record by 27 seconds. The record stood for three years. Since he was over the age of 35, that mark stood as the Masters Age group world record until September 29, 2019, when fellow Ethiopian Kenenisa Bekele ran 2:01:41 at the age of 37. Gebrselassie's 10000 m Masters record has not been challenged since 2008.\n",
            "Geoffrey Kipsang Kamworor (born 22 November 1992) is a Kenyan long-distance runner who competes in cross country, marathon, and half marathon races. He was the 2011 World Junior Cross Country Champion. Kipsang won the IAAF World Half Marathon Championships three times in a row from 2014-2018. In the IAAF World Cross Country Championships he won in 2015 and 2017.\n" +
                    "He won his first World Marathon Major at the 2017 New York City Marathon.\n" +
                    "He is the current half marathon world record holder after winning the Copenhagen Half Marathon with a time of 58:01, on Sunday, 15 September 2019. However this time is still to be officially ratified by the IAAF.",
            "Eliud Kipchoge (born 5 November 1984) is a Kenyan long-distance runner who competes in the marathon and formerly the 5000 metres. He won the Olympic marathon in 2016 and set the marathon world record of 2:01:39 on September 16, 2018, at the 2018 Berlin Marathon. His run broke the previous world record by 1 minute and 18 seconds.[2] It was the greatest improvement in a marathon world record time since 1967.\n" +
                    "Kipchoge won his first individual world championship title in 2003 by winning the junior race at the IAAF World Cross Country Championships and setting a world junior record over 5000 m on the track. At the age of eighteen, he became the senior 5000 m world champion at the 2003 World Championships in Athletics with a championships record, then followed with an Olympic bronze for Kenya in 2004 and a bronze at the 2006 IAAF World Indoor Championships. A five-time World Championship 5000 m finalist, Kipchoge took silver medals at the 2007 World Championships, 2008 Summer Olympics and 2010 Commonwealth Games.\n" +
                    "On 12 October 2019, Kipchoge ran the marathon distance on a special course in Vienna, Austria, achieving a time of 1:59:40 in the Ineos 1:59 Challenge.  Kipchoge became the first person in recorded history to run the marathon distance in under two hours, but the effort does not constitute a new world record due to the specific setup of the challenge, which was not an open event and featured a pace car and rotating teams of other runners pacing in a formation designed to reduce wind resistance and maximize efficiency.\n",
            "Nao Kazam is marathoner with personal best 2:17:2 . one of the participants in Lake Saroma 100 km Ultramarathon and holds world record 6:09:14.  Kazami is a graduate of Hakone Ekiden powerhouse Komazawa University. started running from 13 years old when he joined the track team in middle school. He’s first ultra was when he was 28 years old."

    };

    private static int[] athleteImages = {
            R.drawable.usain_bolt,
            R.drawable.wayde_van_niekerk,
            R.drawable.david_rudisha,
            R.drawable.noah_ngeny,
            R.drawable.hicham_el_guerrouj,
            R.drawable.daniel_komen,
            R.drawable.kenenisa_bekele,
            R.drawable.haile_gebrselassie,
            R.drawable.geoffrey_kamworor,
            R.drawable.eliud_kipchoge,
            R.drawable.nao_kazami
    };

    private static int[] athleteFoto = {
            R.drawable.bolt,
            R.drawable.niekerk,
            R.drawable.rudisha,
            R.drawable.ngeny,
            R.drawable.guerrouj,
            R.drawable.komen,
            R.drawable.bekele,
            R.drawable.gebrselassie,
            R.drawable.kamworor,
            R.drawable.kipchoge,
            R.drawable.kazami
    };

    private static int[] athleteFlag = {
            R.drawable.jamaica,
            R.drawable.rsa,
            R.drawable.kenya,
            R.drawable.kenya,
            R.drawable.morocco,//morocco
            R.drawable.kenya,
            R.drawable.ethiopia,//ethiopia
            R.drawable.ethiopia,//ethiopia
            R.drawable.kenya,
            R.drawable.kenya,
            R.drawable.japan
    };


    static ArrayList<Athlete> getListData() {
        ArrayList<Athlete> list = new ArrayList<>();
        for (int position = 0; position < athleteNames.length; position++) {
            Athlete atlet = new Athlete();
            atlet.setName(athleteNames[position]);
            atlet.setCategory(athleteCategory[position]);
            atlet.setCoutry(athleteCountry[position]);
            atlet.setBio(athleteBio[position]);
            atlet.setPhoto(athleteImages[position]);
            atlet.setFoto(athleteFoto[position]);
            atlet.setFlag(athleteFlag[position]);
            list.add(atlet);
        }
        return list;
    }
}

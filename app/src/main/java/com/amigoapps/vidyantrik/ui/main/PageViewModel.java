package com.amigoapps.vidyantrik.ui.main;

import android.util.Log;
import java.lang.*;
import java.lang.ref.*;
import com.amigoapps.vidyantrik.Data;
import com.amigoapps.vidyantrik.R;

import androidx.annotation.NonNull;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;




import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;

import static android.content.ContentValues.TAG;

public class PageViewModel extends ViewModel {



    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();


    private LiveData<String> Heading = Transformations.map(mIndex, new Function<Integer, String>() {
        @Override
        public String apply(Integer input) {
            switch(mIndex.getValue())
            {

                case 1: return "~~Home~~";
                case 2:  return "~~Events~~";
                case 3: return "~~Contact Us~~";
                default: return "Sorry Page Under Construction";
            }
        }
    });
    public void setIndex(int index) {
        mIndex.setValue(index);
    }
    public LiveData<String> getText() {
        return Heading;
    }



    //Make them generic to return Desired data type;

    private LiveData<ArrayList<Data>> data = Transformations.map(mIndex, new Function<Integer, ArrayList<Data>>() {
        @Override
        public ArrayList<Data> apply(Integer input) {
            ArrayList<Data> word = new ArrayList<Data>();
            switch (mIndex.getValue()) {
                case 1: {

                    word.add(new Data("Blazer's Day Out!","How I got here in the first place ","Computer Science Department has been historically one of the most insane and weird branches of CVRCE since years. Their horrible, weird and illogical antics in the college premises have been unparalleled with the exception of the IT students who definitely are the pioneers in this field. A few weeks back a similar strange and incomprehensible incident was seen in the college campus. The guys, semi-guys and girls from CS were all dressed in oversized blazers and posing like total jackasses for photographs all over the place.\n" +
                            "\n" +
                            "\n" +
                            "I and Hatasia Harry decided to investigate the matter. We were told that the nerds were posing form some photo that will be published in some nerd-magazine. Whatever. But it is beyond logic that how come the CS guys who are BPUT-Famous for their insane amount of mass bunks turn up in such huge numbers for some loser photo shoot?! Anyway, we report some highlights from this weird event.\n" +
                            "\n" +
                            "    CS2 Sherni and Hawt Bihari Kudi (HBK) posed in some absolute loser style photographs in which they hopelessly tried to act like lecturers teaching stuff. They tried to act funny but ended up looking like some geeks whose photos come out in the brochure/prospectus of loser engineering college.\n" +
                            "    Bholadri Dutta woke up at 4 am, gets shaved, shaves chest, legs, arms,etc. Sprays five different deodorants, colognes, perfumes, etc. Applies makeup, hair gel, face wash, fairness cream and other gay stuff. Puts on a costly Reid &amp; Taylor Blazer, Holyfield black shoes, Raymond’s Tie, Allen Solly Suit, Park Avenue Shirt, Jockey Inners, etc . Arrives at college well before anybody else. Sadly all this preparation for the photo soot goes down the drain because of the unforgiving sun. All the beauty queen stuff he had put on wears off due to the heat and sweat and finally Bholadri Dutta still looks like a geek in the Photos.\n" +
                            "    Paradeep Kotipathy forgets his blazer at home. He was the only guy in the photo shoot without a blazer. No big surprise that he looks like a homeless villager or a college sweeper among the other geeks in the final photos.\n" +
                            "    Bhootiya Kutta’s and Foreign Kumar Hembram’s blazers gets exchanged accidentally. Bhootiya Kutta looks like he is wearing a oversized black kurta in the final photos. Foreign Kumar Hembram looks like he is wearing sexy top .\n" +
                            "    Peacock-Race Sahoo turns up in the college after two years of disappearance for the photo shoot. The CS HOD Dr. Kamilla plans to do more such photo shoots to rev up the declining attendance among the students.\n" +
                            "    CS Lecturer Mr. Mohit Panda who resembles a Kollywood Side-Hero seemed more excited than the students about the photo shoot. He changed his shirt four times throughout the day for the photo shoot.\n" +
                            "    Hottie Verma’s ex-boyfriend from ‘Safed Vardi-Wala Branch ’ turns up at the photo shoot in full ‘Tere Naam’ style. Famous Housebreaker Shoe-Case Dash plays superhero and goes to save the day.\n" +
                            "    China Bomb comes to college for the photo shoot inspite of a broken ankle. Frustu-a-sis Panigrahi gets a nervous breakdown after seeing her.\n" +
                            "    Shit-ish Pradhan and Supermodel Mahapatra pose for a pseudo-romantic photograph. Reports state that Supermodel Mahapatra fled the scene soon as she was unable to endure the rotten Shit-isms by Shit-ish Pradhan. By the way we miss the famous crumpled dress Miss Supermodel Mahapatra !\n" +
                            "\n" +
                            "Thus went a strange day at Loserville…oops CS Block. If this day wasn’t ‘loser’ enough, all the other branches decided to ape the weird photo-shoot activity in the coming days. Epic Losers. Keep Visiting CVRCE Diary. Meanwhile lemme dry wash my blazer. My branch has its photo-shoot tomorrow!",R.drawable.blazzer_day_out, R.color.homeColor));

                    word.add(new Data("The Bunk-Masters of CVRCE!","First Class in CVRCE","\n" +
                            "\n" +
                            "Anyone read ‘Secret Seven’? ‘Famous Five’? ‘Fantastic Four’? No…? No one? Damn, I knew it! none of you ‘Geeks’ ever read anything other than academics. And non of you ‘Non-Geeks’ read anything at all! Well I’m dedicating this post to the people whom I’ll fondly (read ‘Devilishly’!) call as the ‘Bunk-masters’. Yeah that’s a pretty lame nomenclature. But did I wish their names to be cool or something! Ok..As I promised in one of my earlier posts that I wont be revealing the real names of my victims to protect their identities (duh!). But I will be using a series of more than obvious Code Names which even a kid can crack (Geez! Doesn't that smell of superhero kinda stuff?! Codenames and all !)\n" +
                            "\n" +
                            "\n" +
                            "    So,coming back to the topic. There are many ‘Bunk-Master’ Gangs in our college like the ‘Monginis Monsters’ from the Mechanical Branch who spend the maximum possible time enjoying the free A/C at the Monginis eatery!\n" +
                            "    Then there are the ‘Canteen Campers’ from the Computer Science Branch who are probably under the impression that the classes take place in the canteen. They get down from the bus, spend the whole day in the canteen, then go back home.\n" +
                            "    Hey ! How can I forget the ‘AEI AutoSquad’ ! Yeah. The strange people from AEI branch always come to the college in the Bus and leave within 15 minutes by Autorickshaws ! Probably off to catch some stupid flick at S-Complex or even going window shopping at Forum Mart if the tickets aren’t available. It beats me that why the hell do they bother coming 20 kilometers to college if they have to leave within 10-15 minutes anyway? Hats off to you Autosquad!\n" +
                            "    Same was the case with the ‘IT PhotoSquad’ a few months back. The only difference here is that these species can be seen sprawling all over the college lawns, trees, rocks, et al posing for group photographs. Till today these guys pollute Orkut and Facebook with numerous photo uploads. But strangely they are spotted toiling their asses off studying hard of late…It scares the shit outta me that they even did extra classes for the PPT!\n" +
                            "    Hmm…Well there’s nothing much to say about the guys from the Electrical Branch. Though they are far behind the bunking standards set by the ‘Mechanical Monginis Monsters’ and the ‘CS Canteen Campers’ they still are catching up with the ‘AEI AutoSquad’ and ‘IT PhotoSquad’ in terms of Paagalpan under the able leadership of Mr. Dhoti-Shaker Padhy !\n" +
                            "    There are a few more assorted groups like the ‘Canteen Commandoes’ which can give the ‘CS Canteen Campers’ a run for their money any day and the ‘Gay Section Guys’…Oops sorry…’The K Section Guys’ who can be spotted either in the Bike Stand or the So called Fast Food shop at the back gate. I’m going to elaborated about these groups some day later.\n" +
                            "\n" +
                            "\n" +
                            "You must have noticed that I have missed out the names of any of the ‘Bunk-Master Gangs’ from the ETC and the Chemical branches. Well. Are you kidding? Have you ever seen anyone from ETC bunking the classes ?(Well…apart from the couple of ETC outcasts from the ‘Canteen Commandoes Gang’). These guys would stand near the door and take notes even if they are driven out from their classes by their psychotic lecturers ! And have you seen anyone from the Chemical Branch at all ?! Honestly guys it took me one year to notice that our college has a branch called chemical engineering. Well…That says the story!\n" +
                            "\n" +
                            "Well I’m signing off with a toast to these ‘Bunk-Masters’ gangs who keep the noble art of bunking alive in our college. Cheerz!\n",0,R.color.eventColor));

                    word.add(new Data("The Tribes of CVRCE","My debut post","\n" +
                            "The Tribes of CVRCE\n" +
                            "The SEXONS (sections) of CVRCE…\n" +
                            "Hi all the dumbasses. This is my debut post and feel like peeing in front of The White House while writing this blog because both are a matter of great Pride ! So being the Senior Guptachar let me first give you an inside analysis of all the sexons sections of our batch. We will go alphabetically or else AEI people will again say that we have been neglected.\n" +
                            "\n" +
                            "\n" +
                            "    AEI (The Rumor-mongers or Pawanaas) - If you are a victim of useless rum ours in CVRCE then you must curse this tribe. They are lead by D.'I never fart’ Rao and Miss ‘Dance India Dance’ Ranjeeta. These people are one of the most civilized tribe of CVRCE ; After all they went for a strike because of No Lab ! Get a life man ! Who complains about it except these \"We are so geek\" people? This class has a considerable number of people who come to college in the morning and end up standing in the queue for movie tickets. They change their CR in every now and then; Much faster than the change of Pakistani captains !\n" +
                            "\n" +
                            "\n" +
                            "    Chemical (The Unknowns) - We don't know much about these people. How they look? Or where they stay? Etc.No one is interested in them as they don't have hot girls unlike other sections. The story of evolution of this tribe is when Raj Thackeray attacked north Indian students in Mumbai they flew to their land but in the midway appeared KRK and rescued them with his Deshdrohi act and sent them here to CVRCE. I think these Chemies have invented some invisible mask and they wear it every time. I just know one guy from Chemical named Kishaan (added an extra ‘K’ because of his involvement with \"Gay\", I mean \"K\" section people). But the tragedy is that he never admits that he belongs to chemical.\n" +
                            "\n" +
                            "\n" +
                            "    Computer Science-1 (The valley of Frustus) - When you see these people they look so frustrated because they did not score enough to get ETC and some of them are still in coma. They have some legendary Casanovas (duh!) like Altaf Raja Bankiya and 40 years old Virgin Sahoo. Then there is also a Band which is more interested in growing mafia size rather than making music or increasing their fan base. They have so much frustus in CS1 that even a guy gives treat after getting a testimonial from Brazil. Some run a group called GMS to increase there network business following. And a guy named Binay Kumar Jhadoo does piercing after getting dumped by a Mechi-Toki.\n" +
                            "\n" +
                            "\n" +
                            "    Computer Science-2 (The Angels & Demons) - This class is full of Angels ( I mean witches ) led by CS2 Sherni and the best part is that they have a plenty of them too. Even one is imported from China itself and one even is half-mental. The class is divided into two groups the ruling party called as 'We want a mass bunk' and there is the minority opposition party named 'We should have been informed about mass bunk earlier'. These people have not attended a single lab in 7th semester, The real demons for teachers. The strangest thing about this class is the rate in which people faint here lead by Bangali Behosh, the CR followed by Chutki Mahapatra, China Bomb and Tomboy Satpathy. I must tell you about the Don of CS, the ever charming and furious Maka who lights a cigarette from its filter.\n" +
                            "\n" +
                            "\n" +
                            "    Electrical (The Inglorious Infighters) - These people can easily give BJP a run for there money as far as infighting is concerned. And the worst thing is that they even have infighting for being the topper. WTF ?! This section consists of bunch of Bihari chachas and Odiya saahi lafangas. They are so charged of that even a mediocre goonda like Nanda Prusty is starting to rain blows on people thrice his size. Most of the people including chicks here are niggers and they can easily scare the hell out of Lara or Obama. They have the most famous the queen of english Miss ‘Shut Yr 'A' Up’ Tripathy and Mr. Dhoti Shaker Padhy, our very own dual meaning poet. I must not criticize much else Knee30 will send PCR to my home also !\n" +
                            "\n" +
                            "\n" +
                            "To be continued...............\n\n\n",0,R.color.colorAccent));
                    return word;
                }
                case 2: {
                   word.add(new Data("CodeAthon","Computer Science Department","In this event there will be 4 rounds and people will have to compete between each other to get some reward",0,R.color.colorAccent));
                    word.add(new Data("CVRCE HACKATHON","Computer Science Department","Quad Round event for all the Students of CVRCE",0,R.color.eventColor));

                    word.add(new Data("AUSSTELLUNG","Computer Science Department","Model exhibition cum competition\nThe aim of this event is to showcase the talent of the students through their projects\nAll the projects will be evaluated by a committee of experts.",0,R.color.contactColor));
                    return word;
                }
                case 3: {
                  word.add(new Data("Aakash Kumar Nanda","Student Co-Ordinators","7008313332\n",0,R.color.contactColor));
                   word.add(new Data("Soumya Ranjan Sahoo","Student Co-Ordinators","7008833912\n",0,R.color.colorAccent));
                    word.add(new Data("Aman Goel","Student Co-Ordinators","7008567793\n",0,R.color.eventColor));
                    word.add(new Data("Subhadarshi Panda ","Student Co-Ordinators","9853344237\n",0,R.color.homeColor));
                    return word;
                }
                default: return word;
            }
        }
    });

    public LiveData<ArrayList<Data>> getData() {
        return data;
    }

}


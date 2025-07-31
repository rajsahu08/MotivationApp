package com.rajsahu.motivationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String[] quotes = {
            "Believe in yourself and all that you are. You are capable of greatness.",
            "Push your limits every day to discover what you're truly capable of becoming.",
            "Dream big, stay focused, and make each day count toward your future goals.",
            "Success is the result of consistent effort, patience, and the will to continue.",
            "Great achievements are born from small, consistent actions repeated with determination daily.",
            "Hard work beats talent when talent refuses to work hard with discipline.",
            "You don’t have to be perfect, just consistent and always moving forward.",
            "Small steps taken every day can lead to big changes in your life.",
            "When you feel like quitting, remember why you started in the first place.",
            "Don't wait for the right time; create the right time with your actions.",
            "Discipline separates dreams from reality; stay focused and keep showing up daily.",
            "Never stop learning, because life never stops teaching or testing your resilience.",
            "Your mindset determines how far you'll go, not just your skill set.",
            "Success doesn’t happen overnight; it’s earned through dedication and relentless persistence.",
            "Even on your worst days, show up, try hard, and believe in progress.",
            "The only way to fail is to quit before you've even truly tried.",
            "Your potential is endless if you stay hungry, humble, and consistent every day.",
            "Stop doubting yourself. Start believing in the power of your consistency and growth.",
            "Every day is a fresh chance to become a better version of yourself.",
            "You are stronger than you think and braver than you ever believed possible.",
            "Comfort zones are where dreams go to die. Step out and chase growth.",
            "Effort matters more than excuses; keep grinding even when it's hard to see.",
            "You don’t have to be the best, just better than you were yesterday.",
            "Make today count by doing something your future self will thank you for.",
            "Discomfort is the price of growth. Embrace it and become who you’re meant to be.",
            "Stop fearing failure. Start fearing regret from never even trying your best.",
            "Focus on progress, not perfection. Keep going even when the steps feel small.",
            "Your success story starts the moment you refuse to give up trying.",
            "Energy flows where focus goes. Keep your eyes on your dreams, not distractions.",
            "You won’t always be motivated. That’s why you need to learn discipline daily.",
            "Take risks. If you win, you lead. If you fail, you learn.",
            "A little progress each day adds up to huge results over time.",
            "If you want different results, you must make different choices and actions.",
            "You get what you work for, not what you wish for daily.",
            "Discipline will take you places that motivation can’t even imagine reaching.",
            "You’re closer than you think. Don’t give up just before the breakthrough.",
            "Start where you are, use what you have, do what you can today.",
            "Winners aren’t lucky, they’re just more consistent and focused on their goals.",
            "The grind may be ugly, but the results are always worth it.",
            "Don’t be afraid of slow progress; fear standing still and never starting.",
            "Turn your pain into power and your dreams into plans with action.",
            "Be patient with yourself. Nothing worth achieving happens overnight without dedication.",
            "Nobody said it would be easy, but it’ll absolutely be worth it.",
            "Stop chasing approval and start chasing your goals like your life depends on it.",
            "You become what you do daily, not what you do occasionally.",
            "Success is built on failures, lessons, and the courage to try again.",
            "Keep grinding in silence. Let your results be your loudest statement.",
            "Fear is temporary. Regret is forever. Choose wisely and keep moving forward.",
            "You already have everything inside you to become the person you dream of.",
            "Nothing changes if nothing changes. Take action and rewrite your story today."
    };

    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView quoteText = findViewById(R.id.quoteText);
        Button quoteButton = findViewById(R.id.quoteButton);

        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index = (index+1)%quotes.length;
                quoteText.setText(quotes[index]);
            }
        });



    }
}
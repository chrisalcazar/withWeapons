package com.gorgonshank.manyfragments.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.gorgonshank.manyfragments.Data.CharacterData;
import com.gorgonshank.manyfragments.R;

public class CharacterEquipmentFragment extends Fragment {
    private static final String TAG = "SecondFragment";
    //ImageButtons for every item
    ImageButton ar1,ar2,ar3,s1,s2,s3,g1,g2,g3,shield,ib,ib2,ib3,ib4,ib5,ib6,
            //weapons
            axe1,axe2,axe3,bow1,bow2,bow3,dagger1,dagger2,dagger3,mace1,mace2,mace3,
            spear1,spear2,spear3,sword1,sword2,sword3,sword4,sword5,sword6;

    //EQUIP Buttons
    Button ea1,ea2,ea3,es1,es2,es3,eg1,eg2,eg3,eshield,
           //weapons
           eaxe1,eaxe2,eaxe3,ebow1,ebow2,ebow3,edagger1,edagger2,edagger3,emace1,emace2,emace3,
                   espear1,espear2,espear3,esword1,esword2,esword3,esword4,esword5,esword6;

    //Name of every item
    TextView ta1,ta2,ta3,ts1,ts2,ts3,tg1,tg2,tg3,tshield,
            //weapons
            taxe1,taxe2,taxe3,tbow1,tbow2,tbow3,tdagger1,tdagger2,tdagger3,tmace1,tmace2,tmace3,
                    tspear1,tspear2,tspear3,tsword1,tsword2,tsword3,tsword4,tsword5,tsword6;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_equipment, container, false);



        return v;
    }

    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        // Make sure that we are currently visible
        if (this.isVisible()) {
            // Method to change things when coming into focus
            onShowFragment();
            if (!isVisibleToUser) {
                // Method to change things when leaving focus
                onHideFragment();
            }
        }
    }

    public void onShowFragment() {

        //characterHP = (TextView) getView().findViewById(R.id.characterHP);
        String text = "myHitPoints: " + CharacterData.getSkill_points() + "/" + CharacterData.getMax_hit_points();
        //characterHP.setText(text);
    }

    public void onHideFragment() {

    }

    public static CharacterEquipmentFragment newInstance(String text) {

        CharacterEquipmentFragment f = new CharacterEquipmentFragment();
        Bundle b = new Bundle();
        b.putString("msg", text);

        f.setArguments(b);

        return f;
    }
}

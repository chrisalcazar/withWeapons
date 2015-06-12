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
        ib=(ImageButton)getActivity().findViewById(R.id.ib);
        ib2=(ImageButton)v.findViewById(R.id.ib2);
        ib3=(ImageButton)v.findViewById(R.id.ib3);
        ib4=(ImageButton)v.findViewById(R.id.ib4);
        ar1=(ImageButton)v.findViewById(R.id.chest1);
        ar2=(ImageButton)v.findViewById(R.id.chest2);
        ar3=(ImageButton)v.findViewById(R.id.chest3);
        s1=(ImageButton)v.findViewById(R.id.shoes1);
        s2=(ImageButton)v.findViewById(R.id.shoes2);
        s3=(ImageButton)v.findViewById(R.id.shoes3);
        g1=(ImageButton)v.findViewById(R.id.gloves1);
        g2=(ImageButton)v.findViewById(R.id.gloves2);
        g3=(ImageButton)v.findViewById(R.id.gloves3);
        shield=(ImageButton)v.findViewById(R.id.shield1);
        ta1=(TextView)v.findViewById(R.id.test1);
        ta2=(TextView)v.findViewById(R.id.test2);
        ta3=(TextView)v.findViewById(R.id.test3);
        ts1=(TextView)v.findViewById(R.id.test4);
        ts2=(TextView)v.findViewById(R.id.test5);
        ts3=(TextView)v.findViewById(R.id.test6);
        tg1=(TextView)v.findViewById(R.id.test7);
        tg2=(TextView)v.findViewById(R.id.test8);
        tg3=(TextView)v.findViewById(R.id.test9);
        tshield=(TextView)v.findViewById(R.id.test10);
        ea1=(Button)v.findViewById(R.id.eArmor1);
        ea2=(Button)v.findViewById(R.id.eArmor2);
        ea3=(Button)v.findViewById(R.id.eArmor3);
        es1=(Button)v.findViewById(R.id.eShoes1);
        es2=(Button)v.findViewById(R.id.eShoes2);
        es3=(Button)v.findViewById(R.id.eShoes3);
        eg1=(Button)v.findViewById(R.id.eGloves1);
        eg2=(Button)v.findViewById(R.id.eGloves2);
        eg3=(Button)v.findViewById(R.id.eGloves3);
        eshield=(Button)v.findViewById(R.id.eShield);

        //WEAPONS
        axe1=(ImageButton)v.findViewById(R.id.axe1);
        axe2=(ImageButton)v.findViewById(R.id.axe2);
        axe3=(ImageButton)v.findViewById(R.id.axe3);
        bow1=(ImageButton)v.findViewById(R.id.bow1);
        bow2=(ImageButton)v.findViewById(R.id.bow2);
        bow3=(ImageButton)v.findViewById(R.id.bow3);
        dagger1=(ImageButton)v.findViewById(R.id.dagger1);
        dagger2=(ImageButton)v.findViewById(R.id.dagger2);
        dagger3=(ImageButton)v.findViewById(R.id.dagger3);
        mace1=(ImageButton)v.findViewById(R.id.mace1);
        mace2=(ImageButton)v.findViewById(R.id.mace2);
        mace3=(ImageButton)v.findViewById(R.id.mace3);
        spear1=(ImageButton)v.findViewById(R.id.spear1);
        spear2=(ImageButton)v.findViewById(R.id.spear2);
        spear3=(ImageButton)v.findViewById(R.id.spear3);
        sword1=(ImageButton)v.findViewById(R.id.sword1);
        sword2=(ImageButton)v.findViewById(R.id.sword2);
        sword3=(ImageButton)v.findViewById(R.id.sword3);
        sword4=(ImageButton)v.findViewById(R.id.sword4);
        sword5=(ImageButton)v.findViewById(R.id.sword5);
        sword6=(ImageButton)v.findViewById(R.id.sword6);
        taxe1=(TextView)v.findViewById(R.id.test11);
        taxe2=(TextView)v.findViewById(R.id.test12);
        taxe3=(TextView)v.findViewById(R.id.test13);
        tbow1=(TextView)v.findViewById(R.id.test14);
        tbow2=(TextView)v.findViewById(R.id.test15);
        tbow3=(TextView)v.findViewById(R.id.test16);
        tdagger1=(TextView)v.findViewById(R.id.test17);
        tdagger2=(TextView)v.findViewById(R.id.test18);
        tdagger3=(TextView)v.findViewById(R.id.test19);
        tmace1=(TextView)v.findViewById(R.id.test20);
        tmace2=(TextView)v.findViewById(R.id.test21);
        tmace3=(TextView)v.findViewById(R.id.test22);
        tspear1=(TextView)v.findViewById(R.id.test23);
        tspear2=(TextView)v.findViewById(R.id.test24);
        tspear3=(TextView)v.findViewById(R.id.test25);
        tsword1=(TextView)v.findViewById(R.id.test26);
        tsword2=(TextView)v.findViewById(R.id.test27);
        tsword3=(TextView)v.findViewById(R.id.test28);
        tsword4=(TextView)v.findViewById(R.id.test29);
        tsword5=(TextView)v.findViewById(R.id.test30);
        tsword6=(TextView)v.findViewById(R.id.test31);
        eaxe1=(Button)v.findViewById(R.id.eAxe1);
        eaxe2=(Button)v.findViewById(R.id.eAxe2);
        eaxe3=(Button)v.findViewById(R.id.eAxe3);
        ebow1=(Button)v.findViewById(R.id.eBow1);
        ebow2=(Button)v.findViewById(R.id.eBow2);
        ebow3=(Button)v.findViewById(R.id.eBow3);
        edagger1=(Button)v.findViewById(R.id.eDagger1);
        edagger2=(Button)v.findViewById(R.id.eDagger2);
        edagger3=(Button)v.findViewById(R.id.eDagger3);
        emace1=(Button)v.findViewById(R.id.emace1);
        emace2=(Button)v.findViewById(R.id.emace2);
        emace3=(Button)v.findViewById(R.id.emace3);
        espear1=(Button)v.findViewById(R.id.espear1);
        espear2=(Button)v.findViewById(R.id.espear2);
        espear3=(Button)v.findViewById(R.id.espear3);
        esword1=(Button)v.findViewById(R.id.esword1);
        esword2=(Button)v.findViewById(R.id.esword2);
        esword3=(Button)v.findViewById(R.id.esword3);
        esword4=(Button)v.findViewById(R.id.esword4);
        esword5=(Button)v.findViewById(R.id.esword5);
        esword6=(Button)v.findViewById(R.id.esword6);

        //TextView tv = (TextView) v.findViewById(R.id.tvFragSecond);
        //tv.setText(getArguments().getString("msg"));




        ar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /*Integer test = 2;
                ImageButton ar1 = (ImageButton)v;
                if(test==1){
                if(ta1.getVisibility()==View.GONE) {
                    ta1.setVisibility(View.VISIBLE);
                    ea1.setVisibility(View.VISIBLE);
                }else{
                    ta1.setVisibility(View.GONE);
                    ea1.setVisibility(View.GONE);
                }}else{
                    Toast.makeText(getActivity(), "Not in inventory", Toast.LENGTH_LONG ).show();
                }*/
                if(ta1.getVisibility()==View.GONE) {
                    ta1.setVisibility(View.VISIBLE);
                    ea1.setVisibility(View.VISIBLE);
                }else{
                    ta1.setVisibility(View.GONE);
                    ea1.setVisibility(View.GONE);
                }

            }
        });
        ar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if(ta2.getVisibility()==View.GONE) {
                    ta2.setVisibility(View.VISIBLE);
                    ea2.setVisibility(View.VISIBLE);
                }else{
                    ta2.setVisibility(View.GONE);
                    ea2.setVisibility(View.GONE);
                }
            }
        });
        ar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ta3.getVisibility()==View.GONE) {
                    ta3.setVisibility(View.VISIBLE);
                    ea3.setVisibility(View.VISIBLE);
                }else{
                    ta3.setVisibility(View.GONE);
                    ea3.setVisibility(View.GONE);
                }
            }
        });
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts1.getVisibility()==View.GONE) {
                    ts1.setVisibility(View.VISIBLE);
                    es1.setVisibility(View.VISIBLE);
                }else{
                    ts1.setVisibility(View.GONE);
                    es1.setVisibility(View.GONE);
                }
            }
        });
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts2.getVisibility()==View.GONE) {
                    ts2.setVisibility(View.VISIBLE);
                    es2.setVisibility(View.VISIBLE);
                }else{
                    ts2.setVisibility(View.GONE);
                    es2.setVisibility(View.GONE);
                }
            }
        });
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(ts3.getVisibility()==View.GONE) {
                    ts3.setVisibility(View.VISIBLE);
                    es3.setVisibility(View.VISIBLE);
                }else{
                    ts3.setVisibility(View.GONE);
                    es3.setVisibility(View.GONE);
                }
            }
        });
        g1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg1.getVisibility()==View.GONE) {
                    tg1.setVisibility(View.VISIBLE);
                    eg1.setVisibility(View.VISIBLE);
                }else{
                    tg1.setVisibility(View.GONE);
                    eg1.setVisibility(View.GONE);
                }
            }
        });
        g2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg2.getVisibility()==View.GONE) {
                    tg2.setVisibility(View.VISIBLE);
                    eg2.setVisibility(View.VISIBLE);
                }else{
                    tg2.setVisibility(View.GONE);
                    eg2.setVisibility(View.GONE);
                }
            }
        });
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tg3.getVisibility()==View.GONE) {
                    tg3.setVisibility(View.VISIBLE);
                    eg3.setVisibility(View.VISIBLE);
                }else{
                    tg3.setVisibility(View.GONE);
                    eg3.setVisibility(View.GONE);
                }
            }
        });
        shield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ImageButton ar1 = (ImageButton)v;
                if(tshield.getVisibility()==View.GONE) {
                    tshield.setVisibility(View.VISIBLE);
                    eshield.setVisibility(View.VISIBLE);
                }else{
                    tshield.setVisibility(View.GONE);
                    eshield.setVisibility(View.GONE);
                }
            }
        });

        ea1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
               /* Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("image",R.drawable.armor1);
                intent.putExtras(bundle);
                startActivity(intent);*/
                ib.setImageResource(R.drawable.armor1);
                Toast.makeText(getActivity(), "Equipped", Toast.LENGTH_LONG ).show();
            }
        });
        ea2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /*Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("armor2",R.drawable.armor2);
                intent.putExtras(bundle);
                startActivity(intent);*/

                ib.setImageResource(R.drawable.armor2);
                Toast.makeText(getActivity(), "Equipped", Toast.LENGTH_LONG ).show();
            }
        });
        ea3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /*Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("armor3",R.drawable.armor3);
                intent.putExtras(bundle);
                startActivity(intent);*/
            }
        });
        es1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /*Intent intent=new Intent(Equipment.this, Character.class);
                Bundle bundle=new Bundle();
                bundle.putInt("shoes1",R.drawable.shoes1);
                intent.putExtras(bundle);
                startActivity(intent);*/
            }
        });
        es2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                //ib2=(ImageButton)findViewById(R.id.ib2);
                //ib2.setImageResource(R.drawable.shoes2);
            }
        });
        es3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                //ib2=(ImageButton)findViewById(R.id.ib2);
                //ib2.setImageResource(R.drawable.shoes3);
            }
        });
        eg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                //ib3=(ImageButton)findViewById(R.id.ib3);
                //ib3.setImageResource(R.drawable.gloves1);
            }
        });
        eg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                ///ib3=(ImageButton)findViewById(R.id.ib3);
                //ib3.setImageResource(R.drawable.gloves2);
            }
        });
        eg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                //ib3=(ImageButton)findViewById(R.id.ib3);
                //ib3.setImageResource(R.drawable.gloves3);
            }
        });
        eshield.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //setContentView(R.layout.character);
                //ib4=(ImageButton)v.findViewById(R.id.ib4);
                //ib4.setImageResource(R.drawable.shield1);
            }
        });


        //WEAPONS
        axe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(taxe1.getVisibility()==View.GONE) {
                    taxe1.setVisibility(View.VISIBLE);
                    eaxe1.setVisibility(View.VISIBLE);
                }else{
                    taxe1.setVisibility(View.GONE);
                    eaxe1.setVisibility(View.GONE);
                }
            }
        });
        axe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(taxe2.getVisibility()==View.GONE) {
                    taxe2.setVisibility(View.VISIBLE);
                    eaxe2.setVisibility(View.VISIBLE);
                }else{
                    taxe2.setVisibility(View.GONE);
                    eaxe2.setVisibility(View.GONE);
                }
            }
        });
        axe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(taxe3.getVisibility()==View.GONE) {
                    taxe3.setVisibility(View.VISIBLE);
                    eaxe3.setVisibility(View.VISIBLE);
                }else{
                    taxe3.setVisibility(View.GONE);
                    eaxe3.setVisibility(View.GONE);
                }
            }
        });
        bow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tbow1.getVisibility()==View.GONE) {
                    tbow1.setVisibility(View.VISIBLE);
                    ebow1.setVisibility(View.VISIBLE);
                }else{
                    tbow1.setVisibility(View.GONE);
                    ebow1.setVisibility(View.GONE);
                }
            }
        });
        bow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tbow2.getVisibility()==View.GONE) {
                    tbow2.setVisibility(View.VISIBLE);
                    ebow2.setVisibility(View.VISIBLE);
                }else{
                    tbow2.setVisibility(View.GONE);
                    ebow2.setVisibility(View.GONE);
                }
            }
        });
        bow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tbow3.getVisibility()==View.GONE) {
                    tbow3.setVisibility(View.VISIBLE);
                    ebow3.setVisibility(View.VISIBLE);
                }else{
                    tbow3.setVisibility(View.GONE);
                    ebow3.setVisibility(View.GONE);
                }
            }
        });
        dagger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tdagger1.getVisibility()==View.GONE) {
                    tdagger1.setVisibility(View.VISIBLE);
                    edagger1.setVisibility(View.VISIBLE);
                }else{
                    tdagger1.setVisibility(View.GONE);
                    edagger1.setVisibility(View.GONE);
                }
            }
        });
        dagger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tdagger2.getVisibility()==View.GONE) {
                    tdagger2.setVisibility(View.VISIBLE);
                    edagger2.setVisibility(View.VISIBLE);
                }else{
                    tdagger2.setVisibility(View.GONE);
                    edagger2.setVisibility(View.GONE);
                }
            }
        });
        dagger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tdagger3.getVisibility()==View.GONE) {
                    tdagger3.setVisibility(View.VISIBLE);
                    edagger3.setVisibility(View.VISIBLE);
                }else{
                    tdagger3.setVisibility(View.GONE);
                    edagger3.setVisibility(View.GONE);
                }
            }
        });
        mace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tmace1.getVisibility()==View.GONE) {
                    tmace1.setVisibility(View.VISIBLE);
                    emace1.setVisibility(View.VISIBLE);
                }else{
                    tmace1.setVisibility(View.GONE);
                    emace1.setVisibility(View.GONE);
                }
            }
        });
        mace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tmace2.getVisibility()==View.GONE) {
                    tmace2.setVisibility(View.VISIBLE);
                    emace2.setVisibility(View.VISIBLE);
                }else{
                    tmace2.setVisibility(View.GONE);
                    emace2.setVisibility(View.GONE);
                }
            }
        });
        mace3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tmace3.getVisibility()==View.GONE) {
                    tmace3.setVisibility(View.VISIBLE);
                    emace3.setVisibility(View.VISIBLE);
                }else{
                    tmace3.setVisibility(View.GONE);
                    emace3.setVisibility(View.GONE);
                }
            }
        });
        spear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tspear1.getVisibility()==View.GONE) {
                    tspear1.setVisibility(View.VISIBLE);
                    espear1.setVisibility(View.VISIBLE);
                }else{
                    tspear1.setVisibility(View.GONE);
                    espear1.setVisibility(View.GONE);
                }
            }
        });
        spear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tspear2.getVisibility()==View.GONE) {
                    tspear2.setVisibility(View.VISIBLE);
                    espear2.setVisibility(View.VISIBLE);
                }else{
                    tspear2.setVisibility(View.GONE);
                    espear2.setVisibility(View.GONE);
                }
            }
        });
        spear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tspear3.getVisibility()==View.GONE) {
                    tspear3.setVisibility(View.VISIBLE);
                    espear3.setVisibility(View.VISIBLE);
                }else{
                    tspear3.setVisibility(View.GONE);
                    espear3.setVisibility(View.GONE);
                }
            }
        });
        sword1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword1.getVisibility()==View.GONE) {
                    tsword1.setVisibility(View.VISIBLE);
                    esword1.setVisibility(View.VISIBLE);
                }else{
                    tsword1.setVisibility(View.GONE);
                    esword1.setVisibility(View.GONE);
                }
            }
        });
        sword2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword2.getVisibility()==View.GONE) {
                    tsword2.setVisibility(View.VISIBLE);
                    esword2.setVisibility(View.VISIBLE);
                }else{
                    tsword2.setVisibility(View.GONE);
                    esword2.setVisibility(View.GONE);
                }
            }
        });
        sword3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword3.getVisibility()==View.GONE) {
                    tsword3.setVisibility(View.VISIBLE);
                    esword3.setVisibility(View.VISIBLE);
                }else{
                    tsword3.setVisibility(View.GONE);
                    esword3.setVisibility(View.GONE);
                }
            }
        });
        sword4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword4.getVisibility()==View.GONE) {
                    tsword4.setVisibility(View.VISIBLE);
                    esword4.setVisibility(View.VISIBLE);
                }else{
                    tsword4.setVisibility(View.GONE);
                    esword4.setVisibility(View.GONE);
                }
            }
        });
        sword5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword5.getVisibility()==View.GONE) {
                    tsword5.setVisibility(View.VISIBLE);
                    esword5.setVisibility(View.VISIBLE);
                }else{
                    tsword5.setVisibility(View.GONE);
                    esword5.setVisibility(View.GONE);
                }
            }
        });
        sword6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(tsword6.getVisibility()==View.GONE) {
                    tsword6.setVisibility(View.VISIBLE);
                    esword6.setVisibility(View.VISIBLE);
                }else{
                    tsword6.setVisibility(View.GONE);
                    esword6.setVisibility(View.GONE);
                }
            }
        });

        //placeholder for equipping stuff
        eaxe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        eaxe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        eaxe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        ebow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        ebow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        ebow3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        edagger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        edagger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        edagger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        emace1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        emace2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        emace3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        espear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        espear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        espear3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });
        esword6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
            }
        });


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

package com.example.agribdcu;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CameraActivity extends Activity {

	Button match, click;
	TextView tx;
	ImageView pict, picdata;

	private Bitmap bmcamerapic;
	private Bitmap blacka, blackb; // paddy
	private Bitmap nutria, nutrib;// paddy
	private Bitmap dowmila, dowmilb;// cabbage
	private Bitmap mang, nit, bor;// Cabbage
	private Bitmap flbta, flbtb;// Eggplant
	private Bitmap mita, mitb, mitc;// Eggplant
	private Bitmap blight, blighta;// potato

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_camera);

		tx = (TextView) findViewById(R.id.textpersen);

		pict = (ImageView) findViewById(R.id.imagedisleaf);

		match = (Button) findViewById(R.id.buttonmatch);
		click = (Button) findViewById(R.id.buttoncapture);

		match.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				match();

			}
		});

		click.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

				startActivityForResult(intent, 0);
			}
		});
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Bitmap bm = (Bitmap) data.getExtras().get("data");
		pict.setImageBitmap(bm);
	}

	protected void match() {

		// paddy 1
		blacka = BitmapFactory.decodeResource(getResources(),
				R.drawable.blackkernela);
		blackb = BitmapFactory.decodeResource(getResources(),
				R.drawable.blackkernelb);

		// paddy 2
		nutria = BitmapFactory.decodeResource(getResources(),
				R.drawable.nutrienta);

		nutrib = BitmapFactory.decodeResource(getResources(),
				R.drawable.nutrientb);

		// cabbage 1
		dowmila = BitmapFactory.decodeResource(getResources(),
				R.drawable.downymildew);
		dowmilb = BitmapFactory.decodeResource(getResources(),
				R.drawable.downymildewa);

		// cabbage 2
		mang = BitmapFactory.decodeResource(getResources(),
				R.drawable.magnesium);

		bor = BitmapFactory.decodeResource(getResources(), R.drawable.boron);
		nit = BitmapFactory.decodeResource(getResources(), R.drawable.nitrigen);

		// eggplant 1
		flbta = BitmapFactory.decodeResource(getResources(), R.drawable.fleaa);
		flbtb = BitmapFactory.decodeResource(getResources(), R.drawable.fleab);

		// eggplant 2
		mita = BitmapFactory.decodeResource(getResources(), R.drawable.mitesa);
		mitb = BitmapFactory.decodeResource(getResources(), R.drawable.mitesb);
		mitc = BitmapFactory.decodeResource(getResources(), R.drawable.mitesc);

		// potato 1
		blight = BitmapFactory.decodeResource(getResources(),
				R.drawable.blightleaf);
		blighta = BitmapFactory.decodeResource(getResources(),
				R.drawable.blightleafa);

		// camera picture
		bmcamerapic = ((BitmapDrawable) pict.getDrawable()).getBitmap();

		// cam picture
		int m = 0, n = 0;
		int colorcam = bmcamerapic.getPixel(m, n);
		int rcam = Color.red(colorcam);
		int gcam = Color.green(colorcam);
		int bcam = Color.blue(colorcam);

		// ///////////////////////////////////////////////////////////////////
		// //////////////////////////////////////////////////////////////////
		// /////////////////////////////////////////////////////////////////

		// get pixel Black Kernala
		int blkx1 = 0, blky1 = 0;
		int colorblackkernala = blacka.getPixel(blkx1, blky1);
		int blkr1 = Color.red(colorblackkernala);
		int blkg1 = Color.green(colorblackkernala);
		int blkb1 = Color.blue(colorblackkernala);

		// get pixel Black Kernalb
		int blkx2 = 0, blky2 = 0;
		int colorblackkernalb = blackb.getPixel(blkx2, blkx2);
		int blkr2 = Color.red(colorblackkernalb);
		int blkg2 = Color.green(colorblackkernalb);
		int blkb2 = Color.blue(colorblackkernalb);

		// get pixel nutrienta
		int nutx1 = 0, nuty1 = 0;
		int colornutrienta = nutria.getPixel(blkx1, blky1);
		int nutr1 = Color.red(colornutrienta);
		int nutg1 = Color.green(colornutrienta);
		int nutb1 = Color.blue(colornutrienta);

		// get pixel nutrientb
		int nutx2 = 0, nuty2 = 0;
		int colornutrientb = nutrib.getPixel(blkx2, blky2);
		int nutr2 = Color.red(colornutrientb);
		int nutg2 = Color.green(colornutrientb);
		int nutb2 = Color.blue(colornutrientb);

		// get pixel downymildwaya
		int downx1 = 0;
		int downy1 = 0;
		int downymildewacolor = dowmila.getPixel(downx1, downy1);
		int downmidr1 = Color.red(downymildewacolor);
		int downmidg1 = Color.green(downymildewacolor);
		int downmidb1 = Color.blue(downymildewacolor);

		// get pixel downymildwayb
		int downx2 = 0;
		int downy2 = 0;
		int downymildewbcolor = dowmilb.getPixel(downx2, downy2);
		int downmidr2 = Color.red(downymildewbcolor);
		int downmidg2 = Color.green(downymildewbcolor);
		int downmidb2 = Color.blue(downymildewbcolor);

		// get pixel magnisium
		int magx = 0;
		int magy = 0;
		int mangnesiumcolor = mang.getPixel(magx, magy);
		int magr1 = Color.red(mangnesiumcolor);
		int magg1 = Color.green(mangnesiumcolor);
		int magb1 = Color.blue(mangnesiumcolor);

		// get pixel boron
		int borx = 0;
		int bory = 0;
		int boroncolor = bor.getPixel(borx, bory);
		int borr4 = Color.red(boroncolor);
		int borg4 = Color.green(boroncolor);
		int borb4 = Color.blue(boroncolor);

		// get pixel nitrogen
		int nitx = 0;
		int nity = 0;
		int nitrogencolor = nit.getPixel(nitx, nity);
		int nitr5 = Color.red(nitrogencolor);
		int nitg5 = Color.green(nitrogencolor);
		int nitb5 = Color.blue(nitrogencolor);

		// get pixel flea1
		int flex = 0;
		int fley = 0;
		int fleaacolor = flbta.getPixel(flex, fley);
		int flear = Color.red(fleaacolor);
		int fleag = Color.green(fleaacolor);
		int fleab = Color.blue(fleaacolor);

		// get pixel flea2
		int fle1x = 0;
		int fle1y = 0;
		int fleabcolor = flbtb.getPixel(fle1x, fle1y);
		int flear1 = Color.red(fleabcolor);
		int fleag1 = Color.green(fleabcolor);
		int fleab1 = Color.blue(fleabcolor);

		// get pixel mites1
		int mitx = 0;
		int mity = 0;
		int mitescolor1 = mita.getPixel(mitx, mity);
		int mitesr1 = Color.red(mitescolor1);
		int mitesg1 = Color.green(mitescolor1);
		int mitesb1 = Color.blue(mitescolor1);

		// get pixel mites2
		int mit2x = 0;
		int mit2y = 0;
		int mitesacolor = mitb.getPixel(mit2x, mit2y);
		int mitesr2 = Color.red(mitesacolor);
		int mitesg2 = Color.green(mitesacolor);
		int mitesb2 = Color.blue(mitesacolor);

		// get pixel mites3
		int mit3x = 0;
		int mit3y = 0;
		int mitesbcolor = mitc.getPixel(mit3x, mit3y);
		int mitesr3 = Color.red(mitesbcolor);
		int mitesg3 = Color.green(mitesbcolor);
		int mitesb3 = Color.blue(mitesbcolor);

		// get pixel blight1
		int bli1x = 0;
		int bli1y = 0;
		int blightleafcolor = blight.getPixel(bli1x, bli1y);
		int blightr1 = Color.red(blightleafcolor);
		int blightg1 = Color.green(blightleafcolor);
		int blightb1 = Color.blue(blightleafcolor);

		// get pixel blight2
		int bli2x = 0;
		int bli2y = 0;
		int blightleafacolor = blighta.getPixel(bli2x, bli2y);
		int blightr2 = Color.red(blightleafacolor);
		int blightg2 = Color.green(blightleafacolor);
		int blightb2 = Color.blue(blightleafacolor);

		// ///////////////////////////////////////////////////////
		// //////////////////////////////////////////////////////
		// /////////////////////////////////////////////////////

		// difference between BLACK KERNAL(paddy):a- camera pic
		int blkRedA = Math.abs(blkr1 - rcam);
		int blkGreenA = Math.abs(blkg1 - gcam);
		int blkBlueA = Math.abs(blkb1 - bcam);
		// difference between BLACK KERNAL(paddy):b- camera pic
		int blkRedB = Math.abs(blkr2 - rcam);
		int blkGreenB = Math.abs(blkg2 - gcam);
		int blkBlueB = Math.abs(blkb2 - bcam);

		// difference between Calcium Deficiency(paddy):a- camera pic
		int calcRed = Math.abs(nutr1 - rcam);
		int calcGreen = Math.abs(nutg1 - gcam);
		int calcblue = Math.abs(nutb1 - bcam);

		// difference between magnesium Deficiency(paddy):b- camera pic
		int mangaRed = Math.abs(nutr2 - rcam);
		int mangaGreen = Math.abs(nutg2 - gcam);
		int mangablue = Math.abs(nutb2 - bcam);

		// difference pic downy midway(cabbage):a and camera picture
		int diffMIDWAYaRed = Math.abs(downmidr1 - rcam);
		int diffMIDWAYaGreen = Math.abs(downmidg1 - gcam);
		int diffMIDWAYaBlue = Math.abs(downmidb1 - bcam);
		// difference pic downy midway(cabbage):b and camera picture
		int diffMIDWAYbRed = Math.abs(downmidr2 - rcam);
		int diffMIDWAYbGreen = Math.abs(downmidg2 - gcam);
		int diffMIDWAYbBlue = Math.abs(downmidb2 - bcam);

		// difference pic magnesium(cabbage): a and camera picture
		int diffmagRed = Math.abs(magr1 - rcam);
		int diffmagGreen = Math.abs(magg1 - gcam);
		int diffmagBlue = Math.abs(magb1 - bcam);

		// difference pic boron(cabbage): d and camera picture
		int diffborRed = Math.abs(borr4 - rcam);
		int diffborGreen = Math.abs(borg4 - gcam);
		int diffborBlue = Math.abs(borb4 - bcam);
		// difference pic nitrogen(cabbage): e and camera picture
		int diffnitRed = Math.abs(nitr5 - rcam);
		int diffnitGreen = Math.abs(nitg5 - gcam);
		int diffnitBlue = Math.abs(nitb5 - bcam);

		// difference pic flea beetles(eggplant) :a and camera picture
		int diffFLEA1Red = Math.abs(flear - rcam);
		int diffFLEA1Green = Math.abs(fleag - gcam);
		int diffFLEA1Blue = Math.abs(fleab - bcam);
		// difference pic flea beetles(eggplant) :b and camera picture
		int diffFLEA2Red = Math.abs(flear1 - rcam);
		int diffFLEA2Green = Math.abs(fleag1 - gcam);
		int diffFLEA2Blue = Math.abs(fleab1 - bcam);

		// difference pic mites(eggplant):a and camera picture
		int diffMITES1Red = Math.abs(mitesr1 - rcam);
		int diffMITES1Green = Math.abs(mitesg1 - gcam);
		int diffMITES1Blue = Math.abs(mitesb1 - bcam);
		// difference pic mites(eggplant):b and camera picture
		int diffMITES2Red = Math.abs(mitesr2 - rcam);
		int diffMITES2Green = Math.abs(mitesg2 - gcam);
		int diffMITES2Blue = Math.abs(mitesb2 - bcam);
		// difference pic mites(eggplant):c and camera picture
		int diffMITES3Red = Math.abs(mitesr3 - rcam);
		int diffMITES3Green = Math.abs(mitesg3 - gcam);
		int diffMITES3Blue = Math.abs(mitesb3 - bcam);

		// difference pic blight leaf(potato):a and camera picture
		int diffBLIGHT1Red = Math.abs(blightr1 - rcam);
		int diffBLIGHT1Green = Math.abs(blightg1 - gcam);
		int diffBLIGHT1Blue = Math.abs(blightb1 - bcam);
		// difference pic blight leaf(potato):b and camera picture
		int diffBLIGHT2Red = Math.abs(blightr2 - rcam);
		int diffBLIGHT2Green = Math.abs(blightg2 - gcam);
		int diffBLIGHT2Blue = Math.abs(blightb2 - bcam);

		// //////////////////////////////////////////////////////
		// /////////////////////////////////////////////////////
		// ////////////////////////////////////////////////////

		// average compare with BLACK KERNAL(paddy) :a
		float pctDiffBLKReda = (float) blkRedA / 255;
		float pctDiffBLKGreena = (float) blkGreenA / 255;
		float pctDiffBLKBluea = (float) blkBlueA / 255;
		float matchBLKa = (pctDiffBLKReda + pctDiffBLKGreena + pctDiffBLKBluea) / 3 * 100;
		// average compare with BLACK KERNAL(paddy) :b
		float pctDiffBLKRedb = (float) blkRedB / 255;
		float pctDiffBLKGreenb = (float) blkGreenB / 255;
		float pctDiffBLKBlueb = (float) blkBlueB / 255;
		float matchBLKb = (pctDiffBLKRedb + pctDiffBLKGreenb + pctDiffBLKBlueb) / 3 * 100;

		// average compare with calcium(paddy) :a
		float pctcalcReda = (float) calcRed / 255;
		float pctcalcGreena = (float) calcGreen / 255;
		float pctcalcBluea = (float) calcblue / 255;
		float matchcalc = (pctcalcReda + pctcalcGreena + pctcalcBluea) / 3 * 100;

		// average compare with magnesium (paddy) :b
		float pctmangRedb = (float) mangaRed / 255;
		float pctmangGreenb = (float) mangaGreen / 255;
		float pctmangBlueb = (float) mangablue / 255;
		float matchmang = (pctmangRedb + pctmangGreenb + pctmangBlueb) / 3 * 100;

		// average compare with [DOWN MIDWAY](cabbage) picture
		float pctMIDWAYDiffReda = (float) diffMIDWAYaRed / 255;
		float pctMIDWAYDiffGreena = (float) diffMIDWAYaGreen / 255;
		float pctMIDWAYDiffBluea = (float) diffMIDWAYaBlue / 255;
		float DOWNMIDWAYa = (pctMIDWAYDiffReda + pctMIDWAYDiffGreena + pctMIDWAYDiffBluea) / 3 * 100;
		// average compare with [DOWN MIDWAY](cabbage) picture
		float pctMIDWAYDiffRedb = (float) diffMIDWAYbRed / 255;
		float pctMIDWAYDiffGreenb = (float) diffMIDWAYbGreen / 255;
		float pctMIDWAYDiffBlueb = (float) diffMIDWAYbBlue / 255;
		float DOWNMIDWAYb = (pctMIDWAYDiffRedb + pctMIDWAYDiffGreenb + pctMIDWAYDiffBlueb) / 3 * 100;

		// avarage compare with [MAGNISIUM](cabbage):a picture
		float pctMAGDiffRed = (float) diffmagRed / 255;
		float pctMAGDiffGreen = (float) diffmagGreen / 255;
		float pctMAGDiffBlue = (float) diffmagBlue / 255;
		float MAGNISIUM = (pctMAGDiffRed + pctMAGDiffGreen + pctMAGDiffBlue) / 3 * 100;

		float pctBORDiffRed = (float) diffborRed / 255;
		float pctBORDiffGreen = (float) diffborGreen / 255;
		float pctBORDiffBlue = (float) diffborBlue / 255;
		float BORON = (pctBORDiffRed + pctBORDiffGreen + pctBORDiffBlue) / 3 * 100;
		// avarage compare with [MAGNISIUM](cabbage):e picture
		float pctNITDiffRed = (float) diffnitRed / 255;
		float pctNITDiffGreen = (float) diffnitGreen / 255;
		float pctNITDiffBlue = (float) diffnitBlue / 255;
		float NITROGEN = (pctNITDiffRed + pctNITDiffGreen + pctNITDiffBlue) / 3 * 100;

		// avarage compare with [FLEA BEETLES](eggplant) :a picture
		float pctFLEA1DiffRed = (float) diffFLEA1Red / 255;
		float pctFLEA1DiffGreen = (float) diffFLEA1Green / 255;
		float pctFLEA1DiffBlue = (float) diffFLEA1Blue / 255;
		float FLEA1 = (pctFLEA1DiffRed + pctFLEA1DiffGreen + pctFLEA1DiffBlue) / 3 * 100;
		// avarage compare with [FLEA BEETLES](eggplant) :b picture
		float pctFLEA2DiffRed = (float) diffFLEA2Red / 255;
		float pctFLEA2DiffGreen = (float) diffFLEA2Green / 255;
		float pctFLEA2DiffBlue = (float) diffFLEA2Blue / 255;
		float FLEA2 = (pctFLEA2DiffRed + pctFLEA2DiffGreen + pctFLEA2DiffBlue) / 3 * 100;

		// avarage compare with [MITES](egglpant):a picture
		float pctMITE1DiffRed = (float) diffMITES1Red / 255;
		float pctMITE1DiffGreen = (float) diffMITES1Green / 255;
		float pctMITE1DiffBlue = (float) diffMITES1Blue / 255;
		float MITES1 = (pctMITE1DiffRed + pctMITE1DiffGreen + pctMITE1DiffBlue) / 3 * 100;
		// avarage compare with [MITES](eggplant):b picture
		float pctMITE2DiffRed = (float) diffMITES2Red / 255;
		float pctMITE2DiffGreen = (float) diffMITES2Green / 255;
		float pctMITE2DiffBlue = (float) diffMITES2Blue / 255;
		float MITES2 = (pctMITE2DiffRed + pctMITE2DiffGreen + pctMITE2DiffBlue) / 3 * 100;
		// avarage compare with [MITES](eggplant):c picture
		float pctMITE3DiffRed = (float) diffMITES3Red / 255;
		float pctMITE3DiffGreen = (float) diffMITES3Green / 255;
		float pctMITE3DiffBlue = (float) diffMITES3Blue / 255;
		float MITES3 = (pctMITE3DiffRed + pctMITE3DiffGreen + pctMITE3DiffBlue) / 3 * 100;

		// avarage compare with [BLIGHT LEAF](potato):a picture
		float pctBLIGHT1DiffRed = (float) diffBLIGHT1Red / 255;
		float pctBLIGHT1DiffGreen = (float) diffBLIGHT1Green / 255;
		float pctBLIGHT1DiffBlue = (float) diffBLIGHT1Blue / 255;
		float BLIGHT1 = (pctBLIGHT1DiffRed + pctBLIGHT1DiffGreen + pctBLIGHT1DiffBlue) / 3 * 100;
		// avarage compare with [BLIGHT LEAF](potato):b picture
		float pctBLIGHT2DiffRed = (float) diffBLIGHT2Red / 255;
		float pctBLIGHT2DiffGreen = (float) diffBLIGHT2Green / 255;
		float pctBLIGHT2DiffBlue = (float) diffBLIGHT2Blue / 255;
		float BLIGHT2 = (pctBLIGHT2DiffRed + pctBLIGHT2DiffGreen + pctBLIGHT2DiffBlue) / 3 * 100;

		// ///////////////////////////////////
		// //////////////////////////////////
		// ///////////////////////////////////

		if (       matchBLKa <= matchBLKb    && matchBLKa <= matchcalc
				&& matchBLKa <= matchmang    && matchBLKa <= DOWNMIDWAYa
				&& matchBLKa <= DOWNMIDWAYb  && matchBLKa <= MAGNISIUM
				&& matchBLKa <= BORON        && matchBLKa <= NITROGEN
				&& matchBLKa <= FLEA1        && matchBLKa <= FLEA2
				&& matchBLKa <= MITES1       && matchBLKa <= MITES2
				&& matchBLKa <= MITES3       && matchBLKa <= BLIGHT1
				&& matchBLKa <= BLIGHT2)
		{
			                   tx.setText("BLACKKERNAL (paddy)");

		}

		
		else if (matchBLKb <= matchBLKa

		&& matchBLKb <= matchcalc && matchBLKb <= matchmang

		&& matchBLKb <= DOWNMIDWAYa && matchBLKb <= DOWNMIDWAYb

		&& matchBLKb <= MAGNISIUM && matchBLKb <= BORON
				&& matchBLKb <= NITROGEN && matchBLKb <= FLEA1
				&& matchBLKb <= FLEA2

				&& matchBLKb <= MITES1 && matchBLKb <= MITES2
				&& matchBLKb <= MITES3 && matchBLKb <= BLIGHT1
				&& matchBLKb <= BLIGHT2

		) {
			tx.setText("BLACKKERNAL (paddy)");
		}

		else if (matchcalc <= matchBLKa && matchcalc <= matchBLKb
				&& matchcalc <= matchmang && matchcalc <= DOWNMIDWAYa
				&& matchcalc <= DOWNMIDWAYb

				&& matchcalc <= MAGNISIUM && matchcalc <= BORON
				&& matchcalc <= NITROGEN && matchcalc <= FLEA1
				&& matchcalc <= FLEA2

				&& matchcalc <= MITES1 && matchcalc <= MITES2
				&& matchcalc <= MITES3 && matchcalc <= BLIGHT1
				&& matchcalc <= BLIGHT2

		) {
			tx.setText("Lack of calcium (paddy)");
		} else if (matchmang <= matchBLKa && matchmang <= matchBLKb
				&& matchmang <= matchcalc && matchmang <= DOWNMIDWAYa
				&& matchmang <= DOWNMIDWAYb && matchmang <= MAGNISIUM

				&& matchmang <= BORON && matchmang <= NITROGEN
				&& matchmang <= FLEA1 && matchmang <= FLEA2

				&& matchmang <= MITES1 && matchmang <= MITES2
				&& matchmang <= MITES3 && matchmang <= BLIGHT1
				&& matchmang <= BLIGHT2

		) {
			tx.setText("Lack of magnesium(paddy)");
		}

		else if (DOWNMIDWAYa <= matchBLKa && DOWNMIDWAYa <= matchBLKb
				&& DOWNMIDWAYa <= matchcalc && DOWNMIDWAYa <= matchmang
				&& DOWNMIDWAYa <= DOWNMIDWAYb && DOWNMIDWAYa <= MAGNISIUM

				&& DOWNMIDWAYa <= BORON && DOWNMIDWAYa <= NITROGEN
				&& DOWNMIDWAYa <= FLEA1 && DOWNMIDWAYa <= FLEA2

				&& DOWNMIDWAYa <= MITES1 && DOWNMIDWAYa <= MITES2
				&& DOWNMIDWAYa <= MITES3 && DOWNMIDWAYa <= BLIGHT1
				&& DOWNMIDWAYa <= BLIGHT2

		) {
			tx.setText(" DOWN MIDWAY(cabbage)");
		} else if (DOWNMIDWAYb <= matchBLKa && DOWNMIDWAYb <= matchBLKb
				&& DOWNMIDWAYb <= matchcalc && DOWNMIDWAYb <= matchmang
				&& DOWNMIDWAYb <= DOWNMIDWAYa

				&& DOWNMIDWAYb <= MAGNISIUM && DOWNMIDWAYb <= BORON
				&& DOWNMIDWAYb <= NITROGEN && DOWNMIDWAYb <= FLEA1
				&& DOWNMIDWAYb <= FLEA2

				&& DOWNMIDWAYb <= MITES1 && DOWNMIDWAYb <= MITES2
				&& DOWNMIDWAYb <= MITES3 && DOWNMIDWAYb <= BLIGHT1
				&& DOWNMIDWAYb <= BLIGHT2

		) {
			tx.setText(" DOWN MIDWAY(cabbage)");
		}

		else if (MAGNISIUM <= matchBLKa && MAGNISIUM <= matchBLKb
				&& MAGNISIUM <= matchcalc && MAGNISIUM <= matchmang
				&& MAGNISIUM <= DOWNMIDWAYa && MAGNISIUM <= DOWNMIDWAYb
				&& MAGNISIUM <= BORON && MAGNISIUM <= NITROGEN
				&& MAGNISIUM <= FLEA1 && MAGNISIUM <= FLEA2

				&& MAGNISIUM <= MITES1 && MAGNISIUM <= MITES2
				&& MAGNISIUM <= MITES3 && MAGNISIUM <= BLIGHT1
				&& MAGNISIUM <= BLIGHT2) {
			tx.setText("Lack of Magnesium (cabbage)");
		}

		else if (BORON <= matchBLKa && BORON <= matchBLKb && BORON <= matchcalc
				&& BORON <= matchmang && BORON <= DOWNMIDWAYa
				&& BORON <= DOWNMIDWAYb && BORON <= NITROGEN
				&& BORON <= MAGNISIUM && BORON <= FLEA1 && BORON <= FLEA2
				&& BORON <= MITES1 && BORON <= MITES2 && BORON <= MITES3
				&& BORON <= BLIGHT1 && BORON <= BLIGHT2) {
			tx.setText("lack of Boron (cabbage)");
		} else if (NITROGEN <= matchBLKa && NITROGEN <= matchBLKb
				&& NITROGEN <= matchcalc && NITROGEN <= matchmang
				&& NITROGEN <= DOWNMIDWAYa && NITROGEN <= DOWNMIDWAYb
				&& NITROGEN <= BORON && NITROGEN <= MAGNISIUM
				&& NITROGEN <= FLEA1 && NITROGEN <= FLEA2 && NITROGEN <= MITES1
				&& NITROGEN <= MITES2 && NITROGEN <= MITES3

				&& NITROGEN <= BLIGHT1 && NITROGEN <= BLIGHT2) {
			tx.setText("Lack of nitrogen (cabbage)");
		} else if (FLEA1 <= matchBLKa && FLEA1 <= matchBLKb
				&& FLEA1 <= matchcalc && FLEA1 <= matchmang
				&& FLEA1 <= DOWNMIDWAYa && FLEA1 <= DOWNMIDWAYb
				&& FLEA1 <= BORON && FLEA1 <= NITROGEN && FLEA1 <= FLEA2
				&& FLEA1 <= MAGNISIUM && FLEA1 <= MITES1 && FLEA1 <= MITES2
				&& FLEA1 <= MITES3 && FLEA1 <= BLIGHT1 && FLEA1 <= BLIGHT2) {
			tx.setText("FLEA BEETLES(eggplant)");
		} else if (FLEA2 <= matchBLKa && FLEA2 <= matchBLKb
				&& FLEA2 <= matchcalc && FLEA2 <= matchmang
				&& FLEA2 <= DOWNMIDWAYa && FLEA2 <= DOWNMIDWAYb
				&& FLEA2 <= BORON && FLEA2 <= NITROGEN && FLEA2 <= FLEA1
				&& FLEA2 <= MAGNISIUM && FLEA2 <= MITES1 && FLEA2 <= MITES2
				&& FLEA2 <= MITES3 && FLEA2 <= BLIGHT1 && FLEA2 <= BLIGHT2) {
			tx.setText("FLEA BEETLES(eggplant)");
		}

		else if (MITES1 <= matchBLKa && MITES1 <= matchBLKb
				&& MITES1 <= matchcalc && MITES1 <= matchmang
				&& MITES1 <= DOWNMIDWAYa && MITES1 <= DOWNMIDWAYb
				&& MITES1 <= BORON && MITES1 <= NITROGEN && MITES1 <= MAGNISIUM
				&& MITES1 <= FLEA1 && MITES1 <= FLEA2 && MITES1 <= MITES2
				&& MITES1 <= MITES3 && MITES1 <= BLIGHT1 && MITES1 <= BLIGHT2) {
			tx.setText("Mites (eggplant)");
		} else if (MITES2 <= matchBLKa && MITES2 <= matchBLKb
				&& MITES2 <= matchcalc && MITES2 <= matchmang
				&& MITES2 <= DOWNMIDWAYa && MITES2 <= DOWNMIDWAYb
				&& MITES2 <= BORON && MITES2 <= NITROGEN && MITES2 <= MAGNISIUM
				&& MITES2 <= FLEA1 && MITES2 <= FLEA2 && MITES2 <= MITES1
				&& MITES2 <= MITES3 && MITES2 <= BLIGHT1 && MITES2 <= BLIGHT2) {
			tx.setText("Mites (eggplant)");
		} else if (MITES3 <= matchBLKa && MITES3 <= matchBLKb
				&& MITES3 <= matchcalc && MITES3 <= matchmang
				&& MITES3 <= DOWNMIDWAYa && MITES3 <= DOWNMIDWAYb
				&& MITES3 <= BORON && MITES3 <= NITROGEN && MITES3 <= MAGNISIUM
				&& MITES3 <= FLEA1 && MITES3 <= FLEA2 && MITES3 <= MITES1
				&& MITES3 <= MITES2 && MITES3 <= BLIGHT1 && MITES3 <= BLIGHT2) {
			tx.setText("Mites (eggplant)");
		}

		else if (BLIGHT1 <= matchBLKa && BLIGHT1 <= matchBLKb
				&& BLIGHT1 <= matchcalc && BLIGHT1 <= matchmang
				&& BLIGHT1 <= DOWNMIDWAYa && BLIGHT1 <= DOWNMIDWAYb
				&& BLIGHT1 <= BORON && BLIGHT1 <= NITROGEN
				&& BLIGHT1 <= MAGNISIUM && BLIGHT1 <= FLEA1 && BLIGHT1 <= FLEA2
				&& BLIGHT1 <= MITES1 && BLIGHT1 <= MITES2 && BLIGHT1 <= MITES3
				&& BLIGHT1 <= BLIGHT2) {
			tx.setText("LATE BLIGHT(potato)");
		} else if (BLIGHT2 <= matchBLKa && BLIGHT2 <= matchBLKb
				&& BLIGHT2 <= matchcalc && BLIGHT2 <= matchmang
				&& BLIGHT2 <= DOWNMIDWAYa && BLIGHT2 <= DOWNMIDWAYb
				&& BLIGHT2 <= BORON && BLIGHT2 <= NITROGEN
				&& BLIGHT2 <= MAGNISIUM && BLIGHT2 <= FLEA1 && BLIGHT2 <= FLEA2
				&& BLIGHT2 <= MITES1 && BLIGHT2 <= MITES2 && BLIGHT2 <= MITES3
				&& BLIGHT2 <= BLIGHT1) {
			tx.setText("LATE BLIGHT(potato)");
		}

	}

}

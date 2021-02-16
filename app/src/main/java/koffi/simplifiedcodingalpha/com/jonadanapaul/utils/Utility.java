package koffi.simplifiedcodingalpha.com.jonadanapaul.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import koffi.simplifiedcodingalpha.com.jonadanapaul.R;

public class Utility {
    public Context mContext;


    public Utility(Context mContext) {
        this.mContext = mContext;
    }


    public void showDialog(String tittle,String message){

        final AlertDialog.Builder aBuilder = new AlertDialog.Builder(mContext, R.style.AppCompatAlertDialogStyle);
        aBuilder.setTitle(tittle);
        // aBuilder.setIcon(R.drawable.ic_launcher);
        aBuilder.setMessage(message);

        aBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(final DialogInterface dialog, final int which) {
                dialog.dismiss();
                // activity.finish();


            }

        });
//        aBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                dialogInterface.dismiss();
//            }
//        });

        aBuilder.show();



    }



}

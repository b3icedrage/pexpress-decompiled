package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AlertController d;
    public final /* synthetic */ AlertController.b e;

    public a(AlertController.b bVar, AlertController alertController) {
        this.e = bVar;
        this.d = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        AlertController.b bVar = this.e;
        DialogInterface.OnClickListener onClickListener = bVar.h;
        AlertController alertController = this.d;
        onClickListener.onClick(alertController.b, i);
        if (bVar.i) {
            return;
        }
        alertController.b.dismiss();
    }
}

package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.c;

/* JADX INFO: renamed from: p02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC5841p02 implements View.OnClickListener {
    public final C6697t5 d;
    public final /* synthetic */ c e;

    public ViewOnClickListenerC5841p02(c cVar) {
        this.e = cVar;
        Context context = cVar.a.getContext();
        CharSequence charSequence = cVar.h;
        C6697t5 c6697t5 = new C6697t5();
        c6697t5.e = 4096;
        c6697t5.g = 4096;
        c6697t5.l = null;
        c6697t5.m = null;
        c6697t5.n = false;
        c6697t5.o = false;
        c6697t5.p = 16;
        c6697t5.i = context;
        c6697t5.a = charSequence;
        this.d = c6697t5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        c cVar = this.e;
        Window.Callback callback = cVar.k;
        if (callback == null || !cVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.d);
    }
}

package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: renamed from: gu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC4088gu implements View.OnClickListener {
    public final /* synthetic */ b d;

    public ViewOnClickListenerC4088gu(b bVar) {
        this.d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.d;
        if (bVar.n && bVar.isShowing()) {
            if (!bVar.p) {
                TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bVar.o = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                bVar.p = true;
            }
            if (bVar.o) {
                bVar.cancel();
            }
        }
    }
}

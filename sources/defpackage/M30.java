package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class M30 extends L42<M30, Drawable> {
    @NonNull
    public static M30 b(@NonNull B30 b30) {
        M30 m30 = new M30();
        UE.e(b30, "Argument must not be null");
        m30.d = b30;
        return m30;
    }

    @Override // defpackage.L42
    public final boolean equals(Object obj) {
        return (obj instanceof M30) && super.equals(obj);
    }
}

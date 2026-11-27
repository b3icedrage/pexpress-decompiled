package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: z30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7951z30 implements InterfaceC6867tt1<Drawable, byte[]> {
    public final InterfaceC0930Es d;
    public final C6442rs e;
    public final C3787fU g;

    public C7951z30(@NonNull InterfaceC0930Es interfaceC0930Es, @NonNull C6442rs c6442rs, @NonNull C3787fU c3787fU) {
        this.d = interfaceC0930Es;
        this.e = c6442rs;
        this.g = c3787fU;
    }

    @Override // defpackage.InterfaceC6867tt1
    public final InterfaceC3667et1<byte[]> a(@NonNull InterfaceC3667et1<Drawable> interfaceC3667et1, @NonNull C4227ha1 c4227ha1) {
        Drawable drawable = interfaceC3667et1.get();
        if (drawable instanceof BitmapDrawable) {
            return this.e.a(C1164Hs.e(this.d, ((BitmapDrawable) drawable).getBitmap()), c4227ha1);
        }
        if (drawable instanceof C0988Fl0) {
            return this.g.a(interfaceC3667et1, c4227ha1);
        }
        return null;
    }
}

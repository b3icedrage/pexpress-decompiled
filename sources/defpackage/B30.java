package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class B30 implements I42<Drawable> {
    public final boolean a;
    public C30 b;

    public B30(boolean z) {
        this.a = z;
    }

    @Override // defpackage.I42
    public final H42 a(CS cs) {
        if (cs == CS.i) {
            return C6279r51.a;
        }
        if (this.b == null) {
            this.b = new C30(this.a);
        }
        return this.b;
    }
}

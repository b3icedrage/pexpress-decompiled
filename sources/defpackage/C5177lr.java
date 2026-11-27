package defpackage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C2803b;

/* JADX INFO: renamed from: lr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5177lr {
    public final C2803b a;
    public int b = 0;
    public int c = -1;
    public int d = -1;
    public Object e = null;

    public C5177lr(@NonNull C2803b c2803b) {
        this.a = c2803b;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        C2803b c2803b = this.a;
        if (i == 1) {
            c2803b.a(this.c, this.d);
        } else if (i == 2) {
            c2803b.b(this.c, this.d);
        } else if (i == 3) {
            int i2 = this.c;
            int i3 = this.d;
            c2803b.a.a.d(this.e, i2, i3);
        }
        this.e = null;
        this.b = 0;
    }

    @SuppressLint({"UnknownNullness"})
    public final void b(Object obj, int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.b == 3 && i <= (i4 = this.d + (i3 = this.c)) && (i5 = i + i2) >= i3 && this.e == obj) {
            this.c = Math.min(i, i3);
            this.d = Math.max(i4, i5) - this.c;
            return;
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }

    public final void c(int i, int i2) {
        a();
        this.a.a.a.c(i, i2);
    }
}

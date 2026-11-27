package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class ER<T> implements InterfaceC5529nX1<T> {
    public final int d;
    public final int e;
    public InterfaceC4762js1 g;

    public ER() {
        if (!C6177qc2.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.d = Integer.MIN_VALUE;
        this.e = Integer.MIN_VALUE;
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void b(@NonNull DM1 dm1) throws Throwable {
        dm1.a(this.d, this.e);
    }

    @Override // defpackage.InterfaceC5529nX1
    public final InterfaceC4762js1 d() {
        return this.g;
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void e(InterfaceC4762js1 interfaceC4762js1) {
        this.g = interfaceC4762js1;
    }

    @Override // defpackage.DP0
    public final void onDestroy() {
    }

    @Override // defpackage.DP0
    public final void onStart() {
    }

    @Override // defpackage.DP0
    public final void onStop() {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void a(@NonNull DM1 dm1) {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void h(Drawable drawable) {
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void i(Drawable drawable) {
    }
}

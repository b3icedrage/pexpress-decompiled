package defpackage;

import android.content.Context;
import com.api.core.ActivityStateProvider;

/* JADX INFO: loaded from: classes.dex */
public final class XK1 implements InterfaceC5331mb0<WK1> {
    public final Z00 a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1531Mk1<ActivityStateProvider> c;

    public XK1(Z00 z00, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = z00;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        return new WK1((X00) this.a.get(), (Context) this.b.get(), this.c.get());
    }
}

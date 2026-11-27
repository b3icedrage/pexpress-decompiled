package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class PC0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public PC0(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, C4176hJ1 c4176hJ1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.d = c6;
        this.b = interfaceC1531Mk1;
        this.e = c4176hJ1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new OC0((C4617jA1) this.b.get(), (C4923kf) this.c.get(), (O3) this.d.get(), (EQ) this.e.get());
            default:
                return new BB1((Context) ((C6) this.d).get(), (C4923kf) this.b.get(), (Set) ((C4176hJ1) this.e).get(), (O3) this.c.get());
        }
    }

    public PC0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }
}

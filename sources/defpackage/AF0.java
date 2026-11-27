package defpackage;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AF0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public AF0(C7784yF0 c7784yF0, C4176hJ1 c4176hJ1) {
        this.b = c4176hJ1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                Set<D7> delegates = (Set) ((C4176hJ1) this.b).get();
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                C3555eM1 c3555eM1 = new C3555eM1(null);
                for (D7 delegate : delegates) {
                    Intrinsics.checkNotNullParameter(delegate, "delegate");
                    c3555eM1.d.a(delegate);
                }
                return c3555eM1;
            default:
                return ((BV0) this.b).a;
        }
    }

    public AF0(BV0 bv0) {
        this.b = bv0;
    }
}

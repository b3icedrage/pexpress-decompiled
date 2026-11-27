package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Sj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1997Sj implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C1997Sj(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C1919Rj((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C5461nB((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C3221cl0((InterfaceC7816yQ) this.b.get());
            case 3:
                return new C3052by0((C3051bx1) this.b.get());
            default:
                Context context = (Context) this.b.get();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(context, "context");
                return new C4148hA0();
        }
    }
}

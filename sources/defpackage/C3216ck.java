package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ck, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3216ck implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3216ck(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3007bk((InterfaceC1442Lg1) this.b.get());
            default:
                JA chartStartTimeProvider = (JA) this.b.get();
                Intrinsics.checkNotNullParameter(chartStartTimeProvider, "chartStartTimeProvider");
                E11 e11 = new E11(chartStartTimeProvider);
                e11.d = true;
                return e11;
        }
    }
}

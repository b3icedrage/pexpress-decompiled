package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: mm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5376mm1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C5376mm1(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4953km1((AbstractC4743jm1) this.b.get());
            default:
                C4923kf appData = (C4923kf) this.b.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                return new C7845yZ1();
        }
    }
}

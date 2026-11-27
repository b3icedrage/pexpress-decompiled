package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: uQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6975uQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC5331mb0 b;

    public /* synthetic */ C6975uQ(InterfaceC5331mb0 interfaceC5331mb0, int i) {
        this.a = i;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC7007ua1 ourSideHttpService = (InterfaceC7007ua1) ((C7904yp) this.b).get();
                Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
                return new C6765tQ(ourSideHttpService);
            default:
                return new FT1(new C7407wT1(), (InterfaceC6776tT1) ((C7196vT1) this.b).get());
        }
    }
}

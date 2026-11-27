package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class K8 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1454Lk1 c;

    public /* synthetic */ K8(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                M8 agentRepository = (M8) this.b.get();
                InterfaceC5321mY0 mediaRepository = (InterfaceC5321mY0) this.c.get();
                Intrinsics.checkNotNullParameter(agentRepository, "agentRepository");
                Intrinsics.checkNotNullParameter(mediaRepository, "mediaRepository");
                return new J8(agentRepository, mediaRepository);
            default:
                return new C2731aW((C6102qE1) this.b.get(), (EK1) this.c.get());
        }
    }
}

package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5019l6 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C5019l6(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C4809k6((InterfaceC1547Mq) this.b.get());
            case 1:
                return new E21((MU) ((M3) this.b).get());
            default:
                Map delegates = (Map) ((C6994uW0) this.b).get();
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                return new HV(delegates);
        }
    }

    public C5019l6(C5027l8 c5027l8, C6994uW0 c6994uW0) {
        this.a = 2;
        this.b = c6994uW0;
    }
}

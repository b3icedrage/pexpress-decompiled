package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: oq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5809oq1 implements Function0 {
    public final /* synthetic */ KN d;
    public final /* synthetic */ InterfaceC6396rf0 e;

    public /* synthetic */ C5809oq1(KN kn, InterfaceC6396rf0 interfaceC6396rf0) {
        this.d = kn;
        this.e = interfaceC6396rf0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KN kn = this.d;
        if (kn != null) {
            C5189lv.k(kn, null, new C6019pq1(this.e, null), 3);
        }
        return Unit.a;
    }
}

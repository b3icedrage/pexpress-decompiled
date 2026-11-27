package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.AppUpdatesManagerImpl$setAppUpdatedConsumed$2", f = "AppUpdatesManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C5988pi extends AW1 implements Function1<JM<? super String>, Object> {
    public final /* synthetic */ C5358mi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5988pi(C5358mi c5358mi, JM<? super C5988pi> jm) {
        super(1, jm);
        this.d = c5358mi;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C5988pi(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super String> jm) {
        return ((C5988pi) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return this.d.g;
    }
}

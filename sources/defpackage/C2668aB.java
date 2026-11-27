package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase$sendContactInfo$chatInitializationValue$1$1", f = "ChatInitializerBase.kt", l = {}, m = "invokeSuspend")
public final class C2668aB extends AW1 implements Function1<JM<? super Long>, Object> {
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2668aB(long j, JM<? super C2668aB> jm) {
        super(1, jm);
        this.d = j;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new C2668aB(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Long> jm) {
        return ((C2668aB) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        return new Long(this.d);
    }
}

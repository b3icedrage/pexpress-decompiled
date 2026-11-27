package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z81, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7972z81 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ AbstractC1091Gt1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7972z81(AbstractC1091Gt1 abstractC1091Gt1) {
        super(1);
        this.d = abstractC1091Gt1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        AbstractC1091Gt1 abstractC1091Gt1 = this.d;
        if (abstractC1091Gt1 != null) {
            abstractC1091Gt1.close();
        }
        return Unit.a;
    }
}

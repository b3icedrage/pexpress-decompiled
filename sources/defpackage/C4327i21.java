package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4327i21 extends ML0 implements Function1<Throwable, Unit> {
    public final /* synthetic */ C4795k21 d;
    public final /* synthetic */ C4795k21.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4327i21(C4795k21 c4795k21, C4795k21.a aVar) {
        super(1);
        this.d = c4795k21;
        this.e = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.e.getClass();
        this.d.b(null);
        return Unit.a;
    }
}

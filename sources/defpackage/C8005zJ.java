package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: zJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8005zJ extends ML0 implements Function2<CP1.d, AbstractC2882b80, Unit> {
    public final /* synthetic */ DJ d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8005zJ(DJ dj) {
        super(2);
        this.d = dj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CP1.d dVar, AbstractC2882b80 abstractC2882b80) {
        CP1.d receiver = dVar;
        AbstractC2882b80 it = abstractC2882b80;
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        Intrinsics.checkNotNullParameter(it, "it");
        C2695aK.b.d(this.d.d.d);
        return Unit.a;
    }
}

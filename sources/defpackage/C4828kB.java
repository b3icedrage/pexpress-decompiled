package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4828kB extends ML0 implements Function1<C3730fB, C3730fB> {
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4828kB(boolean z) {
        super(1);
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C3730fB invoke(C3730fB c3730fB) {
        C3730fB state = c3730fB;
        Intrinsics.checkNotNullParameter(state, "state");
        return C3730fB.a(state, this.d, 6);
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ab1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0569Ab1 extends ML0 implements Function1<C0881Eb1, Boolean> {
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0569Ab1(boolean z) {
        super(1);
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C0881Eb1 c0881Eb1) {
        C0881Eb1 state = c0881Eb1;
        Intrinsics.checkNotNullParameter(state, "state");
        return Boolean.valueOf(state.b != this.d);
    }
}

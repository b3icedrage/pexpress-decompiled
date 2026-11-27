package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0647Bb1 extends ML0 implements Function1<C0881Eb1, C0881Eb1> {
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0647Bb1(boolean z) {
        super(1);
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0881Eb1 invoke(C0881Eb1 c0881Eb1) {
        C0881Eb1 state = c0881Eb1;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z = this.d;
        if (!z) {
            state.getClass();
            return new C0881Eb1(false, z);
        }
        boolean z2 = state.a;
        state.getClass();
        return new C0881Eb1(z2, z);
    }
}

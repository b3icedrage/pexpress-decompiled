package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7432wb1 extends ML0 implements Function1<C0881Eb1, Boolean> {
    public static final C7432wb1 d = new C7432wb1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C0881Eb1 c0881Eb1) {
        C0881Eb1 state = c0881Eb1;
        Intrinsics.checkNotNullParameter(state, "state");
        return Boolean.valueOf(!state.a);
    }
}

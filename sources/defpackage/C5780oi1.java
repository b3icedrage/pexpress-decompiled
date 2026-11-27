package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: oi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5780oi1 extends ML0 implements Function1<C6619si1, Boolean> {
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5780oi1(String str) {
        super(1);
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C6619si1 c6619si1) {
        C6619si1 state = c6619si1;
        Intrinsics.checkNotNullParameter(state, "state");
        return Boolean.valueOf(!Intrinsics.a(state.a, this.d));
    }
}

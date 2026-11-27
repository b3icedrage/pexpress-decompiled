package defpackage;

import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: yb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7852yb1 extends ML0 implements Function1<C0881Eb1, Unit> {
    public final /* synthetic */ C8062zb1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7852yb1(C8062zb1 c8062zb1) {
        super(1);
        this.d = c8062zb1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C0881Eb1 c0881Eb1) {
        C0881Eb1 it = c0881Eb1;
        Intrinsics.checkNotNullParameter(it, "it");
        C8062zb1 c8062zb1 = this.d;
        c8062zb1.h = 0;
        Handler handler = c8062zb1.f;
        RunnableC7221vb1 runnableC7221vb1 = c8062zb1.g;
        handler.removeCallbacks(runnableC7221vb1);
        handler.postDelayed(runnableC7221vb1, 500L);
        return Unit.a;
    }
}

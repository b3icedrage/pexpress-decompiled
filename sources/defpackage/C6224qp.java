package defpackage;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: renamed from: qp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6224qp implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                C1006Fr0.a install = (C1006Fr0.a) obj;
                Intrinsics.checkNotNullParameter(install, "$this$install");
                install.getClass();
                C1006Fr0.a.a(5000L);
                install.a = 5000L;
                return Unit.a;
            case 1:
                View it = (View) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return C4559iy0.b(it);
            default:
                LF it2 = (LF) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(d.i(it2.b, "USDT"));
        }
    }
}

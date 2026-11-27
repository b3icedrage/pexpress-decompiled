package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6178qd implements Function1 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                FY1.b penalty = (FY1.b) obj;
                int i = ApplicationC0963Fd.F;
                Intrinsics.checkNotNullParameter(penalty, "$this$penalty");
                penalty.getClass();
                return Unit.a;
            default:
                VN it = (VN) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return C0896Eg1.a(new AbstractC0662Bg1.b(C1052Gg1.a("FIRST_START")));
        }
    }
}

package defpackage;

import android.util.Patterns;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: tL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6750tL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EY0 b;

    public /* synthetic */ C6750tL(int i, EY0 ey0) {
        this.a = i;
        this.b = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        C6960uL.a aVarA;
        SF0.b bVarA;
        switch (this.a) {
            case 0:
                String it = (String) obj;
                EY0 this_apply = this.b;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                C6960uL.a aVar = (C6960uL.a) this_apply.d();
                if (aVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    String string = StringsKt.d0(it).toString();
                    Intrinsics.checkNotNullParameter(string, "<this>");
                    aVarA = C6960uL.a.a(aVar, false, false, false, !StringsKt.I(string) && Patterns.EMAIL_ADDRESS.matcher(string).matches(), 7);
                } else {
                    aVarA = null;
                }
                this_apply.k(aVarA);
                break;
            default:
                SF0.c cVar = (SF0.c) obj;
                EY0 this_apply2 = this.b;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                SF0.b bVar = (SF0.b) this_apply2.d();
                if (bVar != null) {
                    bVarA = SF0.b.a(bVar, false, false, cVar.h.a != null, 3);
                } else {
                    bVarA = null;
                }
                this_apply2.k(bVarA);
                break;
        }
    }
}

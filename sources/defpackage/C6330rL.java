package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: rL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6330rL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EY0 b;

    public /* synthetic */ C6330rL(int i, EY0 ey0) {
        this.a = i;
        this.b = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        C6960uL.a aVarA;
        SF0.b bVarA;
        String it = (String) obj;
        switch (this.a) {
            case 0:
                EY0 this_apply = this.b;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                C6960uL.a aVar = (C6960uL.a) this_apply.d();
                if (aVar != null) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    aVarA = C6960uL.a.a(aVar, false, !StringsKt.I(StringsKt.d0(it).toString()), false, false, 13);
                } else {
                    aVarA = null;
                }
                this_apply.k(aVarA);
                break;
            default:
                EY0 this_apply2 = this.b;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                SF0.b bVar = (SF0.b) this_apply2.d();
                if (bVar != null) {
                    bVarA = SF0.b.a(bVar, !(it == null || StringsKt.I(it)), false, false, 6);
                } else {
                    bVarA = null;
                }
                this_apply2.k(bVarA);
                break;
        }
    }
}

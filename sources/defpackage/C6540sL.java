package defpackage;

import android.util.Patterns;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: sL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6540sL implements InterfaceC4819k81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EY0 b;

    public /* synthetic */ C6540sL(int i, EY0 ey0) {
        this.a = i;
        this.b = ey0;
    }

    @Override // defpackage.InterfaceC4819k81
    public final void d(Object obj) {
        C6960uL.a aVarA;
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
                    aVarA = C6960uL.a.a(aVar, false, false, !StringsKt.I(string) && Patterns.PHONE.matcher(string).matches(), false, 11);
                } else {
                    aVarA = null;
                }
                this_apply.k(aVarA);
                break;
            default:
                AbstractC4645jK abstractC4645jK = (AbstractC4645jK) obj;
                EY0 this_apply2 = this.b;
                Intrinsics.checkNotNullParameter(this_apply2, "$this_apply");
                SF0.b bVar = (SF0.b) this_apply2.d();
                this_apply2.k(bVar != null ? SF0.b.a(bVar, false, abstractC4645jK instanceof AbstractC4645jK.a, false, 5) : null);
                break;
        }
    }
}

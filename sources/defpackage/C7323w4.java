package defpackage;

import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: w4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7323w4 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7323w4(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (Wd2) ((C7113v4) this.e).invoke();
            case 1:
                return (Wd2) ((C7113v4) this.e).invoke();
            case 2:
                return (Wd2) ((C7113v4) this.e).invoke();
            case 3:
                return (SelectHaveAccountFragmentBase) this.e;
            case 4:
                La2 la2 = (La2) this.e;
                int iF = StringsKt.F('#', 0, 6, la2.h) + 1;
                if (iF == 0) {
                    return "";
                }
                String strSubstring = la2.h.substring(iF);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                return strSubstring;
            default:
                return (Wd2) ((C7113v4) this.e).invoke();
        }
    }
}

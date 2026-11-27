package defpackage;

import com.base.feature.activation.screens.big_stories.ActivationBigStoriesFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class N5 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ N5(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (ActivationBigStoriesFragment) this.e;
            case 1:
                return (Wd2) ((C7323w4) this.e).invoke();
            default:
                La2 la2 = (La2) this.e;
                String str = la2.g;
                if (str == null) {
                    return null;
                }
                if (str.length() == 0) {
                    return "";
                }
                int length = la2.a.a.length() + 3;
                String str2 = la2.h;
                String strSubstring = str2.substring(StringsKt.F(':', length, 4, str2) + 1, StringsKt.F('@', 0, 6, str2));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                return strSubstring;
        }
    }
}

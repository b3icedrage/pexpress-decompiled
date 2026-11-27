package defpackage;

import android.view.MenuItem;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: iV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4421iV0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C4421iV0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strC;
        switch (this.d) {
            case 0:
                ActivityC6781tV0 activityC6781tV0 = (ActivityC6781tV0) this.e;
                C3086c7 c3086c7 = activityC6781tV0.H;
                Intrinsics.checkNotNull(c3086c7);
                MenuItem menuItemFindItem = c3086c7.e.getMenu().findItem(R.id.main_support_fragment);
                String string = activityC6781tV0.getString(((Boolean) obj).booleanValue() ? R.string.help_text : R.string.support_title);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                menuItemFindItem.setTitle(string);
                return Unit.a;
            default:
                KTypeProjection it = (KTypeProjection) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((R62) this.e).getClass();
                if (it.a == null) {
                    return "*";
                }
                SJ0 sj0 = it.b;
                R62 r62 = sj0 instanceof R62 ? (R62) sj0 : null;
                String strValueOf = (r62 == null || (strC = r62.c(true)) == null) ? String.valueOf(sj0) : strC;
                EnumC2920bK0 enumC2920bK0 = it.a;
                int i = enumC2920bK0 == null ? -1 : R62.b.a[enumC2920bK0.ordinal()];
                if (i == 1) {
                    return strValueOf;
                }
                if (i == 2) {
                    return "in ".concat(strValueOf);
                }
                if (i == 3) {
                    return "out ".concat(strValueOf);
                }
                throw new C6489s51();
        }
    }
}

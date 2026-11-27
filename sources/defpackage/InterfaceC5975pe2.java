package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pe2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5975pe2<T extends View> extends OM1 {

    /* JADX INFO: renamed from: pe2$a */
    public static final class a {
        public static int a(C7062uo1 c7062uo1, int i, int i2, int i3, boolean z) {
            int i4 = i - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i2 - i3;
            if (i5 > 0) {
                return i5;
            }
            if (i != -2) {
                return -1;
            }
            Context context = c7062uo1.a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "view.context");
            Resources resources = context.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "view.context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return z ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        public static C1433Ld1 b(C7062uo1 c7062uo1) {
            T t = c7062uo1.a;
            ViewGroup.LayoutParams layoutParams = t.getLayoutParams();
            int iA = a(c7062uo1, layoutParams != null ? layoutParams.width : -1, t.getWidth(), t.getPaddingRight() + t.getPaddingLeft(), true);
            if (iA <= 0) {
                return null;
            }
            ViewGroup.LayoutParams layoutParams2 = t.getLayoutParams();
            int iA2 = a(c7062uo1, layoutParams2 != null ? layoutParams2.height : -1, t.getHeight(), t.getPaddingBottom() + t.getPaddingTop(), false);
            if (iA2 <= 0) {
                return null;
            }
            return new C1433Ld1(iA, iA2);
        }
    }

    @NotNull
    T b();
}

package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import com.base.feature.bottomsheetdialog.screens.custom.CustomBottomSheetView;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3481e1 {

    @NotNull
    public static final JM[] a = new JM[0];
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    @NotNull
    public static final C3481e1 f = new C3481e1();

    @NotNull
    public static final QA1.a a(@NotNull Context context, @NotNull Class klass, @Nullable String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (StringsKt.I(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new QA1.a(context, klass, str);
    }

    public static int b(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = d;
        return C4162hF.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static float c(int i) {
        float f2 = i / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @NotNull
    public static final Pair e(@Nullable String str) {
        if (str == null || StringsKt.I(str)) {
            return new Pair(0L, 0L);
        }
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default.size() <= 1) {
            Long lC0 = StringsKt.c0((String) listSplit$default.get(0));
            return new Pair(Long.valueOf(lC0 != null ? lC0.longValue() : 0L), 0L);
        }
        Long lC1 = StringsKt.c0((String) listSplit$default.get(0));
        Long lValueOf = Long.valueOf(lC1 != null ? lC1.longValue() : 0L);
        Long lC2 = StringsKt.c0((String) listSplit$default.get(1));
        return new Pair(lValueOf, Long.valueOf(lC2 != null ? lC2.longValue() : 0L));
    }

    public static float f() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    @NotNull
    public CustomBottomSheetView d(@NotNull Context context, @NotNull Function1 builderAction) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        CustomBottomSheetView customBottomSheetView = new CustomBottomSheetView(context);
        customBottomSheetView.h = V00.b(LayoutInflater.from(customBottomSheetView.g), null, false);
        builderAction.invoke(customBottomSheetView);
        return customBottomSheetView;
    }
}

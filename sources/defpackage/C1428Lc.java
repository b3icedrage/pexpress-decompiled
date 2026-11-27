package defpackage;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1428Lc implements Function1 {
    public static final C1428Lc e = new C1428Lc(0);
    public static final C1428Lc g = new C1428Lc(1);
    public static final C1428Lc h = new C1428Lc(2);
    public static final C1428Lc i = new C1428Lc(3);
    public final /* synthetic */ int d;

    public /* synthetic */ C1428Lc(int i2) {
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        switch (this.d) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 1:
                Class it = (Class) obj;
                UH uh = C0633Ax.a;
                Intrinsics.checkNotNullParameter(it, "it");
                C3545eJ0 c3545eJ0A = C0633Ax.a(it);
                C5653o60 c5653o60 = C5653o60.d;
                return C5276mJ0.a(c3545eJ0A, c5653o60, false, c5653o60);
            case 2:
                AbstractC4649jL0 it2 = (AbstractC4649jL0) obj;
                IJ0<Object>[] ij0Arr = C3802fZ.Y;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2;
            default:
                RK0 rk0 = (RK0) obj;
                AbstractC2527Yt1.c cVar = AbstractC2527Yt1.c.c;
                Intrinsics.checkNotNullParameter(rk0, "<this>");
                AbstractC5706oM1 abstractC5706oM1W = rk0.w();
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1W, "getUnitType(...)");
                return abstractC5706oM1W;
        }
    }
}

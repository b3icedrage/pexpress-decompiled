package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class Kc2 {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC7224vc0.values().length];
            try {
                EnumC7224vc0 enumC7224vc0 = EnumC7224vc0.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                EnumC7224vc0 enumC7224vc1 = EnumC7224vc0.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                EnumC7224vc0 enumC7224vc2 = EnumC7224vc0.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                EnumC7224vc0 enumC7224vc3 = EnumC7224vc0.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                EnumC7224vc0 enumC7224vc4 = EnumC7224vc0.d;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                EnumC7224vc0 enumC7224vc5 = EnumC7224vc0.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                EnumC7224vc0 enumC7224vc6 = EnumC7224vc0.d;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                EnumC7224vc0 enumC7224vc7 = EnumC7224vc0.d;
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            a = iArr;
        }
    }

    @Nullable
    public static InterfaceC7722xy0 a(@NotNull EnumC7224vc0 id, @NotNull Double newValue, @NotNull InterfaceC7722xy0 params, @NotNull C3471dy0 field, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(field, "field");
        if (params instanceof XU0.a) {
            int iOrdinal = id.ordinal();
            if (iOrdinal == 0) {
                return XU0.a.d((XU0.a) params, f.d(newValue.intValue(), field.a(z)), 0, 0, 6);
            }
            if (iOrdinal == 1) {
                return XU0.a.d((XU0.a) params, 0, f.d(newValue.intValue(), field.a(z)), 0, 5);
            }
            if (iOrdinal != 2) {
                return null;
            }
            return XU0.a.d((XU0.a) params, 0, 0, f.d(newValue.intValue(), field.a(z)), 3);
        }
        if (params instanceof C6977uQ1.a) {
            int iOrdinal2 = id.ordinal();
            if (iOrdinal2 == 3) {
                return C6977uQ1.a.d((C6977uQ1.a) params, f.d(newValue.intValue(), field.a(z)), 0, 0, 6);
            }
            if (iOrdinal2 == 4) {
                return C6977uQ1.a.d((C6977uQ1.a) params, 0, f.d(newValue.intValue(), field.a(z)), 0, 5);
            }
            if (iOrdinal2 != 5) {
                return null;
            }
            return C6977uQ1.a.d((C6977uQ1.a) params, 0, 0, f.d(newValue.intValue(), field.a(z)), 3);
        }
        if (params instanceof C3863fp.a) {
            int iOrdinal3 = id.ordinal();
            if (iOrdinal3 == 6) {
                return new C3863fp.a(f.d(newValue.intValue(), field.a(z)), ((C3863fp.a) params).b);
            }
            if (iOrdinal3 != 7) {
                return null;
            }
            return new C3863fp.a(((C3863fp.a) params).a, f.b(newValue.doubleValue(), field.a(z).d, field.a(z).e));
        }
        if (params instanceof C4065gm1.a) {
            if (a.a[id.ordinal()] == 7) {
                return new C4065gm1.a(f.d(newValue.intValue(), field.a(z)));
            }
            return null;
        }
        if ((params instanceof C2534Yw.a) && a.a[id.ordinal()] == 7) {
            return new C2534Yw.a(f.d(newValue.intValue(), field.a(z)));
        }
        return null;
    }
}

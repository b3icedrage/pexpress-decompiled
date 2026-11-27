package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7257vk1 {

    /* JADX INFO: renamed from: vk1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC2785ak1.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
            int[] iArr2 = new int[InterfaceC1490Lx.a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[EnumC5788ok1.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[4] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[2] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[3] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[5] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            b = iArr3;
        }
    }

    @NotNull
    public static final QW a(@Nullable EnumC5788ok1 enumC5788ok1) {
        Intrinsics.checkNotNullParameter(C7047uk1.a, "<this>");
        switch (enumC5788ok1 == null ? -1 : a.b[enumC5788ok1.ordinal()]) {
            case 1:
                C5323mZ.g INTERNAL = C5323mZ.d;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                return INTERNAL;
            case 2:
                C5323mZ.d PRIVATE = C5323mZ.a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE, "PRIVATE");
                return PRIVATE;
            case 3:
                C5323mZ.e PRIVATE_TO_THIS = C5323mZ.b;
                Intrinsics.checkNotNullExpressionValue(PRIVATE_TO_THIS, "PRIVATE_TO_THIS");
                return PRIVATE_TO_THIS;
            case 4:
                C5323mZ.f PROTECTED = C5323mZ.c;
                Intrinsics.checkNotNullExpressionValue(PROTECTED, "PROTECTED");
                return PROTECTED;
            case 5:
                C5323mZ.h PUBLIC = C5323mZ.e;
                Intrinsics.checkNotNullExpressionValue(PUBLIC, "PUBLIC");
                return PUBLIC;
            case 6:
                C5323mZ.i LOCAL = C5323mZ.f;
                Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
                return LOCAL;
            default:
                C5323mZ.d PRIVATE2 = C5323mZ.a;
                Intrinsics.checkNotNullExpressionValue(PRIVATE2, "PRIVATE");
                return PRIVATE2;
        }
    }

    @NotNull
    public static final InterfaceC1490Lx.a b(@Nullable EnumC2785ak1 enumC2785ak1) {
        Intrinsics.checkNotNullParameter(C7047uk1.a, "<this>");
        int i = enumC2785ak1 == null ? -1 : a.a[enumC2785ak1.ordinal()];
        InterfaceC1490Lx.a aVar = InterfaceC1490Lx.a.d;
        if (i != 1) {
            if (i == 2) {
                return InterfaceC1490Lx.a.e;
            }
            if (i == 3) {
                return InterfaceC1490Lx.a.g;
            }
            if (i == 4) {
                return InterfaceC1490Lx.a.h;
            }
        }
        return aVar;
    }
}

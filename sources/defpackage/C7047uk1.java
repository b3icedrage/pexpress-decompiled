package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7047uk1 {

    @NotNull
    public static final C7047uk1 a = new C7047uk1();

    /* JADX INFO: renamed from: uk1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[EnumC3009bk1.values().length];
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
            int[] iArr2 = new int[C01.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                C01.a aVar = C01.d;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                C01.a aVar2 = C01.d;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                C01.a aVar3 = C01.d;
                iArr2[1] = 4;
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
            int[] iArr4 = new int[C2077Tj1.c.values().length];
            try {
                iArr4[0] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[2] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[4] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[5] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[6] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            b = iArr4;
            int[] iArr5 = new int[SC.values().length];
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                SC sc = SC.d;
                iArr5[1] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                SC sc2 = SC.d;
                iArr5[2] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                SC sc3 = SC.d;
                iArr5[3] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                SC sc4 = SC.d;
                iArr5[4] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                SC sc5 = SC.d;
                iArr5[5] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr6 = new int[C4735jk1.c.values().length];
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[1] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[2] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            int[] iArr7 = new int[C4267hk1.b.c.values().length];
            try {
                iArr7[0] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[1] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[2] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[3] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            int[] iArr8 = new int[EnumC3610ed2.values().length];
            try {
                iArr8[1] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                EnumC3610ed2 enumC3610ed2 = EnumC3610ed2.INVARIANT;
                iArr8[2] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                EnumC3610ed2 enumC3610ed3 = EnumC3610ed2.INVARIANT;
                iArr8[0] = 3;
            } catch (NoSuchFieldError unused37) {
            }
        }
    }

    @NotNull
    public static C01 a(@Nullable EnumC3009bk1 enumC3009bk1) {
        int i = enumC3009bk1 == null ? -1 : a.a[enumC3009bk1.ordinal()];
        if (i == 1) {
            return C01.e;
        }
        if (i == 2) {
            return C01.h;
        }
        if (i != 3) {
            return i != 4 ? C01.e : C01.g;
        }
        return C01.i;
    }
}

package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5207m implements InterfaceC2780aj0 {
    public static final void a(D60 d60) {
        Intrinsics.checkNotNullParameter(d60, "<this>");
        if ((d60 instanceof VG0 ? (VG0) d60 : null) != null) {
            return;
        }
        throw new IllegalStateException(BX.b(C2017Sp1.a, d60.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ")));
    }

    @NotNull
    public static final A62 b(@NotNull A62 a62) {
        Intrinsics.checkNotNullParameter(a62, "<this>");
        SJ0 sj0 = a62.c;
        Intrinsics.checkNotNull(sj0);
        SJ0 sj1 = sj0.f().get(0).b;
        Intrinsics.checkNotNull(sj1);
        InterfaceC4853kJ0 interfaceC4853kJ0G = sj1.g();
        Intrinsics.c(interfaceC4853kJ0G, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        Intrinsics.checkNotNullParameter(sj1, "<this>");
        return new A62((RI0) interfaceC4853kJ0G, sj1, C7128v72.d(sj1));
    }

    @NotNull
    public static final GG0 c(@NotNull InterfaceC7828yU interfaceC7828yU) {
        Intrinsics.checkNotNullParameter(interfaceC7828yU, "<this>");
        GG0 gg0 = interfaceC7828yU instanceof GG0 ? (GG0) interfaceC7828yU : null;
        if (gg0 != null) {
            return gg0;
        }
        throw new IllegalStateException(BX.b(C2017Sp1.a, interfaceC7828yU.getClass(), new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ")));
    }

    @Nullable
    public static final Charset d(@NotNull C4651jM c4651jM) {
        Intrinsics.checkNotNullParameter(c4651jM, "<this>");
        String strA = c4651jM.a("charset");
        if (strA == null) {
            return null;
        }
        try {
            return Charset.forName(strA);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    public static final boolean e(@NotNull C7716xw0 allowInexactSize) {
        Intrinsics.checkNotNullParameter(allowInexactSize, "$this$allowInexactSize");
        int iOrdinal = allowInexactSize.m.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C6489s51();
            }
            InterfaceC5739oX1 interfaceC5739oX1 = allowInexactSize.c;
            boolean z = interfaceC5739oX1 instanceof InterfaceC7234ve2;
            OM1 om1 = allowInexactSize.i;
            if (!z) {
                return allowInexactSize.w.a == null ? false : false;
            }
            InterfaceC7234ve2 interfaceC7234ve2 = (InterfaceC7234ve2) interfaceC5739oX1;
            if (interfaceC7234ve2.e() == null || !(om1 instanceof InterfaceC5975pe2) || ((InterfaceC5975pe2) om1).b() != interfaceC7234ve2.e()) {
                if (allowInexactSize.w.a == null || !(om1 instanceof C7106v20)) {
                }
            }
        }
        return true;
    }

    @Nullable
    public static final Drawable f(@NotNull C7716xw0 getDrawableCompat, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(getDrawableCompat, "$this$getDrawableCompat");
        if (num == null || num.intValue() == 0) {
            return null;
        }
        return C3686f.k(getDrawableCompat.a, num.intValue());
    }

    @NotNull
    public static final Class g(@NotNull Type getRawType) {
        Intrinsics.checkNotNullParameter(getRawType, "$this$getRawType");
        Class clsH = C5189lv.h(getRawType);
        Intrinsics.checkNotNullExpressionValue(clsH, "Utils.getRawType(this)");
        return clsH;
    }

    public static int h(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return h(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static final boolean j(@NotNull FC classDescriptor) {
        Intrinsics.checkNotNullParameter(C7996zG.a, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!C4432iZ.l(classDescriptor)) {
            return false;
        }
        LinkedHashSet linkedHashSet = C7996zG.b;
        QC qcF = C4900kZ.f(classDescriptor);
        return CollectionsKt.z(linkedHashSet, qcF != null ? qcF.e() : null);
    }

    public static int k(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return i(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return i(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    @NotNull
    public static final C4651jM l(@NotNull C4651jM c4651jM, @NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(c4651jM, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        String lowerCase = c4651jM.c.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return !Intrinsics.a(lowerCase, "text") ? c4651jM : c4651jM.c(C6927uA.d(charset));
    }
}

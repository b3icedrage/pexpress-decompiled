package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: eS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3573eS1 extends AbstractC3268d0 implements GG0 {

    @NotNull
    public final AbstractC5267mG0 a;

    @NotNull
    public final EnumC3852fl2 b;

    @NotNull
    public final AbstractC4995l0 c;

    @NotNull
    public final WH1 d;
    public int e;

    @Nullable
    public a f;

    @NotNull
    public final C7577xG0 g;

    @Nullable
    public final NG0 h;

    /* JADX INFO: renamed from: eS1$a */
    public static final class a {

        @Nullable
        public String a;
    }

    public C3573eS1(@NotNull AbstractC5267mG0 json, @NotNull EnumC3852fl2 mode, @NotNull AbstractC4995l0 lexer, @NotNull MH1 descriptor, @Nullable a aVar) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(lexer, "lexer");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.a = json;
        this.b = mode;
        this.c = lexer;
        this.d = json.b;
        this.e = -1;
        this.f = aVar;
        C7577xG0 c7577xG0 = json.a;
        this.g = c7577xG0;
        this.h = c7577xG0.e ? null : new NG0(descriptor);
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final short A() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        long jI = abstractC4995l0.i();
        short s = (short) jI;
        if (jI == s) {
            return s;
        }
        AbstractC4995l0.r(abstractC4995l0, "Failed to parse short for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final float B() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        String strL = abstractC4995l0.l();
        try {
            float f = Float.parseFloat(strL);
            if (this.a.a.h || !(Float.isInfinite(f) || Float.isNaN(f))) {
                return f;
            }
            C1874Qu.u(abstractC4995l0, Float.valueOf(f));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'float' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final double E() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        String strL = abstractC4995l0.l();
        try {
            double d = Double.parseDouble(strL);
            if (this.a.a.h || !(Double.isInfinite(d) || Double.isNaN(d))) {
                return d;
            }
            C1874Qu.u(abstractC4995l0, Double.valueOf(d));
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Failed to parse type 'double' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.EH
    @NotNull
    public final G1 a() {
        return this.d;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.EH
    public final void b(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (this.a.a.b && descriptor.e() == 0) {
            while (h(descriptor) != -1) {
            }
        }
        AbstractC4995l0 abstractC4995l0 = this.c;
        if (abstractC4995l0.B()) {
            C1874Qu.p(abstractC4995l0, "");
            throw null;
        }
        abstractC4995l0.h(this.b.e);
        C6739tH0 c6739tH0 = abstractC4995l0.b;
        int i = c6739tH0.c;
        int[] iArr = c6739tH0.b;
        if (iArr[i] == -2) {
            iArr[i] = -1;
            c6739tH0.c = i - 1;
        }
        int i2 = c6739tH0.c;
        if (i2 != -1) {
            c6739tH0.c = i2 - 1;
        }
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    @NotNull
    public final EH c(@NotNull MH1 sd) {
        Intrinsics.checkNotNullParameter(sd, "descriptor");
        AbstractC5267mG0 abstractC5267mG0 = this.a;
        EnumC3852fl2 enumC3852fl2B = C4062gl2.b(abstractC5267mG0, sd);
        AbstractC4995l0 abstractC4995l0 = this.c;
        C6739tH0 c6739tH0 = abstractC4995l0.b;
        Intrinsics.checkNotNullParameter(sd, "sd");
        int i = c6739tH0.c + 1;
        c6739tH0.c = i;
        Object[] objArr = c6739tH0.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            c6739tH0.a = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(c6739tH0.b, i2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            c6739tH0.b = iArrCopyOf;
        }
        c6739tH0.a[i] = sd;
        abstractC4995l0.h(enumC3852fl2B.d);
        if (abstractC4995l0.w() == 4) {
            AbstractC4995l0.r(abstractC4995l0, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        int iOrdinal = enumC3852fl2B.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
            return new C3573eS1(this.a, enumC3852fl2B, abstractC4995l0, sd, this.f);
        }
        if (this.b == enumC3852fl2B && abstractC5267mG0.a.e) {
            return this;
        }
        return new C3573eS1(this.a, enumC3852fl2B, abstractC4995l0, sd, this.f);
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final <T> T d(@NotNull RJ0 deserializer) {
        AbstractC4995l0 abstractC4995l0 = this.c;
        AbstractC5267mG0 abstractC5267mG0 = this.a;
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        try {
            if (!(deserializer instanceof T0)) {
                return (T) deserializer.d(this);
            }
            C7577xG0 c7577xG0 = abstractC5267mG0.a;
            String strA = C7658xf1.a(abstractC5267mG0, ((C8078zf1) deserializer).c());
            String strV = abstractC4995l0.v(strA, this.g.c);
            if (strV == null) {
                return (T) C7658xf1.b(this, deserializer);
            }
            try {
                RJ0 rj0D = C3057c.d((T0) deserializer, this, strV);
                a aVar = new a();
                aVar.a = strA;
                this.f = aVar;
                return (T) rj0D.d(this);
            } catch (ZH1 e) {
                String message = e.getMessage();
                Intrinsics.checkNotNull(message);
                String strN = StringsKt.N(StringsKt.X(message, '\n'), ".");
                String message2 = e.getMessage();
                Intrinsics.checkNotNull(message2);
                AbstractC4995l0.r(abstractC4995l0, strN, 0, StringsKt.U('\n', message2, ""), 2);
                throw null;
            }
        } catch (B01 e2) {
            String message3 = e2.getMessage();
            Intrinsics.checkNotNull(message3);
            if (StringsKt.C(message3, "at path", false)) {
                throw e2;
            }
            throw new B01(e2.d, e2.getMessage() + " at path: " + abstractC4995l0.b.a(), e2);
        }
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final boolean f() {
        boolean z;
        boolean z2;
        AbstractC4995l0 abstractC4995l0 = this.c;
        int iZ = abstractC4995l0.z();
        if (iZ == abstractC4995l0.u().length()) {
            AbstractC4995l0.r(abstractC4995l0, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC4995l0.u().charAt(iZ) == '\"') {
            iZ++;
            z = true;
        } else {
            z = false;
        }
        int iY = abstractC4995l0.y(iZ);
        if (iY >= abstractC4995l0.u().length() || iY == -1) {
            AbstractC4995l0.r(abstractC4995l0, "EOF", 0, null, 6);
            throw null;
        }
        int i = iY + 1;
        int iCharAt = abstractC4995l0.u().charAt(iY) | ' ';
        if (iCharAt == 102) {
            abstractC4995l0.d(i, "alse");
            z2 = false;
        } else {
            if (iCharAt != 116) {
                AbstractC4995l0.r(abstractC4995l0, "Expected valid boolean literal prefix, but had '" + abstractC4995l0.l() + '\'', 0, null, 6);
                throw null;
            }
            abstractC4995l0.d(i, "rue");
            z2 = true;
        }
        if (!z) {
            return z2;
        }
        if (abstractC4995l0.a == abstractC4995l0.u().length()) {
            AbstractC4995l0.r(abstractC4995l0, "EOF", 0, null, 6);
            throw null;
        }
        if (abstractC4995l0.u().charAt(abstractC4995l0.a) == '\"') {
            abstractC4995l0.a++;
            return z2;
        }
        AbstractC4995l0.r(abstractC4995l0, "Expected closing quotation mark", 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final char g() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        String strL = abstractC4995l0.l();
        if (strL.length() == 1) {
            return strL.charAt(0);
        }
        AbstractC4995l0.r(abstractC4995l0, C1742Pc.d('\'', "Expected single char, but got '", strL), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0234 A[EDGE_INSN: B:128:0x0234->B:129:0x0235 BREAK  A[LOOP:0: B:48:0x009a->B:106:0x01b6]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.EH
    public final int h(@NotNull MH1 descriptor) {
        byte b;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        EnumC3852fl2 enumC3852fl2 = this.b;
        int iOrdinal = enumC3852fl2.ordinal();
        AbstractC4995l0 abstractC4995l0 = this.c;
        byte b2 = 1;
        int i = 0;
        zB = false;
        boolean zB = false;
        char c = ':';
        AbstractC5267mG0 abstractC5267mG0 = this.a;
        int i2 = -1;
        C6739tH0 c6739tH0 = abstractC4995l0.b;
        if (iOrdinal == 0) {
            boolean zB2 = abstractC4995l0.B();
            while (true) {
                boolean zC = abstractC4995l0.c();
                NG0 ng0 = this.h;
                if (zC) {
                    C7577xG0 c7577xG0 = this.g;
                    boolean z = c7577xG0.c;
                    byte b3 = b2;
                    String key = z ? abstractC4995l0.m() : abstractC4995l0.e();
                    abstractC4995l0.h(c);
                    int iA = C4847kH0.a(descriptor, abstractC5267mG0, key);
                    if (iA != -3) {
                        if (ng0 != null) {
                            C5016l50 c5016l50 = ng0.a;
                            if (iA < 64) {
                                c5016l50.c |= 1 << iA;
                            } else {
                                int i3 = (iA >>> 6) - 1;
                                long[] jArr = c5016l50.d;
                                jArr[i3] = jArr[i3] | (1 << (iA & 63));
                            }
                        }
                        i2 = iA;
                        break;
                    }
                    if (!c7577xG0.b) {
                        a aVar = this.f;
                        if (aVar == null || !Intrinsics.a(aVar.a, key)) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            abstractC4995l0.q(StringsKt.K(0, 6, abstractC4995l0.A(0, abstractC4995l0.a), key), C1742Pc.d('\'', "Encountered an unknown key '", key), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                            throw null;
                        }
                        aVar.a = null;
                    }
                    ArrayList arrayList = new ArrayList();
                    byte bW = abstractC4995l0.w();
                    if (bW == 8 || bW == 6) {
                        while (true) {
                            byte bW2 = abstractC4995l0.w();
                            b = b3;
                            if (bW2 != b) {
                                if (bW2 == 8 || bW2 == 6) {
                                    arrayList.add(Byte.valueOf(bW2));
                                } else if (bW2 == 9) {
                                    if (((Number) CollectionsKt.L(arrayList)).byteValue() != 8) {
                                        throw C1874Qu.e("found ] instead of } at path: " + c6739tH0, abstractC4995l0.u(), abstractC4995l0.a);
                                    }
                                    C2904bF.s(arrayList);
                                } else if (bW2 == 7) {
                                    if (((Number) CollectionsKt.L(arrayList)).byteValue() != 6) {
                                        throw C1874Qu.e("found } instead of ] at path: " + c6739tH0, abstractC4995l0.u(), abstractC4995l0.a);
                                    }
                                    C2904bF.s(arrayList);
                                } else if (bW2 == 10) {
                                    AbstractC4995l0.r(abstractC4995l0, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                abstractC4995l0.f();
                                if (arrayList.size() == 0) {
                                    break;
                                }
                            } else if (z) {
                                abstractC4995l0.l();
                            } else {
                                abstractC4995l0.e();
                            }
                            b3 = b;
                        }
                    } else {
                        abstractC4995l0.l();
                        b = b3;
                    }
                    zB2 = abstractC4995l0.B();
                    b2 = b;
                    c = ':';
                } else if (!zB2) {
                    if (ng0 == null) {
                        i2 = -1;
                        break;
                    }
                    C5016l50 c5016l51 = ng0.a;
                    MH1 mh1 = c5016l51.a;
                    int iE = mh1.e();
                    while (true) {
                        long j = c5016l51.c;
                        long j2 = -1;
                        NG0.a aVar2 = c5016l51.b;
                        if (j == -1) {
                            if (iE <= 64) {
                                i2 = -1;
                                break;
                            }
                            long[] jArr2 = c5016l51.d;
                            int length = jArr2.length;
                            loop3: while (true) {
                                if (i >= length) {
                                    i2 = -1;
                                    break;
                                }
                                int i4 = i + 1;
                                int i5 = i4 * 64;
                                long j3 = jArr2[i];
                                while (true) {
                                    if (j3 != j2) {
                                        int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j3);
                                        j3 |= 1 << iNumberOfTrailingZeros;
                                        int i6 = iNumberOfTrailingZeros + i5;
                                        if (((Boolean) aVar2.invoke(mh1, Integer.valueOf(i6))).booleanValue()) {
                                            jArr2[i] = j3;
                                            i2 = i6;
                                            break;
                                        }
                                        j2 = -1;
                                    } else {
                                        jArr2[i] = j3;
                                        i = i4;
                                        j2 = -1;
                                    }
                                }
                            }
                        } else {
                            int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j);
                            c5016l51.c |= 1 << iNumberOfTrailingZeros2;
                            if (((Boolean) aVar2.invoke(mh1, Integer.valueOf(iNumberOfTrailingZeros2))).booleanValue()) {
                                i2 = iNumberOfTrailingZeros2;
                                break;
                            }
                        }
                    }
                } else {
                    C7577xG0 c7577xG1 = abstractC5267mG0.a;
                    C1874Qu.p(abstractC4995l0, "object");
                    throw null;
                }
            }
        } else if (iOrdinal != 2) {
            boolean zB3 = abstractC4995l0.B();
            if (abstractC4995l0.c()) {
                int i7 = this.e;
                if (i7 != -1 && !zB3) {
                    AbstractC4995l0.r(abstractC4995l0, "Expected end of the array or comma", 0, null, 6);
                    throw null;
                }
                i2 = i7 + 1;
                this.e = i2;
            } else if (zB3) {
                C7577xG0 c7577xG2 = abstractC5267mG0.a;
                C1874Qu.p(abstractC4995l0, "array");
                throw null;
            }
        } else {
            int i8 = this.e;
            Object[] objArr = i8 % 2 != 0;
            if (objArr != true) {
                abstractC4995l0.h(':');
            } else if (i8 != -1) {
                zB = abstractC4995l0.B();
            }
            if (abstractC4995l0.c()) {
                if (objArr != false) {
                    if (this.e == -1) {
                        int i9 = abstractC4995l0.a;
                        if (zB) {
                            AbstractC4995l0.r(abstractC4995l0, "Unexpected leading comma", i9, null, 4);
                            throw null;
                        }
                    } else {
                        int i10 = abstractC4995l0.a;
                        if (!zB) {
                            AbstractC4995l0.r(abstractC4995l0, "Expected comma after the key-value pair", i10, null, 4);
                            throw null;
                        }
                    }
                }
                i2 = this.e + 1;
                this.e = i2;
            } else if (zB) {
                C7577xG0 c7577xG3 = abstractC5267mG0.a;
                C1874Qu.p(abstractC4995l0, "object");
                throw null;
            }
        }
        if (enumC3852fl2 != EnumC3852fl2.MAP) {
            c6739tH0.b[c6739tH0.c] = i2;
        }
        return i2;
    }

    @Override // defpackage.GG0
    @NotNull
    public final JsonElement l() {
        return new QH0(this.a.a, this.c).b();
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final int o() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        long jI = abstractC4995l0.i();
        int i = (int) jI;
        if (jI == i) {
            return i;
        }
        AbstractC4995l0.r(abstractC4995l0, "Failed to parse int for input '" + jI + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    @NotNull
    public final InterfaceC7828yU q(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (C3993gS1.a(descriptor)) {
            return new HG0(this.c, this.a);
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.EH
    public final <T> T r(@NotNull MH1 descriptor, int i, @NotNull RJ0 deserializer, @Nullable T t) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        boolean z = this.b == EnumC3852fl2.MAP && (i & 1) == 0;
        C6739tH0 c6739tH0 = this.c.b;
        if (z) {
            int[] iArr = c6739tH0.b;
            int i2 = c6739tH0.c;
            if (iArr[i2] == -2) {
                c6739tH0.a[i2] = C6739tH0.a.a;
            }
        }
        T t2 = (T) super.r(descriptor, i, deserializer, t);
        if (z) {
            int[] iArr2 = c6739tH0.b;
            int i3 = c6739tH0.c;
            if (iArr2[i3] != -2) {
                int i4 = i3 + 1;
                c6739tH0.c = i4;
                Object[] objArr = c6739tH0.a;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, i5);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                    c6739tH0.a = objArrCopyOf;
                    int[] iArrCopyOf = Arrays.copyOf(c6739tH0.b, i5);
                    Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
                    c6739tH0.b = iArrCopyOf;
                }
            }
            Object[] objArr2 = c6739tH0.a;
            int i6 = c6739tH0.c;
            objArr2[i6] = t2;
            c6739tH0.b[i6] = -2;
        }
        return t2;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    @NotNull
    public final String t() {
        C7577xG0 c7577xG0 = this.g;
        AbstractC4995l0 abstractC4995l0 = this.c;
        return c7577xG0.c ? abstractC4995l0.m() : abstractC4995l0.j();
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final int u(@NotNull MH1 enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return C4847kH0.b(enumDescriptor, this.a, t(), " at path " + this.c.b.a());
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final long v() {
        return this.c.i();
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final boolean w() {
        NG0 ng0 = this.h;
        if (!(ng0 != null ? ng0.b : false)) {
            AbstractC4995l0 abstractC4995l0 = this.c;
            int iY = abstractC4995l0.y(abstractC4995l0.z());
            int length = abstractC4995l0.u().length() - iY;
            boolean z = false;
            if (length >= 4 && iY != -1) {
                for (int i = 0; i < 4; i++) {
                    if ("null".charAt(i) == abstractC4995l0.u().charAt(iY + i)) {
                    }
                }
                if (length <= 4 || C5208m0.e(abstractC4995l0.u().charAt(iY + 4)) != 0) {
                    abstractC4995l0.a = iY + 4;
                    z = true;
                }
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.GG0
    @NotNull
    public final AbstractC5267mG0 x() {
        return this.a;
    }

    @Override // defpackage.AbstractC3268d0, defpackage.InterfaceC7828yU
    public final byte z() {
        AbstractC4995l0 abstractC4995l0 = this.c;
        long jI = abstractC4995l0.i();
        byte b = (byte) jI;
        if (jI == b) {
            return b;
        }
        AbstractC4995l0.r(abstractC4995l0, "Failed to parse byte for input '" + jI + '\'', 0, null, 6);
        throw null;
    }
}

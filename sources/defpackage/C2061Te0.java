package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Te0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2061Te0 {
    public static final a A;
    public static final a B;
    public static final a C;
    public static final a D;
    public static final a E;
    public static final a F;
    public static final a G;
    public static final a H;
    public static final a I;
    public static final a J;
    public static final a K;
    public static final a L;
    public static final a M;
    public static final a N;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public static final b p;
    public static final a q;
    public static final a r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final a v;
    public static final a w;
    public static final a x;
    public static final a y;
    public static final a z;

    /* JADX INFO: renamed from: Te0$a */
    public static class a extends c<Boolean> {
        @NotNull
        public final Boolean c(int i) {
            return Boolean.valueOf((i & (1 << this.a)) != 0);
        }
    }

    /* JADX INFO: renamed from: Te0$b */
    public static class b<E extends YB0.a> extends c<E> {
        public final E[] c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i, E[] eArr) {
            if (eArr == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
            }
            int i2 = 1;
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i3 = 31; i3 >= 0; i3--) {
                    if (((1 << i3) & length) != 0) {
                        i2 = 1 + i3;
                    }
                }
                throw new IllegalStateException("Empty enum: " + eArr.getClass());
            }
            super(i, i2);
            this.c = eArr;
        }

        @Nullable
        public final Object c(int i) {
            int i2 = (1 << this.b) - 1;
            int i3 = this.a;
            int i4 = (i & (i2 << i3)) >> i3;
            for (E e : this.c) {
                if (e.getNumber() == i4) {
                    return e;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Te0$c */
    public static abstract class c<E> {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static a a(c<?> cVar) {
            return new a(cVar.a + cVar.b, 1);
        }

        public static a b() {
            return new a(0, 1);
        }
    }

    static {
        a aVarB = c.b();
        a = aVarB;
        b = c.a(aVarB);
        a aVarB2 = c.b();
        c = aVarB2;
        EnumC5788ok1[] enumC5788ok1ArrValues = EnumC5788ok1.values();
        int i2 = aVarB2.a + aVarB2.b;
        b bVar = new b(i2, enumC5788ok1ArrValues);
        d = bVar;
        EnumC3009bk1[] enumC3009bk1ArrValues = EnumC3009bk1.values();
        int i3 = i2 + bVar.b;
        b bVar2 = new b(i3, enumC3009bk1ArrValues);
        e = bVar2;
        C2077Tj1.c[] cVarArrValues = C2077Tj1.c.values();
        int i4 = bVar2.b;
        b bVar3 = new b(i3 + i4, cVarArrValues);
        f = bVar3;
        a aVarA = c.a(bVar3);
        g = aVarA;
        a aVarA2 = c.a(aVarA);
        h = aVarA2;
        a aVarA3 = c.a(aVarA2);
        i = aVarA3;
        a aVarA4 = c.a(aVarA3);
        j = aVarA4;
        a aVarA5 = c.a(aVarA4);
        k = aVarA5;
        a aVarA6 = c.a(aVarA5);
        l = aVarA6;
        m = c.a(aVarA6);
        a aVarA7 = c.a(bVar);
        n = aVarA7;
        o = c.a(aVarA7);
        b bVar4 = new b(i3 + i4, EnumC2785ak1.values());
        p = bVar4;
        a aVarA8 = c.a(bVar4);
        q = aVarA8;
        a aVarA9 = c.a(aVarA8);
        r = aVarA9;
        a aVarA10 = c.a(aVarA9);
        s = aVarA10;
        a aVarA11 = c.a(aVarA10);
        t = aVarA11;
        a aVarA12 = c.a(aVarA11);
        u = aVarA12;
        a aVarA13 = c.a(aVarA12);
        v = aVarA13;
        a aVarA14 = c.a(aVarA13);
        w = aVarA14;
        x = c.a(aVarA14);
        a aVarA15 = c.a(bVar4);
        y = aVarA15;
        a aVarA16 = c.a(aVarA15);
        z = aVarA16;
        a aVarA17 = c.a(aVarA16);
        A = aVarA17;
        a aVarA18 = c.a(aVarA17);
        B = aVarA18;
        a aVarA19 = c.a(aVarA18);
        C = aVarA19;
        a aVarA20 = c.a(aVarA19);
        D = aVarA20;
        a aVarA21 = c.a(aVarA20);
        E = aVarA21;
        a aVarA22 = c.a(aVarA21);
        F = aVarA22;
        G = c.a(aVarA22);
        a aVarA23 = c.a(aVarB2);
        H = aVarA23;
        a aVarA24 = c.a(aVarA23);
        I = aVarA24;
        J = c.a(aVarA24);
        a aVarA25 = c.a(bVar2);
        K = aVarA25;
        a aVarA26 = c.a(aVarA25);
        L = aVarA26;
        M = c.a(aVarA26);
        N = c.b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:18:0x002b  */
    public static /* synthetic */ void a(int i2) {
        Object[] objArr = new Object[3];
        if (i2 == 1) {
            objArr[0] = "modality";
        } else if (i2 == 2) {
            objArr[0] = "kind";
        } else if (i2 == 5) {
            objArr[0] = "modality";
        } else if (i2 == 6) {
            objArr[0] = "memberKind";
        } else if (i2 == 8) {
            objArr[0] = "modality";
        } else if (i2 == 9) {
            objArr[0] = "memberKind";
        } else if (i2 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i2) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case 6:
                objArr[2] = "getFunctionFlags";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}

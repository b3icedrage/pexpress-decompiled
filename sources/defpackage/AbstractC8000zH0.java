package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: zH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8000zH0 implements Closeable {
    public int d;
    public int[] e = new int[32];
    public String[] g = new String[32];
    public int[] h = new int[32];

    /* JADX INFO: renamed from: zH0$a */
    public static final class a {
        public final String[] a;
        public final C4437ia1 b;

        public a(String[] strArr, C4437ia1 c4437ia1) {
            this.a = strArr;
            this.b = c4437ia1;
        }

        @CheckReturnValue
        public static a a(String... strArr) {
            try {
                C1802Pw[] c1802PwArr = new C1802Pw[strArr.length];
                C1481Lu c1481Lu = new C1481Lu();
                for (int i = 0; i < strArr.length; i++) {
                    UH0.Z(c1481Lu, strArr[i]);
                    c1481Lu.P();
                    c1802PwArr[i] = c1481Lu.X(c1481Lu.e);
                }
                String[] strArr2 = (String[]) strArr.clone();
                int i2 = C4437ia1.h;
                return new a(strArr2, C4437ia1.a.b(c1802PwArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zH0$b */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final b g;
        public static final b h;
        public static final b i;
        public static final b j;
        public static final b k;
        public static final b l;
        public static final b m;
        public static final b n;
        public static final /* synthetic */ b[] o;

        static {
            b bVar = new b("BEGIN_ARRAY", 0);
            d = bVar;
            b bVar2 = new b("END_ARRAY", 1);
            e = bVar2;
            b bVar3 = new b("BEGIN_OBJECT", 2);
            g = bVar3;
            b bVar4 = new b("END_OBJECT", 3);
            h = bVar4;
            b bVar5 = new b("NAME", 4);
            i = bVar5;
            b bVar6 = new b("STRING", 5);
            j = bVar6;
            b bVar7 = new b("NUMBER", 6);
            k = bVar7;
            b bVar8 = new b("BOOLEAN", 7);
            l = bVar8;
            b bVar9 = new b("NULL", 8);
            m = bVar9;
            b bVar10 = new b("END_DOCUMENT", 9);
            n = bVar10;
            o = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9, bVar10};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) o.clone();
        }
    }

    public abstract String B();

    public abstract void B0();

    public abstract int E0();

    public abstract void I();

    public abstract void X0();

    public abstract long a1();

    @CheckReturnValue
    public final String c() {
        return C5208m0.l(this.d, this.e, this.g, this.h);
    }

    public abstract double d0();

    public abstract boolean f();

    @Nullable
    public abstract void g();

    public abstract void h1();

    @CheckReturnValue
    public abstract boolean hasNext();

    @CheckReturnValue
    public abstract b k();

    public abstract void l();

    public abstract void l1();

    public final void p(int i) {
        int i2 = this.d;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new EG0("Nesting too deep at " + c());
            }
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.g;
            this.g = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.h;
            this.h = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @CheckReturnValue
    public abstract int q(a aVar);

    @CheckReturnValue
    public abstract int t(a aVar);

    public abstract void u();

    public final void v(String str) throws WG0 {
        StringBuilder sbB = K1.b(str, " at path ");
        sbB.append(c());
        throw new WG0(sbB.toString());
    }
}

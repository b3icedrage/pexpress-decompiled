package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class L20 {
    public String a;
    public String b;
    public float c;
    public a d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final /* synthetic */ a[] e;

        /* JADX INFO: Fake field, exist only in values array */
        a EF0;

        static {
            a aVar = new a("LEFT_ALIGN", 0);
            a aVar2 = new a("RIGHT_ALIGN", 1);
            a aVar3 = new a("CENTER", 2);
            d = aVar3;
            e = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }
    }

    public final int hashCode() {
        int iOrdinal = ((this.d.ordinal() + (((int) (C1039Gc0.b(this.a.hashCode() * 31, 31, this.b) + this.c)) * 31)) * 31) + this.e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f);
        return (((iOrdinal * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.h;
    }
}

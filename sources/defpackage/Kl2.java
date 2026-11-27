package defpackage;

import android.graphics.Paint;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class Kl2 extends AbstractC2510Yo {
    public final a F;
    public final boolean A = true;
    public final boolean B = true;
    public float C = 10.0f;
    public final float D = 10.0f;
    public b E = b.d;
    public final float G = Float.POSITIVE_INFINITY;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] g;

        static {
            a aVar = new a("LEFT", 0);
            d = aVar;
            a aVar2 = new a("RIGHT", 1);
            e = aVar2;
            g = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b d;
        public static final b e;
        public static final /* synthetic */ b[] g;

        static {
            b bVar = new b("OUTSIDE_CHART", 0);
            d = bVar;
            b bVar2 = new b("INSIDE_CHART", 1);
            e = bVar2;
            g = new b[]{bVar, bVar2};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) g.clone();
        }
    }

    public Kl2(a aVar) {
        this.F = aVar;
        this.c = 0.0f;
    }

    @Override // defpackage.AbstractC2510Yo
    public final void a(float f, float f2) {
        if (Math.abs(f2 - f) == 0.0f) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float fAbs = Math.abs(f2 - f);
        float f3 = this.v ? this.y : f - ((fAbs / 100.0f) * this.D);
        this.y = f3;
        float f4 = this.w ? this.x : f2 + ((fAbs / 100.0f) * this.C);
        this.x = f4;
        this.z = Math.abs(f3 - f4);
    }

    public final float e(Paint paint) {
        paint.setTextSize(this.d);
        String strC = c();
        DisplayMetrics displayMetrics = AbstractC8067zc2.a;
        float fMeasureText = (this.b * 2.0f) + ((int) paint.measureText(strC));
        float fC = this.G;
        if (fC > 0.0f && fC != Float.POSITIVE_INFINITY) {
            fC = AbstractC8067zc2.c(fC);
        }
        if (fC <= 0.0d) {
            fC = fMeasureText;
        }
        return Math.max(0.0f, Math.min(fMeasureText, fC));
    }
}

package defpackage;

/* JADX INFO: renamed from: r30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6270r30 {
    public static final e a;
    public static final c b;
    public static final d c;
    public static final f d;
    public static final d e;
    public static final Z91<AbstractC6270r30> f;
    public static final boolean g;

    /* JADX INFO: renamed from: r30$a */
    public static class a extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return g.e;
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: renamed from: r30$b */
    public static class b extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return g.d;
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: renamed from: r30$c */
    public static class c extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.e : AbstractC6270r30.a.a(i, i2, i3, i4);
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, AbstractC6270r30.a.b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: renamed from: r30$d */
    public static class d extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return g.e;
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: renamed from: r30$e */
    public static class e extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return AbstractC6270r30.g ? g.e : g.d;
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            if (AbstractC6270r30.g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: renamed from: r30$f */
    public static class f extends AbstractC6270r30 {
        @Override // defpackage.AbstractC6270r30
        public final g a(int i, int i2, int i3, int i4) {
            return g.e;
        }

        @Override // defpackage.AbstractC6270r30
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: r30$g */
    public static final class g {
        public static final g d;
        public static final g e;
        public static final /* synthetic */ g[] g;

        static {
            g gVar = new g("MEMORY", 0);
            d = gVar;
            g gVar2 = new g("QUALITY", 1);
            e = gVar2;
            g = new g[]{gVar, gVar2};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) g.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        b = new c();
        d dVar = new d();
        c = dVar;
        d = new f();
        e = dVar;
        f = Z91.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}

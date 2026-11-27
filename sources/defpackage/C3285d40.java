package defpackage;

import android.graphics.Color;

/* JADX INFO: renamed from: d40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3285d40 implements AbstractC1002Fq.a {
    public final Object a;
    public final C3532eF b;
    public final C4036gf0 c;
    public final C4036gf0 d;
    public final C4036gf0 e;
    public final C4036gf0 f;
    public boolean g = true;

    /* JADX INFO: renamed from: d40$a */
    public class a extends NU0<Float> {
        public final /* synthetic */ NU0 c;

        public a(NU0 nu0) {
            this.c = nu0;
        }

        @Override // defpackage.NU0
        public final Float a(EU0<Float> eu0) {
            Float f = (Float) this.c.b;
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public C3285d40(AbstractC1002Fq.a aVar, AbstractC1158Hq abstractC1158Hq, C2866b40 c2866b40) {
        this.a = aVar;
        AbstractC1002Fq<Integer, Integer> abstractC1002FqJ = c2866b40.a.j();
        this.b = (C3532eF) abstractC1002FqJ;
        abstractC1002FqJ.a(this);
        abstractC1158Hq.g(abstractC1002FqJ);
        AbstractC1002Fq<Float, Float> abstractC1002FqJ2 = c2866b40.b.j();
        this.c = (C4036gf0) abstractC1002FqJ2;
        abstractC1002FqJ2.a(this);
        abstractC1158Hq.g(abstractC1002FqJ2);
        AbstractC1002Fq<Float, Float> abstractC1002FqJ3 = c2866b40.c.j();
        this.d = (C4036gf0) abstractC1002FqJ3;
        abstractC1002FqJ3.a(this);
        abstractC1158Hq.g(abstractC1002FqJ3);
        AbstractC1002Fq<Float, Float> abstractC1002FqJ4 = c2866b40.d.j();
        this.e = (C4036gf0) abstractC1002FqJ4;
        abstractC1002FqJ4.a(this);
        abstractC1158Hq.g(abstractC1002FqJ4);
        AbstractC1002Fq<Float, Float> abstractC1002FqJ5 = c2866b40.e.j();
        this.f = (C4036gf0) abstractC1002FqJ5;
        abstractC1002FqJ5.a(this);
        abstractC1158Hq.g(abstractC1002FqJ5);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Fq$a, java.lang.Object] */
    @Override // defpackage.AbstractC1002Fq.a
    public final void a() {
        this.g = true;
        this.a.a();
    }

    public final void b(KL0 kl0) {
        if (this.g) {
            this.g = false;
            double dFloatValue = ((double) this.d.f().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.e.f().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.b.f().intValue();
            kl0.setShadowLayer(this.f.f().floatValue(), fSin, fCos, Color.argb(Math.round(this.c.f().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public final void c(NU0<Float> nu0) {
        this.c.k(new a(nu0));
    }
}

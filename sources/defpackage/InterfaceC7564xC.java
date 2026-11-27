package defpackage;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: xC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7564xC {

    /* JADX INFO: renamed from: xC$a */
    public static class a implements TypeEvaluator<d> {
        public static final a b = new a();
        public final d a = new d();

        @Override // android.animation.TypeEvaluator
        @NonNull
        public final d evaluate(float f, @NonNull d dVar, @NonNull d dVar2) {
            d dVar3 = dVar;
            d dVar4 = dVar2;
            float f2 = dVar3.a;
            float f3 = 1.0f - f;
            float f4 = (dVar4.a * f) + (f2 * f3);
            float f5 = dVar3.b;
            float f6 = (dVar4.b * f) + (f5 * f3);
            float f7 = dVar3.c;
            float f8 = (f * dVar4.c) + (f3 * f7);
            d dVar5 = this.a;
            dVar5.a = f4;
            dVar5.b = f6;
            dVar5.c = f8;
            return dVar5;
        }
    }

    /* JADX INFO: renamed from: xC$b */
    public static class b extends Property<InterfaceC7564xC, d> {
        public static final b a = new b(d.class, "circularReveal");

        @Override // android.util.Property
        public final d get(@NonNull InterfaceC7564xC interfaceC7564xC) {
            return interfaceC7564xC.getRevealInfo();
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC7564xC interfaceC7564xC, d dVar) {
            interfaceC7564xC.setRevealInfo(dVar);
        }
    }

    /* JADX INFO: renamed from: xC$c */
    public static class c extends Property<InterfaceC7564xC, Integer> {
        public static final c a = new c(Integer.class, "circularRevealScrimColor");

        @Override // android.util.Property
        @NonNull
        public final Integer get(@NonNull InterfaceC7564xC interfaceC7564xC) {
            return Integer.valueOf(interfaceC7564xC.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        public final void set(@NonNull InterfaceC7564xC interfaceC7564xC, @NonNull Integer num) {
            interfaceC7564xC.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* JADX INFO: renamed from: xC$d */
    public static class d {
        public float a;
        public float b;
        public float c;

        public d() {
        }

        public d(float f, float f2, float f3) {
            this.a = f;
            this.b = f2;
            this.c = f3;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(d dVar);
}

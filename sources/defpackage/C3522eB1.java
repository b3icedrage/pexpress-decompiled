package defpackage;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: eB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3522eB1 extends C6561sS {
    @Override // defpackage.C6561sS
    public final void h(@NonNull C3549eK1 c3549eK1, float f, float f2) {
        c3549eK1.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        c3549eK1.getClass();
        C3549eK1.c cVar = new C3549eK1.c(0.0f, 0.0f, f3, f3);
        cVar.f = 180.0f;
        cVar.g = 90.0f;
        c3549eK1.f.add(cVar);
        C3549eK1.a aVar = new C3549eK1.a(cVar);
        float f4 = 180.0f + 90.0f;
        boolean z = 90.0f < 0.0f;
        float f5 = z ? (180.0f + 180.0f) % 360.0f : 180.0f;
        float f6 = z ? (180.0f + f4) % 360.0f : f4;
        c3549eK1.a(f5);
        c3549eK1.g.add(aVar);
        c3549eK1.d = f6;
        double d = f4;
        c3549eK1.b = (((f3 - 0.0f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
        c3549eK1.c = (((f3 - 0.0f) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((0.0f + f3) * 0.5f);
    }
}

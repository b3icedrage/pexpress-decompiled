package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Gl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1066Gl0 extends I30<C0988Fl0> {
    @Override // defpackage.I30, defpackage.InterfaceC3518eA0
    public final void a() {
        ((C0988Fl0) this.d).d.a.l.prepareToDraw();
    }

    @Override // defpackage.InterfaceC3667et1
    public final void b() {
        OU0 ou0;
        OU0 ou1;
        OU0 ou2;
        C0988Fl0 c0988Fl0 = (C0988Fl0) this.d;
        c0988Fl0.stop();
        c0988Fl0.h = true;
        C1300Jl0 c1300Jl0 = c0988Fl0.d.a;
        c1300Jl0.c.clear();
        Bitmap bitmap = c1300Jl0.l;
        if (bitmap != null) {
            c1300Jl0.e.c(bitmap);
            c1300Jl0.l = null;
        }
        c1300Jl0.f = false;
        C1300Jl0.a aVar = c1300Jl0.i;
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = c1300Jl0.d;
        if (aVar != null) {
            componentCallbacks2C1166Hs1.l(aVar);
            c1300Jl0.i = null;
        }
        C1300Jl0.a aVar2 = c1300Jl0.k;
        if (aVar2 != null) {
            componentCallbacks2C1166Hs1.l(aVar2);
            c1300Jl0.k = null;
        }
        C1300Jl0.a aVar3 = c1300Jl0.n;
        if (aVar3 != null) {
            componentCallbacks2C1166Hs1.l(aVar3);
            c1300Jl0.n = null;
        }
        C3774fP1 c3774fP1 = c1300Jl0.a;
        c3774fP1.l = null;
        byte[] bArr = c3774fP1.i;
        InterfaceC0910El0.a aVar4 = c3774fP1.c;
        if (bArr != null && (ou2 = ((C0832Dl0) aVar4).b) != null) {
            ou2.h(bArr);
        }
        int[] iArr = c3774fP1.j;
        if (iArr != null && (ou1 = ((C0832Dl0) aVar4).b) != null) {
            ou1.h(iArr);
        }
        Bitmap bitmap2 = c3774fP1.m;
        if (bitmap2 != null) {
            ((C0832Dl0) aVar4).a.c(bitmap2);
        }
        c3774fP1.m = null;
        c3774fP1.d = null;
        c3774fP1.s = null;
        byte[] bArr2 = c3774fP1.e;
        if (bArr2 != null && (ou0 = ((C0832Dl0) aVar4).b) != null) {
            ou0.h(bArr2);
        }
        c1300Jl0.j = true;
    }

    @Override // defpackage.InterfaceC3667et1
    public final int c() {
        C1300Jl0 c1300Jl0 = ((C0988Fl0) this.d).d.a;
        C3774fP1 c3774fP1 = c1300Jl0.a;
        return (c3774fP1.j.length * 4) + c3774fP1.d.limit() + c3774fP1.i.length + c1300Jl0.o;
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Class<C0988Fl0> d() {
        return C0988Fl0.class;
    }
}

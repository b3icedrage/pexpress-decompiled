package defpackage;

import androidx.annotation.NonNull;
import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5512nS implements InterfaceC6981uS, InterfaceC6771tS.a<Object> {
    public final List<InterfaceC3129cK0> d;
    public final C6567sU<?> e;
    public final InterfaceC6981uS.a g;
    public int h = -1;
    public InterfaceC3129cK0 i;
    public List<I01<File, ?>> j;
    public int k;
    public volatile I01.a<?> l;
    public File m;

    public C5512nS(List<InterfaceC3129cK0> list, C6567sU<?> c6567sU, InterfaceC6981uS.a aVar) {
        this.d = list;
        this.e = c6567sU;
        this.g = aVar;
    }

    @Override // defpackage.InterfaceC6981uS
    public final boolean a() {
        while (true) {
            List<I01<File, ?>> list = this.j;
            boolean z = false;
            if (list != null && this.k < list.size()) {
                this.l = null;
                while (!z && this.k < this.j.size()) {
                    List<I01<File, ?>> list2 = this.j;
                    int i = this.k;
                    this.k = i + 1;
                    I01<File, ?> i01 = list2.get(i);
                    File file = this.m;
                    C6567sU<?> c6567sU = this.e;
                    this.l = i01.b(file, c6567sU.e, c6567sU.f, c6567sU.i);
                    if (this.l != null && this.e.c(this.l.c.a()) != null) {
                        this.l.c.c(this.e.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.h + 1;
            this.h = i2;
            if (i2 >= this.d.size()) {
                return false;
            }
            InterfaceC3129cK0 interfaceC3129cK0 = this.d.get(this.h);
            C6567sU<?> c6567sU2 = this.e;
            File fileA = c6567sU2.h.a().a(new C5722oS(interfaceC3129cK0, c6567sU2.n));
            this.m = fileA;
            if (fileA != null) {
                this.i = interfaceC3129cK0;
                this.j = this.e.c.a().f(fileA);
                this.k = 0;
            }
        }
    }

    @Override // defpackage.InterfaceC6981uS
    public final void cancel() {
        I01.a<?> aVar = this.l;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC6771tS.a
    public final void d(@NonNull Exception exc) {
        this.g.e(this.i, exc, this.l.c, CS.g);
    }

    @Override // defpackage.InterfaceC6771tS.a
    public final void f(Object obj) {
        this.g.b(this.i, obj, this.l.c, CS.g, this.i);
    }
}

package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ b.d d;
    public final /* synthetic */ h e;
    public final /* synthetic */ f g;
    public final /* synthetic */ b.c h;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.h = cVar;
        this.d = dVar;
        this.e = hVar;
        this.g = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.d;
        if (dVar != null) {
            b.c cVar = this.h;
            b.this.D = true;
            dVar.b.c(false);
            b.this.D = false;
        }
        h hVar = this.e;
        if (hVar.isEnabled() && hVar.hasSubMenu()) {
            this.g.q(hVar, null, 4);
        }
    }
}

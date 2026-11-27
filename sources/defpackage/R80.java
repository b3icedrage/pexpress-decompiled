package defpackage;

import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class R80 implements FS0 {
    public String d;
    public JU1 e;
    public LinkedBlockingQueue g;

    @Override // defpackage.FS0
    public final void a() {
        b();
    }

    public final void b() {
        LU1 lu1 = new LU1();
        System.currentTimeMillis();
        lu1.a = this.e;
        Thread.currentThread().getName();
        this.g.add(lu1);
    }

    @Override // defpackage.FS0
    public final void c(String str) {
        b();
    }

    @Override // defpackage.FS0
    public final String getName() {
        return this.d;
    }
}

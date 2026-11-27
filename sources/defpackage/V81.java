package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class V81 extends C5494nM implements InterfaceC2939bQ1, InterfaceC7183vP0 {
    public boolean h = false;

    @Override // defpackage.InterfaceC2939bQ1
    public final void i(YP1 yp1) {
        if (this.h) {
            StringBuilder sb = new StringBuilder();
            C3567eQ1.a(sb, "", yp1);
            System.out.print(sb);
        }
    }

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        this.h = true;
        if (this.e == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (XP1 xp1 : this.e.g.c()) {
            if (jCurrentTimeMillis - xp1.c().longValue() < 300) {
                StringBuilder sb = new StringBuilder();
                C3567eQ1.a(sb, "", xp1);
                System.out.print(sb);
            }
        }
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        this.h = false;
    }
}

package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class O92<E> extends C5494nM implements InterfaceC7668xi<E> {
    public String j;
    public boolean h = false;
    public final ThreadLocal<Boolean> i = new ThreadLocal<>();
    public final NK0 k = new NK0(1);
    public int l = 0;
    public int m = 0;

    @Override // defpackage.InterfaceC7668xi
    public final void b(String str) {
        this.j = str;
    }

    @Override // defpackage.InterfaceC7668xi
    public final void f(QS0 qs0) {
        Boolean bool = Boolean.TRUE;
        ThreadLocal<Boolean> threadLocal = this.i;
        if (bool.equals(threadLocal.get())) {
            return;
        }
        try {
            threadLocal.set(bool);
            if (this.h) {
                this.k.r(qs0);
                q(qs0);
            } else {
                int i = this.l;
                this.l = i + 1;
                if (i < 3) {
                    o(new Ff2("Attempted to append to non started appender [" + this.j + "].", this));
                }
            }
        } catch (Exception e) {
            int i2 = this.m;
            this.m = i2 + 1;
            if (i2 < 3) {
                m("Appender [" + this.j + "] failed to append.", e);
            }
        } finally {
            threadLocal.set(Boolean.FALSE);
        }
    }

    @Override // defpackage.InterfaceC7668xi
    public final String getName() {
        return this.j;
    }

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    public abstract void q(QS0 qs0);

    @Override // defpackage.InterfaceC7183vP0
    public void start() {
        this.h = true;
    }

    @Override // defpackage.InterfaceC7183vP0
    public void stop() {
        this.h = false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        return C5807oq.b(sb, this.j, "]");
    }
}

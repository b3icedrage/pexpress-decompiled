package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class IV implements InterfaceC1466Lo1 {
    public double a;

    @Override // defpackage.InterfaceC1466Lo1
    public final long a() {
        double dRandom = (Math.random() + ((double) 1)) * this.a;
        if (dRandom > 60000.0d) {
            dRandom = 60000.0d;
        }
        this.a = dRandom;
        return (long) dRandom;
    }

    @Override // defpackage.InterfaceC1466Lo1
    public final void reset() {
        this.a = 3000.0d;
    }
}

package defpackage;

/* JADX INFO: renamed from: Ns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1634Ns extends AbstractC6909u51 {
    @Override // defpackage.AbstractC6909u51
    public final AbstractC6909u51 c() {
        return (AbstractC1634Ns) this.a;
    }

    @Override // defpackage.AbstractC6909u51
    public final void d(AbstractC6909u51 abstractC6909u51) {
        if (!(abstractC6909u51 instanceof AbstractC1634Ns)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        this.a = abstractC6909u51;
    }
}

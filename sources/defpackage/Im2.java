package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class Im2 implements Jm2 {
    public static final Object g = new Object();
    public volatile Jm2 d;
    public volatile Object e;

    public static Jm2 a(Jm2 jm2) {
        if (jm2 instanceof Im2) {
            return jm2;
        }
        Im2 im2 = new Im2();
        im2.e = g;
        im2.d = jm2;
        return im2;
    }

    @Override // defpackage.Jm2
    public final Object zza() {
        Object objZza;
        Object obj = this.e;
        Object obj2 = g;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                objZza = this.e;
                if (objZza == obj2) {
                    objZza = this.d.zza();
                    Object obj3 = this.e;
                    if (obj3 != obj2 && obj3 != objZza) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZza + ". This is likely due to a circular dependency.");
                    }
                    this.e = objZza;
                    this.d = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objZza;
    }
}

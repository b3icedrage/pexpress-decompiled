package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zn2 extends AbstractC4725ji {
    @Override // defpackage.AbstractC4725ji
    public final boolean a() {
        return false;
    }

    @Override // defpackage.AbstractC4725ji
    public final int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4725ji)) {
            return false;
        }
        AbstractC4725ji abstractC4725ji = (AbstractC4725ji) obj;
        return abstractC4725ji.b() == 0 && !abstractC4725ji.a();
    }

    public final int hashCode() {
        return -721381028;
    }

    public final String toString() {
        return "AppUpdateOptions{appUpdateType=0, allowAssetPackDeletion=false}";
    }
}

package defpackage;

/* JADX INFO: renamed from: mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5355mh0<E> extends AbstractC3946gD {
    @Override // defpackage.AbstractC3946gD
    public final String i(QS0 qs0, String str) {
        return "\u001b[" + m(qs0) + "m" + str + "\u001b[0;39m";
    }

    public abstract String m(QS0 qs0);
}

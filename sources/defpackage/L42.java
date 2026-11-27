package defpackage;

import defpackage.L42;

/* JADX INFO: loaded from: classes.dex */
public abstract class L42<CHILD extends L42<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    public I42<? super TranscodeType> d = C6279r51.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof L42) {
            return C6177qc2.b(this.d, ((L42) obj).d);
        }
        return false;
    }

    public int hashCode() {
        I42<? super TranscodeType> i42 = this.d;
        if (i42 != null) {
            return i42.hashCode();
        }
        return 0;
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Lj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1451Lj1 extends AbstractC1568Mx implements IJ0 {
    public final boolean k;

    public AbstractC1451Lj1() {
        this.k = false;
    }

    @Override // defpackage.AbstractC1568Mx
    public final JI0 e() {
        return this.k ? this : super.e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1451Lj1) {
            AbstractC1451Lj1 abstractC1451Lj1 = (AbstractC1451Lj1) obj;
            return j().equals(abstractC1451Lj1.j()) && getName().equals(abstractC1451Lj1.getName()) && o().equals(abstractC1451Lj1.o()) && Intrinsics.a(this.e, abstractC1451Lj1.e);
        }
        if (obj instanceof IJ0) {
            return obj.equals(e());
        }
        return false;
    }

    public final int hashCode() {
        return o().hashCode() + ((getName().hashCode() + (j().hashCode() * 31)) * 31);
    }

    @Override // defpackage.AbstractC1568Mx
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final IJ0 m() {
        if (this.k) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (IJ0) super.m();
    }

    public final String toString() {
        JI0 ji0E = e();
        if (ji0E != this) {
            return ji0E.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public AbstractC1451Lj1(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.k = (i & 2) == 2;
    }
}

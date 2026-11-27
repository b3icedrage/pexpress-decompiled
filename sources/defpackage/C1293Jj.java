package defpackage;

import java.util.RandomAccess;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1293Jj extends AbstractC5838p0<Integer> implements RandomAccess {
    public final /* synthetic */ int[] e;

    public C1293Jj(int[] iArr) {
        this.e = iArr;
    }

    @Override // defpackage.Y
    public final int b() {
        return this.e.length;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0027 A[RETURN] */
    @Override // defpackage.Y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        int i = 0;
        while (i < length) {
            if (iIntValue == iArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return Integer.valueOf(this.e[i]);
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            if (iIntValue == iArr[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.Y, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.e.length == 0;
    }

    @Override // defpackage.AbstractC5838p0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.e;
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i >= 0) {
                    length = i;
                }
            }
        }
        return -1;
    }
}

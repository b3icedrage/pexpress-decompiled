package j$.time.format;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class e implements f {
    private final f[] a;
    private final boolean b;

    e(ArrayList arrayList, boolean z) {
        this((f[]) arrayList.toArray(new f[arrayList.size()]), z);
    }

    e(f[] fVarArr, boolean z) {
        this.a = fVarArr;
        this.b = z;
    }

    public final e a() {
        return !this.b ? this : new e(this.a, false);
    }

    @Override // j$.time.format.f
    public final boolean p(r rVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            rVar.g();
        }
        try {
            for (f fVar : this.a) {
                if (!fVar.p(rVar, sb)) {
                    sb.setLength(length);
                    if (z) {
                        return true;
                    }
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                rVar.a();
            }
        }
    }

    @Override // j$.time.format.f
    public final int r(p pVar, CharSequence charSequence, int i) {
        boolean z = this.b;
        f[] fVarArr = this.a;
        if (z) {
            pVar.q();
            int iR = i;
            for (f fVar : fVarArr) {
                iR = fVar.r(pVar, charSequence, iR);
                if (iR < 0) {
                    pVar.e(false);
                    return i;
                }
            }
            pVar.e(true);
            return iR;
        }
        for (f fVar2 : fVarArr) {
            i = fVar2.r(pVar, charSequence, i);
            if (i < 0) {
                return i;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f[] fVarArr = this.a;
        if (fVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (f fVar : fVarArr) {
                sb.append(fVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}

package defpackage;

/* JADX INFO: renamed from: qX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6159qX1 implements InterfaceC7096v {
    public final int d;

    public C6159qX1(int i) {
        this.d = i;
    }

    @Override // defpackage.InterfaceC7096v
    public final String a(String str) {
        int i = this.d;
        StringBuilder sb = new StringBuilder(i);
        if (str == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (str.length() >= i) {
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int iIndexOf = str.indexOf(46, i2);
                if (iIndexOf == -1 || i3 >= 16) {
                    break;
                }
                iArr[i3] = iIndexOf;
                i3++;
                i2 = iIndexOf + 1;
            }
            if (i3 != 0) {
                int length = str.length() - i;
                int i4 = 0;
                while (i4 < i3) {
                    int i5 = (iArr[i4] - (i4 > 0 ? iArr[i4 - 1] : -1)) - 1;
                    int i6 = (length <= 0 || i5 < 1) ? i5 : 1;
                    length -= i5 - i6;
                    iArr2[i4] = i6 + 1;
                    i4++;
                }
                iArr2[i3] = str.length() - iArr[i3 - 1];
                for (int i7 = 0; i7 <= i3; i7++) {
                    if (i7 == 0) {
                        sb.append(str.substring(0, iArr2[i7] - 1));
                    } else {
                        int i8 = iArr[i7 - 1];
                        sb.append(str.substring(i8, iArr2[i7] + i8));
                    }
                }
                return sb.toString();
            }
        }
        return str;
    }
}

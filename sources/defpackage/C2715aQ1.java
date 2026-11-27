package defpackage;

/* JADX INFO: renamed from: aQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2715aQ1 {
    public final int a;
    public final String b;

    public C2715aQ1(String str) {
        String[] strArrSplit = str.split(" +", 3);
        if (strArrSplit.length < 2) {
            throw new IllegalArgumentException();
        }
        String str2 = strArrSplit[0];
        this.a = Integer.parseInt(strArrSplit[1]);
        if (strArrSplit.length == 3) {
            String str3 = strArrSplit[2];
        }
        this.b = str;
    }

    public final String toString() {
        return this.b;
    }
}

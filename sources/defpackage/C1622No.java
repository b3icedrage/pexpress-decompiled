package defpackage;

import android.os.Build;

/* JADX INFO: renamed from: No, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1622No extends WP1.c {
    public final String a;
    public final String b;
    public final boolean c;

    public C1622No(boolean z) {
        String str = Build.VERSION.RELEASE;
        String str2 = Build.VERSION.CODENAME;
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.b = str2;
        this.c = z;
    }

    @Override // WP1.c
    public final boolean a() {
        return this.c;
    }

    @Override // WP1.c
    public final String b() {
        return this.b;
    }

    @Override // WP1.c
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WP1.c)) {
            return false;
        }
        WP1.c cVar = (WP1.c) obj;
        return this.a.equals(cVar.c()) && this.b.equals(cVar.b()) && this.c == cVar.a();
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OsData{osRelease=");
        sb.append(this.a);
        sb.append(", osCodeName=");
        sb.append(this.b);
        sb.append(", isRooted=");
        return C2983be.b(sb, this.c, "}");
    }
}

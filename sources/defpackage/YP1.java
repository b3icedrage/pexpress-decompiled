package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class YP1 implements XP1 {
    public static final ArrayList g = new ArrayList(0);
    public final int a;
    public final String b;
    public final Object c;
    public ArrayList d;
    public final Throwable e;
    public final long f = System.currentTimeMillis();

    public YP1(String str, Throwable th, int i, Object obj) {
        this.a = i;
        this.b = str;
        this.c = obj;
        this.e = th;
    }

    @Override // defpackage.XP1
    public final Throwable a() {
        return this.e;
    }

    @Override // defpackage.XP1
    public final synchronized int b() {
        int i;
        i = this.a;
        Iterator<XP1> it = iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            if (iB > i) {
                i = iB;
            }
        }
        return i;
    }

    @Override // defpackage.XP1
    public final Long c() {
        return Long.valueOf(this.f);
    }

    @Override // defpackage.XP1
    public final synchronized boolean d() {
        ArrayList arrayList;
        arrayList = this.d;
        return arrayList != null && arrayList.size() > 0;
    }

    public final synchronized void e(N70 n70) {
        try {
            if (this.d == null) {
                this.d = new ArrayList();
            }
            this.d.add(n70);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YP1 yp1 = (YP1) obj;
        if (this.a != yp1.a) {
            return false;
        }
        String str = yp1.b;
        String str2 = this.b;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    @Override // defpackage.XP1
    public final int getLevel() {
        return this.a;
    }

    @Override // defpackage.XP1
    public final String getMessage() {
        return this.b;
    }

    public final int hashCode() {
        int i = (this.a + 31) * 31;
        String str = this.b;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // defpackage.XP1
    public final synchronized Iterator<XP1> iterator() {
        ArrayList arrayList = this.d;
        if (arrayList != null) {
            return arrayList.iterator();
        }
        return g.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int iB = b();
        if (iB == 0) {
            sb.append("INFO");
        } else if (iB == 1) {
            sb.append("WARN");
        } else if (iB == 2) {
            sb.append("ERROR");
        }
        Object obj = this.c;
        if (obj != null) {
            sb.append(" in ");
            sb.append(obj);
            sb.append(" -");
        }
        sb.append(" ");
        sb.append(this.b);
        Throwable th = this.e;
        if (th != null) {
            sb.append(" ");
            sb.append(th);
        }
        return sb.toString();
    }
}

package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: Bx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711Bx {
    public long a = -1;
    public String b = null;
    public final SimpleDateFormat c;

    public C0711Bx(String str) {
        this.c = new SimpleDateFormat(str);
    }

    public final String a(long j) {
        String str;
        synchronized (this) {
            try {
                if (j != this.a) {
                    this.a = j;
                    this.b = this.c.format(new Date(j));
                }
                str = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
